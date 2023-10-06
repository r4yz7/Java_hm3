package org.example;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayT <T extends Comparable<T>>{
    private T[]numbers;
    public ArrayT(int size){
        numbers = (T[]) new Comparable[size];
    }
    public void fillArray(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<numbers.length; i++){
            System.out.print("Enter " + (i+1) + " number: ");
            numbers[i] = (T)Integer.valueOf(scanner.nextInt());
        }
    }
    public void fillRandom(){
        Random random = new Random();
        for (int i = 0; i<numbers.length; i++){
            numbers[i] = (T) Integer.valueOf(random.nextInt(30));
        }
    }

    public void print(){
        for (T number : numbers) {
            System.out.println(number);
        }
    }

    public T findMax(){
        T max = numbers[0];
        for (int i = 1; i<numbers.length; i++){
            if(numbers[i].compareTo(max)>0){
                max = numbers[i];
            }
        }
        return max;
    }

    public T findMin(){
        T min = numbers[0];
        for (int i = 1; i<numbers.length;i++){
            if(numbers[i].compareTo(min)<0){
                min = numbers[i];
            }
        }
        return min;
    }
    public void sort(){
        Arrays.sort(numbers);
    }
}
