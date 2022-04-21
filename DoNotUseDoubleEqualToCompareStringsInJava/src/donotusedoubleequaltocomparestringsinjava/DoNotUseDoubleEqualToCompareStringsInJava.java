/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package donotusedoubleequaltocomparestringsinjava;

/**
 *
 * @author 4800590195
 */
public class DoNotUseDoubleEqualToCompareStringsInJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java").intern();
        System.out.println((s1 == s2) + ", String are equal."); // true  
        System.out.println((s1 == s3) + ", String are not equal."); // false  
        System.out.println((s1 == s4) + ", String are equal."); // true 

        //it will store in the string pool      
        String str1 = "Python";
        String str2 = "Data Science";
//it returns the reference of the pooled instance i.e. str1  
//it will not take place in the string pool  
        String str3 = "Python";
        String str4 = "C";
//store in Java heap  
        String str5 = new String("Java");
//store in Java heap  
        String str6 = new String("C++");
//store in Java heap  
        String str7 = new String("Data Science");
//it will not take place in Java heap  
//it will store in string pool  
        String str8 = new String("C").intern();
//returns false  
        System.out.println((str1 == str5) + ", Strings are not equal.");
//returns false because str2 occupies space in string pool and str7 occupies space in Java heap  
        System.out.println((str2 == str7) + ", Strings are not equal.");
//it returns true because we have invoked the intern() method and the String C is already present in the string pool  
        System.out.println((str4 == str8) + ", Strings are equal.");
    }

}
