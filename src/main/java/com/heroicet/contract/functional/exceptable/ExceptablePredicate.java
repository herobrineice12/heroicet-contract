package com.heroicet.contract.functional.exceptable;

/**
 * ExceptablePredicate is a testing lambda function that takes a specified
 * type of argument and returns a boolean value. Able to throw checked expressions.
 *
 * @param <A> Argument type for processing
 * @param <E> Exception type that may be thrown
 */
@FunctionalInterface
public interface ExceptablePredicate<A, E extends Exception> {
  /**
   * Tests the method defined on interface instantiation by taking one argument and returning a non-null boolean value.
   * @return Returns a boolean value verifying predicate validation.
   */
  boolean test(A arg) throws E;
}
