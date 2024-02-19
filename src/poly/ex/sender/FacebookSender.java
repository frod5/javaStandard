package poly.ex.sender;

public class FacebookSender implements Sender {
	@Override
	public void sendMessage(String msg) {
		System.out.println("페이스북 발송합니다: " + msg);
	}
}
