package tech.thiagohgcoutinho.interfaces;

public interface OperateCar {
    // Constantes, se houver

    public int turn (Direction direction, int radius, int startSpeed, int endSpeed);

    public int changeLanes (Direction direction, int starSpeed, int endSpeed);

    public int signalTurn (Direction direction, boolean signalOn);

    public int getRadarFront (double distanceToCar, int speedOfCar);

    public int getRadarRear (double distanceToCar, int speedOfCar);
}
