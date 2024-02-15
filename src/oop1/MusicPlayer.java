package oop1;

public class MusicPlayer {
	int volume = 0;
	boolean isOn = false;

	void showStatus() {
		System.out.println("음악 플레이어 상태: " + (isOn ? "음악 플레이어 ON, volumn: " + volume : "음악플레이어 OFF"));
	}

	void volumeDown() {
		volume--;
		System.out.println("음악 플레이어 볼륨: " + volume);
	}

	void volumeUp() {
		volume++;
		System.out.println("음악 플레이어 볼륨: " + volume);
	}

	void on() {
		isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}

	void off() {
		isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
}
