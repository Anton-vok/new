package com.example.anew.forPy


import android.app.Application
import com.chaquo.python.PyObject
import com.chaquo.python.Python
import com.chaquo.python.android.AndroidPlatform

class Operation(
    var data     : String  = "",
    var sum      : Int     = 0,
    var name     : String  = "",
    var category : String  = "",
    var type     : Boolean = true
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
    fun getId(date: String):Pair<Int, Int>{
        //TODO
        return 1 to 0
    }
    fun getFromId(id: Int): Operation{
        //TODO
        return Operation()
    }
}