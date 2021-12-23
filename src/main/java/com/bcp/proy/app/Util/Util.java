package com.bcp.proy.app.Util;

import java.math.BigDecimal;

import com.bcp.proy.app.domain.Change;
import com.bcp.proy.app.dto.ResponseExchangeDto;

public class Util {

    public static ResponseExchangeDto convertByRate(Change exchangeRate, String amount) {
        BigDecimal amountDecimal=BigDecimal.valueOf(Double.valueOf(amount));
        BigDecimal result = amountDecimal.multiply(BigDecimal.valueOf(Double.valueOf(exchangeRate.getValue())));
        return new ResponseExchangeDto(amount,exchangeRate.getOrigin(), exchangeRate.getDestination(), result.toString(),exchangeRate.getValue());
    }
}
