package com.javarush.task.task25.task2506;

/**
 * Created by i.lapshinov on 15.02.2017.
 */
public  class LoggingStateThread extends Thread
{
    private Thread thread;
    public LoggingStateThread(Thread thread)
    {
        super();
        this.thread = thread;
        setDaemon(true);
    }

    @Override
    public void run() {
        State state = thread.getState();
        System.out.println(state);

        while (state != State.TERMINATED){
            if(state != thread.getState()){
                state = thread.getState();
                System.out.println(state);
            }
        }
    }
}
