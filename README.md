<h1 style="background: linear-gradient(90deg, #7C3AED, #EC4899, #F59E0B, #10B981); color: white; text-align: center; padding: 1rem 2rem; border-radius: 12px; font-family: Arial, sans-serif;">Kotlin</h1>

Expressions and statements

In Kotlin, if is an expression, not a statement. So if returns something.

`fun max(a: Int, b: Int): Int = if (a > b) a else b`
If a function is written with its body in curly braces, we say that this function has a block
body. If it returns an expression directly, it has an expression body.

You could simplify your max function even more and omit the return type:
`fun max(a: Int, b: Int) = if (a > b) a else b`

Kotlin has type inference, that is, the compiler can figure out the type of a variable or expression automatically. So you can omit the type of a variable if it can be inferred from the initializer:
`val a = 1 // Int`

| Keyword | Meaning |
| --- | --- |
| `val` | Read-only reference (like `final` in Java). The value cannot be changed once assigned, although the object’s properties can still change. |
| `var` | Mutable reference. The value can be reassigned. |


In Kotlin is easy to use String templates [StringTemplate.kt](src/main/kotlin/StringTemplate.kt)
`println("Hello, $name")`

## Classes and Properties in Kotlin

A simple class in Java needs a lot of code (getters, setters, constructors, etc.) to be written. 
In Kotlin, you can write a simple class in one line:

`class Person(val name: String, var age: Int)`

Note that the modifier public disappeared, Kotlin use public by default


`class Person(
    val name: String,
    var isStudent: Boolean
)`

Is equivalent to a Person class in Java with a constructor, getters and setters for the properties name and isStudent.
Kotlin will consder behind the scenes name as private final and isStudent as private, but with a public getter and setter.


| Keyword | Meaning                                         |
| --- |-------------------------------------------------|
| `val` | generate final and getters                                                |
| `var` | Mgenerate private field, public getter and setter |