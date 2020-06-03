package staticprivatemethods;

public interface SendNotifications {

	static void sendNotifications() {//if make static make establishconn also static
		establishConnection();
		System.out.println("sending multiple notificatiosn");
	}
	

	default void sendNotification() {
		establishConnection();
		
		System.out.println("sending  notificatiosn");
	}
	
	private static void establishConnection() {
		System.out.println("establishing connectin");
	}
	
	
}
