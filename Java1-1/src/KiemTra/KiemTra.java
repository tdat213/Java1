/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KiemTra;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author SPC
 */


public class KiemTra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        String input;

        System.out.println("Nhap so (hoac 'stop' de dung):");
        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Vui long nhap mot so hop le hoac 'stop' de dung.");
            }
        }

        if (numbers.size() > 0) {
            int max = numbers.get(0);
            int min = numbers.get(0);
            int tong = 0;

            for (int num : numbers) {
                if (num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
                tong += num;
            }

            double trungbinh = (double) tong / numbers.size();

            System.out.println("So lon nhat: " + max);
            System.out.println("So nho nhat: " + min);
            System.out.println("Tong cua day so: " + tong);
            System.out.println("Trung binh cua day so: " + trungbinh);
        } else {
            System.out.println("Khong co so nao duoc nhap.");
        }

        scanner.close();
    }
}


