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
    static String mobileno;
    static int lenmobno;
    static int gaschoice;
    static int optionchoice;
    static int telchoice;
    static int elecchoice;
    static int postmins;
    static String intchoice;
    public static void result(){
        System.out.println("__________________________________________________________________________");
        System.out.println("Mr."+name+", living at "+address+" your payment of bills are as follows:");
        System.out.println("Gas Bill=Rs."+gasbill);
        System.out.println("Electricity bill=Rs."+paygast);
        System.out.println("Mobile bill=Rs."+ttdata);
        System.out.println("Total amount in bills to be paid="+(gasbill+paygast+ttdata));
        System.out.println("Please pay them as soon as possible to avoid extra charges.");
        System.out.println("Thank you!!!!");
    }
    //option function starts here
    public static void option(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please choose the following options:");
        System.out.println("1 for Main Menu to calculate all the bills again.");
        System.out.println("2 for displaying all the bills.");
        optionchoice=sc.nextInt();
        project option1=new project();
        if(optionchoice==1){
            option1.main();
        }
        else if(optionchoice==2){
            option1.result();
        }
    }
    //telephone bill starts here

    public static void telephone(){
        Scanner sc=new Scanner(System.in);
        System.out.println("___________________________MOBILE BILL____________________________");
        System.out.println("Enter mobile number:");
        mobileno=sc.nextLine();
        lenmobno=mobileno.length();
        project rtel= new project();
        if(lenmobno!=10){
            System.out.println("Invalid mobile number;");
            rtel.option();
        }
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
            //METHOD BREAK-UP
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
        }
        else if(prepost!=1){
            System.out.println("Dial *111# on your mobile phone keypad and get your bill details.");
            System.out.println("Enter the bill information as follows:");
            System.out.println("No. of minutes:");
            postmins=sc.nextInt();
            System.out.println("If you use internet, please press 1 or enter any digit to continue.");
            intchoice=sc.next();
            if(intchoice=="1"){
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
            }
            else if(intchoice!="1"){
                //blank condition block
            }
            tdata=postmins*1.263;
        }
        ttdata=tdata+data;
        project rbills3=new project();
        System.out.println("Enter 1 to calculate electricity bill.");
        System.out.println("Enter 2 to calculate gas bill.");
        System.out.println("Enter 3 to show submenu.");
        telchoice=sc.nextInt();
        if(telchoice==1){
            rbills3.Electricity();
        }
        else if(telchoice==2){
            rbills3.gas();
        }
        else if(telchoice==3){
            rbills3.option();
        }
    }
    //electricity bill starts here
    public static void Electricity(){
        Scanner sc=new Scanner(System.in);
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
        }
        project rbills2=new project();
        System.out.println("Enter 1 to calculate gas bill.");
        System.out.println("Enter 2 to calculate mobile bill.");
        System.out.println("Enter 3 to show submenu.");
        elecchoice=sc.nextInt();
        if(elecchoice==1){
            rbills2.gas();
        }
        else if(elecchoice==2){
            rbills2.telephone();
        }
        else if(elecchoice==3){
            rbills2.option();
        }
    }
    //gas bill starts here

    public static void gas(){
        Scanner sc=new Scanner(System.in);
        System.out.println("________________________________GAS BILL_________________________________");
        System.out.println("Enter digits there in red on your gas metre:");
        gasno=sc.nextInt();
        gasbill=gasno*7;
        project rbills=new project();
        System.out.println("Enter 1 to calculate electricity bill.");
        System.out.println("Enter 2 to calculate mobile bill.");
        System.out.println("Enter 3 to show submenu.");
        gaschoice=sc.nextInt();
        if(gaschoice==1){
            rbills.Electricity();
        }
        else if(gaschoice==2){
            rbills.telephone();
        }
        else if(gaschoice==3){
            rbills.option();
        }
    }
    //main function

    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.println("                                    *****WELCOME TO THE JVMTP BILLING CENTRE*****");
        System.out.println("                            ");
        System.out.println("            *****TODAY, WE WILL BE HELPING YOU IN CALCULATING YOUR BILLS, AND REDUCING YOUR BURDEN*****");
        System.out.println("                            ");
        System.out.println("           *****YOU CAN CHOOSE AMONG ANY 3 OF THE BILLS AND ALSO ALL THREE OF THEM TO CALCULATE THEM*****");
        System.out.println("                            ");
        System.out.println("                          *****THE TYPES OF BILLS Y'ALL CAN CALCULATE ARE AS FOLLOWS:*****");
        System.out.println("                            ");
        System.out.println("            1.)GAS BILL FOR THE NUMBER OF MONTHS USED                   ");
        System.out.println("                            ");
        System.out.println("            2.)ELECTRICITY BILL FOR ANY NUMBER OF MONTHS");
        System.out.println("                            ");
        System.out.println("            3.)TELEPHONE BILL TILL DATE OR AN ESTIMATE ON AN AMOUNT YOU ARE GOING TO PAY ON YOUR NEXT RECHARGE");
        System.out.println("                            ");
        System.out.println("   *****WE WILL BE ASKING YOU SOME DETAILS THOSE ARE MANDATORY AND PLEASE ENTER THEM FOR A SMOOTH EXPERIENCE*****");
        System.out.println("                            ");
        System.out.println("                                  *****PLEASE FOLLOW HE ON-SCREEN INSTRUCTIONS*****");
        System.out.println("                                                           ");
        System.out.println("                                                            ");
        //CODE BREAK-UP
        System.out.println("Enter name:");
        name=sc.nextLine();
        System.out.println("Enter address:");
        address=sc.nextLine();
        System.out.println("Choose bill to be calculated:\n1.)Gas\n2.)Electricity\n3.)telephone");
        System.out.println("____________________________________________________________________");
        opt=sc.nextInt();
        switch(opt){
            case 1:
            project gas=new project();
            gas.gas();
            break;
            case 2:
            project Electricity=new project();
            Electricity.Electricity();
            break;
            case 3:
            project telephone=new project();
            telephone.telephone();
            break;
        }
    }
}