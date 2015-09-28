package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 26/09/15.
 */
public class HRT {
    private BigDecimal cupArea;
    private BigDecimal cupVolume;
    private BigDecimal diskArea;
    private BigDecimal diskVolume;

    private BigDecimal rimArea;

    public HRT(BigDecimal cupArea, BigDecimal cupVolume, BigDecimal diskArea, BigDecimal diskVolume, BigDecimal rimArea) {
        this.cupArea = cupArea;
        this.cupVolume = cupVolume;
        this.diskArea = diskArea;
        this.diskVolume = diskVolume;
        this.rimArea = rimArea;
    }

    public BigDecimal getCupArea() {
        return cupArea;
    }

    public BigDecimal getCupVolume() {
        return cupVolume;
    }

    public BigDecimal getDiskArea() {
        return diskArea;
    }

    public BigDecimal getDiskVolume() {
        return diskVolume;
    }

    public BigDecimal getRimArea() {
        return rimArea;
    }

    @Override
    public String toString() {
        return "HRT{" +
                "rimArea=" + rimArea +
                ", diskVolume=" + diskVolume +
                ", diskArea=" + diskArea +
                ", cupVolume=" + cupVolume +
                ", cupArea=" + cupArea +
                '}';
    }

    public static class Builder {
        private BigDecimal cupArea;
        private BigDecimal cupVolume;
        private BigDecimal diskArea;
        private BigDecimal diskVolume;
        private BigDecimal rimArea;

        public Builder cupArea(BigDecimal cupArea) {
            this.cupArea = cupArea;
            return this;
        }

        public Builder cupVolume(BigDecimal cupVolume) {
            this.cupVolume = cupVolume;
            return this;
        }

        public Builder diskArea(BigDecimal diskArea) {
            this.diskArea = diskArea;
            return this;
        }

        public Builder diskVolume(BigDecimal diskVolume) {
            this.diskVolume = diskVolume;
            return this;
        }

        public Builder rimArea(BigDecimal rimArea) {
            this.rimArea = rimArea;
            return this;
        }

        public HRT build() {
            return new HRT(cupArea, cupVolume, diskArea, diskVolume, rimArea);
        }
    }
}
