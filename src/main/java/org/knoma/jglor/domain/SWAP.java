package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Short Wavelength Perimetry
 *
 * Created by gabriel on 26/09/15.
 */
public class SWAP {
    private BigDecimal totalDeviation;
    private BigDecimal patternDeviation;
    private BigDecimal meanDeviation;
    private BigDecimal patternStandardDeviation;

    public SWAP(BigDecimal totalDeviation, BigDecimal patternDeviation, BigDecimal meanDeviation, BigDecimal patternStandardDeviation) {
        this.totalDeviation = totalDeviation;
        this.patternDeviation = patternDeviation;
        this.meanDeviation = meanDeviation;
        this.patternStandardDeviation = patternStandardDeviation;
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

    public BigDecimal getPatternStandardDeviation() {
        return patternStandardDeviation;
    }

    public void setPatternStandardDeviation(BigDecimal patternStandardDeviation) {
        this.patternStandardDeviation = patternStandardDeviation;
    }

    @Override
    public String toString() {
        return "ShortWavelengthPerimetry{" +
                "totalDeviation=" + totalDeviation +
                ", patternDeviation=" + patternDeviation +
                ", meanDeviation=" + meanDeviation +
                ", patternStandardDeviation=" + patternStandardDeviation +
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

        public SWAP build() {
            return new SWAP(totalDeviation, patternDeviation, meanDeviation, patternStandardDeviation);
        }
    }
}
