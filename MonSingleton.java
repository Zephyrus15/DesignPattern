package com.tactfactory.designpatternniveau1.singleton.tp1;

import java.util.ArrayList;
import java.util.List;

public class MonSingleton
{
    private MonSingleton()
    {}
     
    private static MonSingleton INSTANCE = null;
    
    private List<Entity1> list1 = new ArrayList<Entity1>();
     
    public static synchronized MonSingleton getInstance()
    {           
        if (INSTANCE == null)
        {   INSTANCE = new MonSingleton(); 
        }
        return INSTANCE;
    }
}