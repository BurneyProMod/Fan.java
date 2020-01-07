// Programming Project 1 - CMPS 260
// Due Date: 10/17/2016
// Program Description: Create an editable array of fans
package prog1_npb9925;

import java.util.Scanner;

public class Prog1_npb9925 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        choice = 999;
        System.out.println("How many fans would you like to create? ");
        int arraySize;
        arraySize = input.nextInt();
        Fan fanClass = new Fan();
        Fan[] a = new Fan[arraySize];
        fanClass.SetArraySize(arraySize);
        System.out.println("Array created, all fans set to Radius 5.");
        System.out.println();
        System.out.println();
        while (choice != 0) {
            System.out.println("What would you like to do?");
            System.out.println("1: Edit a fan's radius");
            System.out.println("2: Edit a fan's speed");
            System.out.println("3: Toggle lights on a fan");
            System.out.println("4: Step speed on all fans");
            System.out.println("5: Turn lights off on all fans");
            System.out.println("6: Turn lights on for all fans");
            System.out.println("7: View information on a fan");
            System.out.println("8: View information on all fans");
            System.out.println("9: Exit");
            choice = input.nextInt();
            if (choice == 1) {
                double setRadius;
                int selectFan;
                System.out.println("Which fan would you like to change?");
                selectFan = input.nextInt();
                System.out.println("What is the new radius?");
                setRadius = input.nextInt();
                a[selectFan + 1].SetRadius(setRadius);
                System.out.println("New Radius Set");
                System.out.println();
            } else if (choice == 2) {
                int selectFan;
                String newSpeed;
                System.out.println("Which fan's speed would you like to adjust?");
                selectFan = input.nextInt();
                a[selectFan + 1].SetSpeed();
                newSpeed = a[selectFan + 1].GetSpeed();
                System.out.println("Fan Speed Adjusted, new speed: " + newSpeed);
            } else if (choice == 3) {
                int selectFan;
                String newLight;
                System.out.println("Which fan's lights would you like to adjust?");
                selectFan = input.nextInt();
                a[selectFan + 1].SetLights();
                newLight = a[selectFan + 1].GetLights();
                System.out.println("Fan Lights Adjusted, new speed: " + newLight);
                System.out.println();
            } else if (choice == 4) {
                System.out.println("Stepping speeds for all fans...");
                for (int i = 0; i > a.length; i++) {
                    a[i].SetSpeed();
                }
                System.out.println("All speeds adjusted");
                System.out.println();
            } else if (choice == 5) {
                System.out.println("Turning all lights off...");
                for (int i = 0; i > a.length; i++) {
                    if (a[i].GetLights() == "on") {
                        a[i].SetLights();
                    }
                }
                System.out.println("All Lights Off");
                System.out.println();
            } else if (choice == 6) {
                System.out.println("Turning all lights on...");
                for (int i = 0; i > a.length; i++) {
                    if (a[i].GetLights() == "off") {
                        a[i].SetLights();
                    }
                }
                System.out.println("All Lights On");
                System.out.println();

            } else if (choice == 7) {
                int selectFan;
                String info;
                System.out.println("Which fan would you like to see?");
                selectFan = input.nextInt();
                System.out.print("Fan: " +selectFan);
                System.out.print(" ");
                System.out.print("Radius: " +a[selectFan-1].GetRadius());
                System.out.print(" ");
                System.out.print("Speed: " +a[selectFan-1].GetSpeed());
                System.out.print(" ");
                System.out.print("Lights: " +a[selectFan-1].GetLights());
                System.out.println();
            } else if (choice == 8) {
                System.out.println("Printing all fans:");
                System.out.println();
                for (int i = 0; i > a.length; i++) {
                    System.out.println(a[i].toString());
                }
            } else if (choice == 9) {
                break;
            } else {
                System.out.println("Invalid Option, please try again");
            }
        }
        System.out.println("Goodbye!");

    }

}
