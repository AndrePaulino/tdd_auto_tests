package com.andrepaulino.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.andrepaulino.modelo.Funcionario;
import com.andrepaulino.modelo.Performance;

public class SalaryRaiseServiceTest {

    private SalaryRaiseService salaryRaise;
    private Funcionario funci;

    @BeforeEach
    void setUp() {
        this.salaryRaise = new SalaryRaiseService();
        this.funci = new Funcionario("Vapo", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @Test
    public void raiseShouldBeThreePercentToLowPerformance() {
        salaryRaise.addRaise(funci, Performance.LOW);
        assertThat(funci.getSalario(), equalTo(new BigDecimal("1030.00")));
    }

    @Test
    public void raiseShouldBeFifteenPercentToGoodPerformance() {
        salaryRaise.addRaise(funci, Performance.GOOD);
        assertThat(funci.getSalario(), equalTo(new BigDecimal("1150.00")));
    }

    @Test
    public void raiseShouldBeTwentyPercentToGreatPerformance() {
        salaryRaise.addRaise(funci, Performance.GREAT);
        assertThat(funci.getSalario(), equalTo(new BigDecimal("1200.00")));
    }

}