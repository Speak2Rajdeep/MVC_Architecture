package com.example.mvc_architecture.models

import java.util.*

/**
 * Created by Rajdeep Sarkar on 16-02-2023.
 */
class UserModel : Observable() {

    private val list: MutableList<Int>

    init {
        list = ArrayList(3)

        list.add(0)
        list.add(0)
        list.add(0)
    }

    fun getValue(index: Int): Int {
        return list[index]
    }

    fun setValue(index: Int) {
        list[index] = list[index] + 1
        setChanged()
        notifyObservers()
    }
}