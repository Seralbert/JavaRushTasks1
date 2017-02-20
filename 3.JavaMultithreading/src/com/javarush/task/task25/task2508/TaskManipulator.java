package com.javarush.task.task25.task2508;

public class TaskManipulator implements Runnable, CustomThreadManipulator {
    Thread thread;


    @Override
    public void start(String threadName) {
        thread = new Thread(this);
        thread.setName(threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }

    @Override
    public void run() {
        try {
            while (!thread.isInterrupted()) {
                Thread.sleep(0);
                System.out.println(thread.getName());
                Thread.sleep(90);
            }
        } catch (InterruptedException e) {}
    }
}
