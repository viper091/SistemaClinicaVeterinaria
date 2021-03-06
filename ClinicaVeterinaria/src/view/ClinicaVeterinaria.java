/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import controller.Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import model.Animal;
import model.Cliente;
import model.ClienteDAO;
import model.Consulta;
import model.Tratamento;
import model.Veterinario;

/**
 *
 * @author vilela
 */
public class ClinicaVeterinaria implements Observer{

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Dados Atualizados!!");
        System.out.println(arg);
    }
    
    public void listaClientes(){
        List clientes = Controller.getAllClientes();
        for (Object cliente : clientes){
            System.out.println(cliente);
        }
    }
    
    public void listaAnimais(){
        List animais = Controller.getAllAnimais();
        for (Object animal : animais){
            System.out.println(animal);
        }
    }
    public void listaAnimaisOfClients(Integer idCliente){
        List animais = Controller.getAnimaisOfClient(idCliente);
        for (Object animal : animais){
            System.out.println(animal);
        }
    }
   
    
    public void menuPrincipal(){
    	 Scanner in = new Scanner(System.in);
         while (true){
             System.out.println("0- Encerrar");
             System.out.println("1- Insere Cliente");
             System.out.println("2- Lista Clientes");
             System.out.println("3- Deletar id 3");
             System.out.println("4- Insere Animal");
             System.out.println("5- Pega animal do cliente");
             System.out.println("6- Lista Animais");
             int opcao = in.nextInt();
             switch (opcao){
                 case 1:
                	 System.out.println(Controller.getAllVeterinarios());
                	 break;
                 case 2:
                     listaClientes();
                     break;
                 case 3:
                     Controller.deleteCliente(Controller.getClienteById(3));
                     break;
                 case 4:
                	 Controller.addAnimal("Bob", "M", 2010, 1);
                	 Controller.addAnimal("Mel", "F", 2014, 1);
                	 
                	 Controller.addAnimal("Dog caramelo", "M", 2015, 2);
                     break;
                 case 5:
                	 listaAnimaisOfClients(1);
                     break;
                 case 6:
                     Controller.getAllAnimais();
                     break;
                 case 0:
                     return;
             }
         }
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ClinicaVeterinaria().menuPrincipal();
    }
    
}
