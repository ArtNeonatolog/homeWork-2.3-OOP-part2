package transport;

public class Car extends Transport {

    private float engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private Boolean summerTires;

    public Car(String brand, String model, int productionYear, String productionCountry, String color, int maximumSpeed, float engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, Boolean summerTires) {
        super(brand, model, productionYear, productionCountry, color, maximumSpeed);
        if (engineVolume < 0.5) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;}
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "МКПП";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = "седан";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх";
        }
        if (numberOfSeats < 2 || numberOfSeats > 8) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
        if (this.summerTires == null) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;}
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public Boolean getSummerTires() {
        return summerTires;
    }

    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0.5) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = "МКПП";
        }
    }

    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        } else {
            this.registrationNumber = "х000хх";
        }
    }

    public void setSummerTires(Boolean summerTires) {
        if (this.summerTires == null) {
            this.summerTires = true;
        } else {
            this.summerTires = summerTires;}
    }

    public void setNumberOfSeats (int numberOfSeats){
        if (numberOfSeats < 2 || numberOfSeats > 8) {
            this.numberOfSeats = 4;
        } else {
            this.numberOfSeats = numberOfSeats;
        }
    }

    public void informationOfTheCar() {
        System.out.println(getBrand() + " " + getModel() + ", " + getProductionYear() + " год выпуска" + ", сборка - " + getProductionCountry() + ", цвет кузова - " + getColor() + ", объем двигателя - " + getEngineVolume() + " л." +
                ", коробка передач - " + getTransmission() + ", тип кузова - " + getBodyType() + ", регистрационный номер - " + getRegistrationNumber() + ", количество мест - " + getNumberOfSeats() + ", летняя резина - " + getSummerTires());
    }

    @Override
    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар");
    }
}