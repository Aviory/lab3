package common;

import java.io.IOException;

import interfaces.BundesInterface;

public class Main {
	static String path;

	public static void main(String[] args) throws IOException {
		
		path = "C:/Users/Кудесник/Desktop/this.txts";
		
		 if(path!=null){
				new Fabric().type("C:/Users/Кудесник/Desktop/this.txt");
				new Fabric().type("C:/Users/Кудесник/Desktop/this.float");
				new Fabric().type("C:/Users/Кудесник/Desktop/this.int");
				new Fabric().type("C:/Users/Кудесник/Desktop/this.char");
				new Fabric().type("C:/Users/Кудесник/Desktop/this.blabla");//не обрабатываемый тип
				new Fabric().type("C:/Users/Кудесник/Desktop/blabla.txt");//файл не будет найден
		 }
		 else{
			 System.out.println("не задан путь");
		 }
	}
}
