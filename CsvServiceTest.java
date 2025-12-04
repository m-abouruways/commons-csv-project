package org.example.csvdemo;

import org.junit.jupiter.api.*;
import java.util.*;

public class CsvServiceTest {

    @Test
    public void testParse() throws Exception {
        CsvService s = new CsvService();
        String csv = "name,age\nAli,22";

        var list = s.parse(csv);

        Assertions.assertEquals(1, list.size());
        Assertions.assertEquals("Ali", list.get(0).get("name"));
    }
}
