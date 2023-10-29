package com.andrepaulino.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

import com.andrepaulino.modelo.Funcionario;

public class BonusServiceTest {

    @Test
    public void bonusShould0ForHighSalary() {
        BonusService bonusService = new BonusService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), BigDecimal.valueOf(10010));
        assertThrows(IllegalArgumentException.class, () -> bonusService.calcularBonus(funci));
    }

    @Test
    public void bonusShouldBe10Percent() {
        BonusService bonusService = new BonusService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), BigDecimal.valueOf(5000));
        var bonus = bonusService.calcularBonus(funci);

        assertThat(bonus, equalTo(new BigDecimal("500.00")));
    }

    @Test
    public void bonusShouldBe10PercentForSalaryEqualsTo10k() {
        BonusService bonusService = new BonusService();
        Funcionario funci = new Funcionario("Vapo", LocalDate.now(), BigDecimal.valueOf(10000));
        var bonus = bonusService.calcularBonus(funci);

        assertThat(bonus, equalTo(new BigDecimal("1000.00")));
    }
}
