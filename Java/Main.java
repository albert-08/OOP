class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Car car = new Car("AMQ123", new Account("Frida Benitez", "123456"));
    car.passenger = 4;
    car.printDataCar();

    Car car2 = new Car("AMQ456", new Account("Daniela Valdez", "456789"));
    car2.passenger = 4;
    car2.printDataCar();
  }
}