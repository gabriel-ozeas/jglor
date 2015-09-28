package org.knoma.jglor.generators;

import domain.GDX;

import java.math.BigDecimal;

import static org.knoma.jglor.generators.MonteCarlo.monteCarlo;

/**
 * Created by gabriel on 26/09/15.
 */
public class GDXGenerator {
    private static final BigDecimal NERVE_FIBER_INDICATOR_MAX_LIMIT = new BigDecimal("100");
    private static final BigDecimal NERVE_FIVER_INDICATOR_MIN_LIMIT = new BigDecimal("0");

    private static final BigDecimal SUPERIOR_AVERAGE_MAX_LIMIT = new BigDecimal("100");
    private static final BigDecimal SUPERIOR_AVERAGE_MIN_LIMIT = new BigDecimal("10");

    private static final BigDecimal INFERIOR_AVERAGE_MAX_LIMIT = new BigDecimal("100");
    private static final BigDecimal INFERIOR_AVERAGE_MIN_LIMIT = new BigDecimal("10");

    private static final BigDecimal TSNIT_AVERAGE_MAX_LIMIT = new BigDecimal("100");
    private static final BigDecimal TSNIT_AVERAGE_MIN_LIMIT = new BigDecimal("10");

    private static final BigDecimal TSNIT_STANDARD_DEVIATION_MAX_LIMIT = new BigDecimal("1000");
    private static final BigDecimal TSNIT_STANDARD_DEVIATION_MIN_LIMIT = new BigDecimal("0");

    private static final BigDecimal INTEREYE_SIMMETRY_MAX_LIMIT = new BigDecimal("1");
    private static final BigDecimal INTEREYE_SIMMETRY_MIN_LIMIT = new BigDecimal("-1");

    public GDX generate() {
        return new GDX.Builder()
                .nerveFiberIndicator(monteCarlo(NERVE_FIBER_INDICATOR_MAX_LIMIT, NERVE_FIVER_INDICATOR_MIN_LIMIT, 0))
                .superiorAverage(monteCarlo(SUPERIOR_AVERAGE_MAX_LIMIT, SUPERIOR_AVERAGE_MIN_LIMIT, 2))
                .inferiorAverage(monteCarlo(INFERIOR_AVERAGE_MAX_LIMIT, INFERIOR_AVERAGE_MIN_LIMIT, 2))
                .tnsiAverage(monteCarlo(TSNIT_AVERAGE_MAX_LIMIT, TSNIT_AVERAGE_MIN_LIMIT, 2))
                .tnsiStandardDeviation(monteCarlo(TSNIT_STANDARD_DEVIATION_MAX_LIMIT, TSNIT_STANDARD_DEVIATION_MIN_LIMIT, 2))
                .interEyeSimmetry(monteCarlo(INTEREYE_SIMMETRY_MAX_LIMIT, INTEREYE_SIMMETRY_MIN_LIMIT, 2))
                .build();
    }
}
