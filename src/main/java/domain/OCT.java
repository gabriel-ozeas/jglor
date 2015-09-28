package domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 26/09/15.
 */
public class OCT {
    private BigDecimal superiorMax;
    private BigDecimal inferiorMax;
    private BigDecimal superiorAverage;
    private BigDecimal inferiorAverage;
    private BigDecimal thicknessAverage;

    public OCT(BigDecimal superiorMax, BigDecimal inferiorMax, BigDecimal superiorAverage, BigDecimal inferiorAverage, BigDecimal thicknessAverage) {
        this.superiorMax = superiorMax;
        this.inferiorMax = inferiorMax;
        this.superiorAverage = superiorAverage;
        this.inferiorAverage = inferiorAverage;
        this.thicknessAverage = thicknessAverage;
    }

    public BigDecimal getSuperiorMax() {
        return superiorMax;
    }

    public void setSuperiorMax(BigDecimal superiorMax) {
        this.superiorMax = superiorMax;
    }

    public BigDecimal getInferiorMax() {
        return inferiorMax;
    }

    public void setInferiorMax(BigDecimal inferiorMax) {
        this.inferiorMax = inferiorMax;
    }

    public BigDecimal getSuperiorAverage() {
        return superiorAverage;
    }

    public void setSuperiorAverage(BigDecimal superiorAverage) {
        this.superiorAverage = superiorAverage;
    }

    public BigDecimal getInferiorAverage() {
        return inferiorAverage;
    }

    public void setInferiorAverage(BigDecimal inferiorAverage) {
        this.inferiorAverage = inferiorAverage;
    }

    public BigDecimal getThicknessAverage() {
        return thicknessAverage;
    }

    public void setThicknessAverage(BigDecimal thicknessAverage) {
        this.thicknessAverage = thicknessAverage;
    }

    @Override
    public String toString() {
        return "OpticalCoherenceTomography{" +
                "superiorMax=" + superiorMax +
                ", inferiorMax=" + inferiorMax +
                ", superiorAverage=" + superiorAverage +
                ", inferiorAverage=" + inferiorAverage +
                ", thicknessAverage=" + thicknessAverage +
                '}';
    }

    public static class Builder {
        private BigDecimal superiorMax;
        private BigDecimal inferiorMax;
        private BigDecimal superiorAverage;
        private BigDecimal inferiorAverage;
        private BigDecimal thicknessAverage;

        public Builder superiorMax(BigDecimal superiorMax) {
            this.superiorMax = superiorMax;
            return this;
        }

        public Builder inferiorMax(BigDecimal inferiorMax) {
            this.inferiorMax = inferiorMax;
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

        public Builder thicknessAverage(BigDecimal thicknessAverage) {
            this.thicknessAverage = thicknessAverage;
            return this;
        }

        public OCT build() {
            return new OCT(superiorMax, inferiorMax, superiorAverage, inferiorAverage, thicknessAverage);
        }
    }
}
