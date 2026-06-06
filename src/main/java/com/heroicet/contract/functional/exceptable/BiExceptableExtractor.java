package com.heroicet.contract.functional.exceptable;

/**
 * ExceptableExtractor focus on extracting possibly thrown errors by returning the exceptions instead of throwing it,
 * this is useful in cases where you are working with multiple exceptions cases which will hurt performance if immediately
 * thrown.
 *
 * @param <E> The type of error that can be returned during process
 */
@FunctionalInterface
public interface BiExceptableExtractor<A,U,E extends Exception> {
    /**
     * Takes two arguments for processing, then returns a failure exception mid-processing, else it returns null.
     * @param arg1 First argument of declared type
     * @param arg2 Second argument of declared type
     * @return Exception
     */
    E extract(A arg1, U arg2);
}
