package org.knoma.jglor.generators;

import org.knoma.jglor.domain.SWAP;

import java.math.BigDecimal;

import static org.knoma.jglor.generators.MonteCarlo.monteCarlo;

/**
 * Created by gabriel on 25/09/15.
 */
public class SWAPGenerator {

    public SWAP generate() {
       return new SWAP.Builder()
                .totalDeviation(monteCarlo(new BigDecimal("1000"), new BigDecimal("0")))
                .patternDeviation(monteCarlo(new BigDecimal("1000"), new BigDecimal("0")))
                .meanDeviation(monteCarlo(new BigDecimal("1000"), new BigDecimal("0")))
                .patternStandardDeviation(monteCarlo(new BigDecimal("1000"), new BigDecimal("0")))
                .build();
    }
}
