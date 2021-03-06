package _08_Object_Oriented_Concepts._3_Polymorphism;

// RUNTIME POLYMORPHISM USING THE METHOD OVERRIDING.
/**
 * @Method_Overloading = Same method name but having different parameters
 * @Method_Overriding = Same method name but body of the programs varies
 */
class Plane
{
    String name;
    void takeOff()
    {
        System.out.println("plane is taking off");
    }
    void fly()
    {
        System.out.println("plane is flying"); //overriding here
    }
    void land()
    {
        System.out.println("plane is landing");
    }
}
class CargoPlane extends Plane
{
    {
        super.name = "Cargo Plane";
    }
    void fly()
    {
        System.out.println(name+" plane is flying");//overriding here
    }
    void carryCargo()
    {
        System.out.println(name+" used to carry goods");
    }
}
class PassengerPlane extends Plane
{
    {
        super.name = "Passenger Plane";
    }
    void fly()
    {
        System.out.println(name+" plane is flying");//overriding here
    }
    void carryPassenger()
    {
        System.out.println(name+" used to carry passengers");
    }
}
class FighterJet extends Plane
{
    {
        super.name = "Fighter Plane";
    }
    void fly()
    {
        System.out.println(name+" is flying");//overriding here
    }
    void CarryArms()
    {
        System.out.println(name+" used to carry arms");
    }
}
class Airport
{
    //method overriding here
    //NOTE: We create a reference to parent class using that reference we call method of parent class
    void Allow(Plane p)
    {
        p.takeOff();
        p.fly();
        p.land();
    }
}

public class _4_methodOverriding
{
    public static void main(String[] args)
    {
        CargoPlane cargo = new CargoPlane();
        PassengerPlane passenger = new PassengerPlane();
        FighterJet fighter = new FighterJet();
        Airport air = new Airport();

        System.out.println("---------------------------");
        air.Allow(cargo);
        cargo.carryCargo();
        System.out.println("---------------------------");
        air.Allow(passenger);
        passenger.carryPassenger();
        System.out.println("---------------------------");
        air.Allow(fighter);
        fighter.CarryArms();
    }
}
