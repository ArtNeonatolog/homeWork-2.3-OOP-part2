package transport;

public class Train extends Transport {

    private int tripPrice;
    private String timeTrip;
    private String nameOfTheDepartureStation;
    private String endingStation;
    private int numberOfWagons;

    public Train(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed, int tripPrice, String timeTrip, String nameOfTheDepartureStation, String endingStation, int numberOfWagons) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
        if(tripPrice < 100) {
            this.tripPrice = 500;
        }else{
            this.tripPrice = tripPrice;}
        if(timeTrip != null && !timeTrip.isEmpty() && !timeTrip.isBlank()) {
            this.timeTrip = timeTrip;
        }else{
            this.timeTrip = "1 час";}
        if(nameOfTheDepartureStation != null && !nameOfTheDepartureStation.isEmpty() && !nameOfTheDepartureStation.isBlank()) {
            this.nameOfTheDepartureStation = nameOfTheDepartureStation;
        }else{
            this.nameOfTheDepartureStation = "Начальная станция";}
        if(endingStation != null && !endingStation.isEmpty() && !endingStation.isBlank()) {
            this.endingStation = endingStation;
        }else{
            this.endingStation = "Конечная станция";}
        if(numberOfWagons < 1) {
            this.numberOfWagons = 3;
        }else{
            this.numberOfWagons = numberOfWagons;}
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public String getTimeTrip() {
        return timeTrip;
    }

    public String getNameOfTheDepartureStation() {
        return nameOfTheDepartureStation;
    }

    public String getEndingStation() {
        return endingStation;
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setTripPrice(int tripPrice) {
        if(tripPrice < 100) {
            this.tripPrice = 500;
        }else{
            this.tripPrice = tripPrice;}
    }

    public void setTimeTrip(String timeTrip) {
        if(timeTrip != null && !timeTrip.isEmpty() && !timeTrip.isBlank()) {
            this.timeTrip = timeTrip;
        }else{
            this.timeTrip = "1 час";}
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if(numberOfWagons < 1) {
            this.numberOfWagons = 3;
        }else{
            this.numberOfWagons = numberOfWagons;}
    }

    public void informationOfTheTrain() {
        System.out.println("Поезд " + getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", максимальная скорость - " + getMaximumSpeed() + " км/ч"
                + ", цена поездки - " + getTripPrice() + " рублей," + "\n" + "время поездки - " + getTimeTrip() + ", начальная станция - " + getNameOfTheDepartureStation() + ", конечная станция - " + getEndingStation() + ", количество вагонов - " + getNumberOfWagons());
    }

    @Override
    public void refill() {
        System.out.println("Нужно заправлять дизелем");
    }
}