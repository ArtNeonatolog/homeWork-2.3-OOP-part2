package transport;

public class Bus extends Transport {
    public Bus(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }

    public void informationOfTheBus() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", максимальная скорость - " + getMaximumSpeed() + " км/ч");
    }
}
