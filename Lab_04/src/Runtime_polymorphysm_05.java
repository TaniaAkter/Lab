
	class ABC{
		
		   public void display(){
			System.out.println("My name is Sadia");
		   }
		}
	
		public class Runtime_polymorphysm_05 extends ABC{

		   public void display(){
			System.out.println("I am a Student");
		   }
		   
		   public static void main(String args[]){
			   
			ABC obj = new Runtime_polymorphysm_05();
			obj.display();
		   }
		}
	

