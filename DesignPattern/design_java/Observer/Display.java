/*package Observer;
import java.util.*;
class Sensor extends Observable
{
private int temp = 68;
void takeReading()
{
double d=.05;

//d =Math.random();
if(d>0.75)
{
temp++;
setChanged();
}
else if (d<0.25)
{
temp--;
setChanged();
}
System.out.print("[Temp: " + temp + "]");
}
public int getReading()
{
return temp;
}
}


public class Display implements Observer 
{
public void update(Observable o, Object arg)
{
System.out.print("New Temp: " + ((Sensor) o).getReading());
}
public static void main(String []ac)
{
Sensor sensor = new Sensor();
Display display = new Display();
// register observer with observable class
sensor.addObserver(display);
// Simulate measuring temp over time
for(int i=0; i < 20; i++)
{
sensor.takeReading();
sensor.notifyObservers();
System.out.println();
}
}
}*/
