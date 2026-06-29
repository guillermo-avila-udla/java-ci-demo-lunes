package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MainTest {

    @Test
    void htmlDebeContenerMensajePrincipal() {
        String html = Main.buildHtml();

        assertTrue(html.contains("Hello from Java CI/CD!"));
        assertTrue(html.contains("<html lang=\"es\">"));
    }
}
