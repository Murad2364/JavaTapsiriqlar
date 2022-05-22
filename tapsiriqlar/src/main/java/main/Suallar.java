/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author turko
 */
public class Suallar {
    //Sual-1  

//    public static int[] twoNumberSum(int[] array, int targetSum) {
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] + array[j] == targetSum && i != j) {
//                    return new int[]{array[i], array[j]};
//                }
//
//            }
//        }
//        return new int[0];
//
//    }
    //Sual-3
//    public int[] sortedSquaredArray(int[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = array[i] * array[i];
//        }
//
//        Arrays.sort(array);
//
//        return array;
//
//    }
    
    
    //Sual-10
//    public int minimumWaitingTime(int[] queries) {
//        // Write your code here.
//        int sum = 0;
//        Arrays.sort(queries);
//        for (int i = 1; i < queries.length; i++) {
//            sum =sum+ queries[i-1]*(queries.length-i);
//
//        }
//        return sum;
//    }
    
    
    
    
    //Sual-12
//    public int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
//        int sonuc = 0;
//        Arrays.sort(redShirtSpeeds);
//        Arrays.sort(blueShirtSpeeds);
//        if(fastest==true){
//            for (int i = 0; i < redShirtSpeeds.length; i++) {
//            sonuc =sonuc+ Math.max(redShirtSpeeds[i],blueShirtSpeeds[redShirtSpeeds.length-i-1]);
//        }
//        }
//        else{
//            for (int i = 0; i < redShirtSpeeds.length; i++) {
//            sonuc =sonuc+ Math.max(redShirtSpeeds[i],blueShirtSpeeds[i]);
//        }
//        }
//        return sonuc;
//    }
    
    
    
    
    //Sual-16
//    public static int binarySearch(int[] array, int target) {
//        int sonuc = 0;
//        for (int i = 0; i < array.length; i++) {
//            if(array[i]==target){
//                sonuc = i;
//                break;
//            }
//            else{
//                sonuc = -1;
//            }
//            
//            
//        }
//        
//    
//    return sonuc;
//  }
    
    
    
//    Sual-17
//    public static int[] findThreeLargestNumbers(int[] array) {
//        Arrays.sort(array);
//        int [] arr = {array[array.length-1],array[array.length-2],array[array.length-3]};
//    
//    return arr;
//  }
    
    
    
    
//    Sual-18
//    public static int[] bubbleSort(int[] array) {
//    Arrays.sort(array);
//    return array;
//  }
    
    
    
//    Sual-21
//    public static boolean isPalindrome(String str) {
//        boolean a = true;
//        int i = 0;
//        while (i < str.length()) {
//            if (str.charAt(i) == str.charAt(str.length() - i - 1)) {
//                i++;
//                a= true;
//
//            } else {
//                
//                a= false;
//                break;
//                
//               
//            }
//            
//        }
//        return a;
//    }
    
    
    
//    Sual-22
//    public static String caesarCypherEncryptor(String str, int key) {
//        int a;
//        String z = "";
//        for (int i = 0; i < str.length(); i++) {
//            a = (int)str.charAt(i)+key%26;
//            if(a>122){
//                a=a-26;
//            }
//            z=z+(char)a;
//            
//            
//        }
//    
//    return z;
//  }

//    Sual-23
//    public String runLengthEncoding(String string) {
//        int count = 1;
//        String sonuc = "";
//        string = string+"!";
//        if(string.length()==1){
//            sonuc = string;
//        }
//        String aString="";
//        for(int i =0; i<string.length()-1;i++){
//            if(string.charAt(i)==string.charAt(i+1)){
//                count++;
//                if(count>9){
//                    string.replace(string.charAt(i),string.charAt(string.length()-1));
//                    aString = Integer.toString(count-1);
//                    sonuc = sonuc+(aString+string.charAt(i));
//                    count =1;
//                }
//            }
//            else{
//                aString = Integer.toString(count);
//                sonuc = sonuc+(aString+string.charAt(i));
//                count =1;
//            }
//        }
//        return sonuc;
//    }
    
    
    
    
}
