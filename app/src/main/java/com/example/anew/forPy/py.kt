package com.example.anew.forPy

import com.chaquo.python.PyObject
import com.chaquo.python.Python


class py {
    var py = Python.getInstance()
    var zipfile = py.getModule("su")
    var hui = zipfile.callAttr("sum",1)

    fun pr(){
        println(hui)
        println(zipfile)
        println(hui)
    }
}