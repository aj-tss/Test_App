package com.example.taskmanagerapp


class Task {
    var name: String = ""
    var description: String = ""
    var isCompleted: Boolean = false

    data class Task(var name: String, var description: String, var isCompleted: Boolean)
}
