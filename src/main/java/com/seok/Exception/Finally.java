package com.seok.Exception;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Finally {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("D:/simple.txt");//절대경로 박아버리기
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write('a');
            writer.write("こんにちは");
            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
 class FinallyCase3 {
    public static void main(String[] args) {
        Path path = Paths.get("D:/simple.txt"); // 절대경로(full 경로)

        // try-with-resources 구문을 사용하여 자원 자동 관리
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("반가워");

        } catch (IOException e) {
            e.printStackTrace(); // 예외 발생 시 처리
        }

        System.out.println("お終い");
    }
}