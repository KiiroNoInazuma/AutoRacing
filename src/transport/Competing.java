package transport;

public interface Competing {
    void pitStop(Transport transport);
    double bestLapTime();
    double maxSpeed();
}
