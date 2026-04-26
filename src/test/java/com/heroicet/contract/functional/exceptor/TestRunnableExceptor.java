package com.heroicet.contract.functional.exceptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRunnableExceptor {
    @Test
    public void assertRunnableExceptor() {
        RunnableExceptor<Exception> exceptor = () -> {};
        Assertions.assertDoesNotThrow(exceptor::run);
    }

    @Test
    public void assertThrowingRunnableExceptor() {
        RunnableExceptor<Exception> exceptor = () -> {
            throw new Exception();
        };
        Assertions.assertThrows(Exception.class, exceptor::run);
    }
}
