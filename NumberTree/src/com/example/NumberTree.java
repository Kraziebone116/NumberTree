package com.example;

public class NumberTree {
    public static void main(String[] args)
    {
        int rowcount=6, i, j, max=1, num;
            for (i=1; i<=rowcount; i++)
            {
                System.out.println();
                num=1;
                    for (j=1; j<=max; j++)
                    {
                        System.out.print(num);
                        num++;
                    }
                max++;
            }
    }
}
