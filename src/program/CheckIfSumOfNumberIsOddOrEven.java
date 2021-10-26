package program;

import java.util.stream.IntStream;

public class CheckIfSumOfNumberIsOddOrEven {
	
	public static void main(String[] args) {
		// Input: [0, 1, 4] Output: "odd"
		 System.out.println(oddOrEven((new int[] {2, 5, 34, 6})));

	}

	public static String oddOrEven(int[] array) {

		int value = IntStream.of(array).sum();
		if (value % 2 == 0)
			return "even";
		return "odd";
	}

}
