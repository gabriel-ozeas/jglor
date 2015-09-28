package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 26/09/15.
 */
public class GDX {
    private BigDecimal nerveFiberIndicator;
    private BigDecimal superiorAverage;
    private BigDecimal inferiorAverage;

    /**
     * Temporal – Superior – Nasal – Inferior - Temporal
     * */
    private BigDecimal tnsiAverage;
    private BigDecimal tnsiStandardDeviation;
    private BigDecimal interEyeSimmetry;

    public GDX(BigDecimal nerveFiberIndicator, BigDecimal superiorAverage, BigDecimal inferiorAverage, BigDecimal tnsiAverage, BigDecimal tnsiStandardDeviation, BigDecimal interEyeSimmetry) {
        this.nerveFiberIndicator = nerveFiberIndicator;
        this.superiorAverage = superiorAverage;
        this.inferiorAverage = inferiorAverage;
        this.tnsiAverage = tnsiAverage;
        this.tnsiStandardDeviation = tnsiStandardDeviation;
        this.interEyeSimmetry = interEyeSimmetry;
    }

    public BigDecimal getNerveFiberIndicator() {
        return nerveFiberIndicator;
    }

    public BigDecimal getSuperiorAverage() {
        return superiorAverage;
    }

    public BigDecimal getInferiorAverage() {
        return inferiorAverage;
    }

    public BigDecimal getTnsiAverage() {
        return tnsiAverage;
    }

    public BigDecimal getTnsiStandardDeviation() {
        return tnsiStandardDeviation;
    }

    public BigDecimal getInterEyeSimmetry() {
        return interEyeSimmetry;
    }

    @Override
    public String toString() {
        return "GDX{" +
                "interEyeSimmetry=" + interEyeSimmetry +
                ", tnsiStandardDeviation=" + tnsiStandardDeviation +
                ", tnsiAverage=" + tnsiAverage +
                ", inferiorAverage=" + inferiorAverage +
                ", superiorAverage=" + superiorAverage +
                ", nerveFiberIndicator=" + nerveFiberIndicator +
                '}';
    }

    public static class Builder {
        private BigDecimal nerveFiberIndicator;
        private BigDecimal superiorAverage;
        private BigDecimal inferiorAverage;
        private BigDecimal tnsiAverage;
        private BigDecimal tnsiStandardDeviation;
        private BigDecimal interEyeSimmetry;

        public Builder nerveFiberIndicator(BigDecimal nerveFiberIndicator) {
            this.nerveFiberIndicator = nerveFiberIndicator;
            return this;
        }

        public Builder superiorAverage(BigDecimal superiorAverage) {
            this.superiorAverage = superiorAverage;
            return this;
        }

        public Builder inferiorAverage(BigDecimal inferiorAverage) {
            this.inferiorAverage = inferiorAverage;
            return this;
        }

        public Builder tnsiAverage(BigDecimal tnsiAverage) {
            this.tnsiAverage = tnsiAverage;
            return this;
        }

        public Builder tnsiStandardDeviation(BigDecimal tnsiStandardDeviation) {
            this.tnsiStandardDeviation = tnsiStandardDeviation;
            return this;
        }

        public Builder interEyeSimmetry(BigDecimal interEyeSimmetry) {
            this.interEyeSimmetry = interEyeSimmetry;
            return this;
        }

        public GDX build() {
            return new GDX(nerveFiberIndicator, superiorAverage, inferiorAverage, tnsiAverage, tnsiStandardDeviation, interEyeSimmetry);
        }
    }


}
