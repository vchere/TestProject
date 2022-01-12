
import java.sql.SQLOutput;
import java.util.Scanner;

public  class MyProject {
    public static void main(String[] args) {
        /* System.out.println ("Starting to make a coffee");
        System.out.println ("Grinding coffee beans");
        System.out.println ("Boiling water");
        System.out.println ("Mixing boiled water with crushed coffee beans");
        System.out.println ("Pouring coffee into the cup");
        System.out.println ("Pouring some milk into the cup");
        System.out.println ("Coffee is ready!");
 */



// 200 ml of water, 50 ml of milk, and 15 g of coffee beans.

        int water = 200;
        int milk = 50;
        int coffee = 15;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many cups of coffee you will need:");
        Integer cups = scanner.nextInt();
        System.out.println("for " + cups + " cups of coffee you will need:");
        System.out.println(water * cups + " ml of water");
        System.out.println(milk * cups + " ml of milk");
        System.out.println(coffee * cups + " g of coffee beans");



    }
}
