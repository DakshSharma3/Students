class Masters(id: Int, name: String, course: String) : Students(id, name, course) {
    override fun getGrade(): String {
        var grade = when(mark){
            in 70.0..100.0 -> "Distinction"
            in 60.0..69.0 -> "Merit"
            in 40.0..59.0 -> "Pass"
            in 0.0..39.0 -> "Fail"
            else -> "Unknown"
        }
        return grade
    }
}