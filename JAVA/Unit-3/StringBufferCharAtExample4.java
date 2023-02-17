import java.util.Scanner;  
public class StringBufferCharAtExample4 {  
    public static void main(String[] args) {  
        StringBuffer sb = new StringBuffer("");          System.out.print("enter your string value: ");  
       Scanner sc = new Scanner(System.in);  
       sb.append(sc.nextLine());  
       System.out.print("enter index value: ");  
        int index = sc.nextInt();   
        // printing the character at input index  
        System.out.println("character at index "+index+ ": "+sb.charAt(index));  
        sc.close();  
    }  
}
