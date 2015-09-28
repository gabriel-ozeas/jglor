package org.knoma.jglor.generators;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static java.lang.Math.random;

/**
 * Created by gabriel on 25/09/15.
 */
public class MonteCarlo {
    public static BigDecimal monteCarlo(BigDecimal max, BigDecimal min) {
        BigDecimal random = new BigDecimal(random());
        return min.add(random.multiply(max.subtract(min))).setScale(2, RoundingMode.UP);
    }

    public static BigDecimal monteCarlo(BigDecimal max, BigDecimal min, int roundValue) {
        BigDecimal random = new BigDecimal(random());
        return min.add(random.multiply(max.subtract(min))).setScale(roundValue, RoundingMode.UP);
    }
}
