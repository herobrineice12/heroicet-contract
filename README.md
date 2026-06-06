# Heroicet Contracts

This is a repository dedicated for interface contract development,
aimed to be used as external jar package file library contracts.

The purpose of this repository is to keep userful auxiliary interfaces which
solves language limitations and functionality gaps that isn't directly related
to a specific project.

The process selection for add new contracts requires resolve some early questions:

* Is this something new compared to what is already done in the repository?
  * If not. Is this absolutely necessary? or I must say, a 'game changer' feature?
* Does this works independently of any project?
* The number of contracts are remotely relevant for a change to be necessary on the repository?
* This can be separated on a distinct package relative to the existent ones?
* Is this userful?

# Features

This project feature some groups of contracts that need to be specified and dissected at the README,
the objective of the project is to be future-resistant just like the Java language.
Breaking changes should not be remotely close to common, if inexistent.

From now on, the current available project interfaces.

## Exceptable contracts

These contracts are composed by a group 5 of interfaces:

* Exceptable
* ExceptableRunnable
* ExceptableExtractor
* ExceptableFunction
* ExceptableSupplier
* ExceptablePredicate
* BiExceptable
* BiExceptableExtractor
* BiExceptableFunction
* BiExceptablePredicate

Their differential is the possibility of throwing checked exception,
giving the developer more flexibility through lambda functions which used
to take an entire try-catch and a throw new runtime exception just to be able to
use a specific method

### Exceptable

Exceptable is the principal functional interface with a generic signature for two values,
an argument class type and an exception subclass type:

```java
// com.heroicet.contract.functional.exceptable.Exceptable
public interface Exceptable<Argument, Exception> {}
```

It exposes an `apply(arg)` method which receives a value and doesn't return any.

### ExceptableRunnable

RunnableException is a counterpart to Runnable lambda interfaces,
but this one takes only one signature value compared to exceptor:

```java
// com.heroicet.contract.functional.exceptable.ExceptableRunnable
public interface ExceptableRunnable<Exception> {}
```

It exposes a `run()` method which doesn't receive arguments and doesn't return values.<br>

**IMPORTANT:** Although it is called 'runnable', this contract doesn't work as a `Thread()` class parameter.
This could be made possible, 
but the idea of an interface able to throw exceptions on separated thread is catastrophic,
and would also take an enormous amount of time and effort to develop and make it safe to use.

### ExceptableExtractor

ExceptableExtractor is an interface focused on return exception instances rather than throwing it directly.
This is important on the case sequential operations is needed to be made and exceptions can be thrown, which
by normal mean it would hurt performance pretty badly.

```java
// com.heroicet.contract.functional.exceptable.ExceptableExtractor
public interface ExceptableExtractor<Argument, Exception> {}
```

It exposes a `extract(arg)` method, which will return an exception or null.

### ExceptableFunction

This is a counterpart for Function lambda interface,
this one take three signature values:

```java
// com.heroicet.contract.functional.exceptable.ExceptableFunction
public interface ExceptableFunction<Argument, Return, Exception> {}
```

It exposes an `apply(arg)` method, which takes a specified argument and returns a value.

### ExceptableSupplier

ExceptableSupplier is a functional interface based on oracle's jdk implementation,
it takes 2 signature values:

```java
// com.heroicet.contract.functional.exceptable.ExceptableSupplier
public interface ExceptableSupplier<Return, Exception> {}
```

The interface exposes a `get()` method which returns a value, but doesn't take any arguments.

### ExceptablePredicate

The ExceptablePredicate is used to validation, this one take two signature values:

```java
// com.heroicet.contract.functional.exceptable.ExceptablePredicate
public interface ExceptablePredicate<Argument, Exception> {}
```

It exposes a `test(arg)` method which takes an argument and returns a boolean.

### BiExceptable

BiExceptable is a double argument counterpart of Exceptable, it works similarly too.

```java
// com.heroicet.contract.functional.exceptable.BiExceptable
public interface BiExceptable<Argument, Argument, Exception> {}
```

The interface exposes an `apply(arg1,arg2)` to its function.

### BiExceptableExtractor

BiExceptorExtractor is a double argument variance of ExceptabelExtractor that works similarly to its base

```java
// com.heroicet.contract.functional.exceptable.BiExceptableExtractor
```

It exposes an `extract(arg1,arg2)`

### BiExceptableFunction

BiExceptableFunction is a double argument counterpart of ExceptableFunction, it works similarly.

```java
// com.heroicet.contract.functional.exceptable.BiExceptableFunction
public interface BiExceptableFunction<Argument, Argument, Exception> {}
```

The interface exposes an `apply(arg1,arg2)` to its processing.

### BiExceptablePredicate

BiExceptablePredicate is a double argument counterpart of ExceptablePredicate, it works similarly to it.

```java
// com.heroicet.contract.functional.exceptable.BiExceptablePredicate
public interface BiExceptablePredicate<Argument, Argument, Exception> {}
```

The interface exposes a `test(arg1,arg2)` to its execution.

# Usage

You can use this library by compiling in your local machine or downloading
the latest release on the releases page.

### Cloning and compiling the project

Firstly you will need maven, you can download it using your package manager or downloading
it from the Apache Maven site.
After installing it, you will need to go to your terminal and enter these commands:

```bash
git clone https://github.com/herobrineice12/heroicet-contract
cd heroicet-contract
mvn package
ls target/heroicet-contract*.jar
```

### Downloading from the release page

You can also go to the page [releases page](https://github.com/herobrineice12/heroicet-contract/releases)
and download the preferred version of your choice