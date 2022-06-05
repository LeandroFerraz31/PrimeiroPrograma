package com.mycompany.Questao;

public class Questao4 
{
    public static void main(String[] args) 
    {
        int i = 4;
        int j = 5;
        int m = 12;
        if (i+ j > m + 4 - i * 2)
        {
            j = j - 2;
            if (j > 3)
            {
                j = j + i;
                 System.out.println(j); 
        }
        else
        {
            j = j - 1;
            System.out.println(i + j);
        }
    }
        else
        {
            i=i + 2;
            if (m > 10 - i)
        {
            i = i + 1;
            System.out.println(i);
        }
        else
        {
            j=j + 2;
            System.out.println(j);
        }
    }
        System.out.println(i + j + m);
}
}
    