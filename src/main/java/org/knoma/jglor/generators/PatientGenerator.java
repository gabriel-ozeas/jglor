package org.knoma.jglor.generators;

import domain.Patient;

/**
 * Created by gabriel on 28/09/15.
 */
public class PatientGenerator {
    public Patient generate() {
        return new Patient.Builder()
                .fdp(new FDPGenerator().generate())
                .gdx(new GDXGenerator().generate())
                .hrt(new HRTGenerator().generate())
                .iop(new IOPGenerator().generate())
                .oct(new OCTGenerator().generate())
                .swap(new SWAPGenerator().generate())
                .va(new VAGenerator().generate())
                .build();
    }

    public final static void main(String... args) {
        System.out.println(new PatientGenerator().generate());
    }
}
