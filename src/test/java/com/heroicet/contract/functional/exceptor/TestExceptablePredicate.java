package com.heroicet.contract.functional.exceptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptablePredicate {
    @Test
    public void assertExceptablePredicate() {
        ExceptablePredicate<Void, Exception> exceptor = (v) -> true;
        Assertions.assertDoesNotThrow(() -> exceptor.test(null));
    }

    @Test
    public void assertThrowingExceptablePredicate() {
        ExceptablePredicate<Void, Exception> exceptor = (v) -> {
            throw new Exception();
        };
        Assertions.assertThrows(Exception.class, () -> exceptor.test(null));
    }
}
