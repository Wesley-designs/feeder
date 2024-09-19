public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        Feeder g = new Feeder(500);
        Feeder h = new Feeder(1000);
        Feeder i = new Feeder(100);
        System.out.println(f);
            //System.out.println(f.currentFood);
        System.out.println(f.getCurrentFood());
        g.simulateOneDay(12);
        System.out.println(g.getCurrentFood());
        h.simulateOneDay(22);
        System.out.println(h.getCurrentFood());
        i.simulateOneDay(5);
        System.out.println(i);
    }
}