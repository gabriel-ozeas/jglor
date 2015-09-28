package org.knoma.jglor.domain;

import java.math.BigDecimal;

/**
 * Created by gabriel on 25/09/15.
 */
public class IOP {
    private BigDecimal leftEye;
    private BigDecimal rightEye;

    public IOP(BigDecimal leftEye, BigDecimal rightEye) {
        this.leftEye = leftEye;
        this.rightEye = rightEye;
    }

    public BigDecimal getLeftEye() {
        return leftEye;
    }

    public void setLeftEye(BigDecimal leftEye) {
        this.leftEye = leftEye;
    }

    public BigDecimal getRightEye() {
        return rightEye;
    }

    public void setRightEye(BigDecimal rightEye) {
        this.rightEye = rightEye;
    }

    @Override
    public String toString() {
        return "IntraocularPressure{" +
                "leftEye=" + leftEye +
                ", rightEye=" + rightEye +
                '}';
    }
}
