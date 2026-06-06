package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.ExceptablePredicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptablePredicate {
    private static ExceptablePredicate<Boolean,Exception> exceptablePredicate;

    static {
        exceptablePredicate = (b) -> {
            if (b) throw new Exception();
            return true;
        };
    }

    @Test
    public void exceptablePredicateThrows() {
        Assertions.assertThrows(Exception.class,() -> exceptablePredicate.test(true));
    }

    @Test
    public void exceptablePredicateDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> exceptablePredicate.test(false));
    }

    @Test
    public void exceptablePredicateReturns() throws Exception {
        Assertions.assertTrue(exceptablePredicate.test(false));
    }
}
