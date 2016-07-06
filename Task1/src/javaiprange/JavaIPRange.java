/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaiprange;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class JavaIPRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        IPAdrStruct high_Addr = new IPAdrStruct();
        IPAdrStruct low_Addr = new IPAdrStruct();
        String ERR_MSG = "ќшибка при вводе адреса";

        System.out.println("ƒл€ выхода введите exit");

        Scanner sc = new Scanner(System.in);
        String arg = "";

        while (true) {
            while (!arg.equals("exit")) {
                System.out.println("¬ведите нижний диапазон");
                arg = sc.nextLine();
                if (low_Addr.setAddr(arg)) {
                    break;
                } else if (!arg.equals("exit")) {
                    System.out.println(ERR_MSG);
                }

            }

            while (!arg.equals("exit")) {
                System.out.println("¬ведите верхний диапазон");
                arg = sc.nextLine();
                if (high_Addr.setAddr(arg)) {
                    break;
                } else if (!arg.equals("exit")) {
                    System.out.println(ERR_MSG);
                }

            }
            if (arg.equals("exit")) {
                break;
            } else {
                IPAdrStruct.printIPRange(low_Addr, high_Addr);
            }
        }

    }
}
