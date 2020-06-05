package test;
import java.util.*;

public class CoffeeMachine{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
        System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");
        
        System.out.println("Write how many cups of coffee you will need:");
        int n = in.nextInt();
        
        int twater = 200*n;
        int tmilk =  50*n;
        int tcoffee = 15*n;
        
        System.out.println(twater+" ml of water");
        System.out.println(tmilk+" ml of milk");
        System.out.println(tcoffee+" g of coffee beans"); 
        
        
        System.out.println("Write how many ml of water the coffee machine has: ");
        int water = in.nextInt();
        
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = in.nextInt();
        
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beans = in.nextInt();
        
        System.out.println("Write how many cups of coffee you will need: ");
        int cups = in.nextInt();
      
        water /= 200;
        milk /= 50;
        beans /= 15;
        
        int min = Math.min(water, milk);		//gets minimum values
        min = Math.min(beans, min);
        
        if (cups==min) {
			System.out.println("Yes, I can make that amount of coffee");
		} else if(cups<min) {
			System.out.println("Yes, I can make that amount of coffee (and even " +(min - cups) + " more than that)");
		} else {
			System.out.println("No, I can make only " + min + " cup(s) of coffee");
		}
        
    }	
}

