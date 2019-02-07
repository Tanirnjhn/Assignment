package com.cpgi.lab7.bean;

import java.util.Enumeration;
//import java.util.HashMap;
import java.util.Hashtable;
//import java.util.Iterator;
//import java.util.Map;
//import java.util.Map.Entry;
//import java.util.Set;
//import java.util.TreeMap;


class HashTableDemo{
public static void main(String args[]) {
Hashtable<String,Double> balance = new
Hashtable<String,Double>();
Enumeration names;
String str;
double bal;
balance.put("Arun", new Double(3434.34));
balance.put("Radha", new Double(123.22));
balance.put("Ram", new Double(99.22));
// Show all balances in hash table.
names = balance.keys();
while(names.hasMoreElements()) {
str= (String) names.nextElement();
System.out.println(str+ ": " +balance.get(str));
}
// Deposit 1,000 into Zara's account
bal = ((Double)balance.get("Ram")).doubleValue();
balance.put("Ram", new Double(bal+1000));
System.out.println("Ram's new balance: " +balance.get("Ram"));
}
}