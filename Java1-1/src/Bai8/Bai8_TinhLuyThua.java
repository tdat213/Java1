/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai8;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai8_TinhLuyThua {
    public static void main(String[] args) {
        double so, mu, luythua = 1;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap so: ");
        so = sc.nextDouble();
        
        System.out.print("Nhap so mu: ");
        mu = sc.nextDouble();

        for(int i = 1; i<= mu; i++){
            luythua *= so;
        }
        
        System.out.println(so + " luy thua " + mu + " = " + luythua);
    }    
        
}
