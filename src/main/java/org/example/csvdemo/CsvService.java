package org.example.csvdemo;

import org.apache.commons.csv.*;
import java.io.*;
import java.util.*;

public class CsvService {

    public List<Map<String, String>> parse(String input) throws IOException {
        List<Map<String, String>> out = new ArrayList<>();
        CSVParser parser = CSVParser.parse(input, CSVFormat.DEFAULT.withFirstRecordAsHeader());
        for (CSVRecord rec : parser) {
            out.add(rec.toMap());
        }
        return out;
    }
}
