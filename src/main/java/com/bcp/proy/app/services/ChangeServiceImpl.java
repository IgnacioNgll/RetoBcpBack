package com.bcp.proy.app.services;

import com.bcp.proy.app.Util.Util;
import com.bcp.proy.app.domain.Change;
import com.bcp.proy.app.dto.ResponseExchangeDto;
import com.bcp.proy.app.repositories.ChangeRepository;

import io.reactivex.Single;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ChangeServiceImpl implements ChangeService {

    @Autowired
    private ChangeRepository currencyRepository;

    @Override
    public List<Change> findAll() {
        List<Change> currencyList = currencyRepository.findAll();
        return currencyList;
    }

    @Override
    public Change save(Change currency) {
        Change currencySaved = currencyRepository.save(currency);
        return currencySaved;
    }

    @Override
    public Optional<Change> findById(Long id) {
        return currencyRepository.findById(id);
    }

    @Override
    public void deleteAll() {
        currencyRepository.deleteAll();
    }

	@Override
	public Single<ResponseExchangeDto> exchangeAmount(String amount, String origin, String destination) {
		List<Change> listCurrency = currencyRepository.findByOriginAndDestination(origin, destination);
        if (listCurrency.size() > 0) {
            return Single.create(singleSubscriber -> {
                ResponseExchangeDto exchange = Util.convertByRate(listCurrency.get(0), amount);
                singleSubscriber.onSuccess(exchange);
            });
        } else {
            return Single.create(singleSubscriber -> {
                singleSubscriber.onSuccess(new ResponseExchangeDto());
            });
        }
	}


}
