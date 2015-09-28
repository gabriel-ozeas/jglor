package org.knoma.jglor.csv;

import java.util.List;
import org.knoma.jglor.domain.Patient;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.knoma.jglor.generators.PatientGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by gabriel on 28/09/15.
 */
public class CSVFileExporter {
    public void write(List<Patient> patients, String file) {
        CSVFormat csvFileFormat = CSVFormat.EXCEL;

        try {
            StringBuilder builder = new StringBuilder();

            CSVPrinter csvPrinter = new CSVPrinter(builder, csvFileFormat);
            csvPrinter.printRecord(PatientCSVConverter.FILE_HEADER);

            for (Patient patient : patients) {
                csvPrinter.printRecord(new PatientCSVConverter().convert(patient));
            }

            FileWriter writer = new FileWriter(file);
            writer.write(builder.toString());
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException("Cannot generate csv file", e);
        }
    }

    public static final void main(String... args) {
        final List<Patient> patients = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            patients.add(new PatientGenerator().generate());
        }
        new CSVFileExporter().write(patients, "build/patients.csv");
    }
}
