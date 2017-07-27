
public class Manager implements MailObserver{
	
	@Override
	public void doUpdate(Email email) {
		System.out.println("The manager has recibed an email: ");
		email.readEmail();
	}

}
