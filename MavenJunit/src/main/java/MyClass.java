
/**
*For educational use
*@author Karthik 
**/
public class MyClass {
	  public int add(int x, int y) {
	    return x + y;
	  }
	  
	  public int div(int a, int b ){
		  return a/b;
	  }
public static void main(String args[]){
	System.out.println("Program started using Jenkins");

	MyClass my1 = new MyClass();
	System.out.println("Program function add 2,4 :" + my1.add(2, 4));

	System.out.println("Program finished using Jenkins");

}	
}
