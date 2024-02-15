package com.example.anew.forPy

class Operation(
    var data     : String  = "",
    var sum      : Int     = 0,
    var name     : String  = "",
    var category : String  = "",
    var type     : Boolean = true
)

class Back {
    fun add(operation: Operation):Int{
        //TODO
        return 0
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