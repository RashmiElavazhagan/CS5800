import java.util.Iterator;
import java.util.List;

public class MainSystem {
    private static final ChatServer chatServer = new ChatServer();

    public static void main(String[] args) {
        //creating 4 users and adding them to system
        User roomfrnd1 = new User("Rahul", chatServer);
        User roomfrnd2 = new User("Rohit", chatServer);
        User roomfrnd3 = new User("Tariq", chatServer);
        User roomfrnd4 = new User("Preetha", chatServer);
        System.out.println("\n===== Users Created =====");

        // Sending some messages
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2), "Hey, Rohit! What's for dessert tonight?"));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd2), "Hi Rohit, how's your stomachache?"));
        chatServer.sendMessage(new Message(roomfrnd2, List.of(roomfrnd4), "Hey Preetha, my stomachache's worse."));
        chatServer.sendMessage(new Message(roomfrnd4, List.of(roomfrnd1), "Rahul, thanks for not asking what I want for dessert."));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd3), "Hi Tariq, smoothies tonight?"));
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd4), "Sorry Preetha, what do you want for dessert?"));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Hey Rahul, no smoothies for me."));

        // Demonstrating blocking
        roomfrnd2.blockerUsers(roomfrnd1);

        // Sending a message after blocking
        chatServer.sendMessage(new Message(roomfrnd1, List.of(roomfrnd2, roomfrnd3), "Tariq, how about some fresh fruit?"));
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "Why fresh fruit?"));

        // Demonstrating unsending
        chatServer.undoLastMessage(roomfrnd3);
        System.out.printf("Tariq's last message: '%s'\n", roomfrnd3.getChatHistory().getLastSentMessages());
        chatServer.undoLastMessage(roomfrnd2);

        // Iterating over chat history
        System.out.println("Tariq's chat history:");
        Iterator<Message> allMessagesIterator = roomfrnd3.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }

        System.out.println("Rahul's chat history:");
        allMessagesIterator = roomfrnd1.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }

        System.out.println("Preetha's chat history:");
        allMessagesIterator = roomfrnd4.iterator();
        while (allMessagesIterator.hasNext()) {
            System.out.println(allMessagesIterator.next());
        }

        // Unregistering a user and trying to send a message
        chatServer.unregisterUser(roomfrnd1);
        chatServer.sendMessage(new Message(roomfrnd3, List.of(roomfrnd1), "I want fresh fruit from there."));
    }
}
