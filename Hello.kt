/*
 * Reference: https://github.com/Kotlin/kotlin-examples/blob/master/maven/hello-world/src/main/kotlin/Hello.kt
 */
package hello

fun getHelloString() : String {
    return "Hello, world!"
}

fun main(args : Array<String>) {
    println(getHelloString())
}
