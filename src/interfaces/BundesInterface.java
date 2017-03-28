package interfaces;

import java.io.IOException;

public interface BundesInterface {
	String readFile(String name) throws IOException;
	String readMock(String name);


}
