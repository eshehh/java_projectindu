package ch12_generics_1024;

public class ThreeDPrinterTest {

	public static void main(String[] args) {

		ThreeDPrinter printer = new ThreeDPrinter();
		Powder p1 = new Powder();
		printer.setMaterial(p1);
		Powder p2 = (Powder)printer.getMaterial();
	}
}
