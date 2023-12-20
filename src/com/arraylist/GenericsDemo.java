package com.arraylist;

public class GenericsDemo {


        public static void printIntArray(int[] elem){
            for(int val : elem){
                System.out.println(val);
            }
            System.out.println();
        }
        public static void printCharArray(Character[] elemchar){
            for(Character cval : elemchar){
                System.out.println(cval);
            }
            System.out.println();
        }

        public static void main(String[] args) {
            int[] intArray ={10,20,30,40,};
            Character[] charArray ={'s','a','i','a','b','c'};
            printIntArray(intArray);
            printCharArray(charArray);
        }
    }

