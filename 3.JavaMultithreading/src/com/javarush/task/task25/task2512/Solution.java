package com.javarush.task.task25.task2512;

import java.util.ArrayList;
import java.util.Stack;

/*
Живем своим умом
*/
public class Solution implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        t.interrupt();
        ArrayList<Throwable> str = new ArrayList<>();
        str.add(e);
        Throwable el = e;
        while (el.getCause() != null)
        {
            el = el.getCause();
            str.add(0,el);
        }
        for (Throwable iskl : str)
        {
            System.out.println(iskl);
        }
        str.add(e);




    }

    public static void main(String[] args){
        Throwable e =  new Exception("ABC", new RuntimeException("DEF", new IllegalAccessException("GHI")));
        new Solution().uncaughtException(Thread.currentThread(), e);
    }
}
