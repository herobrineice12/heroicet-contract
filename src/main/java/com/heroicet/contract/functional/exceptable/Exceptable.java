package com.heroicet.contract.functional.exceptable;

/**
 * Similar to Consumer functional interface in functionality, but this kind
 * allows to throw
 * cleaner exceptions compared to RuntimeExceptions, which requires an
 * additional try-catch
 * statement.<br>
 * This was created with forEach statements in mind.
 *
 * @param <A> The argument data type to be used as argument.
 * @param <E> The type of error that is possible to be thrown inside the method.
 */
@FunctionalInterface
public interface Exceptable<A, E extends Exception> {
  /**
   * Executes lambda function declared on interface instantiation and may throw or not a
   * type of exception.
   */
  void apply(A arg) throws E;
}
