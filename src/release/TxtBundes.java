package release;

import java.io.IOException;

import common.Files;
import interfaces.BundesInterface;

public class TxtBundes implements BundesInterface {

	@Override
	public String readFile(String name) throws IOException {
		new Files(name).read();
		return name;
		

	}

	@Override
	public String readMock(String name) {
		System.out.println("TxtBundes "+name);
		return name;
	}

}
