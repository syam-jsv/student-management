import java.util.Scanner;
class studentServices{
    long studentId=1000000001L;
    student studentList[] = new student[10];
    Scanner scan = new Scanner(System.in);
    int idx=0;
    void addNewStudent(){
        if(idx<10){
            student sam = new student();
            System.out.println("enter student name");
            String studentName = scan.nextLine();
            System.out.println("enter gender");
            String gender = scan.nextLine();
            System.out.println("enter your opted course");
            String StudentOptedCourse=scan.nextLine();
            System.out.println("enter the qualification");
            String StudentQualification = scan.nextLine();
            System.out.println("enter email id");
            String emailId = scan.nextLine();
            System.out.println("enter mobile number");
            double mobileNumber = scan.nextDouble();
            scan.nextLine();
            sam.studentName = studentName;
            sam.gender = gender;
            sam.StudentOptedCourse = StudentOptedCourse;
            sam.StudentQualification = StudentQualification;
            sam.emailId = emailId;
            sam.mobileNumber = mobileNumber;
            studentList[idx] = sam;
            studentId++;
            idx++;
        }
        else{
            System.out.println("sorry!!!!!   admissions are filled");
        }
    }
    void displayStudent(){
        if(idx>0){
            for(int i=0;i<idx;i++){
                studentList[i].displayStudentDetails();
            }
        }
        else{
            System.out.println("sorry!!!! there are no students");
        }
    }
    void menu(){
        while(true){
            System.out.println("========================STUDENT ADMINISTRATION====================");
            System.out.println("press 1 to add a new student details");
            System.out.println("press 2 to disply all student details");
            System.out.println("press 9 to exit from the menu");
            System.out.println("enter your choice");
            int choice  = scan.nextInt();
            scan.nextLine();
            switch(choice){
                case 1:addNewStudent();break;
                case 2:displayStudent();break;
                case 3:System.exit(0);
                default:System.out.println("project under construction");
            }

        }
    }
}