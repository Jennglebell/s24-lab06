package frogger;

/**
 * Refactor Task 1.
 *
 * @author Zishen Wen (F22), Deyuan Chen (S22)
 */
public class Road {
    private final boolean[] occupied;

    public Road(boolean[] occupied) {
        this.occupied = occupied;
    }

    public boolean isValid(int nextPosition) {
        if (nextPosition < 0) return false;
        return nextPosition < occupied.length;
    }

    public boolean isOccupied(int nextPosition) {
        return occupied[nextPosition];
    }
}
