package com.example.task_manager

import com.example.taskmanagerapp.Task

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private val tasks = mutableListOf<Task>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Log when onCreate is called
        Log.d("com.example.task_manager.com.example.task_manager.MainActivity", "onCreate called")


        val addButton = findViewById<Button>(R.id.addTaskButton)
        addButton.setOnClickListener {
            val newTask = Task.Task("New Task", "This is a new task", false)
            tasks.add(newTask)  // Add the new task to the list
            showToast("Task Added!")  // Show a Toast message when a task is added
            sendNotification("New Task Added!")  // Send a Notification for the new task
        }

        // Button to complete a task
        val completeButton = findViewById<Button>(R.id.completeTaskButton)
        completeButton.setOnClickListener {
            if (tasks.isNotEmpty()) {
                val task = tasks[0]  // Get the first task in the list
                task.isCompleted = true  // Mark the task as completed
                showToast("${task.name} Completed!")  // Show a Toast message for completion
            }
        }
    }

    // Lifecycle Method - onStart
    override fun onStart() {
        super.onStart()
        Log.d("com.example.task_manager.com.example.task_manager.MainActivity", "onStart called")  // Log when onStart is called
    }


    override fun onResume() {
        super.onResume()
        Log.d("com.example.task_manager.com.example.task_manager.MainActivity", "onResume called")  // Log when onResume is called
    }


    override fun onPause() {
        super.onPause()
        Log.d("com.example.task_manager.com.example.task_manager.MainActivity", "onPause called")  // Log when onPause is called
    }
    // Lifecycle Method - onStop
    override fun onStop() {
        super.onStop()
        Log.d("com.example.task_manager.com.example.task_manager.MainActivity", "onStop called")  // Log when onStop is called
    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }


    private fun sendNotification(message: String) {// Show a Toast message
        // Your notification code goes here (from previous steps)
    }
}

private fun <E> MutableList<E>.add(element: Task.Task) {

}
