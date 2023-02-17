import java.util.LinkedList;  
import java.util.List;  
public class JavaListIndexOfExample1 {  
public static void main(String[] args) {  
        List<Integer> list= new LinkedList<>();  
for (int i=0;i<6;i++)
{  
list.add(i);  
int value =list.indexOf(i);  
System.out.println("Element stored at index "+i+" : "+value);  
        }  
    }  
}
