package program;

import java.util.ArrayList;
import java.util.List;

public class SubStringForm {


	public static String[] solution(String s) {
		if (s.length() % 2 != 0)
			s = s.concat("_");
		List<String> result = new ArrayList<>();
		for (int i = 1; i < s.length(); i += 2) {
			result.add(String.valueOf(s.charAt(i - 1)).concat(String.valueOf(s.charAt(i))));
		}
		System.out.println(result);
		return result.stream().map(letter -> letter).toArray(String[]::new);
	}


	public static void main(String[] args) {

		// StringSplit.solution("abcdef") // should return {"ab", "cd", "ef"}
		 System.out.println(solution("abcde"));

	}

}
