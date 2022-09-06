package de.jo.wynn.util;

public class Timer {

    public long started;

    public Timer() {
        this.started = System.currentTimeMillis();
    }

    public void reset() {
        this.started = System.currentTimeMillis();
    }

    public int get() {
        return (((int)System.currentTimeMillis()- (int)started));
    }

    public boolean check(int amount) {
        return get()>=amount;
    }

}
