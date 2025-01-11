package com.example.androidtodoapp.ui.theme

import com.example.androidtodoapp.Todo
import java.util.Date

object TodoManager {
    private val todolist = mutableListOf<Todo>()

    fun getAllTodo(): List<Todo> {
        return todolist
    }

    fun addTodo(title: String) {
        todolist.add(Todo((System.currentTimeMillis().toInt()), title, Date()))
    }

    fun deleteTodo(id: Int) {
        todolist.removeIf {
            it.id == id
        }
    }

}