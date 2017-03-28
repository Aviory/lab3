package release;

import interfaces.BundesInterface;

public class FloatBundes implements BundesInterface {

	@Override
	public String readFile(String name) {
		System.out.println("FloatBundes "+name);
		return name;
	}

	@Override
	public String readMock(String name) {
		System.out.println("FloatBundes "+name);
		return name;
	}
}
