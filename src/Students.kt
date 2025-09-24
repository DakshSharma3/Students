class Students(val id: Int, val name: String, val course: String, val mark: Double){

    override fun toString(): String {
        return "Student name: $name \nCourse name: $course \nMarks: $mark \n"
    }

}