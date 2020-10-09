package decoratorpattern;
interface Car {
    void paint();
}


class ElectricCar implements Car {
    @Override
    public void paint() {
        // ...
    }
}


class HybridCar implements Car {
    @Override
    public void paint() {
        // ...
    }
}


abstract class CarDecorator implements Car {
    protected Car decoratedCar;
    public CarDecorator(Car car){
        decoratedCar = car;
    }
    public void paint(){
        decoratedCar.paint();
    }
}


class CarColorDecorator extends CarDecorator {
    public CarColorDecorator(Car car) {
        super (car);
    }
    @Override
    public void paint(){
        decoratedCar.paint();
        setTheme(decoratedCar);
    }
    private void setTheme(Car car){
        // ...
    }

}

public class decorator {
    public static void main(String[] args) {
        Car defaultHybridCar = new HybridCar();
        Car redHybridCar = new CarColorDecorator(new
                HybridCar());
        Car blueElectricCar = new CarColorDecorator(new
                ElectricCar());
        defaultHybridCar.paint();
        redHybridCar.paint();
        blueElectricCar.paint();
    }
}
