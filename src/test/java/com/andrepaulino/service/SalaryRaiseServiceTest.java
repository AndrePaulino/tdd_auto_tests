package com.andrepaulino.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.Test;

import com.andrepaulino.modelo.Funcionario;
import com.andrepaulino.modelo.Performance;

public class SalaryRaiseServiceTest {

    @Test
    public void raiseShouldBeThreePercentToLowPerformance() {
        SalaryRaiseService salaryRaise = new SalaryRaiseService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), new BigDecimal("1000.00"));
        salaryRaise.addRaise(funci, Performance.LOW);

        assertThat(funci.getSalario(), equalTo(new BigDecimal("1030.00")));
    }

    @Test
    public void raiseShouldBeFifteenPercentToGoodPerformance() {
        SalaryRaiseService salaryRaise = new SalaryRaiseService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), new BigDecimal("1000.00"));
        salaryRaise.addRaise(funci, Performance.GOOD);

        assertThat(funci.getSalario(), equalTo(new BigDecimal("1150.00")));
    }

    @Test
    public void raiseShouldBeTwentyPercentToGreatPerformance() {
        SalaryRaiseService salaryRaise = new SalaryRaiseService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), new BigDecimal("1000.00"));
        salaryRaise.addRaise(funci, Performance.GREAT);

        assertThat(funci.getSalario(), equalTo(new BigDecimal("1200.00")));
    }

}