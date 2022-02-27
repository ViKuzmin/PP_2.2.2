package web.models;

public class Car {

    private String brand;
    private long miliage;
    private boolean notDamagedNotPainted;

    /*private static List<Car> listCar = new ArrayList<>();
    {
        listCar.add(new Car("C1", 15, true));
        listCar.add(new Car("C2", 1123, true));
        listCar.add(new Car("C3", 815, false));
        listCar.add(new Car("C4", 45615, true));
        listCar.add(new Car("C5", 456315, false));
    }*/

    /*public static List<Car> getListCar() {
        return listCar;
    }*/

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
        return brand != null ? brand.equals(car.brand) : car.brand == null;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (int) (miliage ^ (miliage >>> 32));
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
