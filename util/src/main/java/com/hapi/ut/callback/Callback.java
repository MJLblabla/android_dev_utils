package com.hapi.ut.callback;

/**
 * Created by athoucai on 16/10/10.
 */

public interface Callback<T> {
    void onCall(T t);
}
