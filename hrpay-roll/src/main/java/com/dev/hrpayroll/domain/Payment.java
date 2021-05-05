package com.dev.hrpayroll.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    private Double dailyIncome;

    private Integer days;

    public double getTotal(){
        return this.days * this.dailyIncome;
    }



}
