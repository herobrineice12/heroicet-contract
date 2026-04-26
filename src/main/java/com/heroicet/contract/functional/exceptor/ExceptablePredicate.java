package com.heroicet.contract.functional.exceptor;

/**
 * exceptable predicate is a testing lambda function that takes a specified
 * type of argument and returns a boolean value. Able to throw checked expressions.
 *
 * @param <A> Argument type for processing
 * @param <E> Exception type that may be thrown
 */
@FunctionalInterface
public interface ExceptablePredicate<A, E extends Exception> {
  /**
   * tests the method defined on interface instantiation.
   *
   * @return Returns a boolean value verifying predicate validation.
   */
  boolean test(A arg) throws E;
}
