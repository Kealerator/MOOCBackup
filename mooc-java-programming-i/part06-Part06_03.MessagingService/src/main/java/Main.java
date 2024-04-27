
public class Main {

    public static void main(String[] args) {

        // Try out your class here

        Message viesti1 = new Message("Matti", "Morjesta Jari");
        Message viesti2 = new Message("Jari", "No hyvää päivää Masa");

        MessagingService palvelu = new MessagingService();

        palvelu.add(viesti1);
        palvelu.add(viesti2);

        System.out.println(palvelu.getMessages());
    }
}
