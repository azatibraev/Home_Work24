package com.company;

import java.util.*;

public class Main {

    static Random random = new Random();

    public static void main(String[] args) {

        Integer[] numbers = new Integer[10];
        ArrayList<Integer> numbersOfArrayList = new ArrayList<>();
        LinkedList<Integer> numbersOfLinkedList = new LinkedList<>();

        System.out.println("Random numbers: ");
        randomNumbers(numbers, numbersOfArrayList,numbersOfLinkedList);

        System.out.println("Numbers in an Array = " + Arrays.toString(numbers));
        System.out.println("numbersOfArrayList = " + numbersOfArrayList);
        System.out.println("numbersOfLinkedList = " + numbersOfLinkedList);

        System.out.println("Sorted Numbers: ");

        Integer[] sortedNumbers = sortNumbers(numbers);
        System.out.println("Sorted numbers in the Array = " + Arrays.toString(sortedNumbers));

        List<Integer> sortedNumbersOfArrayList = sortNumbers(numbersOfArrayList);
        System.out.println("Sorted Numbers in the ArrayList = " + sortedNumbersOfArrayList);

        LinkedList<Integer> sortedNumbersOfLinkedList = sortNumbers(numbersOfLinkedList);
        System.out.println("Sorted Numbers in the LinkedList = " + sortedNumbersOfLinkedList);

    }

    private static void randomNumbers(Integer[] numbers, ArrayList<Integer> numbersOfArrayList,
                                          LinkedList<Integer> numbersOfLinkedList) {
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(0, 2);
            numbersOfArrayList.add(random.nextInt(0, 2));
            numbersOfLinkedList.add(random.nextInt(0, 2));
        }
    }

    private static List<Integer> sortNumbers(List<Integer> numbersOfArrayList) {
        numbersOfArrayList.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return numbersOfArrayList;
    }

    private static LinkedList<Integer> sortNumbers(LinkedList<Integer> numbersOfLinkedList) {
        numbersOfLinkedList.sort(new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 -o2;
            }
        });
        return numbersOfLinkedList;
    }

    private static Integer[] sortNumbers(Integer[] numbers) {
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[i] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
}