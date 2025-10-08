abstract class Students(val id: Int, val name: String, val course: String){

     var mark: Double = 0.0
        set (newMark){
            if (newMark in 0.0..100.0){
                field = newMark
            }
        }

    abstract fun getGrade(): String

    fun didPass(): Boolean{
        if (mark >= 40){
            return true
        }
        return false
    }

}