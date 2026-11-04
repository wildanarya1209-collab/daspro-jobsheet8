# JOBSHEET 8 - LOOPS 2

## Student Identity

- Name: Wildan Arya Indradiansyah
- Student ID (NIM): 264107020257
- Class / No. Attendance : TI-1I / 30

---

# 1. Objectives

The objectives of this practicum are:

1. Students can understand the concept of nested loops in algorithms.
2. Students can understand the flow of nested loops.
3. Students can recognize the syntax of nested loops.
4. Students can apply nested loops to solve a simple case study.

---

# 2. Labs Activities

## 2.1 Experiment 1: Review of Loops 1

This experiment is a review of the for loop before learning nested loops. The program reads a positive integer n and prints the character \* side by side n times. It uses print, not println, so the stars stay on the same line.

### 2.1.1 Java Program Code

```java
import java.util.Scanner;

public class Star30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
        sc.close();
    }
}
```

### 2.1.2 Running Results / Output Screenshot

> Insert the screenshot of the program output here. (To be completed - no screenshot has been provided yet.)

Expected output (example only, calculated from the code; not yet confirmed by running the program). The number after = is the input.

```text
Enter the value of n = 5
*****
```

For n = 3 the program should print 3 stars (\*\*\*), and for n = 7 it should print 7 stars (\*\*\*\*\*\*\*). (The real numbers from the test runs are to be completed.)

### 2.1.3 Answers to Questions / Reflection Questions

Question 1: If the initialization i = 1 is changed to i = 0 without changing the condition, how many \* characters are printed when n = 5? Explain.

Answer: 6 stars are printed. The loop now starts at i = 0 and still stops after i <= 5, so i becomes 0, 1, 2, 3, 4, and 5. That is 6 rounds, and each round prints one star.

Question 2: If the condition i <= n is changed to i < n, how many times does the loop run when n = 5? Why is the result different?

Answer: The loop runs 4 times, so 4 stars are printed. i starts at 1 and the loop stops as soon as i is 5, because 5 < 5 is false. With <= the value 5 is still included, with < it is not.

Question 3: Predict the output of the following code fragment when n = 9, then verify it by replacing the FOR loop in your program and running it. Modify this code so that it prints the odd positive numbers that do not exceed n.

```java
for (int i = 2; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

Answer: The loop starts at 2 and adds 2 each round, so i becomes 2, 4, 6, and 8. When i is 10, the condition 10 <= 9 is false and the loop stops. The predicted output is:

```text
2 4 6 8 
```

(To be completed - verify this by running the program.)

To print the odd positive numbers, the loop must start at 1. It still adds 2 each round:

```java
for (int i = 1; i <= n; i += 2) {
    System.out.print(i + " ");
}
```

For n = 9 the expected output is 1 3 5 7 9.

Question 4: Explain why changing the increment i++ to i-- (with the condition still i <= n) makes the loop run endlessly.

Answer: i starts at 1 and gets smaller every round (1, 0, -1, -2, and so on). It is always smaller than n for a positive n, so the condition i <= n never becomes false. The loop keeps printing stars and does not stop in a reasonable time. I did not run this version. If it is started by mistake, it can be stopped with Ctrl + C in the terminal.

---

## 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)

This experiment prints a rectangle of stars with a nested for loop. The user enters the number of rows and the number of columns. The outer loop controls the rows, and the inner loop controls the columns. For rows = 3 and columns = 6, the output is 3 lines with 6 stars each.

### 2.2.1 Java Program Code

```java
import java.util.Scanner;

public class Rectangle30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
```

### 2.2.2 Running Results / Output Screenshot

> Insert the screenshot of the program output here. (To be completed - no screenshot has been provided yet.)

Expected output (example only, taken from the job sheet; not yet confirmed by running the program):

```text
Enter the number of rows: 3
Enter the number of columns: 6
******
******
******
```

Expected output for the other two inputs in the job sheet (example only, calculated from the code):

```text
Enter the number of rows: 4
Enter the number of columns: 2
**
**
**
**
```

```text
Enter the number of rows: 1
Enter the number of columns: 5
*****
```

### 2.2.3 Answers to Questions / Reflection Questions

Question 1: Explain the function of the variables i and j in the program.

Answer: i is the counter of the outer loop. It counts the rows, so it decides how many lines are printed. j is the counter of the inner loop. It counts the stars in one row, so it decides how many stars are printed on each line.

Question 2: How many times are the outer loop, the inner loop, and the statement print("\*") executed for rows = 4 and columns = 7?

Answer: The outer loop runs 4 times. The inner loop runs 7 times for each round of the outer loop, so it runs 4 x 7 = 28 times in total. The statement print("\*") is inside the inner loop, so it is executed 28 times.

Question 3: What happens if the bounds of the outer and inner loops are swapped (the outer loop uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.

Answer: The outer loop would run 6 times and the inner loop would run 3 times in each round. The program would print 6 lines with 3 stars each, not 3 lines with 6 stars. The shape turns around (6 rows and 3 columns). The total number of stars is still 18.

Question 4: Explain the effect of removing System.out.println(); after the inner loop.

Answer: The cursor never moves to a new line, so all the stars are printed on one single line. For rows = 3 and columns = 6, the output would be 18 stars in a row (\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*\*), not a rectangle.

Question 5: Modify the program so that the printed character is #, then commit and push the changes to GitHub.

Answer: Only the character inside print is changed:

```java
for (int i = 1; i <= rows; i++) {
    for (int j = 1; j <= columns; j++) {
        System.out.print("#");
    }
    System.out.println();
}
```

For rows = 3 and columns = 6, the expected output is three lines of ######. (To be completed - add the GitHub link after the commit and push.)

---
