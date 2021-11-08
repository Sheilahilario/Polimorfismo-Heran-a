# Kotlin - Polymorphism and Inheritance

Part 1: Exploring the HR System
Download the src folder and import the project into IntelliJ Idea
In this exercise, we'll create the Human Resources Management System mentioned in the theory section
Create the following class

![image](https://user-images.githubusercontent.com/68394577/140787273-e79e9413-1bc3-4190-b417-e95806b0e6ef.png)

Implement the methods:

fun timeToRetirement(): Int {
    // time to retirement = min(60 - age, 40 - yearsWorked)
}

fun vacationTimeLeft(): Int {
    // vacation time left = (daysWorked/360)*(30 - vacationDaysTaken)
}

fun calculateBonus(): Int {
    // bonus = 2.2*salary
}
Now, create a sales rep class that inherits the original employee class
The arrow used means inheritance in class diagrams

![image](https://user-images.githubusercontent.com/68394577/140787378-e4a344cb-5492-4b19-a53c-ca54ae65b1e6.png)

fun calculateComission(): Int {
    // comission = 0.1 * salesMade
}
Create a Java Class for sales manager:

![image](https://user-images.githubusercontent.com/68394577/140787425-b0cd10ec-cd72-4313-9656-c23f81a668d9.png)
fun calculateComission() {
    // 0.03 * all sales made by team
}
