package com.bcp.proy.app.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseExchangeDto {


    private String amount;
    private String origin;
    private String destination;
    private String amountResult;
    private String value;

    public ResponseExchangeDto() {}

    public ResponseExchangeDto(String amount, String origin, String destination, String amountResult, String value) {
        this.amount = amount;
        this.origin = origin;
        this.destination = destination;
        this.amountResult = amountResult;
        this.value = value;
    }


}
