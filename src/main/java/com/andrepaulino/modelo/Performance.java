package com.andrepaulino.modelo;

import java.math.BigDecimal;

public enum Performance {

    LOW {
        @Override
        public BigDecimal salaryRaisePercent() {
            return new BigDecimal("0.03");
        }
    },
    GOOD {
        @Override
        public BigDecimal salaryRaisePercent() {
            return new BigDecimal("0.15");
        }
    },
    GREAT {
        @Override
        public BigDecimal salaryRaisePercent() {
            return new BigDecimal("0.20");
        }
    };

    public abstract BigDecimal salaryRaisePercent();
}
