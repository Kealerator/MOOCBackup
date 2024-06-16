
public class Main {

    public static void main(String[] args) {
        Box box = new Box(10);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 2));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println("Normal box:");
        System.out.println(box);

        Box containerA = new Box(20);

        containerA.add(box);
        containerA.add(box);

        System.out.println("Container A:");
        System.out.println(containerA);

        System.out.println("Box added to itself:");
        System.out.println("Actually failed.");        

    }

}
