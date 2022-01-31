abstract class Car{

    public abstract CarFuel();
    public void Fuel(){
        System.out.println("Petrol");

    }
}
class HisCar extends Car{
    @java.lang.Override
    public void Fuel() {
        System.out.println(" His Car uses ");

    }
}
class Main {
    public static void main(String[] args) {
        HisCar hisCar = new HisCar();
        hisCar.carFuel();
       hisCar.Fuel();
    }
}