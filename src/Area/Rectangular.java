package Area;

import java.util.Scanner;

public class Rectangular {
    float width;
    float height;

    public void inputInfo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Width: ");
        width = Float.parseFloat(input.nextLine());
        System.out.println("Enter Height: ");
        height = Float.parseFloat(input.nextLine());
    }

    public float Circumference(){
        return width * height;
    }

    public float Area(){
        return (width+height)*2;
    }
}
