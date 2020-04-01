/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.*;
import java.sql.SQLOutput;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author Alfredo Quezada
 * 31-03-2020
 * #191002 
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Se crean el vectorHeap y el queue para hacer los dos diferentes procesos
        //Ambos contienen pacientes
        VectorHeap<Paciente> pacienteVectorHeap = new VectorHeap<Paciente>();
        PriorityQueue<Paciente> pacientePriorityQueue = new PriorityQueue<Paciente>();

        //Scanner teclado
        Scanner teclado = new Scanner(System.in);

        //Se da a elegir al usuario la manera para priorizar a los pacientes
        System.out.println("Elija una manera de priorizar");
        System.out.println("1. VectorHeap");
        System.out.println("2. Priority Queue");
        String opcion = teclado.nextLine();

        //Opcion Vector Heap (osea 1)
        if (opcion.equals("1")){
            try {
                //Se lee el documento pacientes que se encuentra en el proyecto
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);
                //String linea
                String linea = "";
                System.out.println("Los pacientes se atenderan en este orden, debido a su prioridad");
                //mientras existan lineas
                while((linea = br.readLine()) != null) {
                     // Se va a crear una lista de Strings y se van a splitear por las comas
                    String[] parts = linea.split(",");
                    // La parte 0 decada linea va a ser el nombre de los pacientes
                    String nombreL = parts[0];
                    // La parte 1 de la lista va a ser la enfermedad de cada uno
                    String enfermedadL= parts[1];
                    // La parte 2 que s la que nos interesa va a ser la categoria a comparar
                    String categoriaL= parts[2];

                    //Se agrega el paceinte a nuestro VecotrHeap
                    pacienteVectorHeap.add(new Paciente(nombreL,enfermedadL,categoriaL));
                }
                while (pacienteVectorHeap.size()>0){
                    //Se va a ir removiendo conforme a prioridad
                    System.out.println(pacienteVectorHeap.remove());

                }
                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }
        }

        //Opcion PriorityQueue (osea 2)
        else if (opcion.equals("2")){
            try {
                //Se lee el documento que se encuentra en la carpeta del proyecto
                FileReader fr = new FileReader("pacientes.txt");
                BufferedReader br = new BufferedReader(fr);

                String linea = "";
                //Mientras exista algo en cada lina
                while((linea = br.readLine()) != null) {
                    String[] parts = linea.split(",");
                    String nombreL = parts[0]; 
                    String enfermedadL= parts[1]; 
                    String categoriaL= parts[2];
                    //Se va a agregar al PriorityQueue para ordenarlo.
                    pacientePriorityQueue.add(new Paciente(nombreL,enfermedadL,categoriaL));

                }
                while (pacientePriorityQueue.size()>0){
                    System.out.println(pacientePriorityQueue.remove());
                   
                }

                fr.close();
            }
            catch(Exception e) {
                System.out.println("Excepcion leyendo fichero "+ "pacientes" + ": " + e);
            }

        }
        //else de opcion invalida
        else{
            System.out.println("Opcion no válida");
        }

    }
}
