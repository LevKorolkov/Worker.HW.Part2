public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener error;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener error) {
        this.callback = callback;
        this.error = error;
    }

    public void toWork() {
        for (int i = 0; i <= 100; i++) {
            if (i == 33) {
                error.onError("ERROR: task " + i + " is not completed");
            }
            callback.onDone("Task " + i + " is done");
        }
    }

    public void onDone(String result) {
    }


    public void onError(String error) {
    }
}
