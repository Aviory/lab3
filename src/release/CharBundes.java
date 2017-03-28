package release;

import interfaces.BundesInterface;

public class CharBundes implements BundesInterface {

	@Override
	public String readFile(String name) {
		System.out.println("CharBundes "+name);
		return name;
		
	}

	@Override
	public String readMock(String name) {
		System.out.println("CharBundes "+name);
		return name;
	}
}
