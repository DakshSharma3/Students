class University {
    val students = mutableListOf<Students>()

    fun enrolStudent(student: Students): Boolean{
        val completed: Boolean = students.add(student)
        if (completed) {
            return true
        }else{
            return false
        }
    }

    fun findStudentById(id: Int): Students?{
        for (student in students){
            if (student.id == id){
                return student
            }
        }
        return null
    }
    fun findStudentsByName(name: String): List<Students>{
        val studentsFound = mutableListOf<Students>()
        for (student in students){
            if (student.name == name){
                studentsFound.add(student)
            }
        }
        return studentsFound
    }
}