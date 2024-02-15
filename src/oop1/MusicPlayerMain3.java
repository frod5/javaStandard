package oop1;

public class MusicPlayerMain3 {
	public static void main(String[] args) {
		MusicPlayer musicPlayer = new MusicPlayer();

		//음악플레이어 켜기
		musicPlayer.on();

		//volume 증가
		musicPlayer.volumeUp();

		//volume 증가
		musicPlayer.volumeUp();

		//volume 감소
		musicPlayer.volumeDown();

		//음악 플레이어 상태
		musicPlayer.showStatus();

		//음악 플레이어 끄기
		musicPlayer.off();
	}
}
