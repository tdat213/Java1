/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai15;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author SPC
 */
public class Bai15_TinhDaySoConsole {
    public static void main(String[] args) {
        System.out.println("Tinh Cong Tru Nhan Chia");
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> dsso = new ArrayList<String>();
        for (int i = 1; i <= 100; i++) {
            
            dsso.add(Integer.toString(i));
        }
        dsso.add("dfg");
        
        int x = dsso.indexOf(60);
        dsso.remove(x);

    }
}
