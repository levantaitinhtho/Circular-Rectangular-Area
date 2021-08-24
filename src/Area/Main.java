package Area;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangular rectangular = new Rectangular();
        int choose;
        Scanner input = new Scanner(System.in);
        do {
            showMenu();
            System.out.println("Enter Choose: ");
            choose = Integer.parseInt(input.nextLine());
            switch (choose){
                case 1:
                    circle.inputInfo();
                    break;
                case 2:
                    System.out.println("Circumference Circle: "+ circle.circumference());
                    break;
                case 3:
                    System.out.println("Area Circle: "+ circle.Area());
                    break;
                case 4:
                    rectangular.inputInfo();
                    break;
                case 5:
                    System.out.println("Circumference Rectangular: "+ rectangular.Circumference());
                    break;
                case 6:
                    System.out.println("Area Rectangular: "+ rectangular.Area());
                    break;
                case 7:
                    System.out.println("GoodBye!! ~~");
                    break;
                default:
                    System.out.println("Enter Again");
            }

        }while (choose!=7);
    }
    static void showMenu(){
        System.out.println("1.Enter Information Circle");
        System.out.println("2.Circumference Circle");
        System.out.println("3.Area Circle");
        System.out.println("4.Enter Information Rectangular");
        System.out.println("5.Circumference Rectangular");
        System.out.println("6.Area Rectangular");
        System.out.println("7.Exit");
    }
}
