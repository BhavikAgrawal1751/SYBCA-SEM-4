import java.util.LinkedList;  
import java.util.List;  
public class JavaListIsEmptyExample1 {  
public static void main(String[] args) {  
        List<Character> list = new LinkedList<Character>();  
 
Boolean bool = list.isEmpty();  
if(bool){  
System.out.println("Enter elements in this list as it is empty.");  
        }  
else{  
System.out.println("Elements are already present in this list.\nList : "+list);  
        }  
    }  
}