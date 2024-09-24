/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai7;

import java.util.Scanner;

/**
 *
 * @author SPC
 */
public class Bai7_HinhTron {
    public static void main(String[] args) {
        double bankinh, chuvi, dientich;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhap ban kinh: ");
        bankinh = sc.nextDouble();

        chuvi = Math.PI * bankinh * 2;
        dientich = Math.PI * bankinh * bankinh;
        
        System.out.println("Chu Vi : " + chuvi);
        System.out.println("Dien Tich: " + dientich);
        
    }
}
