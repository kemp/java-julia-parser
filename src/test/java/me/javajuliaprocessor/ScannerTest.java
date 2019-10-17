package me.javajuliaprocessor;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class ScannerTest {
    @Test
    void testSimpleExample() {
        String input = "a = a + 1";

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);

        Scanner scanner = new Scanner(printStream);
        scanner.scan(input);

        String output = byteArrayOutputStream.toString();

        assertTrue(output.contains("Lexical analysis complete!"));
//        assertTrue(output.contains("Syntax analysis complete!"));
    }
}