import java.util.*;
class project{
    static int opt;
    static int sup;
    static double units;
    static double paygas;
    static double paygast;
    static double duty;
    static int minutes;
    static int op2;
    static int G;
    static int mb;
    static double data;
    static double tdata;
    static int mnths;
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose bill to be calculated:\n1.)Gas\n2.)Electricity\n3.)telephone");
        System.out.println("____________________________________________________________________");
        opt=sc.nextInt();
        switch(opt){
            case 1:
                System.out.println("Hmm");
                break;
            case 2:
                System.out.println("___________________GAS BILL_____________________");
                System.out.println("Choose supplier:");
                System.out.println("1.)Reliance");
                System.out.println("2.)Tata");
                sup=sc.nextInt();
                if(sup==1){
                    System.out.println("Enter number of units consumed:");
                    units=sc.nextDouble();
                    System.out.println("Enter number of months:");
                    mnths=sc.nextInt();
                    if(units<=150&&units>0){
                        paygas=units*mnths*2.30;
                    }
                    else if(units>150&&units<=400&&units>0){
                        paygas=(150*mnths*2.30)+((units-150)*mnths*4.20);
                    }
                    else if(units>400&&units>0){
                        paygas=(150*mnths*2.30)+(250*mnths*4.20)+(mnths*4.40*(units-400));
                    }
                    else{
                        paygas=0;
                    }
                    duty=units*0.09;
                    paygast=duty+paygas;
                    System.out.println("Bill:"+paygast);
                }
                else if(sup==2){
                    System.out.println("Enter number of units consumed:");
                    units=sc.nextDouble();
                    System.out.println("Enter number of months:");
                    mnths=sc.nextInt();
                    if(units<=150&&units>0){
                        paygas=units*mnths*2.30;
                    }
                    else if(units>150&&units<=400&&units>0){
                        paygas=(150*mnths*2.30)+((units-150)*mnths*4.20);
                    }
                    else if(units>400&&units>0){
                        paygas=(150*mnths*2.30)+(250*mnths*4.20)+(mnths*4.40*(units-400));
                    }
                    else{
                        paygas=0;
                    }
                    duty=units*0.09;
                    paygast=duty+paygas;
                    System.out.println("Bill:"+paygast);
                }
                System.out.println("Press 1 for mobile bill, or press any other number to exit.");
                op2=sc.nextInt();
                if(op2==1){
                }
                else{
                    break;
                }
            case 3:
                System.out.println("___________________MOBILE BILL____________________");
                System.out.println("Enter number of minutes:");
                minutes=sc.nextInt();
                System.out.println("Enter 4 for 4G or 3 for 3G, or any other number for no data pack-");
                G=sc.nextInt();
                if(G==4){
                    System.out.println("Enter amount of data consumed in MB on the internet:");
                    mb=sc.nextInt();
                    data=mb*0.4;
                }
                else if(G==3){
                    System.out.println("Enter amount of data consumed in MB on the internet:");
                    mb=sc.nextInt();
                    data=mb*0.1;
                }
                else{
                    data=0;
                }
                tdata=data+(minutes*0.3);
                System.out.println("Total bill="+tdata);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}