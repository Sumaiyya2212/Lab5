package lab5;
// Java Javabean Class
public class Java {
	    @Override
	public String toString() {
		return "Java [StudId=" + StudId + ", StudName=" + StudName + ", StudMobNo=" + StudMobNo + ", StudEmail="
				+ StudEmail + "]";
	}
	    //Declaring all Variables
		private int StudId;
	    private String StudName;
	    private double StudMobNo;
	    private String StudEmail;
	    // Generated all Getter And Setter methods for the Variables
		public int getStudId() //to get Student Id
		{
			return StudId;
		}
		public void setStudId(int studId) //To set Student Id 
		{
			StudId = studId;
		}
		public String getStudName() //to get Student Name
		{
			return StudName;
		}
		public void setStudName(String studName) //To set Student Name
		{
			StudName = studName;
		}
		public double getStudMobNo() //to get Student Mobile Number
		{
			return StudMobNo;
		}
		public void setStudMobNo(double studMobNo) //To set Student Mobile no.
		{
			StudMobNo = studMobNo;
		}
		public String getStudEmail()//to get Student Email
		{
			return StudEmail;
		}
		public void setStudEmail(String studEmail)//To set Student Email Address
		{
			StudEmail = studEmail;
		}
		 //Create Parametrized Constructor
		 public Java(int StudId,String StudName,double StudMobNo,String StudEmail) {
	    	super();
			 this.StudId=StudId;
	    	 this.StudName=StudName;
	    	 this.StudMobNo=StudMobNo;
	    	 this.StudEmail=StudEmail; 
	     }
		 public Java(){
		       super();
		     }
		
	   
	}
