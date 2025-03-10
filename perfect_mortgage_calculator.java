package javabymosh;

import java.text.NumberFormat;
import java.util.Scanner;

public class perfect_mortgage_calculator {
    public static void main(String[] args) {
        //principle,annual interest rate,time(year)
        //M=(r(1+r)^n)/((1+r)^n)-1
        final int percent=100;
        final int month =12;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the principle amount : ");
        int principle = scanner.nextInt();
        while(true){
            if (principle>=1 && principle<=1000_000){
                System.out.println("the principle amount is : "+principle);
                break;
            }
            else{
                System.out.println("enter the principle amount again: ");
                principle=scanner.nextInt();
            }
        }
        System.out.println("enter the annual interest rate: ");
        float annual_rate= scanner.nextFloat();
        float monthly_rate;
        while(true){
            if (annual_rate>=0f && annual_rate<=30.0f){
                System.out.println("the annual interest rate is : "+annual_rate);
                break;
            }
            else{
                System.out.println("enter the annual interest rate again: ");
                annual_rate= scanner.nextFloat();
            }
        }
        monthly_rate=(annual_rate/percent)/month;
        System.out.println("the monthly interest is : "+monthly_rate);
        System.out.println("enter the period(year) : ");
        int period = scanner.nextInt();
        while(true){
            if (period>=1 && period<=30){
                System.out.println("the period is : "+period);
                break;
            }
            else{
                System.out.println("enter the period again: ");
                period =scanner.nextInt();
            }
        }
        int time_in_month=period*month;
        System.out.println("the no. of months are: "+time_in_month);
        double mortgage= principle*((monthly_rate*Math.pow(1+monthly_rate,time_in_month))/(Math.pow(1+monthly_rate,time_in_month)-1));
        String monthly_mortgage=NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println(monthly_mortgage);
    }
}
