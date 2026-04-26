package com.heroicet.contract.functional.exceptor;

/**
 * exceptable supplier is a lazy lambda function that takes one specified type of argument and
 * returns a value. Able to throw checked exceptions.
 *
 * @param <R> Return type at the end of the function
 * @param <E> Exception type that may be thrown
 */
@FunctionalInterface
public interface ExceptableSupplier<R, E extends Exception> {
  R get() throws E;
}
