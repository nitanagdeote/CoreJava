package package1;
// Overloading or polymorphism
public class ReturnCheck {

	
	public static void main(String[] args) {
	check check1 = new check();
    int a = check1.hello(6);
    String s = check1.hello("great");
    double f = check1.hello(805238.3251456786923198765);
    float d = check1.hello(8);
    
    System.out.println(a); //output integer
    System.out.println(s); //output String
    System.out.println(f); //output double
    System.out.println(d); //output float
	}

 
}

class check{
	public int hello(int a){
	return (a);
	}
	public String hello(String b){
	return ("hellow");
	}	
	public double hello(double b){
		return (b);
		}	
	public float hello(float b){
		return (b);
		}	
}