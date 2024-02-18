package static2.ex;

import java.util.Arrays;

public class MathArrayUtils {
	private MathArrayUtils() {
		//인스턴스 생성 제한
	}

	public static int sum(int[] arr) {
		return Arrays.stream(arr).sum();
	}

	public static double average(int[] arr) {
		return (double) sum(arr) / arr.length;
	}

	public static int min(int[] arr) {
		return Arrays.stream(arr).min().getAsInt();
	}

	public static int max(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}
}
