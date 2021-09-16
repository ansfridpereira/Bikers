/*Five Bikers Compete in a race such that they drive at
        a constant speed which may or may not be the same as
        the other. To qualify the race, the speed of a racer must
        be more than the average speed of all 5 racers. Write a
        Java program to take as input the speed of each racer
        and print back the speed of qualifying racers.*/

class Bikers{
    public static void main(String[] args)
    {
        float s1=100,s2=200,s3=150,s4=250,s5=120,average;
        average=(s1+s2+s3+s4+s5)/5;
        System.out.println("Average="+average);
        if(s1>average)
            System.out.println("S1 is qualified");
        if(s2>average)
            System.out.println("S2 is qualified");
        if(s3>average)
            System.out.println("S3 is qualified");
        if(s4>average)
            System.out.println("S4 is qualified");
        if(s5>average)
            System.out.println("S5 is qualified");
    }
}
