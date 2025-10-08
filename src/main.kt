fun main(){
    var finished: Boolean = false
    var idCounter: Int = 0
    val studentsList = mutableListOf<Students>()

    while (!finished) {
        print("Enter your name: ")
        val name: String = readln()
        print("Enter your course name: ")
        val course: String = readln()
        print("Enter your marks: ")
        val marks: Double = readln().toDouble()
        print("Are you an undergradte or masters student? ")
        val studentType: String = readln()
        val student =  when (studentType.lowercase()) {
            "undergraduate" -> Undergraduate(idCounter, name, course)
            "masters" -> Masters(idCounter, name, course)
            else -> null
            }
        idCounter++

        student?.mark = marks
        println(student?.toString())
        if (student != null) {
            studentsList.add(student)
        }


        println("Do you want to add another student?")
        val addAnother = readln()
        if (addAnother == "no"){
            finished = true
        }

        }
 for (student in studentsList){
     println(student.toString())
 }


    }
//    var student = Masters(1, "Sarah", "English")
//    print("Enter your marks: ")
//    var marks: Double = readln().toDouble()
//    student.mark = marks
//
//println("Marks: ${student.mark}, Grade ${student.getGrade()}, Passed? ${student.didPass()}")
