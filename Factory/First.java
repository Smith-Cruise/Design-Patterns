public class First {
	public static void main(String[] args) {
		SendFactory factory = new SendFactory();
		Sender sender1 = factory.produce("message");
		sender1.send();
		Sender sender2 = factory.produce("mail");
		sender2.send();
	}
}

interface Sender {
	public void send();
}

class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MailSender");
	}
}

class MessageSender implements Sender {
	@Override
	public void send() {
		System.out.println("This is MessageSender");
	}
}

class SendFactory {
	public Sender produce(String type) {
		// switch support String type since JDK7
		switch(type) {
			case "mail":
				return new MailSender();
			case "message":
				return new MessageSender();
			default:
				return null;
		}
	}
}