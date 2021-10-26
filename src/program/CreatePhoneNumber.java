package program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class CreatePhoneNumber {

	public static String createPhoneNumber(int[] numbers) {

		String str = Arrays.stream(numbers).mapToObj(String::valueOf).collect(Collectors.joining());

		return "(" + str.substring(0, 3) + ") "

				+ str.substring(3, 6) + "-" + str.substring(6);
	}

	public static void main(String[] args) {
		System.out.println(createPhoneNumber(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 })); // "(123) 456-7890"

	}

}
