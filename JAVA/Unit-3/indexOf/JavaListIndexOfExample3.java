import java.util.LinkedList;  
import java.util.List;  
public class JavaListIndexOfExample3 {  
public static void main(String[] args) {  
        List<Integer> list= new LinkedList<>();  
list.add(67);  
list.add(89);  
 
int value =list.indexOf(null);  
System.out.println("Element stored at "+null+" : "+value);  
    }  
}
