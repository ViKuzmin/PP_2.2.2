package web.models;

public class Car {

    private String brand;
    private long miliage;
    private boolean notDamagedNotPainted;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public long getMiliage() {
        return miliage;
    }

    public void setMiliage(long miliage) {
        this.miliage = miliage;
    }

    public boolean isNotDamagedNotPainted() {
        return notDamagedNotPainted;
    }

    public void setNotDamagedNotPainted(boolean notDamagedNotPainted) {
        this.notDamagedNotPainted = notDamagedNotPainted;
    }

    public Car() {

    }

    public Car(String brand, long miliage, boolean notDamagedNotPainted) {
        this.brand = brand;
        this.miliage = miliage;
        this.notDamagedNotPainted = notDamagedNotPainted;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (miliage != car.miliage) return false;
        if (notDamagedNotPainted != car.notDamagedNotPainted) return false;
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (int) (miliage ^ (miliage >>> 32));
        result = 31 * result + (notDamagedNotPainted ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", miliage=" + miliage +
                ", notDamagedNotPainted=" + notDamagedNotPainted +
                '}';
    }
}
