class Students(var id: Int, var name: String, var course: String){

    var mark: Double = 0.0
        set (newMark){
            if (newMark in 0.0..100.0){
                field = newMark
            }
        }

    override fun toString(): String {
        return "Student name: $name \nCourse name: $course \nMarks: $mark \n"
    }
    fun getGrade(): String {
        var grade = when(mark){
            in 70.0..100.0 -> "First"
            in 60.0..69.0 -> "2/1"
            in 50.0..59.0 -> "2/2"
            in 40.0..49.0 -> "Third"
            in 0.0..39.0 -> "Fail"
            else -> "Unknown"
        }
        return grade
    }

    fun didPass(): Boolean{
        if (mark >= 40){
            return true
        }
        return false
    }

}