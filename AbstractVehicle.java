abstract class AbstractVehicle
{
int nooftyres;
abstract void start();
}
class Car extends AbstractVehicle
{
void start()
{
System.out.println("start with key");
}
}
class Scooter extends AbstractVehicle
{
void start()
{
System.out.println("start with key");
}
public static void main(String []args)
{
Car c=new Car();
c.start();
Scooter s=new Scooter();
s.start();
}
}

