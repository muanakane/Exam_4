/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_4;

import java.util.Scanner;


public class Exam_4 {
    private class InventoryManagement{
        string data;
    
        int quantity;
        InventoryManagement next;
    }
    private InventoryManagement top;
    private int size;
    
    private InventoryManagement createNewNode (string productName, int quantity) throws Exception {
        InventoryManagement node = new InventoryManagement();
        if (node== null) {
            throw new Exception("memory is empty");
        }else{
            node.data = productName;
            node.quantity = quantity;
            node.next = null;
            return node;
        }
    }
    
    public void add (string productName, int quantity)throws Exception {
        
        InventoryManagement node = createNewNode (productName, quantity);
        if (size==0){
            top= node;
        }else{
            node.next = top;
            top = node;
        }
        size++;
    }
    
    public string sell()throws Exception{
        if (size == 0){
            throw new Exception ("stack is empty");
        }
        string temporary = peek();
        top = top.next;
        size--;
        return temporary;
    }

    public void display () throws Exception {
        if (size == 0){
            throw new Exception("Inventory is empty");
        }
        InventoryManagement temporary = top;
        while (temporary != null) {
            System.out.println("product Name: " + temporary.data + "Quantity: " + temporary.quantity);
            temporary = temporary.next;
        }
        System.out.println("Null");
    }
    
    public string peek() throws Exception {
        if (size==0){
            throw new Exception("stack is empty");
        }
        return top.data;
    }
            
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner (System.in);
        Exam_4 list = new Exam_4();
        
        while (true){
            System.out.println("khen Store");
            System.out.println("1. Add product");
            System.out.println("2. Sell product");
            System.out.println("3. Display Inventory");
            System.out.println("4. Exit");
            
            int element;
            int choice = scn.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("add product");
                    string.item = scn.next();
                    System.out.println("add quantity");
                    String quantity = scn.next();
                    
                    break;
                case 2:
                    System.out.println(list.sell() +"deleted");
                    
                    break;
                case 3:
                   list.display();
                    break;
                case 4:
                    scn.close();
                    System.exit(0);
                    break;
                    
                    default :
                        System.out.println("Invalid choice");
            }
        }
    }
    
}
