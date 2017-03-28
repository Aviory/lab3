package common;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files {

    private FileInputStream inputStream;
    private String path;
 
    public Files(String path) {
        this.path = path;
    }
 
    public void read() throws IOException {
    	try{
    		
    	
        inputStream = new FileInputStream(path);
 
        int data = inputStream.read();
        char content;
 
        // ���� data ����� ����� 0 �� ��� ������,
        // ��� ���� ����
        while(data != -1) {
            // ��������� ����� � ������
            content = (char) data;
 
            // ������� ���������� ������
            System.out.print(content);
     
            // ������ ��������� ����� �������
            data = inputStream.read();
        }
 
        // ��������� ����� ������ �����
        inputStream.close();
    	}
    	catch(FileNotFoundException e){
    		System.out.println("���� �� ������");
    	}
    }
}
