class Student{
    private int rollno;
    private String name;
    private int[] marks = new int[5];
    private double average;
    private char grade;
    Student(String Name , int Rollno , int Mark1 , int Mark2 , int Mark3 , int Mark4 , int Mark5){
        this.name = Name;
        this.rollno = Rollno;
        marks[0] = Mark1;
        marks[1] = Mark2;
        marks[2] = Mark3;
        marks[3] = Mark4;
        marks[4] = Mark5;
    }
    public double calculateAverage()
    {
        int sum = 0;
        for(int i=0; i<5; i++)
        {
            sum += this.marks[i];
        }
        this.average = sum/5.0;
        return average;
    }
    public char calculateGrade(){
        this.grade = 'D';
        if(average>=90) grade = 'A';
        else if(average>=75 && average<90) grade = 'B';
        else if(average>=60 && average<75) grade = 'C';
        return grade;
    }
    public void displayDetails()
    {
        calculateAverage();
        calculateGrade();
        System.out.println("Roll Number : "+this.rollno);
        System.out.println("Name : "+this.name);
        System.out.println("Average : "+this.average);
        System.out.println("Grade : "+this.grade);
    }
}

public class prog98 {
    public static void main(String[] args) {
    Student s = new Student("Aman", 101, 85, 92, 78, 88, 90);

    s.displayDetails();
}
}
