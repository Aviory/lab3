package release;

import interfaces.BundesInterface;

public class IntBundes implements BundesInterface {

	@Override
	public String readFile(String name) {
		System.out.println("IntBundes "+name);
		return name;

	}

	@Override
	public String readMock(String name) {
		System.out.println("IntBundes "+name);
		return name;
	}

}
