fun main() {
    // no need to use the new keyword
    var q:Question?  = Question()
    q?.answer = "45"
//    q.name = "James"
    q?.display()
    // use ${} for compound variables
    println("You said your answer was ${q?.answer}")

    // if statements OR we can use the other syntax
    val message = if (q?.answer == q?.correct) {
        "You are correct"
    }else {
        "Try again"
    }
    println(message)

    val number:Int? = try {
        Integer.parseInt(q?.answer)
    } catch (e: NumberFormatException) {
        null
    }
    println("Number is $number")

    // loops
    // while and do while same as javascript
    var ages = listOf(1, 2, 3)
    for (i in ages) {
        println(i)
    }
    var num = 1..10
    for (i in num) {
        println(i)
    }
    for (i in 1..5){
        println(i)
    }
    for (i in 'a'..'z'){
        println(i)
    }
}
class Question {
    var answer:String? = null
    var correct = "45"
    val name = "Douglas"

    fun display() {
        // $ only for single variables
        println("You said $answer")
    }
    fun printResult() {
        when (answer) {
            correct -> print("you are correct")
            else -> print("Try again")
        }
    }
}