Since Checkstyle 3.4

Check that the `default` is after all the `case`s in a `switch` statement.

Rationale: Java allows `default` anywhere within the `switch` statement. But it is more readable if it comes after the last `case`.