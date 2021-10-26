package program;

import java.util.stream.IntStream;

public class ArrayDifference {

	public static int[] arrayDiff(int[] a, int[] b) {

		// test case
		// 1. assertArrayEquals(new int[] {2}, Kata.arrayDiff(new int [] {1,2}, new
		// int[] {1}));

		/*
		 * List<Integer> originalB =
		 * Arrays.stream(b).boxed().collect(Collectors.toList());
		 * 
		 * List<Integer> listA = Arrays.stream(Arrays.copyOf(a,
		 * a.length)).boxed().collect(Collectors.toList()); listA.removeAll(originalB);
		 * 
		 * return listA.stream().mapToInt(Integer :: intValue).toArray();
		 */
		return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arrayDiff(new int[] { 1, 2 }, new int[] { 1 }));


	}

}
