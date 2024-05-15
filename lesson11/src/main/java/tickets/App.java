package tickets;

public class App {
    public static void main(String[] args) {
        Tickets infant = new Tickets(1,1000);
        System.out.println(infant.getPrice());
        System.out.println(infant.prInfo(1,100));
    }
}
