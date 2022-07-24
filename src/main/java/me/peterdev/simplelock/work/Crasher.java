package me.peterdev.simplelock.work;

/**
 * @author PeterDev
 * @since 07/24/2022 at 2:51 p.m
 */

public class Crasher extends RuntimeException {
    public Crasher(String msg) {
        super(msg);
        setStackTrace(new StackTraceElement[0]);
    }
    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
