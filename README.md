# Introduction

This document describes how to import a git maven project into Eclipse.



# Installation

Start Eclipse and open a workspace as follows:

`Eclipse > Workspace > C:\Users\John\TestProjects\MyWorkspace`



Next import the maven project from GIT

`Eclipse>File>Import>Check out Maven Projects from SCM`

*Ensure "Check out Head Revision" and "Check out All Projects" are checked.*

Click on `"Finish"`

*The project will be checked out with a serial number, such as "maven.1539259254695", but an Eclipse renaming error occurs prevents it from being renamed appropriately.*

***Work-around***

Either open the project with the serial number or close Eclipse and rename the project manually. The following instructions describes the latter.

Using File Explorer, renamed the project directory (e.g. `maven.1539259254695`) to an more appropriate name, such as `MyEclipseGitMavenProject`.

Next restart Eclipse and open the project from the file system as: 

`Eclipse > File > Open Projects from File System...`
`Import source: C:\Users\John\TestProjects\MyWorkspace\MyEclipseGitMavenProject`



In package explorer, a yellow drum beside the project name should appear after the project is automatically built.



# Run a test

Open a JUnit window as:

`Window > Show View > Other > Java > JUnit`

In the JUnit window, click the play button to run the tests.



# Make a change and commit it to Git through Eclipse

Make a change to a source file. For example make some change in com.example.TestGreeter.java

Window>Show View>Other>Git>Staging
Drag TestGreeter.java from the Unstaged Changes window to the Stages Changes window
Add comment to the Commit Message window.

>Commit and Push
>A message will appear saying thta it was pushed to origin.

Check on Github to ensure that the change was pushed at: https://github.com/SoftDevJohn/my-eclipse-git-maven-project/blob/master/src/test/java/com/example/TestGreeter.java.

XXXXX Ok here

In the Junit window, click the play button t run the tests.
----







xxxxx

Open a new windows command shell.

Change to the directory where you want the project to be created under.

`cd \dev\`



Checkout the repository by cloning it in the current directory:

`git clone https://github.com/SoftDevJohn/my-simple-git-maven-project.git`

The project is now cloned under the current directory as:

`c:\dev\`

​	`my-simple-got-maven-project`

​	.`git`

​	`docs`

​	`src`

​	.`gitignore`

​	`pom`.xml



# Build the project

Change into the project directory:

`cd ..\my-simple-git-maven-project`



Build the project:

`mvn package`



# Run tests

Run the maven tests by typing:

`mvn tests`



