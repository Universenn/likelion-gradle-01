package com.line;

import com.line.parser.Parser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LineReader<T> { // 제네릭 활용

    Parser<T> parser;
    boolean isRemoveColumName = true;

    public LineReader(Parser<T> parser) {
        this.parser = parser;
    }

    public LineReader(Parser<T> parser,boolean isRemoveColumName) {
        this.parser = parser;
        this.isRemoveColumName = isRemoveColumName;
    }

    List<T> readLines(String filename) throws IOException {

        List<T> result = new ArrayList<>(); // 파일을 List 로 받아야 하기 때문에
        BufferedReader br = new BufferedReader(new FileReader(filename)); // ??
        String str;
        if(isRemoveColumName){br.readLine();}
        while ((str =br.readLine()) != null){ // null 이 되면 종료 읽을파일이 없음
            result.add(parser.parse(str));
        }
        return result;
    }

//    public static void main(String[] args) throws IOException {
//        String filename = "C:\\Users\\UserK\\Desktop\\백엔드 스쿨\\서울시 병의원 위치 정보.csv";
//        LineReader lr = new LineReader();
//        List<String> lines = lr.readLines(filename);
//        System.out.println(lines.size());
//    }
}
