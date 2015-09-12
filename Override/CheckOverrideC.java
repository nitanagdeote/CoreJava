package package2;

// override Example
import package1.Multiplication;

public class CheckOverrideC extends Multiplication{


	public static void main(String[] args) {
	CheckOverrideC SC = new CheckOverrideC();
	int value = SC.multiply(100,20) ;
	System.out.println("Subraction result is " + value) ;
		
	}
	public  int multiply(int a, int b){
	return(a-b);	
	}
	
}
