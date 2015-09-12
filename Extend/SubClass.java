package package2;


import package1.Multiplication;

public class SubClass extends Multiplication{

	public static void main(String[] args) {
		
	SubClass SC = new SubClass();
	int value = SC.subtract(9,6) ;
	System.out.println("Subraction result is " + value) ;
		
	
	Multiplication M = new Multiplication() ;
	int mult = M.multiply(10,20) ;
	System.out.println("Multiplication result is  " + mult) ;
	}
	 
	public  int subtract(int a, int b){
	return(a-b);	
	}
	
}
