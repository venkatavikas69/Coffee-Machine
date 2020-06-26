package jetbrains;
import java.util.*;

public class CoffeeMachine{
	static Scanner in = new Scanner(System.in);
	
	static int money = 550;
	static int water = 400;
	static int milk = 540;
	static int beans = 120;
	static int cups = 9;
	static boolean back;
	
	static void defaul() {
		System.out.println("");
		System.out.println("The coffee machine has:");
		System.out.println(water + " of water");
		System.out.println(milk + " of milk");
		System.out.println(beans + " of coffee beans");
		System.out.println(cups + " of disposable cups");
		if(money>0) {
			System.out.println("$"+money + " of money");
		}else{
			System.out.println(money + " of money");
		}
		System.out.println("");
	}
	
	static void buy() {
		
		System.out.println("");
		System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back - to main menu: ");
		String option = in.next();
		
		switch(option) {
		case "1":
			if(water>=250 && beans>=16 && cups>=1) {
				System.out.println("I have enough resources, making you a coffee!");
				water -= 250;
				beans -= 16;
				money += 4;
				cups--;
			}else if(water<250) {
				System.out.println("Sorry, not enough water!");
			}else if(beans<16) {
				System.out.println("Sorry, not enough coffee beans!");
			}
			break;
		case "2":
			if(water>=350 && beans>=20 && cups>=1 && milk >= 75) {
				System.out.println("I have enough resources, making you a coffee!");
				water -= 350;
				milk -= 75;
				beans -= 20;
				money += 7;
				cups--;
			}else if(water<350) {
				System.out.println("Sorry, not enough water!");
			}else if(beans<20) {
				System.out.println("Sorry, not enough coffee beans!");
			}else if(milk<75) {
				System.out.println("Sorry, not enough milk!");
			}
			break;
		case "3":
			if(water>=200 && beans>=100 && milk>= 100 && cups>=1) {
				System.out.println("I have enough resources, making you a coffee!");
				water -= 200;
				milk -= 100;
				beans -= 12;
				money += 6;
				cups--;
			}else if(water<200) {
				System.out.println("Sorry, not enough water!");
			}else if(beans<12) {
				System.out.println("Sorry, not enough coffee beans!");
			}else if(milk<100) {
				System.out.println("Sorry, not enough milk!");
			}
			break;
		default:
			break;
		}
	  
	}
	
	static void fill() {
		System.out.println();
		System.out.println("Write how many ml of water do you want to add: ");
		int addWater = in.nextInt();
		System.out.println("Write how many ml of milk do you want to add: ");
		int addMilk = in.nextInt();
		System.out.println("Write how many grams of coffee beans do you want to add: ");
		int addBeans = in.nextInt();
		System.out.println("Write how many disposable cups of coffee do you want to add: ");
		int addCups = in.nextInt();
		String s = in.nextLine();
		water += addWater;
		milk += addMilk;
		beans += addBeans;
		cups += addCups;
	}
	
	static void take() {
		System.out.println("I gave you $"+money);
		money =0;
	}
	
	public static void main(String[] args) {
		
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
		
		do {
		
		System.out.println();	
		System.out.println("Write action (buy, fill, take, remaining, exit):");
		String action = in.next().toLowerCase();
		
		if(action.equals("buy")) {
			buy();
			System.out.println("");
		}else if(action.equals("fill")) {
			fill();
			System.out.println("");
		}else if(action.equals("take")) {
			take();
			System.out.println("");
		}else if(action.equals("remaining")) {
			defaul();
			System.out.println();
		}else if(action.equals("exit")) {
			break;
		}
		else {
			System.out.println("Enter one of the valid command!");
		}
			
		}while(true);
    }	
}


