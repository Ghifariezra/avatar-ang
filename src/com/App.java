package com;

import com.services.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        BaseService ObjectFactory = new ObjectFactory();
        BaseService PrinterService = new PrinterService();

        Scanner input = new Scanner(System.in);
        System.out.print("Masukan pilihan: ");
        String pilihan = input.nextLine().toLowerCase();

        String[] names = { 
                "Dheka", 
                "Belva",
                "Bryan",
                "Agis",
                "Andiani",
                "Yayi"
         };
        
        ArrayList<Object> listItems = ObjectFactory.createObjects(names);
        PrinterService.printOut(pilihan, listItems);

        input.close();
    }
}
