fun main() {
    // no need to use the new keyword
    var q  = Question()
    q.answer = "34"
//    q.name = "James"
    q.display()
    // use ${} for compound variables
    println("You said your answer was ${q.answer}")

}
class Question {
    var answer = ""
    val name = "Douglas"

    fun display() {
        // $ only for single variables
        println("You said $answer")
    }
}