
public class StaticBlock_07 {
	
	static  String name;
	static int id;
	
	static {
		
		 name = "Sadia Zaman" ;
		 id = 17200008;
		
	}
	
	static void display() {
		System.out.println("Name :" + name);
		System.out.println("ID :" + id);
	}
	
	public static void main (String[]args) {
		
		StaticBlock_07.display();
	}
	
}
