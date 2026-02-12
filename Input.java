import java.util.Scanner;
public class Input
{
    void inputsomething()
    {
        System.out.println("Hi from Input file.");
        System.out.println("This just takes inputs and prints them. that's all. Nothng more.");
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean happy;
        char letter;
        double price;
        String s;
        byte b;      // very small integers range (-128 to 127)
        short s2; //range (-32768 to 32767)
        long l; // long range(-2147483648 to 2147483647)
        long l2; // long long range(-9223372036854775808 to 9223372036854775807)
        
        
        // Object form of data types. Capital letter start, full word.
        
        Integer i1 = 33;
        Double id = 33.534;
        Boolean available = false;
        Character ss = 'Q';
        Byte b2 = 33;
        Short s1 = 554;
        Long L = 5545435443L;
        String S= "Ambia";

        System.out.print("Enter an Integer: ");
        age = scanner.nextInt();
        System.out.println("You have entered "+ age);

        System.out.print("Enter a Boolean: ");
        happy = scanner.nextBoolean();
        System.out.println("You have entered : "+ happy);
       
        System.out.print("Enter a Charecter: ");
        letter = scanner.next().charAt(0);
        System.out.println("You have entered : "+ letter);

        System.out.print("Enter a Double: ");
        price = scanner.nextDouble();
        System.out.println("You have entered : "+ price);
       
        System.out.print("Enter a String: ");
        scanner.nextLine();
        s = scanner.nextLine();
        System.out.println("You have entered : "+ s);

        System.out.print("Enter a small integer (-128 to 127): ");
        b = scanner.nextByte();
        System.out.println("You have entered : "+ b);

        System.out.print("Enter a integer (-32768 to 32767): ");
        s2 = scanner.nextShort();
        System.out.println("You have entered : "+ s2);

        System.out.print("Enter a Long integer (-2147483648 to 2147483647): ");
        l = scanner.nextLong();
        System.out.println("You have entered : "+ l);

        System.out.print("Enter a Long Long integer (-9223372036854775808L to 9223372036854775807L): ");
        l2 = scanner.nextLong();
        System.out.println("You have entered : "+ l2);

        
        System.out.print("How many numbers for array? ");
        int n = scanner.nextInt();
        int[] numbers =new int[n];   // array
        for (int i = 0; i < n; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Your Number array : ");
         for (int i = 0; i < n; i++) 
        {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();

        System.out.print("How many double numbers for array? ");
        int d = scanner.nextInt();
        double[] points = new double[d];
        for (int i = 0; i < d; i++)
        {
            System.out.print("Enter number " + (i + 1) + ": ");
            points[i] = scanner.nextDouble();
        }
        System.out.print("Your Double Number array : ");
         for (int i = 0; i < d; i++) 
        {
            System.out.print(points[i]+" ");
        }
        System.out.println();

        System.out.print("How many strings for array? ");
        int p = scanner.nextInt();
        scanner.nextLine();
        String[] names = new String[p];
        for (int i = 0; i < p; i++)
        {
            System.out.print("Enter string " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }
        System.out.print("Your strings array : ");
         for (int i = 0; i < p; i++) 
        {
            System.out.println(names[i]);
        }
        System.out.println();
        scanner.close();   
    }
}
