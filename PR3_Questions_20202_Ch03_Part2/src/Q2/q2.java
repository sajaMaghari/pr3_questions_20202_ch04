/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 *
 * @author khatib
 */
public class q2 {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> lst = new ArrayList<>();
        Pattern p = Pattern.compile(("\\s+"));
        Map<String, Long> map = new TreeMap<>();
        try {
            map = Files
                    .lines(Paths.get("src/Q2/test.txt"))
                    .flatMap(line -> p.splitAsStream(line))
                    .collect(Collectors
                            .groupingBy(String::toUpperCase,
                                    Collectors.counting()
                            )
                    );

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(map);

    }
}
