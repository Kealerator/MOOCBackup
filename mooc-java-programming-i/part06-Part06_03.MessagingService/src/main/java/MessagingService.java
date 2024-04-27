import java.util.ArrayList;

public class MessagingService {

    ArrayList<Message> messageObj;

    public MessagingService(){
        this.messageObj = new ArrayList<>();
    }

    public void add (Message message){
        // adds a message passed as a parameter to the messaging service
        //as long as the message content is at most 280 characters long.

        if (message.getContent().length() <= 280) {
            messageObj.add(message);
        }
    }

    public ArrayList<Message> getMessages(){
        return messageObj;
    }
    
}
