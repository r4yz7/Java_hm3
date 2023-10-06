package org.example;

public class Array implements IMath {
    int[] elements;

    public Array(int[] elements) {
        this.elements = elements;
    }

    @Override
    public int max() {
        if (elements.length == 0) {
            return 0;
        }else{
            int max = elements[0];
            for (int i = 1; i < elements.length; i++) {
                if (elements[i] > max) {
                    max = elements[i];
                }
            }
            return max;
        }
    }

    @Override
    public int min() {
        if (elements.length == 0) {
            return 0;
        }else{
            int min = elements[0];
            for (int i = 1; i < elements.length; i++) {
                if (elements[i] < min) {
                    min = elements[i];
                }
            }
            return min;
        }
    }

    @Override
    public double avg() {
        if (elements.length == 0) {
            return 0;
        }else{
            double avg = 0;
            for (int element : elements) {
                avg += element;
            }
            System.out.println(avg);
            System.out.println(elements.length);
            return avg/elements.length;
        }
    }
}
