package org.knoma.jglor.generators;

import org.knoma.jglor.domain.VA;

import java.math.BigDecimal;

import static org.knoma.jglor.generators.MonteCarlo.monteCarlo;

/**
 * Created by gabriel on 26/09/15.
 */
public class VAGenerator {
    private static final BigDecimal LEFT_EYE_MAX_LIMIT = new BigDecimal(1000);
    private static final BigDecimal LEFT_EYE_MIN_LIMIT = new BigDecimal(0);

    private static final BigDecimal RIGHT_EYE_MAX_LIMIT = new BigDecimal(1000);
    private static final BigDecimal RIGHT_EYE_MIN_LIMIT = new BigDecimal(0);

    public VA generate() {
        VA va = new VA();
        va.setLeftEye(monteCarlo(LEFT_EYE_MAX_LIMIT, LEFT_EYE_MIN_LIMIT));
        va.setLeftEye(monteCarlo(RIGHT_EYE_MAX_LIMIT, RIGHT_EYE_MIN_LIMIT));
        return va;
    }
}
