package com.heroicet.contract.functional.exceptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableFunction {
    @Test
    public void assertExceptableFunction() {
        ExceptableFunction<Void, Void, Exception> exceptor = (v) -> null;
        Assertions.assertDoesNotThrow(() -> exceptor.apply(null));
    }

    @Test
    public void assertThrowingExceptableFunction() {
        ExceptableFunction<Void, Void, Exception> exceptor = (v) -> {
            throw new Exception();
        };
        Assertions.assertThrows(Exception.class, () -> exceptor.apply(null));
    }
}
