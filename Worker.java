public class Worker implements OnTaskDoneListener, OnTaskErrorListener {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is Error");
                continue;
            }
            callback.onDone("Task " + i + " is Done");
        }

    }

    @Override
    public void onDone(String result) {

    }

    @Override
    public void onError(String result) {

    }
}
