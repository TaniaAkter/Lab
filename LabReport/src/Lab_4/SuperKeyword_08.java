package Lab_4;


		class Animal{  
		String color="white";  
		} 
	
	
		class Dog extends Animal{  
		String color="black";  
		
		void printColor(){  
			
		System.out.println(color); 
		System.out.println(super.color); 
		}  
		}  
		
		public class SuperKeyword_08 {
			
		public static void main(String args[]){  
			
		Dog d=new Dog();  
		d.printColor(); 
		
		}
}
