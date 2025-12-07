/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Rin
 */
import java.util.*;
public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your money : ");
        double money = sc.nextDouble();
        System.out.print("Input your account type(Please type A B C or X in uppercase) : ");
        char Type = sc.next().charAt(0);
        switch (Type) {
            case 'A' -> {
                money = money * 1.015;
                System.out.println("Your total money in one year = " + (int)money);
            }
            case 'B' -> {
                money = money * 1.02;
                System.out.println("Your total money in one year = " + (int)money);
            }
            case 'C' -> {
                money = money * 1.015;
                System.out.println("Your total money in one year = " + (int)money);
            }
            case 'X' -> {
                money = money * 1.05;
                System.out.println("Your total money in one year = " + (int)money);
            }
        }
    }
}
