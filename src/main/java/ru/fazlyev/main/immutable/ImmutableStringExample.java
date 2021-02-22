package ru.fazlyev.main.immutable;

import java.time.LocalDateTime;

public final class ImmutableStringExample {
    private final int length;
    private final String content;
    private final LocalDateTime creationDate;

    public ImmutableStringExample(String content) {
        this.content = new String(content.toCharArray());
        length = content.length();
        creationDate = LocalDateTime.now();
    }

    public int getLength() {
        return length;
    }

    public String getContent() {
        return new String(content.toCharArray());
    }

    public LocalDateTime getCreationDate() {
        return LocalDateTime.of(creationDate.toLocalDate(), creationDate.toLocalTime());
    }
}
