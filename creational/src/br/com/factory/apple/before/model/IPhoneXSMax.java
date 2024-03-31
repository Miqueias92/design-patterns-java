package br.com.factory.apple.before.model;

public class IPhoneXSMax extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list for IPhone XS Max");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
