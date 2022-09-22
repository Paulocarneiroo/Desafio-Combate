package Application;

import Entities.Champion;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first champion data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Starting life: ");
        int life = sc.nextInt();
        System.out.print("Attack: ");
        int attack = sc.nextInt();
        System.out.print("Armor: ");
        int armor = sc.nextInt();

        Champion champion1 = new Champion(name, life, attack, armor);

        System.out.println("Enter second champion data:");
        System.out.print("Name: ");
        sc.nextLine();
        name = sc.nextLine();
        System.out.print("Starting life: ");
        life = sc.nextInt();
        System.out.print("Attack: ");
        attack = sc.nextInt();
        System.out.print("Armor: ");
        armor = sc.nextInt();

        Champion champion2 = new Champion(name, life, attack, armor);

        System.out.print("How many rounds you want to execute? ");
        int rounds = sc.nextInt();

        for (int i = 0; i < rounds; i++) {
            System.out.println("Round " + (i+1) + " result:");
            champion1.takeDamage(champion2);
            champion2.takeDamage(champion1);
            if (champion1.getLife() <= 0 || champion2.getLife() <= 0){
                System.out.println(champion1.status());
                System.out.println(champion2.status());
                break;
            }else {
                System.out.println(champion1.status());
                System.out.println(champion2.status());
            }
        }
        System.out.println("END OF FIGHT");
        sc.close();
    }
}
