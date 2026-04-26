package com.heroicet.contract.functional.exceptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableSupplier {
    @Test
    public void assertExceptableSupplier() {
        ExceptableSupplier<Void, Exception> exceptor = () -> null;
        Assertions.assertDoesNotThrow(exceptor::get);
    }

    @Test
    public void assertThrowingExceptableSupplier() {
        ExceptableSupplier<Void, Exception> exceptor = () -> {
            throw new Exception();
        };
        Assertions.assertThrows(Exception.class, exceptor::get);
    }
}
