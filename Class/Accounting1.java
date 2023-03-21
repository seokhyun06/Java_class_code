package Class;

class Accounting11 {
	public static double valueOfSupply;
	public static double vatRate = 0.1;
	public static double getVAT() {
		return valueOfSupply * vatRate;
		
	}
	public static double getTotal() {
		return valueOfSupply + getVAT();
		
	}
}
public class Accounting1 {
	public static void main(String[] args) {
		Accounting11.valueOfSupply = 10000.0;
		System.out.println("Value of supply : " + Accounting11.valueOfSupply);
		Accounting11.valueOfSupply = 20000.0;
		System.out.println("Value of supply : " + Accounting11.valueOfSupply);
		
		Accounting11.valueOfSupply = 10000.0;
		System.out.println("VAT : " + Accounting11.getVAT());
		Accounting11.valueOfSupply = 20000.0;
		System.out.println("VAT : " + Accounting11.getVAT());

		Accounting11.valueOfSupply = 10000.0;
		System.out.println("Total : " + Accounting11.getTotal());
		Accounting11.valueOfSupply = 20000.0;
		System.out.println("Total : " + Accounting11.getTotal());
		
	}
}