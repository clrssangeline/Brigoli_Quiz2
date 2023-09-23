/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.awt.BorderLayout;
import java.util.LinkedList;
import java.util.Scanner;


/**
 *
 * @author Clarisse Angeline
 */

class Node {
    int data;
    Node next;

    Node(int m) {
        data = m;
        next = null;
    }
}

public class num1 {        
    public Node head;
    public Node insertNode(int data){
        
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    
        return head;
    }
    
    public void display(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        System.out.println("");
    }
    public boolean search(int target){
        Node current = head;
        
            while (current != null) {            
                if (current.data == target) {
                    return true;
                }
                current = current.next;
        }
        
        return false;
    }
    
    public int searchPosition(int target){
    Node current = head;
    int pos = 0;
    
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
            pos++;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        num1 element= new num1();
        element.insertNode(500);
        element.insertNode(200);
        element.insertNode(300);
      
        System.out.println("Search your desired element ");   
                int targerVal = scn.nextInt();
        
        int Position = element.searchPosition(targerVal);
        
        if (Position != -1) {
            System.out.println(targerVal + " is in " + Position);
        } else {
            System.out.println("The "+ targerVal + " is not here");

        }
    }
}
    
