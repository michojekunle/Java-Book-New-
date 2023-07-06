package ch01.painter;

import java.util.Arrays;

public class CheckerboardPatterns {
    public static void main(String[] args) {
        int i = 1;
        boolean bool = false;

        while (i<=64)
        {
            System.out.print("* ");
            if(i%8==0)
            {
                bool = !bool;
                System.out.println();

                if(bool)
                    System.out.print(" ");
            }
            i++;
        }
    }
}