import java.util.*;
class Student {
    int rolino;
    int mark1;
    int mark2;
    int mark3;
    
    public Student(int rolino, int mark1, int mark2, int mark3) {
        this.rolino = rolino;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
}

public class Studenthighestmarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            int rolino = sc.nextInt();
            int mark1 = sc.nextInt();
            int mark2 = sc.nextInt();
            int mark3 = sc.nextInt();
            students[i] = new Student(rolino, mark1, mark2, mark3);
        }
        
        // Calculate and print total marks of each student
        for (int i = 0; i < n; i++) {
            int total = students[i].mark1 + students[i].mark2 + students[i].mark3;
            System.out.println(total);
        }
        
        // Find highest marks in each subject with roll number
        int highest1 = Integer.MIN_VALUE;
        int highest2 = Integer.MIN_VALUE;
        int highest3 = Integer.MIN_VALUE;
        int highest1Roll = -1;
        int highest2Roll = -1;
        int highest3Roll = -1;
        for (int i = 0; i < n; i++) {
            if (students[i].mark1 > highest1) {
                highest1 = students[i].mark1;
                highest1Roll = students[i].rolino;
            }
            if (students[i].mark2 > highest2) {
                highest2 = students[i].mark2;
                highest2Roll = students[i].rolino;
            }
            if (students[i].mark3 > highest3) {
                highest3 = students[i].mark3;
                highest3Roll = students[i].rolino;
            }
        }
        System.out.println(highest1Roll + " " + highest1);
        System.out.println(highest2Roll + " " + highest2);
        System.out.println(highest3Roll + " " + highest3);
        
        // Find student who obtained the highest total marks
        int highestTotal = Integer.MIN_VALUE;
        int highestTotalRoll = -1;
        for (int i = 0; i < n; i++) {
            int total = students[i].mark1 + students[i].mark2 + students[i].mark3;
            if (total > highestTotal) {
                highestTotal = total;
                highestTotalRoll = students[i].rolino;
            }
        }
        sc.close();
        System.out.println(highestTotalRoll + " " + highestTotal);
    }
}