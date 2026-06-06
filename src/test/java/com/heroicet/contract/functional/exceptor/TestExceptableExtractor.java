package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.Exceptable;
import com.heroicet.contract.functional.exceptable.ExceptableExtractor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExceptableExtractor {
    private static Exception referenceException = new Exception();

    private static ExceptableExtractor<Boolean,Exception> exceptableExtractor;

    static {
        exceptableExtractor = (b) -> {
            if (b) return referenceException;
            return null;
        };
    }

    @Test
    public void exceptableExtractorReturns() {
        Assertions.assertEquals(referenceException,exceptableExtractor.extract(true));
        Assertions.assertNull(exceptableExtractor.extract(false));
    }
}
