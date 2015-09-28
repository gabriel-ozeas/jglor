package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 26/09/15.
 */
public class VA {
    private BigDecimal leftEye;
    private BigDecimal rightEye;

    public VA() {
    }

    public VA(BigDecimal leftEye, BigDecimal rightEye) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }

    public BigDecimal getLeftEye() {
        return leftEye;
    }

    public BigDecimal getRightEye() {
        return rightEye;
    }

    public void setLeftEye(BigDecimal leftEye) {
        this.leftEye = leftEye;
    }

    public void setRightEye(BigDecimal rightEye) {
        this.rightEye = rightEye;
    }

    @Override
    public String toString() {
        return "VA{" +
                "leftEye=" + leftEye +
                ", rightEye=" + rightEye +
                '}';
    }
}
