/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_progra3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Roy Martinez
 */
public class Martinez_Alisson_Estructura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("----menu----\n" + "1. numero perfecto\n" + "2. palabra alrevez\n" + "3. numeros primos\n" + "4. votacion\n" + "5. slir");
    
    int opciones = scanner.nextInt();
    
        
        switch (opciones) {
    case 1:
    System.out.println("Favor ingresar un número:");
    int num = scanner.nextInt();
    int divisor = 0;
    //dividir el numero
    for (int i = 1; i < num; i++) {
        if (num % i == 0) {
            divisor += i;
        }
    }
    //si el numero es o no perfecto
    if (divisor == num) {
        System.out.println(num + " es un número perfecto");
    } 
    else {
        System.out.println(num + " no es un número perfecto");
    }
    break;
   
                case 2:
                     scanner.nextLine();
                     System.out.println("favor ingrese varias palabras");
                     String frase = scanner.nextLine();
                     
                      String[] palabras = frase.split(" ");
                      String resultado = "";
                      String palabraMasLarga = "";
                      String palindromos = "";
                      // Invertir palabra manualmente
                       for (String palabra : palabras) {
                           String invertida = "";
        for (int i = palabra.length() - 1; i >= 0; i--) {
            invertida += palabra.charAt(i);
        }

        resultado += invertida + " ";
            //la palabra mas larga
        if (palabra.length() > palabraMasLarga.length()) {
            palabraMasLarga = palabra;
        }
            //palindromo
        if (palabra.equalsIgnoreCase(invertida)) {
            palindromos += palabra + " ";
        }
    }

    System.out.println("Palabras al revés: " + resultado.trim());
    System.out.println("Palabra más larga: " + palabraMasLarga);
    System.out.println("Palíndromos encontrados: " + (palindromos.isEmpty() ? "Ninguno" : palindromos.trim()));
                       
                   
                    break;

                case 3:
                     Random random = new Random();
        int numero = random.nextInt(100) + 1;

        int contador = 0;
        StringBuilder divisores = new StringBuilder();

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                contador++;
                divisores.append(i);
                if (i < numero) {
                    divisores.append(", ");
                }
            }
        }

        if (contador == 2) {
            System.out.println(" es primo porque solo tiene dos divisores");
        } else {
            System.out.println( numero + " no es primo porque tiene " + contador +  "divisores");
        }

                    System.out.println( "Divisores de " + numero + " son: " + divisores);
                    
                    break;
                case 4:
 System.out.println("Ingrese la cantidad de votos:");
                int cantidad = scanner.nextInt();
                scanner.nextLine(); // Limpiar salto de línea

                int votosAzul = 0, votosRojo = 0, votosNegro = 0, votosAmarillo = 0, votosValidos = 0;

                for (int i = 0; i < cantidad; i++) {
                    System.out.println("Ingrese el voto (AZUL, ROJO, NEGRO, AMARILLO): ");
                    String voto = scanner.nextLine().trim().toUpperCase();

                    switch (voto) {
                        case "AZUL":
                            votosAzul++;
                            votosValidos++;
                            break;
                        case "ROJO":
                            votosRojo++;
                            votosValidos++;
                            break;
                        case "NEGRO":
                            votosNegro++;
                            votosValidos++;
                            break;
                        case "AMARILLO":
                            votosAmarillo++;
                            votosValidos++;
                            break;
                        default:
                            System.out.println("Voto inválido.");
                            break;
                    }
                }

                if (votosValidos < cantidad * 0.6) {
                    System.out.println("VOTACIÓN FALLIDA");
                } else {
                    int maxVotos = Math.max(Math.max(votosAzul, votosRojo), Math.max(votosNegro, votosAmarillo));
                    String ganadores = "";

                    if (votosAzul == maxVotos) ganadores += "AZUL ";
                    if (votosRojo == maxVotos) ganadores += "ROJO ";
                    if (votosNegro == maxVotos) ganadores += "NEGRO ";
                    if (votosAmarillo == maxVotos) ganadores += "AMARILLO ";

                    System.out.println("La(s) planilla(s) ganadora(s): " + ganadores.trim());
                }
                    break;
                case 5:
                    System.out.println("hasta luego");
                    break;
                default:
                    System.out.println("Opción inválida\n" + "Intente de nuevo.");
            }
        
        }
         
        
    }
    

