import java.time.LocalTime;

public class Round {

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    public Long getRoundLength() {
        return roundLength;
    }

    public void setRoundLength(Long roundLength) {
        this.roundLength = roundLength;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    private boolean started;
    private boolean completed;
    private Long roundLength;
    // add your timer

    public boolean isRoundCompleted() {
//        return LocalTime.now() < roundLength
        return false;
    }


}
