/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz2;

import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 */

public class num2 {
    Node head;
    public num2(){
    this.head=null;
    }
public void anypost(int data, int position){
    if (position<0){
        System.out.println("Invalid Position");
    return;}
    Node newNode= new Node (data); 
    if (head==null){
        newNode.next=newNode;
        head=newNode;
        return;
    }
    if (position==0){
    newNode.next=head;
    Node current = head;
    while (current.next !=head){
            current=current.next;
    }            current.next = newNode;
            head = newNode;
            return;
        }
        
    }

   
    
    public static void main(String[] args) {
        num2 list= new num2();
        Scanner scn= new Scanner(System.in);
        
    }
}
