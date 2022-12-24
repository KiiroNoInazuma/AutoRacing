package transport;

public interface Competing {
    void pitStop(boolean pitStop);

    double bestLapTime(double time);

    double maxSpeed(double maxS);
}
