package com.heroicet.contract.functional.exceptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptor {
    @Test
    public void assertExceptor() {
        Exceptor<Void, Exception> exceptor = (v) -> {};
        Assertions.assertDoesNotThrow(() -> exceptor.apply(null));
    }

    @Test
    public void assertThrowingExceptor() {
        Exceptor<Void, Exception> exceptor = (v) -> {
            throw new Exception();
        };
        Assertions.assertThrows(Exception.class, () -> exceptor.apply(null));
    }
}
