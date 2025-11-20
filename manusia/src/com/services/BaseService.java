package com.services;

import java.util.ArrayList;

public abstract class BaseService {
    public abstract ArrayList<Object> createObjects(String[] names);

    public abstract void printOut(String pilihan, ArrayList<Object> listItems);
}
