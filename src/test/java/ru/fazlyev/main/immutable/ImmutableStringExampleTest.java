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

        final int actual = example.getLength();

        assertNotEquals(test.length(), actual);
    }

    @Test
    void shouldHaveCorrectContent() {
        String test = "Test";
        final ImmutableStringExample example = new ImmutableStringExample(test);

        test = "Test1";

        final String actual = example.getContent();

        assertNotEquals(test, actual);
    }

    @Test
    void shouldHaveCorrectCreationDate() throws InterruptedException {
        final LocalDateTime now = LocalDateTime.now();
        Thread.sleep(200);
        final ImmutableStringExample example = new ImmutableStringExample("Test");

        assertNotEquals(example.getCreationDate(), now);
    }
}
