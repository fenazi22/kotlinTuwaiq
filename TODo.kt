data class Taskinfo(var id: Int, var name: String, var completed: Boolean = false) {

}

class Task {


    fun printTaskinfo(Taskinfo: Taskinfo) {
        println("ID: ${Taskinfo.id},  Name: ${Taskinfo.name}, completed: ${Taskinfo.completed}")
    }

    fun addDTask(add: String): ArrayList<Taskinfo> {
       var  array= arrayListOf<Taskinfo>()
        return array
    }
    fun printall(){
        val add = null
        for (i in 0 ..add?.let { addDTask(it).lastIndex }!!) {
            println("All Task: ${add?.let { addDTask(it) }?.get(i)}")
        }
    }


    }




fun main() {
    val Taskinfo1 = Taskinfo(1, "Faisal")
    val Taskinfo2 = Taskinfo(2, "Abdullah")

    var task1 = Task().also {

        it.addDTask("Faisal")
    }
    task1.printall()
}


















