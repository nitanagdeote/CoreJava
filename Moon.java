package package2;
// Override
import package1.Planet;

public class Moon extends Planet{

	public void PlanetName() {
			System.out.println("Moon is a planet.")  ;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Moon m = new Moon() ;
		m.PlanetName() ;
	
	}

}
