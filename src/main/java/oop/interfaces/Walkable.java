package oop.interfaces;

public interface Walkable {
    double getWalk(int distance);

    int MAX_WALK_DISTANCE = 20;//км
    double AVERAGE_SPEED = 6; // средняя скорость пешехода км/ч
}
