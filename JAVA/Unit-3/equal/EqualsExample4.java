public class EqualsExample4   
{  
// main method  
public static void main(String argvs[])  
{  
// Strings  
String str = "a";  
String str1 = "123";  
String str2 = "45.89";  
String str3 = "false";  
Character c = 'a';  
Integer i = 123;  
Float f = 45.89f;  
Boolean b = false;  
// reference of the Character object is passed  
System.out.println(str.equals(c));  
// reference of the Integer object is passed  
System.out.println(str1.equals(i));  
// reference of the Float object is passed  
System.out.println(str2.equals(f));  
// reference of the Boolean object is passed  
System.out.println(str3.equals(b));  
// the above print statements show a false value because  
// we are comparing a String with different data types  
// To achieve the true value, we have to convert   
// the different data types into the string using the toString() method  
System.out.println(str.equals(c.toString()));  
System.out.println(str1.equals(i.toString()));  
System.out.println(str2.equals(f.toString()));  
System.out.println(str3.equals(b.toString()));  
}  
}
