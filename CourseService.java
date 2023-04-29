package lab5;
import java.util.Scanner;

public class CourseService {
	    static Java coursejava[] = new Java[10];
	    static Aws courseaws[] = new Aws[10];
        static Scanner sc=new Scanner(System.in);
        static int index1 =0;
        static int index2 =0;
        
        //Method to create Course Java Registration
        public static void CreateCourseJava() {
        	    System.out.println("Welcome to Java Course!!Please Register Yourself");
        	    System.out.println("Enter Student Id : ");//Enter Student Id
        	    int sid = sc.nextInt();
        		sc.nextLine();
            	System.out.println("Enter Student Name : ");//Enter Student Name
            	String sname = sc.nextLine();
            	
            	System.out.println("Enter Student Mobile Number : ");//Enter Student Number
            	double smobno = sc.nextDouble();
            	
            	sc.nextLine();
            	System.out.println("Enter Student Email Address: ");//Enter Student Email Address
            	String smail = sc.nextLine();
        	
            coursejava[index1] = new Java(sid,sname,smobno,smail);
        	index1++;
        	System.out.println("Student details for Java Course enrolled Successfully!!!");
            System.out.println("------------------------------------------------------");
        }
        
        public static void getJavaStudentdetailsById()//To get Student Details Using Stduent Id
        {
        	System.out.println("Enter Student id to search : ");
        	boolean flag = false;
        	int sid = sc.nextInt();
        	for(int i=0;i<index1;i++)
        	{
        		if(coursejava[i].getStudId()==sid)
        		{
                		System.out.println("Student Id : "+coursejava[i].getStudId());
                		System.out.println("Student Name : "+coursejava[i].getStudName());
                		System.out.println("Student Contact No. : "+coursejava[i].getStudMobNo());
                		System.out.println("Student Email Address : "+coursejava[i].getStudEmail());
                		System.out.println("===========================");
                		flag=true;
                	    break;	
                }
        			            			
        		}
        	if(flag==false)
				System.out.println("Student is not registered");

        	}
        
        public static void UpdateJavaStudentinfo()//update Student details using Student Id
        {
        	boolean flag=false;
			System.out.println("Enter the Student id you want to Update your details for Java Course : ");	
			int sid= sc.nextInt();
			
			for(int i=0 ; i<index1 ; i++) {
				
				if(coursejava[i].getStudId()==sid)//check Student id with User entered Id
				{
					sc.nextLine();
					System.out.println("Enter new Student Name : ");
					String sname = sc.nextLine();
					
					System.out.println("Enter new Student Mobile No. : ");
					long smobno = sc.nextLong();
					
					sc.nextLine();
					System.out.println("Enter new Student Email Address : ");
					String smail = sc.nextLine();
					
					coursejava[i] = new Java(sid ,sname , smobno , smail);
					flag=true;
					
				}
				
				if(flag==true) {
					System.out.println("Student Updated Successfully!");
				}
				else {
					System.out.println("Student id not found!!");
				}						
			}
        }
        
//----------------------------------------------------------------------------------//		
	//Create Aws Course

	 public static void CreateCourseAws() //create Aws course Registration
	 {
	 System.out.println("Welcome to AWS Course!! Please Register Yourself");
	System.out.println("Enter Student Id : ");
    int sid = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Student Name : ");
	String sname = sc.nextLine();
	System.out.println("Enter Student Mobile Number : ");
	double smobno = sc.nextDouble();
	sc.nextLine();
	System.out.println("Enter Student Email Address: ");
	String smail = sc.nextLine();	            	
	courseaws[index2] = new Aws(sid,sname,smobno,smail);
	index2++;
	System.out.println("Student details for AWS course enrolled Successfully!!!");
	}
	 
	 public static void getAWsStudentdetailsById()//To get Student details using Student Id
     {
     	System.out.println("Enter Student id to search : ");
     	boolean flag = false;
     	int sid = sc.nextInt();
     	for(int i=0;i<index2;i++)
     	{
     		if(courseaws[i].getStudId()==sid)//check Student id with User entered Id
     		{
             		System.out.println("Student Id : "+courseaws[i].getStudId());
             		System.out.println("Student Name : "+courseaws[i].getStudName());
             		System.out.println("Student Contact No. : "+courseaws[i].getStudMobNo());
             		System.out.println("Student Email Address : "+courseaws[i].getStudEmail());
             		System.out.println("===========================");
             		flag=true;
             	    break;	
             }
     			            			
     		}
     	if(flag==false)
				System.out.println("Student is not registered");

     	}
     
     public static void UpdateAwsStudentinfo()//To Update Student details using Student Id
     {
     	boolean flag=false;
			System.out.println("Enter the Student id you want to Update your details for Aws Course : ");	
			int sid= sc.nextInt();
			
			for(int i=0 ; i<index2 ; i++) {
				
				if(courseaws[i].getStudId()==sid)//check Student id with User entered Id
				{
					
					sc.nextLine();
					System.out.println("Enter new Student Name : ");
					String sname = sc.nextLine();
					
					System.out.println("Enter new Student Mobile No. : ");
					long smobno = sc.nextLong();
					
					sc.nextLine();
					System.out.println("Enter new Student Email Address : ");
					String smail = sc.nextLine();
					
					courseaws[i] = new Aws(sid ,sname , smobno , smail);
					flag=true;
					
				}
				
				if(flag==true) {
					System.out.println("Student Updated Successfully!");
				}
				else {
					System.out.println("Student id not found!!");
				}						
			}
     }
	 
   //----------------------------------------------------------------------------------//
	 //Other Course
	static void checkcourse(String name) throws CourseNotFoundException{
		
		//To check If the Entered Name of Course is equal to Java or Aws
		if(name.equalsIgnoreCase("Java") || name.equalsIgnoreCase("Aws"))
		{	
			System.out.println("Please Select Option 1 or 2 for your preferred course");
			System.out.println("Thank You!!");
		
		}
		else
		{
			//If Name of Course is not Java or Aws Then it will Throw an Exception(CourseNotFoundException)
			throw new CourseNotFoundException("Exception--Sorry!!The Course Name you have entered is not available"
					+ "\nThank You!!");
		}
	}
	public void OtherCourseinfo()//othercourseinfo method
	{  
	  try (Scanner sc = new Scanner(System.in)){
	  System.out.println("Enter Course name you want to Learn");
	  String name = sc.nextLine();
	  checkcourse(name);//Call checkcourse mehtod
	   }
	  catch(CourseNotFoundException e) //catch block to catch Exception
	  {
	   System.out.println(e.getMessage());
	   }
	}	        	
		        	
			 
}	 

