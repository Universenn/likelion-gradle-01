package com.line;

import com.line.domain.Hospital;
import com.line.parser.Hospitalparser;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        LineReader<Hospital> hospitalLineReader = new LineReader<>(new Hospitalparser());
        String filename = "C:\\Users\\UserK\\Desktop\\backendschool\\Seoul hospital location information.csv";
        List<Hospital> hospitalList = hospitalLineReader.readLines(filename);

//        String dataFileName = "seoul_data.txt";
        String sqlFileName = "seoul_hospital.sql";
//        List<Hospital> sqlfile =


//        System.out.println(hospitalList.size());
//        for (Hospital hospital : hospitalList) {
//            System.out.println(hospital.getId());
//
//        }
    }
}
