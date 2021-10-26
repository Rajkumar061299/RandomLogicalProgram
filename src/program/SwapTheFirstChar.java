package program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SwapTheFirstChar {

	
	public static String pigIt(String str) {
		char symbol = 0;
		char[] arr = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == '!') {
				symbol += arr[i];
			}
		}
		str = str.replaceAll("[!]*", "");

		return (Arrays.stream(str.split(" "))
				.map(word -> word.substring(1, word.length()).concat(word.substring(0, 1)).concat("ay "))
				.collect(Collectors.joining())).concat(String.valueOf(symbol));

	}



	public static void main(String[] args) {

		// elloHelloayorldworlday!ay

		System.out.println(pigIt("Hello world !"));

	}

}
