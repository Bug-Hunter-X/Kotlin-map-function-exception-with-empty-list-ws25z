```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = if (emptyList.isEmpty()) emptyList else emptyList.map { it * 2 }
    println(emptyResult) // Output: []
    
    //Alternative solution using orEmpty
    val anotherEmptyResult = emptyList.map {it *2}.orEmpty() 
    println(anotherEmptyResult) // Output: []
}
```