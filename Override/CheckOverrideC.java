package package2;

// override Example
import package1.Multiplication;

public class CheckOverrideC extends Multiplication{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckOverrideC SC = new CheckOverrideC();
		int value = SC.multiply(100,20) ;
		System.out.println("Subraction result is " + value) ;
		
		
	}
	public  int multiply(int a, int b){
		//super.multiply(a,  b);
		return(a-b);	
		}
	
}
