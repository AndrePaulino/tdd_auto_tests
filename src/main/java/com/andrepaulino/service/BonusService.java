package com.andrepaulino.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.andrepaulino.modelo.Funcionario;

public class BonusService {

	public BigDecimal calcularBonus(Funcionario funcionario) {
		BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
		if (valor.compareTo(new BigDecimal("1000")) > 0) {
			throw new IllegalArgumentException("Funcionario com salário acima do limite bonificável.");
		}
		return valor.setScale(2, RoundingMode.HALF_UP);
	}

}
