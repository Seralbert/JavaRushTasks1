package com.javarush.task.task29.task2909.user;

import com.google.common.math.DoubleMath;
import com.google.common.util.concurrent.AtomicDouble;
//import com.google.common.util.concurrent.AtomicDouble;

public class UserHelper{
    private User userAnya = new User("Аня", "Смирнова", 10);
    private User userRoma = new User("Рома", "Виноградов", 30);

    private boolean isManAnya = false;
    private boolean isManRoma = true;



    public void printUsers() {
        userAnya.printInfo();
        userRoma.printInfo();
    }



    public int calculateAvarageAge() {
        User userUra = new User("Юра", "Карп", 28);

        return (userAnya.getAge() + userRoma.getAge() + userUra.getAge()) / 3;
    }

    public double calculateRate(AtomicDouble base, int age, boolean hasWork, boolean hasHouse) {
        double znach = base.get();
        znach +=  age / 100;
        znach = znach * (hasWork ? 1.1 : 0.9);
        znach = znach * (hasHouse ? 1.1 : 0.9);
        return znach;
    }

    public String getBossName(User user) {
        Work work = user.getWork();
        return work.getBoss();
    }
}