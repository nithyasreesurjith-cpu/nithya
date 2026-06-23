public class Day14_factory {
 interface Notification {
  void send(String to, String message);
 }
 class EmailNotification implements Notification {
  @Override
  public void send(String to, String message) {
   System.out.println("Sending Email: " + message + ", to " + to);
  }
 }
 class WhatsappNotification implements Notification {
  @Override
  public void send(String to, String message) {
   System.out.println("Sending WhatsApp: " + message + ", to " + to);
  }
 }
 static Notification getNotification(Day14_factory factory, String type) {
  return switch (type) {
   case "Email" -> factory.new EmailNotification();
   case "WhatsApp" -> factory.new WhatsappNotification();
   default -> throw new IllegalArgumentException("Invalid notification type: " + type);
  };
 }

 static void main() {
  Day14_factory factory=new Day14_factory();
  String type="WhatsApp";
  getNotification(factory, type).send("8778456707","Hello World");
 }
}
