package br.com.factory.apple.before.model;

public class IPhoneX extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list for IPhone X");
		System.out.println("\t- 5.8in Screen");
		System.out.println("\t- A11 Chipset");
		System.out.println("\t- 3Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}
