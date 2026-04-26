package com.heroicet.contract.functional.exceptor;

/**
 * runnable exceptor is a lambda interface that doesn't receive an argument
 * and doesn't return a value. Able to throw checked exceptions.<br>
 * <strong>IMPORTANT: runnable exceptor doesn't work as thread instance parameter.<strong/>
 *
 * @param <E> The type of error that is possible to be thrown inside the method.
 */
@FunctionalInterface
public interface RunnableExceptor<E extends Throwable> {
    void run() throws E;
}
