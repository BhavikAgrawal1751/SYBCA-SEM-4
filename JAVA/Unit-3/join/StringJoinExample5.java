public class StringJoinExample5  
{  
// main method  
public static void main(String argvs[])  
{  
String str = null;  
// one of the element is null however it will be treated as normal string  
str = String.join("-", null, " wake up ", " eat ", " write content for JTP ", " eat ", " sleep ");  
System.out.println(str);  
}  
} 
