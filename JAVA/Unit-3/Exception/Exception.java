import java.io.*;  
class Exception{  
    public static void main(String args[]) {  
        FileInputStream file_data = null;  
        try{  
            file_data = new FileInputStream("C:/Users/ajeet/OneDrive/Desktop/programs/Hell.txt");  
        }catch(FileNotFoundException fnfe){  
            System.out.println("File Not Found!");  
        }  
        int m;  
        try{  
            while(( m = file_data.read() ) != -1) {  
                System.out.print((char)m);  
            }  
            file_data.close();    
        }catch(IOException ioe){  
            System.out.println("I/O error occurred: "+ioe);  
        }  
    }  
}  