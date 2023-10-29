package com.andrepaulino.service;

import java.math.BigDecimal;

import com.andrepaulino.modelo.Funcionario;
import com.andrepaulino.modelo.Performance;

public class SalaryRaiseService {

    public void addRaise(Funcionario funci, Performance performance) {
        BigDecimal raise = funci.getSalario().multiply(performance.salaryRaisePercent());
        funci.setSalario(funci.getSalario().add(raise));
    }

}
