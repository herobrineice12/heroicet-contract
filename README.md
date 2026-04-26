# Heroicet Contracts

This is a repository dedicated for interface contract development,
aimed to be used as external jar file library contracts.

The objective of this repository is to keep an organized,
dedicated, scalable and centralized way of keeping usable interfaces
without having the one-project-available problem.

# Features

### Exceptor contracts

These contracts are composed by a group 5 of interfaces:

* Exceptor
* RunnableExceptor
* ExceptableFunction
* ExceptableSupplier
* ExceptablePredicate

Their differential is the possibility of throwing checked exception,
giving the developer more flexibility through lambda functions which used
to take an entire try-catch and a throw new runtime exception just to be able to
use a specific method

### Exceptor

Exceptor is the principal functional interface with a generic signature for two values,
an argument class type and an exception subclass type:

```java
// com.heroicet.contract.functional.Exceptor
public interface Exceptor<Argument, Exception> {}
```

It exposes an `apply(arg)` method which receives a value and doesn't return any.

### RunnableException

RunnableException is a counterpart to Runnable lambda interfaces,
but this one takes only one signature value compared to exceptor:

```java
// com.heroicet.contract.functional.RunnableExceptor
public interface RunnableExceptor<Exception> {}
```

It exposes a `run()` method which doesn't receive arguments and doesn't return values.<br>

Although it is called 'runnable', this contract doesn't work as a `Thread()` class parameter.
This could be made possible,
but the idea of a lambda function able to throw exceptions on separated is catastrophic.
The idea would also take an enormous amount of time and effort to develop in a way that is safe to execute.

### ExceptableFunction

This is a counterpart for Function lambda interface,
this one take three signature values:

```java
// com.heroicet.contract.functional.ExceptableFunction
public interface ExceptableFunction<Argument, Return, Exception> {}
```

It exposes an `apply(arg)` method, which takes a specified argument and returns a value.

### ExceptableSupplier

ExceptableSupplier is a functional interface based on oracle's jdk implementation, it takes 2 signature values:

```java
// com.heroicet.contract.functional.ExceptableSupplier
public interface ExceptableSupplier<Return, Exception> {}
```

The interface exposes a `get()` method which returns a value, but doesn't take any arguments.

### ExceptablePredicate

The ExceptablePredicate is used to validation, this one take two signature values:

```java
public interface ExceptablePredicate<Argument, Exception> {}
```

It exposes a `test(arg)` method which takes an argument and returns a boolean.

# Usage

You can use this library by compiling in your local machine or downloading the latest release on the releases page.

### Cloning and compiling the project

Firstly you will need maven, you can download it using your package manager or downloading it from the Apache Maven site.
After installing it, you will need to go to your terminal and enter these commands:

```bash
git clone https://github.com/herobrineice12/heroicet-contract
cd heroicet-contract
mvn package
ls target/heroicet-contract*.jar
```

