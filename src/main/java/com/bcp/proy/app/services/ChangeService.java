package com.bcp.proy.app.services;

import io.reactivex.Single;

import java.util.List;
import java.util.Optional;

import com.bcp.proy.app.domain.Change;
import com.bcp.proy.app.dto.ResponseExchangeDto;

public interface ChangeService {

    List<Change> findAll();
    Change save(Change currency);
    Optional<Change> findById(Long id);
    void deleteAll();
    Single<ResponseExchangeDto> exchangeAmount(String origin, String destination, String amount);
}
