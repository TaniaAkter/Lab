package Lab_4;


abstract class MyClass{
	   public void disp(){
	     System.out.println("This is Course name is OOP");
	   }
	   abstract public void disp2();
	}


public class Demo extends MyClass{
	
	
	public void disp2()
	   {
	       System.out.println("This is abstract ");
	   }

	 public static void main(String args[]){
	       Demo obj = new Demo();
	       obj.disp2();
	   }
	}




	
	   
	   
	  