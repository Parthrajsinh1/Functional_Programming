## Overview

This folder demonstrates how Java lambda expressions evolve from a verbose anonymous inner-class to concise one-liners.  
Programs **1 → 7** progressively shorten the same behavior.  

Two additional programs explain:
- **Capturing vs Non-Capturing Lambdas**
- **Anonymous Inner Class vs Lambda**
- And specify which **Single Abstract Method (SAM)** is used in each lambda.

---

## Lambda Evolution (Prog 1 → Prog 7)

These programs show how the same logic becomes shorter and cleaner step by step:

- **Prog 1:** Starts with a long **Anonymous Inner Class** implementation.
- **Prog 2:** Converts the inner class into a **lambda expression** with a block body.
- **Prog 3:** Removes unnecessary parts to make it slightly shorter.
- **Prog 4:** Keeps the same logic but simplifies syntax.
- **Prog 5:** Removes braces `{}` for single-line lambdas.
- **Prog 6:** Moves toward **method references** where possible.
- **Prog 7:** Becomes a **final one-liner** — the shortest, cleanest lambda form.

🧠 The idea:  
Each step reduces boilerplate from **7–8 lines** to **1 line**, showing how lambdas simplify functional interface usage.

---

## Capturing vs Non-Capturing Lambdas

**Non-Capturing Lambda:**  
Does not use or depend on any variable from the outer scope.  
It’s **stateless** and can be easily reused.

**Capturing Lambda:**  
Uses (captures) a variable from the surrounding method or scope.  
The variable must be **effectively final** (not modified after initialization).

Example difference:
- Non-capturing → returns fixed data or performs independent logic.
- Capturing → depends on some local variable value during execution.

---

## Anonymous Inner Class vs Lambda

An **anonymous inner class** is a longer way to implement an interface with one abstract method.  
A **lambda expression** provides a **short, more readable** alternative to do the same job.

Both achieve the same result but lambdas:
- Remove extra syntax like `new Interface() { ... }`
- Automatically target the **Single Abstract Method (SAM)** of the interface
- Improve readability and reduce clutter

---

## Single Abstract Method (SAM) Usage

Every lambda expression in Java implements a **functional interface** that contains exactly **one abstract method**.

Common SAM interfaces used in lambda programs:

| Functional Interface | Method | Use Case |
|----------------------|---------|-----------|
| `Runnable` | `void run()` | Task execution (no input, no output) |
| `Callable<V>` | `V call()` | Task that returns a value |
| `Comparator<T>` | `int compare(T a, T b)` | Comparison logic |
| `Consumer<T>` | `void accept(T t)` | Consumes a value (no return) |
| `Supplier<T>` | `T get()` | Provides a value (no input) |
| `Function<T,R>` | `R apply(T t)` | Maps one value to another |
| `Predicate<T>` | `boolean test(T t)` | Tests a condition |

Each program in this folder demonstrates how one or more of these SAM interfaces can be used with lambda syntax.

---

## Key Learning Points

1. **Lambda expressions** are shorthand for anonymous classes with one abstract method.
2. Each step (Prog 1 → Prog 7) reduces code verbosity while keeping logic the same.
3. **Capturing lambdas** can use external variables (effectively final).
4. **Non-capturing lambdas** are stateless and reusable.
5. **Anonymous Inner Classes** → replaced by **Lambdas** for functional interfaces.
6. **SAM** (Single Abstract Method) determines what the lambda body implements.
7. The final goal: write cleaner, readable, and concise Java code.

---

## Summary Table (What Each Program Demonstrates)

| Program | Concept | Description |
|----------|----------|-------------|
| Prog 1 | Anonymous Inner Class | The long-form implementation of a functional interface |
| Prog 2 | Basic Lambda | Converts the inner class to a lambda with block syntax |
| Prog 3 | Shortened Lambda | Removes some unnecessary parts |
| Prog 4 | Cleaner Syntax | Uses fewer lines, more readable |
| Prog 5 | One-Line Lambda | Removes braces for single statements |
| Prog 6 | Method Reference | Uses existing method instead of lambda |
| Prog 7 | Final Short Form | The most concise, one-line lambda version |
| Extra 1 | Non-Capturing Lambda | Does not depend on outer variables |
| Extra 2 | Capturing Lambda | Uses variables from outer scope |
| Extra 3 | Anonymous Inner Class vs Lambda | Comparison between old and new syntax |

---

## Conclusion

This series of programs clearly shows how **Java Lambda Expressions** simplify the way we write functional-style code.  
By understanding **how the syntax shortens** and **what each lambda captures**, you’ll be able to:
- Write concise code
- Use functional interfaces effectively
- Replace anonymous inner classes with clean, modern lambda syntax

---

## Author  
**Parthrajsinh Gol**

---
