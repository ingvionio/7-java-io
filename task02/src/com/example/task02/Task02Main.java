package com.example.task02;

import java.io.IOException;
import java.io.InputStream;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStream input = System.in;

        int first = input.read();
        int second = input.read();

        while (first != -1){
            if (first != 13 || second != 10){
                System.out.write(first);
            }

            first = second;
            second = input.read();
        }

        System.out.flush();

    }
}
