fun main(){
    var finished: Boolean = false
    while (!finished){
        val university: University = University()
        print("Main Menu\n1) Add a student\n2) Search for student by ID\n3) Search for student by name\n4) quit\nEnter answer here: ")
        var choice: Int = readln().toInt()
        when(choice) {
            1 -> {}
            2-> {}
            3-> {}
            4 -> finished = true
            else -> println("invalid choice!")
        }
    }

    }