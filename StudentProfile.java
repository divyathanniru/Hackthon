 class Student {
     String name;
     int rollNo;
     String branch;

    public Student(String name, int rollNo, String branch) {
        this.name = name;
        this.rollNo = rollNo;
        this.branch = branch;
    }
     void display(){
       System.out.println("Name: " + name );
       System.out.println("Roll No: " + rollNo);
       System.out.println( "Branch: " + branch);
     }
   
     public class Main{
        public static void main(String[]args){

            Student s1 = new Student(
                "Rahul",
                101,
                "CSE"
            );
            Student s2 = new Student(
                "Anjali",
                102,
                "ECE"
            );
            s1.display();
            System.out.println();
            s2.display();
        System.out.println();
        }
     }
}
