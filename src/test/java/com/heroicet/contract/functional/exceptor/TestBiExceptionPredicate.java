package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.BiExceptablePredicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBiExceptionPredicate {
    private static BiExceptablePredicate<Boolean,Boolean,Exception> biExceptablePredicate;

    static {
        biExceptablePredicate = (b1,b2) -> {
            if (b1) throw new Exception();
            return b2;
        };
    }

    @Test
    public void biExceptablePredicateThrows() {
        Assertions.assertThrows(Exception.class,() -> biExceptablePredicate.test(true,true));
    }

    @Test
    public void biExceptablePredicateDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> biExceptablePredicate.test(false,true));
    }

    public void biExceptablePredicateReturns() throws Exception {
        Assertions.assertFalse(biExceptablePredicate.test(false,false));
    }
}
