package com.hapi.ut.safe;

/**
 * @author athoucai
 * @date 2018/7/3
 */

public abstract class SafeRunnable implements Runnable {

    private Exception exception;

    @Override
    public void run() {
        try {
            safeRun();
        } catch (Exception e) {
            this.exception = e;
        }
    }

    public Exception getException() {
        return exception;
    }

    public abstract void safeRun();
}