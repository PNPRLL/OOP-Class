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
public class Tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        if (money > 50000.00) {
            money = money * 0.1;
            System.out.println(money);
        }else {
            money = money * 0.05;
            System.out.println(money);
        }
    }
}
