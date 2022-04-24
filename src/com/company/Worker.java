package com.company;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        int i = 0;
        while (i < 100) {
            i++;
            if (i < 33) {
                callback.onDone("Task " + i + " is done");
                continue;
            }
            else if (i == 33) {
                errorCallback.onError("Task " + i + " was failed");
                continue;
            }
            else if (i > 33) {
                callback.onDone("Task " + i + " is done");
                continue;
            }

        }
    }
}