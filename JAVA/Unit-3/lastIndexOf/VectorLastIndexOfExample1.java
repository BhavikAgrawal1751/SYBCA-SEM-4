import java.util.*;  
public class VectorLastIndexOfExample1 {    
    public static void main(String arg[]) {   
        //Create an empty Vector        
        Vector < Integer > in = new Vector < > ();  
        //Add elements in the vector  
        in.add(100);  
        in.add(200);  
        in.add(300);  
        in.add(100);  
        in.add(400);  
            //Obtain an index of last occurrence of the specified element  
        System.out.println("Index of element is: " +in.lastIndexOf(100));  
          }              
}
