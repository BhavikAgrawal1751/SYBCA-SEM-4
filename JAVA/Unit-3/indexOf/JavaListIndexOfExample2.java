import java.util.LinkedList;  
import java.util.List;  
public class JavaListIndexOfExample2 {  
public static void main(String[] args) {  
        List<Integer> list= new LinkedList<>();  
list.add(null);  
list.add(null);  
list.add(null);  

int value =list.indexOf(90);  
System.out.println("Element stored at Index "+90+" : "+value);  
    }  
}
