/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author HP
 */
public class BinaryTreeProject {
    public static void main(String[] args) throws IOException {
        //Programa que crea un árbol binario y lo recorre en preorden, inorden y postorden
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        char respuesta;
        int dato;
      
        
        System.out.println("--------------------------------------------------------------");
        System.out.println("Programa que crea un arbol binario");
        
        //Creacio del arbol
        BinaryTree arbol = new BinaryTree();
        
        //Agregar datos al arbol
        do{
            System.out.println("Escribe dato para ingresar al arbol");
            entrada=bufer.readLine();
            dato= Integer.parseInt(entrada);
            arbol.add(dato);
            System.out.println("Escribe n para parar, cualquier otra tecla para ingresar otro dato: ");
            entrada=bufer.readLine();
            respuesta=entrada.charAt(0);
    }while(respuesta != 'n');
       
}
}