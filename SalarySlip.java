import java.util.Scanner;

public class SalarySlip {
    static String name;
    static int employeeID;
    static double basicPay;
    static final String companyName = "HUA Co.";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        setData(sc);
        double grossData = basicPay + HRA() + DA() + TA();
        double netData = grossData - PF() - TAX();
        printSlip(grossData, netData);
        sc.close();
    }
    public static void printSlip(double grossData, double netData) {
        System.out.println(companyName);
        System.out.println("Your HRA : "+HRA());
        System.out.println("Your DA : "+DA());
        System.out.println("Your TA : "+TA());
        System.out.println("Your PF : "+PF());
        System.out.println("Your tax : "+TAX());
        System.out.println("Your gross salary : "+grossData);
        System.out.println("Your net salary : "+netData);

    }
    public static void setData(Scanner sc) {
        System.out.println("Enter the name");
        name = sc.nextLine();
        System.out.println("Enter the employee Id");
        employeeID = sc.nextInt();
        System.out.println("Enter the basic pay");
        basicPay = sc.nextDouble();
    }
    public static double HRA() {
        return 0.25*basicPay;
    }
    public static double DA() {
        return 0.30*basicPay;
    }
    public static double TA() {
        return 0.2*basicPay;
    }
    public static double PF() {
        return 0.12*basicPay;
    }
    public static double TAX() {
        if(basicPay <= 320000) {
            return 0;
        } else if(basicPay > 320000 && basicPay <= 450000) {
            return 0.12*basicPay;
        } else if(basicPay > 450000 && basicPay <= 699000){
            return 0.15*basicPay;
        } else {
            return 0.20*basicPay;
        }
    }
}