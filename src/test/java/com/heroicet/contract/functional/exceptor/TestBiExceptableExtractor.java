package com.heroicet.contract.functional.exceptor;

import com.heroicet.contract.functional.exceptable.BiExceptableExtractor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestBiExceptableExtractor {
    private static Exception referenceException = new Exception();

    private static BiExceptableExtractor<Boolean,Void,Exception> exceptableExtractor;

    static {
        exceptableExtractor = (b,v) -> {
            if (b) return referenceException;
            return null;
        };
    }

    @Test
    public void exceptableExtractorReturns() {
        Assertions.assertEquals(referenceException,exceptableExtractor.extract(true,null));
        Assertions.assertNull(exceptableExtractor.extract(false,null));
    }
}
