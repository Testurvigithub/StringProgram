
public class ReverseString 
{

	public static void main(String[] args) 
	{
	    String name = "My name is urvi";
	    
	    String reversedStr = "";    
	    
	    for(int i = name.length()-1; i >= 0; i--){    
           
	    	reversedStr = reversedStr + name.charAt(i);    
        }    
	    
	    System.out.println("Original string: " + name);    
        
        System.out.println("Reverse of given string: " + reversedStr);    
    }    
}    