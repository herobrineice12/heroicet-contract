package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.ExceptableFunction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableFunction {
    private static ExceptableFunction<Boolean,Boolean,Exception> exceptableFunction;

    static {
        exceptableFunction = (b) -> {
            if (b) throw new Exception();
            return true;
        };
    }

    @Test
    public void exceptableFunctionThrows() {
        Assertions.assertThrows(Exception.class,() -> exceptableFunction.apply(true));
    }

    @Test
    public void exceptableDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> exceptableFunction.apply(false));
    }

    @Test
    public void exceptableFunctionReturns() throws Exception {
        Assertions.assertTrue(exceptableFunction.apply(false));
    }
}
