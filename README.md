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

# Git Basics
- Commit:
  	Snapshot of a project
  	git commit 

- Branch:
	Act as Pointers to a specific commit
	eg: git branch main

- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
	eg: git Rebase bugFix
	
- Git Hash: 
		Unique identifier for every single commit in a Git repository.
		Generated using SHA-1; 40-char string of hexadecimal
		therefore, *git log
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else* and *relative refs* were introduced.
		Git is smart about hashes. It only requires you to specify enough characters of the hash until it uniquely identifies the commit.
		
- Relative refs:
	    Moving upwards one commit at a time with ^
	    Moving upwards a number of times with ~<num>
	    
	    eg:
	    git checkout C3 -> move to commit C3
	    git checkout HEAD^ -> check the parent
	    git checkout HEAD^ -> Checl C3's grandparent
	    "~" operator - to move a lot of levels up in the commit tree by taking a trailing number
	    eg: git checkout HEAD~4
	
- Branch Forcing:
	-f can be used to directly reassign a branch to a commit
	-f Helps us quickly move a branch to that location
	eg: git branch -f main HEAD~3
	NOTE: in a real environment git branch -f command is not allowed for your currennt branch
	    
- Head:
	Symbolic name for the currently checked out commit
	basically what you're working on top of 
	Detaching head: attaching it to a commit instead of a branch
	eg: git checkout c1; git checkout main;
	    git commit; git checkout c2 
	    
	working of the command `git checkout C1` a.ka. attacking it to a commit instead of a branch:
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
- Checkout:
	Lets you navigate between the branches created by git branch.
	eg: git checkout main

- Merge:
	Used to combine work from two different features
	Creates a special commit that has two unique parents (Union Operation)
	eg: git merge main
	
- Rebase:
	Used to make linear sequence of commits
	copies and plops them down somewhere else
		Before: HEAD -> main -> C1 
		After: HEAD -> C1
	
- Revealing HEAD after and before a commit
	git checkout C1
	git checkout main
	git commit
	git checkout c2
	
- Reversing Changes in Git
	a) Has two components: 
		Low-Level - Staging individual files/chunks
		High-Level - How the changes are actually reversed
	
	b) Two primary ways to undo changes: git reset and git revert 
		i) git reset:
			Like "rewriting history"
			Will move a branch backwards as if the commit had never been made in the first place
			Doesn't work well for remote branches
			eg: git reset HEAD~1
			
		ii) git revert:
			Reverses changes and shares it with others
			Works better for remote branches
			eg: git revert HEAD
	
- Creating a pull request
		to propose and collaborate changes
		these changes are proposed in a branch other than default
		if you don't have write permission for repo to create new branch -> Fork repo
		
