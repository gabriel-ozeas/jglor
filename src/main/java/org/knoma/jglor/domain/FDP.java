package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 26/09/15.
 */
public class FDP {
    private BigDecimal totalDeviation;
    private BigDecimal patternDeviation;
    private BigDecimal meanDeviation;
    private BigDecimal patterStandardDeviation;

    public FDP(BigDecimal totalDeviation, BigDecimal patternDeviation, BigDecimal meanDeviation, BigDecimal patterStandardDeviation) {
        this.totalDeviation = totalDeviation;
        this.patternDeviation = patternDeviation;
        this.meanDeviation = meanDeviation;
        this.patterStandardDeviation = patterStandardDeviation;
    }

    public BigDecimal getTotalDeviation() {
        return totalDeviation;
    }

    public void setTotalDeviation(BigDecimal totalDeviation) {
        this.totalDeviation = totalDeviation;
    }

    public BigDecimal getPatternDeviation() {
        return patternDeviation;
    }

    public void setPatternDeviation(BigDecimal patternDeviation) {
        this.patternDeviation = patternDeviation;
    }

    public BigDecimal getMeanDeviation() {
        return meanDeviation;
    }

    public void setMeanDeviation(BigDecimal meanDeviation) {
        this.meanDeviation = meanDeviation;
    }

    public BigDecimal getPatterStandardDeviation() {
        return patterStandardDeviation;
    }

    public void setPatterStandardDeviation(BigDecimal patterStandardDeviation) {
        this.patterStandardDeviation = patterStandardDeviation;
    }

    @Override
    public String toString() {
        return "FrequencyDoublingPerimetry{" +
                "totalDeviation=" + totalDeviation +
                ", patternDeviation=" + patternDeviation +
                ", meanDeviation=" + meanDeviation +
                ", patterStandardDeviation=" + patterStandardDeviation +
                '}';
    }

    public static class Builder {
        private BigDecimal totalDeviation;
        private BigDecimal patternDeviation;
        private BigDecimal meanDeviation;
        private BigDecimal patternStandardDeviation;

        public Builder totalDeviation(BigDecimal totalDeviation) {
            this.totalDeviation = totalDeviation;
            return this;
        }

        public Builder patternDeviation(BigDecimal patternDeviation) {
            this.patternDeviation = patternDeviation;
            return this;
        }

        public Builder meanDeviation(BigDecimal meanDeviation) {
            this.meanDeviation = meanDeviation;
            return this;
        }

        public Builder patternStandardDeviation(BigDecimal patternStandardDeviation) {
            this.patternStandardDeviation = patternStandardDeviation;
            return this;
        }

        public FDP build() {
            return new FDP(totalDeviation, patternDeviation, meanDeviation, patternStandardDeviation);
        }
    }
}
