class vehicle{
    public void run(){
        System.out.println("Vehicle is running");
    }
    public void stand(){
        System.out.println("The vehicle is standing");
    }
}


class Car extends vehicle{
    public void run(){
        System.out.println("Car is running");
    }
    public void stand(){
        System.out.println("Car is standing");
    }
}


class Bike extends vehicle{
    public void run(){
        System.out.println("Bike is running");
    }
    public void stand(){
        System.out.println("The Bike is standing");
    }
}



public class Demo2 {
    public static void main(String[] args) {
        System.out.println("Let's see what happens");
        Car obj1=new Car();
        Bike obj2=new Bike();

//  obj1=obj2;//Error because we are trying to assign an object of type Bike to a reference variable of type Car.
        vehicle ref; //This statement declares a reference variable named ref of type vehicle.
        ref = obj1; // Assigning the object referenced by obj1 (Car object) to the reference variable ref.
        obj1.run();
        obj2.run();
        ref.run();

    }
}
