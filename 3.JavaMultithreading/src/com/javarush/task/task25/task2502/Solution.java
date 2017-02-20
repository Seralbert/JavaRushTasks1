package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            //init wheels here
            wheels = new LinkedList<>();
            String[] s = loadWheelNamesFromDB();
            Wheel[] list = Wheel.values();
            boolean el = false;
            if (s.length != 4)
            {
                throw new IllegalArgumentException();
            }
            for (String s1 : s){

                for (int i = 0; i < list.length; i++) {
                    if (s1.equals(list[i].toString()))
                    {
                        el = true;
                        if (el = true)
                        {
                            wheels.add(list[i]);
                        }
                        el = false;
                    }
                }
                boolean el2 = false;
                for (int i = 0; i < list.length; i++) {
                    if (s1.equals(list[i].toString())) {
                        el2 = true;
                    }}
                if (el2 != true) {
                    throw new IllegalArgumentException();
                }
                el2 = false;
            }


        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {

    }
}
