package com.dev.hrpayroll.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Payment {

    private String name;

    private Double dailyIncome;

    private Integer days;

    public double getTotal(){
        return this.days * this.dailyIncome;
    }



}
