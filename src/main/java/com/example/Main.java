package com.example;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {

    static String buildHtml() {
        return """
            <!DOCTYPE html>
            <html lang="es">
            <head>
              <meta charset="UTF-8">
              <title>Java CI/CD Demo</title>
            </head>
            <body>
              <h1>Hello from Java CI/CD!</h1>
              <p>Este HTML fue generado desde Java y desplegado con GitHub Actions.</p>
              <p><a href="checkstyle.html">Ver reporte Checkstyle</a></p>
            </body>
            </html>
            """;
    }

    public static void main(String[] args) throws IOException {
        Path outputDir = Path.of("output");
        Files.createDirectories(outputDir);
        Files.writeString(outputDir.resolve("index.html"), buildHtml(), StandardCharsets.UTF_8);
        System.out.println("HTML generado correctamente en output/index.html");
    }
}