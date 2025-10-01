fun main(){
//    var finished: Boolean = false
//    var idCounter: Int = 0
//
//    while (!finished) {
//        print("Enter your name: ")
//        val name: String = readln()
//        print("Enter your course name: ")
//        val course: String = readln()
//        print("Enter your marks: ")
//        val marks: Double = readln().toDouble()
//
//        val student = Students(idCounter, name, course, marks)
//        idCounter++
//        print(student.toString())
//
//        println("Do you want to add another student?")
//        val addAnother = readln()
//        if (addAnother == "no"){
//            finished = true
//        }
//    }
    var student = Students(1, "Sarah", "English", 89.0)
    println(student.getGrade())
    println(student.didPass())
}