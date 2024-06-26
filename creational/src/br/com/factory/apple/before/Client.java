package br.com.factory.apple.before;

import br.com.factory.apple.before.model.IPhone;
import br.com.factory.apple.before.model.IPhone11;
import br.com.factory.apple.before.model.IPhone11Pro;
import br.com.factory.apple.before.model.IPhoneX;
import br.com.factory.apple.before.model.IPhoneXSMax;

public class Client {

	public IPhone orderIPhone(String generation, String level) {
		IPhone device = null;
		
		if (generation.equals("X")) {
			if (level.equals("standard")) {
				device = new IPhoneX();
			} else if (level.equals("highEnd")) {
				device = new IPhoneXSMax();
			}
		} else if(generation.equals("11")) {
			if (level.equals("standard")) {
				device = new IPhone11();
			} else if (level.equals("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();
	
		return device;
	}
	
	public static void main(String[] args) {
		Client client = new Client();
		
		IPhone iphone = client.orderIPhone("X", "standard");
		
		System.out.println(iphone);
	}
}
