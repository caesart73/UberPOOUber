class Car {
    Integer id;
    String license;
    Account driver;
    Integer passenger;
    
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    void printDataCard(){
        System.out.println("Licence: " + license + "," + "Driver: " + driver.name);
    }
    
}