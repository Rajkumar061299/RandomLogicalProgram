package program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CamelCase {

	 public static String camelCase(String str) {
		 
		 str = str.trim().replaceAll("  ", " ");
		 if(str.equals("") && str.length()==0) {
			 return "";
		 }
		 return Arrays.stream(str.split(" "))
		 .map(word -> (String.valueOf(word.charAt(0)).toUpperCase()).concat(word.substring(1))).collect(Collectors.joining());
	    }


	public static void main(String[] args) {


		//camelCase("camel case word"); // => "CamelCaseWord"

		System.out.println(camelCase("camel case word"));
	}

}
