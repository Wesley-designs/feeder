public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        Feeder g = new Feeder(1000);
        Feeder i = new Feeder(100);
        Feeder h = new Feeder(2400);
        Feeder j = new Feeder(250);
        Feeder k = new Feeder(0);
        System.out.println(f);
        g.simulateOneDay(22);
        System.out.println(g);
        i.simulateOneDay(5);
        System.out.println(i);
        System.out.println(h.simulateManyDays(10, 4));
        System.out.println(j.simulateManyDays(10, 5));
        System.out.println(k.simulateManyDays(5, 10));
    }
}