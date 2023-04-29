package lab5;
import java.util.Scanner;

import lab5.CourseService;
public class CourseMain {

	public CourseMain(int sid, String sname, double smobno, String smail) {
		super();
	}

	public static void main(String[] args) {
		CourseService courseservice = new CourseService();
		Scanner sc = new Scanner(System.in);
		//First do while Loop For Main Switch case
		do {
		System.out.println("**Welcome to Social Foundation**");
		System.out.println("---------------------------------");
		System.out.println("Enter \n"+"1) For Java Course\n" 
		                +"2) For AWS Course\n"
		                +"3) To get Other Course \n"
		                +"4) Exit");
		System.out.println("=========================================");
		System.out.println("Enter your choice : ");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			//Nested Do-While Loop For Java Course
			do {
				
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter \n"
						+ " 1)Register for Java Course \n"
						+ " 2)To get details of Student using Student Id\n"
						+ " 3)Update Student detail using Student Id \n"
						+ " 4)Exit ");
				System.out.println();
				System.out.println("Enter your choice : ");
				int ch1 = sc1.nextInt();
				System.out.println("----------------------");
				//Nested Switch Case for Java course
				switch(ch1){
	
				case 1:
					CourseService.CreateCourseJava();//Register Student in Java Course
					System.out.println();
					break;
					
				case 2:
					CourseService.getJavaStudentdetailsById();//Get Student Details by Student Id
					System.out.println();
					break;
					
				case 3:
					CourseService.UpdateJavaStudentinfo();//Update Student details using Student Id
					break;
					
				case 4 :
					System.out.println("Thank You!!");//Exit
					System.exit(0);
             		break;							
				}
				System.out.println();
			}
			while(true);
		case 2:
			//2nd Nested Do-While Loop For Aws Course
            do {			
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter \n"
						+ " 1)Register for Aws Course \n"
						+ " 2)To get details of Student using Student Id\n"
						+ " 3)Update Student detail using Student Id \n"
						+ " 4)Exit ");
				System.out.println();
				System.out.println("Enter your choice : ");
				int ch2 = sc2.nextInt();
				System.out.println("----------------------");
				
				switch(ch2){
				case 1:
					CourseService.CreateCourseAws();//Register Student in Aws Course
					System.out.println();
					break;		
				case 2:
					CourseService.getAWsStudentdetailsById();//Get Student Details by Student Id
					System.out.println();
					break;
				case 3:
					CourseService.UpdateAwsStudentinfo();//Update Student details using Student Id
					break;
					
				case 4 :
					System.out.println("Thank You!!");//Exit
					System.exit(0);
             		break;							
					
				}
				System.out.println();
			}
			while(true);
		case 3:
			courseservice.OtherCourseinfo();//To get details other than Java and Aws
			System.exit(0);
			break;
		case 4:
			System.out.println("Thank You!!");//Exit from Main program
			System.exit(0);
			break;
		}
	}while(true);

	}

}

	
