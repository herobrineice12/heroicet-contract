package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.BiExceptable;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBiExceptable {
    private static BiExceptable<Boolean,Void,Exception> exceptable;

    static {
        exceptable = (b,v) -> {
            if (b) throw new Exception();
        };
    }

    @Test
    public void biExceptableThrows() {
        Assertions.assertThrows(Exception.class,() -> exceptable.apply(true,null));
    }

    @Test void biExceptableDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> exceptable.apply(false,null));
    }
}
