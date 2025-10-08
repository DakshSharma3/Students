class Undergraduate(id: Int, name: String, course: String) : Students(id, name, course) {
    override fun getGrade(): String {
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

    override fun toString(): String {
        return "Student name: $name, Course name: $course, Course type: Undergraduate, Marks: $mark "
    }
}