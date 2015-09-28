package org.knoma.jglor.generators;

import org.knoma.jglor.domain.IOP;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Random;

/**
 * Created by gabriel on 26/09/15.
 */
public class IOPGenerator {
    private static final BigDecimal MAX_LIMIT = new BigDecimal("50");
    private static final BigDecimal MIN_LIMIT = new BigDecimal("5");
    private static final BigDecimal MEAN = new BigDecimal("14");
    private static final BigDecimal STANDARD_DEVIATION = new BigDecimal("2");

    public IOP generate() {
        BigDecimal le = random(MAX_LIMIT, MIN_LIMIT, MEAN, STANDARD_DEVIATION);
        BigDecimal re = random(MAX_LIMIT, MIN_LIMIT, MEAN, STANDARD_DEVIATION);

        return new IOP(le, re);
    }

    private BigDecimal random(BigDecimal max, BigDecimal min, BigDecimal mean, BigDecimal standardDeviation) {

        BigDecimal rand = new BigDecimal(new Random().nextDouble());

        BigDecimal random = new BigDecimal(new Random()
                .doubles(min.intValue(), max.intValue())
                .findFirst()
                .getAsDouble());

        BigDecimal sign = random.compareTo(mean) < 0 ? new BigDecimal("1") : new BigDecimal("-1");

        if (random.compareTo(mean.subtract(standardDeviation.multiply(new BigDecimal("2")))) < 0) {
            if (rand.compareTo(new BigDecimal(0.5)) < 0) {
                random = mean.add(standardDeviation.multiply(sign).multiply(rand));
            }
        } else {
            if (random.compareTo(mean.add(standardDeviation.multiply(new BigDecimal("2")))) > 0) {
                if (rand.compareTo(new BigDecimal("0.95")) < 0) {
                    random = mean.add(standardDeviation.multiply(sign).multiply(rand));
                }
            }
        }

        BigDecimal pvalue = random.round(new MathContext(0));

        if (pvalue.compareTo(min) < 0) {
            return min.round(new MathContext(2)).setScale(2);
        }

        if (pvalue.compareTo(max) > 0) {
            return max.round(new MathContext(2)).setScale(2);
        }

        return pvalue.round(new MathContext(2)).setScale(2);
    }
}
