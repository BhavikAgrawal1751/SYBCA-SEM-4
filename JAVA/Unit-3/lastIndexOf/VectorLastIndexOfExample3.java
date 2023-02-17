import java.util.*;  
public class VectorLastIndexOfExample3 {    
    public static void main(String arg[]) {   
        //Create a first empty vector     
          Vector<String> vec = new Vector<>(4);   
          //Add elements in the first vector            
          vec.add("Facebook");  
          vec.add("Whatsapp");  
          vec.add("Twitter");  
          vec.add("Instagram");  
          vec.add("Skype");  
            //This would start searching of element in the backward direction from index -2  
        System.out.println("Index of element is found at: " +vec.lastIndexOf("Skype", 6));        
    }              
}  
Output:
Exception in thread "main" java.lang.IndexOutOfBoundsException: 6 >= 5
	at java.base/java.util.Vector.lastIndexOf(Vector.java:469)
	at myPackage.VectorLastIndexOfExample3.main(VectorLastIndexOfExample3.java:14)
Example 4
import java.util.*;  
public class VectorLastIndexOfExample4 {    
    public static void main(String arg[]) {   
        //Create an empty Vector        
        Vector < Integer > in = new Vector < > ();  
        //Add elements in the vector  
        in.add(101);  
        in.add(201);  
        in.add(301);  
        in.add(401);  
        in.add(501);  
            //This would start searching of element in the backward direction from index 3  
       System.out.println("Index of element is found at: " +in.lastIndexOf(201, 3));
    }              
}
