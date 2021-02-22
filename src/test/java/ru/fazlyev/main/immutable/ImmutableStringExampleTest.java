package ru.fazlyev.main.immutable;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class ImmutableStringExampleTest {
    @Test
    void shouldHaveCorrectLength() {
        String test = "Test";
        final ImmutableStringExample example = new ImmutableStringExample(test);

        test = "Test1";

        assertNotEquals(test.length(), example.getLength());
    }

    @Test
    void shouldHaveCorrectContent() {
        String test = "Test";
        final ImmutableStringExample example = new ImmutableStringExample(test);

        test = "Test1";

        assertNotEquals(test, example.getContent());
    }

    @Test
    void shouldHaveCorrectCreationDate() throws InterruptedException {
        final LocalDateTime now = LocalDateTime.now();
        Thread.sleep(200);
        final ImmutableStringExample example = new ImmutableStringExample("Test");

        assertNotEquals(example.getCreationDate(), now);
    }
}
