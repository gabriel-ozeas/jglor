package org.knoma.jglor.generators;

import domain.HRT;

import java.math.BigDecimal;

import static org.knoma.jglor.generators.MonteCarlo.monteCarlo;

/**
 * Created by gabriel on 26/09/15.
 */
public class HRTGenerator {
    private static final BigDecimal CUP_AREA_MAX_LIMIT = new BigDecimal("3");
    private static final BigDecimal CUP_AREA_MIN_LIMIT = new BigDecimal("1");

    private static final BigDecimal CUP_VOLUME_MAX_LIMIT = new BigDecimal("1");
    private static final BigDecimal CUP_VOLUME_MIN_LIMIT = new BigDecimal("0.0");

    private static final BigDecimal DISK_AREA_MAX_LIMIT = new BigDecimal("2");
    private static final BigDecimal DISK_AREA_MIN_LIMIT = new BigDecimal("0.2");

    private static final BigDecimal DISK_VOLUME_MAX_LIMIT = new BigDecimal("0.5");
    private static final BigDecimal DISK_VOLUME_MIN_LIMIT = new BigDecimal("0");

    private static final BigDecimal RIM_AREA_MAX_LIMIT = new BigDecimal("1.8");
    private static final BigDecimal RIM_AREA_MIN_LIMIT = new BigDecimal("0.2");

    public HRT generate() {
        return new HRT.Builder()
                .cupArea(monteCarlo(CUP_AREA_MAX_LIMIT, CUP_AREA_MIN_LIMIT, 3))
                .cupVolume(monteCarlo(CUP_VOLUME_MAX_LIMIT, CUP_VOLUME_MIN_LIMIT, 3))
                .diskArea(monteCarlo(DISK_AREA_MAX_LIMIT, DISK_AREA_MIN_LIMIT, 3))
                .diskVolume(monteCarlo(DISK_VOLUME_MAX_LIMIT, DISK_VOLUME_MIN_LIMIT, 3))
                .rimArea(monteCarlo(RIM_AREA_MAX_LIMIT, RIM_AREA_MIN_LIMIT, 3))
                .build();
    }
}
