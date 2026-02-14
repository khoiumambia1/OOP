import java.util.Scanner;

public class if_else_loops
{
    void resultCheck()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********************");
        System.out.println("Result Checking System");
        System.out.println("**********************");
        System.out.println("How many times do you want to check your result?");
        int a = scanner.nextInt();
        while(a!=0){

            boolean c = true;
            while (c == true) { 

                System.out.print("Enter your Number: ");
                double x = scanner.nextDouble();
                if(x>100||x<0)
                {
                    System.out.println("Number has to be with in (1 - 100)");
                }
                else
                {
                    if(x>=80 && x<=100)
                    {
                        System.out.println("Congratulations!! You Got A+!🥰 ");
                    }
                    else if(x>=70 && x<=79)
                    {
                        System.out.println("Great!! You Got A😍 ");
                    }
                    else if(x>=60 && x<=69)
                    {
                        System.out.println("Keep up the good work!! You Got A-😉 ");
                    }
                    else if(x>=50 && x<=59)
                    {
                        System.out.println("You are killing it!! You Got B 🫡 ");
                    }
                    else if(x>=40 && x<=49)
                    {
                        System.out.println("Try Harder!! You Got C 🤗 ");
                    }
                    else if(x>=33 && x<=39)
                    {
                        System.out.println("Safe Zone!! You Got D 😮‍💨");
                    }
                    else if(x>=0 && x<=32)
                    {
                        System.out.println("oops!! You Failed.😔 ");
                    }
                    c = false;
                }
            }
            a--;
            System.out.println(a + " attempts remaining\n\n");
        
        }
        System.out.println("Thank you");
        scanner.close();

    }
}
