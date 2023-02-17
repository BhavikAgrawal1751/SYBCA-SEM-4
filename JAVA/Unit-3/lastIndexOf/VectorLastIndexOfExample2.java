import java.util.*;  
public class VectorLastIndexOfExample2 {    
    public static void main(String arg[]) {   
        //Create an empty vector     
          Vector<String> vec = new Vector<>(4);   
          //Add elements in the vector          
          vec.add("Java");  
          vec.add("JavaScript");  
          vec.add("Android");  
          vec.add("Python");  
            //Obtain an index of the last occurrence of the specified element  
        System.out.println("Index of element is: " +vec.lastIndexOf("C"));  
        System.out.println("The element is not found.");  
          }              
}  
