package csv;

import domain.Patient;

import java.math.MathContext;
import java.util.List;
import java.util.ArrayList;

/**
 * Created by gabriel on 28/09/15.
 */
public class PatientCSVConverter {
    public static final Object [] FILE_HEADER = {
            "iop.le", "iop.re",
            "oct.superiorMax", "oct.inferiorMax", "oct.superiorAverage", "oct.inferiorAverage", "oct.thicknessAverage",
            "hrt.cupArea", "hrt.cupVolume", "hrt.diskArea", "hrt.diskVolume", "hrt.rimArea",
            "gdx.nerveFiberIndicator", "gdx.interEyeSimmetry", "gdx.tnsiAverage", "gdx.tnsiSD", "gdx.superiorAverage", "gdx.inferiorAverage"
    };


    public List<?> convert(Patient patient) {
        List record = new ArrayList<>();

        record.add(patient.getIop().getLeftEye());
        record.add(patient.getIop().getRightEye());

        record.add(patient.getOct().getSuperiorMax());
        record.add(patient.getOct().getInferiorMax());
        record.add(patient.getOct().getSuperiorAverage());
        record.add(patient.getOct().getInferiorAverage());
        record.add(patient.getOct().getThicknessAverage());

        record.add(patient.getHrt().getCupArea());
        record.add(patient.getHrt().getCupVolume());
        record.add(patient.getHrt().getDiskArea());
        record.add(patient.getHrt().getDiskVolume());
        record.add(patient.getHrt().getRimArea());

        record.add(patient.getGdx().getNerveFiberIndicator());
        record.add(patient.getGdx().getInterEyeSimmetry());
        record.add(patient.getGdx().getTnsiAverage());
        record.add(patient.getGdx().getTnsiStandardDeviation());
        record.add(patient.getGdx().getSuperiorAverage());
        record.add(patient.getGdx().getInferiorAverage());

        return record;
    }
}
