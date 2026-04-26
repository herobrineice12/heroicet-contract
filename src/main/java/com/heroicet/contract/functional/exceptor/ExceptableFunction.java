package com.heroicet.contract.functional.exceptor;

/**
 * exceptable function is a function which receives and specified type of argument,
 * and returns a specified type of value. Able to throw checked exceptions.
 *
 * @param <A> Argument type for processing
 * @param <R> Return type at the end of the function
 * @param <E> Exception type that may be thrown
 */
@FunctionalInterface
public interface ExceptableFunction<A, R, E extends Exception> {
   /**
    * Runs lambda instantiated method and returns a value, may or not throw an
    * exception.
    */
   R apply(A arg) throws E;
}
