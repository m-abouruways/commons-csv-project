package org.example.csvdemo.bench;

import org.openjdk.jmh.annotations.*;
import org.apache.commons.csv.*;

public class CsvParseBenchmark {
    private final String sample = "name,age\nA,20\nB,25";

    @Benchmark
    public void testParse() throws Exception {
        CSVParser.parse(sample, CSVFormat.DEFAULT.withFirstRecordAsHeader());
    }
}
