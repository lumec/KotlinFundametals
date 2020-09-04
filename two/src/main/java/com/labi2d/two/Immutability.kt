package com.labi2d.two
//Recommendations:
// 1. Make your data as immutable or unchangeable as possible
// 2- Make your data as private as possible

//const and val are read-only references

/*
Constants:
 1. can just hold primitive types or Strings

      Primitive data types:

                 |-Byte
      *Integer ->|-Short
                 |-Int
                 |-Long


      *Floating-Point->|-Double
                       |-Float

      *Boolean

      *Character

 2. Their values are known at compile time

 3. not need to be created over and over again. They improve efficiency of the program because
 a space in memory is assigned specifically for them

 Use them when the information is always the same even when the program runs
*/
const val TAKE_PHOTO_CODE = 101

// If the information is only used in specific places, consider making it private or protected
private const val ADD = "+"


/*
Val:
 1. The value is assigned at runtime

 Use it when the information is unchangeable during the runtime but changes every time the program runs
 Example: to store a value fetched from internet
*/

val userName: String = "Luigi"

fun main() {

    println("Please enter your name: ")
    val name: String = readLine()!!
    println("your name is $name")

    //this will throw an error because val is immutable
    //userName = name

    println("the code to take a picture is $TAKE_PHOTO_CODE")
    println("the gravity of Earth is $EARTH_GRAVITY m/s²" )
    println(CONNECTION_ESTABLISHED_MESSAGE)
}

//When we pass arguments to a function, new references are created for each argument, that point to the same addresses
//in memory space. In Kotlin, the new references are always of type val
fun doSomething(argument: String){
    //Val may not be reassigned!
    //argument = ""
}