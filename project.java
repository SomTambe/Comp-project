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
    static int gasno;
    static int gasbill;
    static int op1;
    static int prepost;
    static int pre;
    static int recharge;
    static double finrec;
    static String name;
    static String address;
    static int in1;
    static double ttdata;
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter address:");
        address=sc.nextLine();
        System.out.println("Choose bill to be calculated:\n1.)Gas\n2.)Electricity\n3.)telephone");
        System.out.println("____________________________________________________________________");
        opt=sc.nextInt();
        switch(opt){
            case 1:
                System.out.println("________________________________GAS BILL_________________________________");
                System.out.println("Enter digits there in red on your gas metre:");
                gasno=sc.nextInt();
                gasbill=gasno*7;
                System.out.println("Your bill is "+gasbill);
                System.out.println("Press 1 to calculate electricity bill, or press any other number to exit.");
                op1=sc.nextInt();
                if(op1==1){
                }
                else{
                    break;
                }
            case 2:
                System.out.println("_________________________ELECTRICITY BILL_________________________");
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
                System.out.println("___________________________MOBILE BILL____________________________");
                System.out.println("Press 1 for prepaid,or any other number for postpaid.");
                prepost=sc.nextInt();
                if(prepost==1){
                    System.out.println("Press 1 for custom plan or 2 to select plan.");
                    pre=sc.nextInt();
                    
                    if(pre==2){
                        System.out.println("Select from the following plan:");
                        System.out.println("1.)Talktime=Rs.40.10;Recharge=Rs.50");
                        System.out.println("2.)Talktime=Rs.90;Recharge=Rs.100");
                        System.out.println("3.)Talktime=Rs.138.92;Recharge=Rs.150");
                        System.out.println("4.)Talktime=Rs.186.20;Recharge=Rs.200");
                        System.out.println("5.)Talktime=Rs.233.20;Recharge=Rs.250");
                        System.out.println("6.)Talktime=Rs.279.50;Recharge=Rs.300");
                        System.out.println("If amount more than this, press 7 to choose custom plan.");
                        //custom plan code starts
                        int custplan=sc.nextInt();
                        if(custplan==1){
                            finrec=50;
                        }
                        else if(custplan==2){
                            finrec=100;
                        }
                        else if(custplan==3){
                            finrec=150;
                        }
                        else if(custplan==4){
                            finrec=200;
                        }
                        else if(custplan==5){
                            finrec=250;
                        }
                        else if(custplan==6){
                            finrec=300;
                        }
                        else if(custplan==7){
                            pre=1;
                        }
                        tdata=finrec;
                        }
                        
                        if(pre==1){
                        System.out.println("Enter recharge amount=");
                        recharge=sc.nextInt();
                        if(recharge==222||recharge==250||recharge==350||recharge==500||recharge==750||recharge==777||recharge==1000||recharge==204){
                            finrec=recharge;
                        }
                        else{
                            finrec=recharge+(0.1*recharge);
                        }
                        tdata=finrec;
                        }
                    else{
                        System.out.println("Enter number of minutes:");
                        minutes=sc.nextInt();
                        }
                        
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
                        tdata=(minutes*0.72)+minutes;
                        }
                        ttdata=tdata+data;
                    System.out.println("Total amount to be paid:Rs."+ttdata); 
                    break;
                default:
                System.out.println("Invalid choice.");
                
        }
        System.out.println("__________________________________________________________________________");
        System.out.println("Mr."+name+", living at "+address+" your payment of bills are as follows:");
        System.out.println("Gas Bill=Rs."+gasbill);
        System.out.println("Electricity bill=Rs."+paygast);
        System.out.println("Mobile bill=Rs."+tdata);
        System.out.println("Total amount in bills to be paid="+(gasbill+paygast+tdata));
        System.out.println("Please pay them as soon as possible to avoid extra charges.");
        System.out.println("Thank you!!!!");
    }
}