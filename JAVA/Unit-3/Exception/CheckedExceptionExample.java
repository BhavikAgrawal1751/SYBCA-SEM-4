import java.io.*;  
class CheckedExceptionExample {  
    public static void main(String args[]) {  
        FileInputStream file_data = null;  
        file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/Hello.txt");  
        int m;  
        while(( m = file_data.read() ) != -1) {  
            System.out.print((char)m);  
        }  
        file_data.close();  
    }  
}  
