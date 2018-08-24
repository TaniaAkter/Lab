package Lab_4;

	class ABC{
		
		   public void display(){
			System.out.println("My name is Tania");
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
	

