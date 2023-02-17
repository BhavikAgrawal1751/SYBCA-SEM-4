public class StringBufferCharAtExample3 {  
    public static void main(String[] args) {  
        StringBuffer sb = new StringBuffer("udhna");  
        System.out.println("string: "+sb);  
        // try to print character at index value at size length  
        System.out.println("character at index equal to length: "+sb.charAt(sb.length()));  
    }  
}
