import java.util.*;
import java.io.*;

public class isUnique{
	public static void main(String[] args){
		String str = "rupali";
		//String newStr="";
		for(int i=0; i<str.length(); i++){
			if(str.indexOf(str.charAt(i),i+1)>0){
				System.out.println("not unique");
				break;
				
			}
			else if(i==str.length()-1)
				System.out.println("unique");
			
				
			
			/*if(newStr.indexOf(str.charAt(i))<0)
				newStr = newStr+str.charAt(i);*/
		}
		
		//System.out.println(newStr);

	}

}
