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
 
        // если data будет равна 0 то это значит,
        // что файл пуст
        while(data != -1) {
            // переводим байты в символ
            content = (char) data;
 
            // выводим полученный символ
            System.out.print(content);
     
            // читаем следующий байты символа
            data = inputStream.read();
        }
 
        // закрываем поток чтения файла
        inputStream.close();
    	}
    	catch(FileNotFoundException e){
    		System.out.println("файл не найден");
    	}
    }
}
