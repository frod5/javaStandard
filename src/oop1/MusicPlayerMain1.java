package oop1;

public class MusicPlayerMain1 {
	public static void main(String[] args) {
		int volume = 0;
		boolean isOn = false;

		//음악플레이어 켜기
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");

		//volume 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);

		//volume 증가
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);

		//volume 감소
		volume--;
		System.out.println("음악 플레이어 볼륨: " + volume);

		//음악 플레이어 상태
		System.out.println("음악 플레이어 상태: " + (isOn ? "음악 플레이어 ON, volumn: " + volume : "음악플레이어 OFF"));

		//음악 플레이어 끄기
		isOn = false;
	}
}
