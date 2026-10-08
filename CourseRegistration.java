import java.util.Scanner;

class Student {
    String studentName;
    String courseName;
    int rollNumber;
    int courseCredits;
    double marks;

    Student(String studentName, int rollNumber, double marks, String courseName, int courseCredits) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.courseName = courseName;
        this.courseCredits = courseCredits;
    }
    double calculateFee() {
        return courseCredits * 1500;
    }
    boolean checkEligibility() {
        return marks >= 50;
    }
    double calculateScholarship() {
        if (marks >= 85) return calculateFee() * 0.20;
        if (marks >= 70) return calculateFee() * 0.10;
        return 0;
    }
    double calculateFinalFee() {
        return calculateFee() - calculateScholarship();
    }
    void displayDetails() {
        System.out.println("Name: " + studentName + " | Roll No: " + rollNumber);
        System.out.println("Course: " + courseName + " | Credits: " + courseCredits + " | Marks: " + marks);
        System.out.println("Eligible: " + checkEligibility());
        System.out.println("Total Fee: Rs. " + calculateFee());
        System.out.println("Scholarship: Rs. " + calculateScholarship());
        System.out.println("Final Fee: Rs. " + calculateFinalFee());
    }
}
public class CourseRegistration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Roll number: ");
        int roll = sc.nextInt();
        System.out.print("Marks: ");
        double marks = sc.nextDouble();
        sc.nextLine();
        System.out.print("Course name: ");
        String course = sc.nextLine();
        System.out.print("Credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility())
            s.displayDetails();
        else
            System.out.println("Not eligible for registration (minimum marks: 50).");

        sc.close();
    }
}

