package common;

import java.io.IOException;

import interfaces.BundesInterface;

public class Main {
	static String path;

	public static void main(String[] args) throws IOException {
		
		path = "C:/Users/��������/Desktop/this.txts";
		
		 if(path!=null){
				new Fabric().type("C:/Users/��������/Desktop/this.txt");
				new Fabric().type("C:/Users/��������/Desktop/this.float");
				new Fabric().type("C:/Users/��������/Desktop/this.int");
				new Fabric().type("C:/Users/��������/Desktop/this.char");
				new Fabric().type("C:/Users/��������/Desktop/this.blabla");//�� �������������� ���
				new Fabric().type("C:/Users/��������/Desktop/blabla.txt");//���� �� ����� ������
		 }
		 else{
			 System.out.println("�� ����� ����");
		 }
	}
}
