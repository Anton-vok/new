import com.chaquo.python.PyObject
import com.chaquo.python.Python




class Operation(
    var data     : String  = "",
    var sum      : Int     = 0,
    var name     : String  = "",
)

class Back {

    val py: Python = Python.getInstance()
    val controllerModule: PyObject = py.getModule("app")
    val controller: PyObject = controllerModule.callAttr("App")

    fun add(operation: Operation):Int{
        var type = "expenses"
        var adoduass = controller.callAttr("add_into_table", operation.sum, operation.data, operation.name, type)

        return adoduass.toInt()
    }
}
fun main(){
    var op = Operation()
    var g= Back()
    var t = g.add(op)
    print(t)
}