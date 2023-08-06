package creational_patterns.builder;

/**
 * Теперь мы напишем класс-распорядитель AutomotiveEngineer, под руководством которого строитель будет собирать автомобиль (объект Car) шаг за шагом в четко определенном порядке.
 */
public class AutomotiveEngineer {
    
    private CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    /**
     * метод manufactureCar вызывает этапы сборки автомобиля в правильном порядке.
     * @return
     */
    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }

}
