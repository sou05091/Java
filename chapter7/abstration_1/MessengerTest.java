package chapter7.abstration_1;

public class MessengerTest {
	public static void main(String[] args) {
		GalaxyMessenger galaxy = new GalaxyMessenger();
		IPhoneMessenger iphone = new IPhoneMessenger();
		galaxy.fileDownload();
		galaxy.fileUpload();
		iphone.draw_textBox();
		iphone.draw_submitButton();
	}
}
