# Kotlin map function exception with empty list
This repository demonstrates a common error encountered when using the `map` function in Kotlin with an empty list. The `map` function transforms each element of a collection into a new element based on a provided lambda function.  However, if the collection is empty, applying the lambda function will result in a runtime error.

## Problem
The provided code attempts to use `map` on an empty list. This causes a runtime error because the lambda function is not executed, leading to an exception.

## Solution
The solution involves adding a check to handle the case where the list is empty. This prevents the exception and provides a more robust solution.