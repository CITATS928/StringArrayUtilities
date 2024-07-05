package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        int posi = array.length-1;
        return array[posi];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length-2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return true;
            }
        }

        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] result = new String[array.length];
        //result.length = array.length;
        int j=0;
        for(int i = array.length-1;i >=0;i--){
            result[j]=array[i];
            j++;
        }

        return result;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
//        if(array.length%2==1){
//        for(int i=0;i<=array.length/2;i++){
//            if(array[i]!=array[array.length-1-i]){
//                return false;
//            }
//        }}else if(array.length%2==0) {
//            for (int i = 0; i<= (array.length / 2); i++) {
//                if (array[i] != array[array.length - 1]) {
//                    return false;
//                }
//            }
//
//        }
//        return true;

        for(int i=0;i<=array.length/2;i++){
            if(array[i]!=array[array.length-1-i]){
                return false;
            }
        }
        return true;

    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String str = Arrays.toString(array);
        str = str.replace(" ","").replace(",","").replace("[","").replace("]","").toLowerCase();
        char[] arr=str.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);
        StringBuilder sb=new StringBuilder();
        sb.append(arr[0]);

        for(int i=1;i<arr.length;i++){
            if(arr[i]!=arr[i-1]){
                sb.append(arr[i]);
            }
        }
//        System.out.println(sb);
//        System.out.println(sb.length());
        if(sb.length()==26){
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter =0;
        for(int i=0;i<=array.length-1;i++){
            if(array[i]==value){
                counter ++;
            }
        }
        return counter;



    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrlist = new ArrayList();
        for(int i=0;i<=array.length-1;i++){
            if (!array[i].equals(valueToRemove)){
                arrlist.add(array[i]);
            }
        }
        String[] aaa= arrlist.toArray(new String[0]);
        System.out.println(arrlist);
        return aaa;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> list = new ArrayList<>();
        list.add(array[0]);
        System.out.println(list);

        for (int i = 1; i < array.length; i++) {
            if (!array[i].equals(array[i - 1])) {
                list.add(array[i]);
            }
        }
        System.out.println(list);
        String[] result = list.toArray(new String[0]);
        System.out.println(result[0]);
        return result;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> resultList = new ArrayList<>();
        StringBuilder pack = new StringBuilder(array[0]);

        for(int i=1;i<array.length;i++){
            if(array[i].equals(array[i-1])){
                pack.append(array[i]);

            }else {
                resultList.add((pack.toString()));
                pack = new StringBuilder(array[i]);
            }
        }
        resultList.add(pack.toString());



        return resultList.toArray(new String[0]);
    }


}
