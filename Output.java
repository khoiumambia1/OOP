public class Output
{
    void printsomething()
    {
        System.out.println("Hi from Output file.");
        System.out.println("This just prints some random line. that's all. Nothng more.");
        
        int age=25;
        boolean happy = true;
        char letter = 'a';
        double price=19.99;
        String s = "Hi Ambia";
        byte b = 10;      // very small integers
        short s2 = 200;
        long l = 1000000000; // long
        long l2 = 1000000000000000000L; // long long
        int[] numbers = {1, 2, 3};   // array
        double[] points = {1.43, 2.55, 3.221};
        String[] names = {"Rohim", "Korim", "Joshim"};
        
        // Object form of data types. Capital letter start.
        
        Integer i = 33;
        Double id = 33.534;
        Boolean available = false;
        Character ss = 'Q';
        Byte b2 = 33;
        Short s1 = 554;
        Long L = 5545435443L;
        String S= "Ambia";
        
        System.out.println(age);
        System.out.println(happy);
        System.out.println(letter);
        System.out.println(price);
        System.out.println(s);
        System.out.println(b);
        System.out.println(s2);
        System.out.println(l);
        System.out.println(l2);
        System.out.println(numbers[0] +" " + numbers[1] +" " +numbers[2]);
        System.out.printf("%.2f %.2f %.2f\n",points[0],points[1],points[2]);
        System.out.printf("%s %s %s\n",names[0],names[1],names[2]);


    }
}
