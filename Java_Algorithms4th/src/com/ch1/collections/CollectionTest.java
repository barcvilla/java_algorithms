/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch1.collections;

import edu.princeton.cs.algs4.Bag;

/**
 *
 * @author barcvilla
 */
public class CollectionTest 
{
    public static void bagOperationDemo()
    {
        Bag<Double> numbers = new Bag<Double>();
        numbers.add(1.0);
        numbers.add(2.2);
        numbers.add(3.3);
        numbers.add(10.11);
        
        int N = numbers.size();
        
        double sum = 0.0;
        for(double x : numbers)
        {
            sum += x;
        }
        double mean = sum / N;
        
        sum = 0.0;
        
        for(double x : numbers)
        {
            sum += (x - mean) * (x - mean);
        }
        
        double std = Math.sqrt(sum / (N-1));
        System.out.printf("Mean: %2f\n", mean );
        System.out.printf("Std dev: %.2f\n", std);
    }
    
    public static void main(String[] args) 
    {
        bagOperationDemo();
    }
}
