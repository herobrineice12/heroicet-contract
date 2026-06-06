package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.ExceptableSupplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableSupplier {
    private static ExceptableSupplier<Boolean,Exception> throwingSupplier, safeSupplier;

    static {
        throwingSupplier = () -> {
            throw new Exception();
        };
        safeSupplier = () -> true;
    }

    @Test
    public void exceptableSupplierThrows() {
        Assertions.assertThrows(Exception.class, () -> throwingSupplier.get());
    }

    @Test
    public void exceptableSupplierDoesNotThrow() {
        Assertions.assertDoesNotThrow(() -> safeSupplier.get());
    }

    @Test
    public void exceptableSupplierReturns() throws Exception {
        Assertions.assertTrue(safeSupplier.get());
    }
}
