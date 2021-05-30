from car import Car

if __name__ == "__main__":
  print("Hello world!")
  car = Car()
  car.license = "DVH123"
  car.driver = "Frida Benitez"
  print(vars(car))

  car = Car()
  car.license = "MPCP123"
  car.driver = "Daniela Valdez"
  print(vars(car))