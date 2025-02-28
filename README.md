# Task Manager App
---

## Two Buttons
- Add Task
- Complete Task

## Steps
- Create a new project.
- Use Empty Views Activity.
- Design Basic Layout (activty_main.xml).
- Create a Class for Tasks with properties: name, description, isCompleted by creating a new Kotlin Class in the project's package directory.
- Import the class into MainActivty file.
- Intitalize lifecycle components along with the necessary buttons, toast message and notifications in the MainActivity file.
- Initialize mutable list in main_activity to store the tasks.
- Compile and run the app on an emulator or device.

## Activty Life Cycle
A series of methods called during different instances of an app's lifecycle
- onCreate - This callback fires during activity creation
- onStart - Makes Activty visible to user
- onResume - The state in which app interacts with the user
- onPause - First indication that user is leaving your activty
- onStop - Activity is no longer visible to user

## Toast and Notification
- showToast - small temporary pop-up message
- SendNotification - more persistent message (can appear even in background)

## Examples of Activtities:
- Viewing current list of to dos
- Adding a new task

# ADB commands
- check connected devices: `adb devices`
- List installed packages: `adb shell pm list packages`
- check installed package's details: `adb shell dumpsys package com.example.taskmanagerapp`
- show logs related to app: `adb logcat | grep "MainActivity"`
- clear app data: `adb shell pm clear com.example.taskmanagerapp`
- Check battery info: `adb shell dumpsys battery`
