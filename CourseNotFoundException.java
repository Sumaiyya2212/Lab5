package lab5;
//Course not Found Exception If user enter Course Name other Than 
//Java or Aws
public class CourseNotFoundException extends Exception {
    //Constructor 
	public CourseNotFoundException(String message) {
        	super(message);
        }
}
