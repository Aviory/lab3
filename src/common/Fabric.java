package common;

import java.io.IOException;

import interfaces.BundesInterface;
import release.CharBundes;
import release.FloatBundes;
import release.IntBundes;
import release.TxtBundes;

public class Fabric {

	private static BundesInterface bundes;
	 public static String type(String type) throws IOException {

			 String typeFile = split(type);
	
	     switch (typeFile) {
	         case "char":
	             bundes= new CharBundes();
	             break;
	         case "float":
	        	 bundes= new FloatBundes();
	        	 break;
	         case "int":
	        	 bundes= new IntBundes();
	        	 break;
	         case "txt":
	        	 bundes= new TxtBundes();
	        	 break;
	         default:
	             System.out.println("Не допустимое расширение: ." + typeFile);
	     }
	     return bundes.readFile(type);
	 }
	 private static String split(String type){
		 
		 String[] tmp = type.split("\\W");
		 String name = tmp[tmp.length-2];
		 String typeFile = tmp[tmp.length-1];
		 
		return typeFile;
	 }
}
