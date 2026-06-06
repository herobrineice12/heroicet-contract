package com.heroicet.contract.functional.exceptable;

/**
 * BiExceptablePredicate is a testing lambda function that takes a specified
 * type of argument and returns a boolean value. Able to throw checked expressions.
 *
 * @param <A> First argument type for processing
 * @param <U> Second argument type for processing
 * @param <E> Exception type that may be thrown
 */
public interface BiExceptablePredicate<A,U,E extends Exception> {
    /**
     * Test the method defined on interface instantiation by taking two arguments and returning a non-null boolean value.
     * @return Returns a boolean value verifying predicate validation.
     */
    boolean test(A arg1, U arg2) throws E;
}
