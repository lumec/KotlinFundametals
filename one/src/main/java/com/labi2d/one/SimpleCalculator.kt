package com.labi2d.one

import java.lang.NumberFormatException

/**
 * Program:
 * Simple Calculator
 *
 * Problem Statement:
 * This program accepts two numbers and one of the following arguments:
 * - "+"
 * - "-"
 * - "*"
 * - "/"
 *
 * If the numbers are valid and if the operator matches one of the above Strings [1a], execute the appropriate
 * mathematical function [2a]. Display this result in the console [3a].
 *
 * If the number are invalid or the operator do not match any of the above Strings [1b], display an error
 * message in the console [2b].
 *
 */

// Operators
val ADD: String = "+"
//Kotlin can infer that the variable is a String
val SUBSTRACT = "-"
val MULTIPLY = "*"
val DIVIDE = "/"

val ERROR_MESSAGE = "An error has occurred"


//Let's create two operands
var operandOne: Double = 0.0
var operandTwo = 0.0


//this function is executed when the program runs on the computer
fun main(args: Array<String>){

    getNumbers()

}

fun getNumbers(){
    println("Please enter the first number: ")
    val num1: String = readLine()!!

    println("Select one of the following operations: ")
    println("+")
    println("-")
    println("*")
    println("/")
    val operatorSymbol = readLine()!!

    println("Please enter the second number: ")
    val num2 = readLine()!!

    if(checkNumbers(num1, num2) && checkOperator(operatorSymbol)){
        start(operatorSymbol)
    }else{
        print(ERROR_MESSAGE)
    }

}

fun checkNumbers(num1: String, num2: String): Boolean{

    try {
        operandOne = num1.toDouble()
        operandTwo = num2.toDouble()
    }
    //if numbers are not Double, this exception is thrown
    catch (e: NumberFormatException){
        return false
    }
    return true
}

fun start(operatorSymbol: String){
    if(checkOperator(operatorSymbol)){
        displayResult(
            makeCalculation(operandOne, operandTwo, operatorSymbol)
        )
    }else{
        print(ERROR_MESSAGE)
    }

}


//this function returns true or false, based on if the operator matches our constants
/*fun checkOperator(symbol: String): Boolean{
	when(symbol){
		//equals
		ADD -> return true
		SUBSTRACT -> return true
		MULTIPLY -> return true
		DIVIDE -> return true
		//otherwise
		else -> return false
	}
}*/

//better function
fun checkOperator(symbol: String): Boolean{
    return when(symbol){
        //equals
        ADD ->  true
        SUBSTRACT ->  true
        MULTIPLY ->  true
        DIVIDE ->  true
        //otherwise
        else ->  false
    }
}

fun makeCalculation(opOne: Double, opTwo: Double, sym: String): String{
    return when(sym){
        ADD ->  (opOne + opTwo).toString()
        SUBSTRACT ->  (opOne - opTwo).toString()
        MULTIPLY ->  (opOne * opTwo).toString()
        DIVIDE ->  (opOne / opTwo).toString()
        //this statement is necessary if this function is called somewhere in our code
        else ->  ERROR_MESSAGE
    }
}

//Single expression syntax (for single line code snippets). You avoid writing brackets with this.
fun displayResult(result: String) = print("The result of the operation is $result")
