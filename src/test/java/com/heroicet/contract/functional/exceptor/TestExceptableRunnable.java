package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.ExceptableRunnable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableRunnable {
    private static ExceptableRunnable<Exception> throwingRunnable;
    private static ExceptableRunnable<Exception> safeRunnable;

    static {
        throwingRunnable = () -> {
            throw new Exception();
        };
        safeRunnable = () -> {};
    }

    @Test
    public void exceptableRunnableThrows() {
        Assertions.assertThrows(Exception.class,() -> throwingRunnable.run());
    }

    @Test
    public void exceptableRunnableDoesNotThrow() {
        Assertions.assertThrows(Exception.class,() -> safeRunnable.run());
    }
}
