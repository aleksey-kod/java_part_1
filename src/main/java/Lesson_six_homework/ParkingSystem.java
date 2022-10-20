package Lesson_six_homework;

public class ParkingSystem {
    private int big;
    private int medium;
    private int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        switch (carType) {
            case 1:
                if (this.big > 0) {
                    big -= 1;
                    return true;
                }
                return false;
            case 2:
                if (this.medium > 0) {
                    medium -= 1;
                    return true;
                }
                return false;
            case 3:
                if (this.small > 0) {
                    small -= 1;
                    return true;
                }
                return false;
            default:
                return false;
        }
    }
}
