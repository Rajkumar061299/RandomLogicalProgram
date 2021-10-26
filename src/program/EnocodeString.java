package program;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EnocodeString {

	public static void main(String[] args) {

		// "din" => "((("
		// "recede" => "()()()"

		System.out.println(encode("recede"));
	}

	static String encode(String word) {

		List<String> str = Arrays.asList(word.split(""));

		Map<String, Long> map = str.stream()

				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		for (Map.Entry<String, Long> entry : map.entrySet()) {
			for (int i = 0; i < str.size(); i++) {
				if (entry.getValue() > 1) {
					str.set(i, str.get(i).replace(entry.getKey(), ")"));
				} else {
					str.set(i, str.get(i).replace(entry.getKey(), "("));
				}
			}
		}
		return str.stream().collect(Collectors.joining());
	}

}
