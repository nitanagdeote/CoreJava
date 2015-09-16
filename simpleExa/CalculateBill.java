package package1;

public class CalculateBill {

	
	public static void main(String[] args) {
		ElectricityBillData bill1 = new ElectricityBillData() ;
		Calculation cal1 = new Calculation() ;
		
		bill1.date = 30;
		bill1.location = "Bangaluru";
		bill1.units = 500 ;
		bill1.year = 2015;
		System.out.println("bill year is "+bill1.year + ", date "+ bill1.date+",  bill units  " + bill1.units);
		System.out.println("Calculated Bill is "+ cal1.BillCal(bill1.date, bill1.year, bill1.units));
				;
	}

	
	
}
