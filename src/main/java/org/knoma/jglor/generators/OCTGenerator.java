package org.knoma.jglor.generators;

import domain.OCT;

import java.math.BigDecimal;

import static org.knoma.jglor.generators.MonteCarlo.monteCarlo;

/**
 * Created by gabriel on 24/09/15.
 */
public class OCTGenerator {
    private static final BigDecimal SUPERIOR_MAX_LIMIT = new BigDecimal("189");
    private static final BigDecimal SUPERIOR_MIN_LIMIT = new BigDecimal("124");

    private static final BigDecimal INFERIOR_MAX_LIMIT = new BigDecimal("194");
    private static final BigDecimal INFERIOR_MIN_LIMIT = new BigDecimal("125");

    private static final BigDecimal SUPERIOR_AVERAGE_MAX_LIMIT = new BigDecimal("152");
    private static final BigDecimal SUPERIOR_AVERAGE_MIN_LIMIT = new BigDecimal("97");

    private static final BigDecimal INFERIOR_AVERAGE_MAX_LIMIT = new BigDecimal("156");
    private static final BigDecimal INFERIOR_AVERAGE_MIN_LIMIT = new BigDecimal("98");

    private static final BigDecimal THICKNESS_AVERAGE_MAX_LIMIT = new BigDecimal("118");
    private static final BigDecimal THICKNESS_AVERAGE_MIN_LIMIT = new BigDecimal("82");

    public OCT generate() {
        return new OCT.Builder()
                .superiorMax(monteCarlo(SUPERIOR_MAX_LIMIT, SUPERIOR_MIN_LIMIT, 0))
                .superiorAverage(monteCarlo(SUPERIOR_AVERAGE_MAX_LIMIT, SUPERIOR_AVERAGE_MIN_LIMIT, 0))

                .inferiorMax(monteCarlo(INFERIOR_MAX_LIMIT, INFERIOR_MIN_LIMIT, 0))
                .inferiorAverage(monteCarlo(INFERIOR_AVERAGE_MAX_LIMIT, INFERIOR_AVERAGE_MIN_LIMIT, 0))

                .thicknessAverage(monteCarlo(THICKNESS_AVERAGE_MAX_LIMIT, THICKNESS_AVERAGE_MIN_LIMIT, 0))

                .build();
    }
}
