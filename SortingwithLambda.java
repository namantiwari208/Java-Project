/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingwithLambda {
    public static void main(String[] args) {
         List<Integer> myList=Arrays.asList(10,30,20,50,40);
         Collections.sort(myList,(o1,o2)-> o2-o1);
         System.out.println(myList);   
    }
}
