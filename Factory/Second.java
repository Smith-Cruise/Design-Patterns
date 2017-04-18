public class Second {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.send();
	} 
}

interface Sender {
	public void send();
}

class MailSender implements Sender {
	@Override
	public void send() {
		System.out.println("this is mailsender");
	}
}

class SmsSender implements Sender {
	@Override
	public void send() {
		System.out.println("this is sms sender");
	}
}

interface Provider {
	public Sender produce();
}

class SendMailFactory implements Provider {
	@Override
	public Sender produce() {
		return new MailSender();
	}
}

class SendSmsFactory implements Provider {
	@Override
	public Sender produce() {
		return new SmsSender();
	}
}