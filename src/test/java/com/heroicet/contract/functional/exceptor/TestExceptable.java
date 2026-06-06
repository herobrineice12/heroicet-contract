package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.Exceptable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptable {
    private static Exceptable<Boolean,Exception> exceptable;

    static {
        exceptable = (b) -> {
            if (b) throw new Exception();
        };
    }

    @Test
    public void exceptableThrows() {
        Assertions.assertThrows(Exception.class,() -> exceptable.apply(true));
    }

    @Test
    public void exceptableDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> exceptable.apply(false));
    }
}
