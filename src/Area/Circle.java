package Area;

import java.util.Scanner;

public class Circle {
    float radius;

    public double getPi(){
        return Math.PI;
    }
    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        radius = Float.parseFloat(input.nextLine());
    }
    public float circumference(){
        return (float) (2 * getPi() * radius);
    }
    public float Area(){
        return (float) (getPi() * Math.pow(radius,2));
    }
}
