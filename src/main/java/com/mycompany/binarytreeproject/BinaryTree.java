/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreeproject;

/**
 *
 * @author HP
 */
public class BinaryTree {

    Node root = null;

    public void add(int valor) {
        if (this.root == null) {
            this.root = new Node(valor);
        } else {
            add(this.root, valor);
        }

    }

    public void add(Node nodo, int valor) {
        if (valor > (Integer) nodo.getValue()) {
            if (nodo.getRight() == null) {
                nodo.setRight(new Node<>(valor));
            } else {
                this.add(nodo.getRight(), valor);
            }
        } else {
            if (nodo.getLeft() == null) 
                nodo.setLeft((new Node<>(valor)));
             else 
                this.add(nodo.getLeft(), valor);
            
        }
    }
    
    public void preorden(Node n){
        if(n!=null){
            printDato(n);
            preorden(n.getLeft());
            preorden(n.getRight());

        }
    }
    
    public void printDato(Node n){
        int dato=(Integer) n.getValue();
        System.out.println(dato);
    }
    
}
