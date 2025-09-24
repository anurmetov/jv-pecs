package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    private double armLength;
    private double bucketVolume;

    public Excavator() {
        System.out.println(this.getClass().getSimpleName() + "is created");
    }

    public double getArmLength() {
        return armLength;
    }

    public void setArmLength(double armLength) {
        this.armLength = armLength;
    }

    public double getBucketVolume() {
        return bucketVolume;
    }

    public void setBucketVolume(double bucketVolume) {
        this.bucketVolume = bucketVolume;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
