public abstract class Task {
    protected String taskName;
    protected int taskNumber;
    protected boolean isDone;

    public Task(String taskName) {
        this.taskName = taskName;
        this.isDone = false;
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public void markDone() {
        isDone = true;
    }

    @Override
    public String toString() {
        if (isDone()) {
            return "[✓] " + taskName;
        }
        else {
            return "[ ] " + taskName;
        }
    }
}
