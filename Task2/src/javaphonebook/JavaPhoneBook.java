/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphonebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author User
 */
public class JavaPhoneBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Random r = new Random(1000);
        Scanner sc = new Scanner(System.in);
        String[] data = {"Иванов И.И.;+8 800 2000 500;+8 800 200 600","Петров П.П.;+8 800 2000 700","Сидоров С.С.;+8 800 2000 800;+8 800 2000 900;+8 800 2000 000","Кафка Ф."};
        HashMap book  = new HashMap();
        
        for (String data1 : data) {
            StringTokenizer st = new StringTokenizer(data1, ";");
            ArrayList phone = new ArrayList();
            book.put(st.nextToken().trim(),phone);
            while (st.hasMoreElements())
            {
                phone.add(st.nextToken());
            }
        }
       
       System.out.println("Для выхода из программы введите exit");
       while (true)
       { 
           System.out.println("Введите имя");
           String arg = sc.nextLine();
           if (arg.equals("exit")) break;
           if (book.get(arg) == null ) System.out.println("Такого человека в базе нет");
           else 
           {  
               ArrayList tmp = (ArrayList)book.get(arg);
               for (int i = 0 ; i < tmp.size(); i++)
                 System.out.println(i+1+". "+tmp.get(i));
           
           }
           
       }

}
}