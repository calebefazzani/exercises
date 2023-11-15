package org.example.chapter2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingCharactersTest {
    private CountingCharacters cc;
    private final String HELLO = "hello";

    @BeforeEach
    public void init() {
        cc = new CountingCharacters();
    }

    @Test
    public void shouldContainText() {
        boolean contains = cc.count(HELLO).contains(HELLO);
        assertTrue(contains);
    }

    @Test
    public void shouldContainTextLength() {
        assertTrue(cc.count(HELLO).contains(String.valueOf(HELLO.length())));
    }

}