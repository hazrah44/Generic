package com.WildCardWrong;

//Generic stack

import java.util.*;

public class Generic
{
 public static void main(String[] args)
 {     
       GenStack<String> s2 = new GenStack<String>();
       s2.push("three"); 
       s2.push("two"); 
       s2.push("one");
       while (!s2.isEmpty()) System.out.printf("%s%n", s2.pop());

       GenericItem<Double> g1 = new GenericItem<Double>();
       g1.set(3.90);

       GenericItem<Double> g2 = new GenericItem<Double>();
       g2.set(2.718); 

       GenStack<GenericItem<Double>> s3 = new GenStack<GenericItem<Double>>();
       s3.push(g1);
       s3.push(g2);
       while (!s3.isEmpty()) System.out.printf("%f%n", s3.pop().get());  
 }  
}

class GenStack<T> 
{
private ArrayList<T> a;

public GenStack() {  a = new ArrayList<T>();   }
public void push(T t) {  a.add(t);  }
public T pop() { return isEmpty() ? null : a.remove(a.size() - 1);  }
public boolean isEmpty() { return a.size() == 0; }
}

class GenericItem<T>        
{
 private T t;
 public void set(T t) { this.t = t; }
 public T get() { return t; }
}  
