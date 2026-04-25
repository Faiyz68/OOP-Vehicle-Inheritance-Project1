class Vehicle{
    String Brand;
    int year;
    Vehicle(){
        
    }
    void startengine(){
        System.out.println("THE VEHICLE'S ENGINE IS STARTING . . . ");
    }
    void display(){
        System.out.println("BRAND " +  Brand  + " year : " + year  );

    }
}
class Car extends Vehicle{
    int numberofdoors;
    void display(){
        System.out.println("BRAND " +  Brand  + ", year : " + year + ", number of doors : " + numberofdoors );
    }
    void openTrunk() {
        System.out.println("The trunk is now open.");
    }
    Car(){
        super();
        
    }
    @Override
    void startengine(){
        System.out.println("the car engine is starting ");
    }
}
void main(){
    Car c1 = new Car();
    c1.Brand="BMW";
    c1.year= 2015;
    c1.numberofdoors =4;
    c1.startengine();
    c1.display();
    Car c2 = new Car();
    c2.Brand= "Marcedes Benz";
    c2.year= 2024;
    c2.display();
    c2.openTrunk();
    Vehicle v1 = new Vehicle();
    v1.Brand="Ferrari";
    v1.year=1995;
    v1.display();
}