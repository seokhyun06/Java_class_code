package Class;
class Accounting22 {
	public double valueOfSupply;
	public static double vatRate = 0.1;
	public double getVAT() {
		return valueOfSupply * vatRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
		
	}
}
public class Accounting2 {
	public static void main(String[] args) {
		Accounting22 a1 = new Accounting22();
		a1.valueOfSupply = 10000.0;
		
		Accounting22 a2 = new Accounting22();
		a2.valueOfSupply = 20000.0;
		
		System.out.println("value of supply : " + a1.valueOfSupply);
		System.out.println("value of supply : " + a2.valueOfSupply);

		System.out.println("VAT : " + a1.getVAT());
		System.out.println("VAT : " + a2.getVAT());

		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
	}
}