package com.heroicet.contract.functional.exceptable;

/**
 * BiExceptableFunction is a lambda expression which receives two specified types of arguments,
 * and returns a specified type of value. Able to throw checked exceptions.
 *
 * @param <A> First argument type for processing
 * @param <U> Second argument type for processing
 * @param <R> Return type at the end of the function
 * @param <E> Exception type that may be thrown
 */
@FunctionalInterface
public interface BiExceptableFunction<A,U,R,E extends Exception> {
    /**
     * Runs lambda instantiated method that requires two arguments and returns a value, may or not throw an
     * exception.
     */
    R apply(A arg1, U arg2) throws E;
}
