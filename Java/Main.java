class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    UberX uberX = new UberX("AMQ123", new Account("Frida Benitez", "123456"), "Chevrolet", "Sonic");
    uberX.setPassenger(4);
    uberX.printDataCar();

    UberVan uberVan = new UberVan("AMQ456", new Account("Daniela Valdez", "456789"));
    uberVan.setPassenger(6);
    uberVan.printDataCar();
  }
}