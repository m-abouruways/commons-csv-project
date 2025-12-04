package org.example.csvdemo;

import org.springframework.web.bind.annotation.*;
import java.io.*;
import java.util.*;

@RestController
@RequestMapping("/csv")
public class CsvController {

    private final CsvService service = new CsvService();

    @PostMapping("/parse")
    public List<Map<String,String>> parse(@RequestBody String csv) throws IOException {
        return service.parse(csv);
    }
}
