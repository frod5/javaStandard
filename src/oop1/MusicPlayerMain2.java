package oop1;

public class MusicPlayerMain2 {
	public static void main(String[] args) {
		MusicPlayerData data = new MusicPlayerData();

		//음악플레이어 켜기
		on(data);

		//volume 증가
		volumeUp(data);

		//volume 증가
		volumeUp(data);

		//volume 감소
		volumeDown(data);

		//음악 플레이어 상태
		showStatus(data);

		//음악 플레이어 끄기
		off(data);
	}

	static void showStatus(MusicPlayerData data) {
		System.out.println("음악 플레이어 상태: " + (data.isOn ? "음악 플레이어 ON, volumn: " + data.volume : "음악플레이어 OFF"));
	}

	static void volumeDown(MusicPlayerData data) {
		data.volume--;
		System.out.println("음악 플레이어 볼륨: " + data.volume);
	}

	static void volumeUp(MusicPlayerData data) {
		data.volume++;
		System.out.println("음악 플레이어 볼륨: " + data.volume);
	}

	static void on(MusicPlayerData data) {
		data.isOn = true;
		System.out.println("음악 플레이어를 시작합니다.");
	}

	static void off(MusicPlayerData data) {
		data.isOn = false;
		System.out.println("음악 플레이어를 종료합니다.");
	}
}
