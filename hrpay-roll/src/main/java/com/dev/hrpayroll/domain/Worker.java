package com.dev.hrpayroll.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;


@Data
@EqualsAndHashCode
public class Worker implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String nome;

    private Double dailyIncome;


}
