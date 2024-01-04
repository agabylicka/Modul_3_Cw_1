package org.trzcinska;
public class Suma {
    public int sumArray(int[] numbers){
        int sum = 0;
        for (int i = 0; i < 10; i++)
            sum += numbers[i];

        return sum;
    }
}
