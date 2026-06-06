package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.BiExceptableFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBiExceptableFunction {
    private static BiExceptableFunction<Boolean,Integer,Integer,Exception> biExceptableFunction;

    static {
        biExceptableFunction = (b1,b2) -> {
            if (b1) throw new Exception();
            return ++b2;
        };
    }

    @Test
    public void biExceptableFunctionThrows() {
        Assertions.assertThrows(Exception.class,() -> biExceptableFunction.apply(true,0));
    }

    @Test
    public void biExceptableFunctionDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> biExceptableFunction.apply(false,0));
    }

    @Test
    public void biExceptableFunctionReturns() throws Exception {
        Assertions.assertEquals(1,biExceptableFunction.apply(false,0));
    }
}