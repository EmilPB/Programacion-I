package CRUD;

import java.util.Random;



public class Test {
    public static void main(String[] args)  {
        test();
    }

    public static void test() {
        
        Random rand = new Random();
        int id = rand.nextInt(9999);
        System.out.println(id);
    }
}