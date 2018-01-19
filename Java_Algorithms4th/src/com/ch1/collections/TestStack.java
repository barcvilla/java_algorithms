/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ch1.collections;
import edu.princeton.cs.algs4.Stack;
/**
 *
 * @author barcvilla
 */
public class TestStack 
{
    public static void testingStack()
    {
        Stack<String> stack = new Stack<>();
        stack.push("Juan Antonio");
        stack.push("Fernando Alonso");
        stack.push("Carlos Alberto");
        while(!stack.isEmpty())
        {
            System.out.println(stack.pop() + " ");
        }
    }
    public static void main(String[] args) {
        testingStack();
    }
}
