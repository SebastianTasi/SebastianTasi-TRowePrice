package com.SDET_Screening.utilities;

import java.util.ArrayList;

public class JavaMethods {

    public static void main(String[] args) {


        String result = findBiggestWordInAString("The cow jumped over the moon");
        System.out.println(result);


        String result2 = findBiggestWordInAString2("The cow jumped over the moon jumoed");
        System.out.println(result2);

        String minimumResult = findShortestWordInAString("T , cow jumped over the moon");
        System.out.println(minimumResult);
    }



    public static String findBiggestWordInAString(String sentance) {

        if(sentance == null || sentance.length() == 0) {
            return "Invalid Input";
        }

        String [] splitSentanceToWords = sentance.split(" ");

        int maxSentanceLength = 0;
        String maxWord = "";

        for(int i = 0; i < splitSentanceToWords.length; i++) {

            if(splitSentanceToWords[i].length() > maxSentanceLength) {
                maxWord = splitSentanceToWords[i];
                maxSentanceLength = splitSentanceToWords[i].length();
            }
        }

        return maxWord + ", " + maxSentanceLength;
    }


    public static String findBiggestWordInAString2(String sentance) {

        if(sentance == null || sentance.length() == 0) {
            return "Invalid Input";
        }


        String [] splitSentanceToWords = sentance.split(" ");
        int maxLength = 0;

        ArrayList<String> listWithWords = new ArrayList<String>(); //storing words

        for(int i = 0; i < splitSentanceToWords.length; i++) {

            if(splitSentanceToWords[i].length() > maxLength) {

                listWithWords.removeAll(listWithWords);
                maxLength = splitSentanceToWords[i].length();
                listWithWords.add(splitSentanceToWords[i]);
            }else if(splitSentanceToWords[i].length() == maxLength) {
                listWithWords.add(splitSentanceToWords[i]);
            }

        }

        return listWithWords.toString() + ":  " + maxLength;
    }

    public static String findShortestWordInAString(String sentance) {

        if(sentance == null || sentance.length() == 0) {
            return "Invalid Input";
        }

        String [] splitSentanceToWords = sentance.split(" ");

        int minSentanceLength = splitSentanceToWords[0].length();
        String minWord = splitSentanceToWords[0];

        for(int i = 0; i < splitSentanceToWords.length; i++) {

            if(!splitSentanceToWords[i].matches(".*[!`~@#$%^&*)('.,].*")) {
                if(splitSentanceToWords[i].length() < minSentanceLength) {
                    minWord = splitSentanceToWords[i];
                    minSentanceLength = splitSentanceToWords[i].length();
                }
            }

        }

        return minWord + ", " + minSentanceLength;
    }

}

