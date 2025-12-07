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
public class Compare01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();
        if( n1.equals(n2) ) {
               System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }
}
