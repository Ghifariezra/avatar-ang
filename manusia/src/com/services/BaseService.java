package com.services;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class BaseService {
    public abstract ArrayList<Object> createObjects(String[] names);

    public abstract void printOut(String pilihan, ArrayList<Object> listItems, Scanner input);
}
