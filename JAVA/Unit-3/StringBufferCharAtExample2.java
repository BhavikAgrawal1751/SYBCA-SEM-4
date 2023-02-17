public class StringBufferCharAtExample2 {  
    public static void main(String[] args) {  
        StringBuffer sb = new StringBuffer("stringbuffer");  
        System.out.println("string: "+sb);  
        // try to print character at index value negative  
        System.out.println("character at index -1: "+sb.charAt(-1));  
    }  
}
