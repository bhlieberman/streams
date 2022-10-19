/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bakery;

public class App
{
    public static void main(String[] args)
    {
        Bakery bakery = new Bakery();

        Doughnut doughnut1 = new Doughnut(true, "Glazed", true, 1, 1.0, false);
        Doughnut doughnut2 = new Doughnut(true, "Chocolate", true, 1, 1.0, false);
        Cake cake1 = new Cake(false, "Vanilla", false, 3, 2.0, 3);

        bakery.pastries.add(doughnut1);
        bakery.pastries.add(cake1);

        Pastry pastry2 = bakery.pastries.get(0);
        if (pastry2 instanceof Doughnut)
        {
            String baker1 = args[0];
            String baker2 = args[1];
            System.out.println("Baker 1 is: " + baker1 + " and Baker 2 is: " + baker2);

            Doughnut sameDoughnut = (Doughnut) pastry2;
            //System.out.println("Is this pastry cake? " + sameDoughnut.isCake);
            //System.out.println("Doughnut: " + sameDoughnut);
            //sameDoughnut.baker = "Not Shan";
            //System.out.println("Doughnut baker: " + sameDoughnut.baker);
            //System.out.println("Doughnut baker: " + doughnut2.baker);
            //System.out.println("Doughnut baker: " + Doughnut.baker);
        }
    }
}