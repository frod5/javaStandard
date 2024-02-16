package access.ex;

public class MaxCounter {
	private int count;
	private int maxCount;

	public MaxCounter(int maxCount) {
		this.maxCount = maxCount;
	}

	public void increment() {
		if(isMaxCountValid(count)) {
			count++;
		} else {
			System.out.println("최대 카운트를 넘을 수 없습니다.");
		}
	}
	public int getCount() {
		return count;
	}

	private boolean isMaxCountValid(int count) {
		return count < maxCount;
	}
}
