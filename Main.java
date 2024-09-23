public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        Feeder g = new Feeder(500);
        Feeder h = new Feeder(5000);
        Feeder i = new Feeder(100);
        System.out.println(f);
        g.simulateOneDay(12);
        System.out.println(g);
        i.simulateOneDay(5);
        System.out.println(i);
        h.simulateOneDay(22);
        System.out.println(h);
        System.out.println(h.simulateManyDays(5, 10));
    }
}