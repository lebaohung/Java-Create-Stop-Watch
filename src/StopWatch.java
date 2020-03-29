import java.time.ZonedDateTime;
public class StopWatch {
    private long startTime, endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setStartTime() {
        this.startTime = ZonedDateTime.now().toInstant().toEpochMilli();
    }

    public void setEndTime() {
        this.endTime = ZonedDateTime.now().toInstant().toEpochMilli();
    }

    public long getElapsdTime() {
        return this.getEndTime() - this.getStartTime();
    }

}
