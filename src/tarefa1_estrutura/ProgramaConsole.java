/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1_estrutura;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marth
 */
public class ProgramaConsole {

    private int[] array;
    private int[] arrayTemporario;
    private int tamanho;
    private int[] numeros;
    //public static List<ProgramaConsole> numeros = new ArrayList();
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random numAleatorio = new Random();
        int[] numeros = new int[5];
        MergeSort mms = new MergeSort();

        System.out.println("****Tarefa 1 - Estrutura de Dados****");
        System.out.println("");
        int opcao = 0;

        do {

            System.out.println("1 - Digitar 20 valores");
            System.out.println("2 - Gerar 20 valores aleatórios");
            System.out.println("3 - Ordenar");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Opção: ");
            opcao = leitura.nextInt();
            System.out.println("");

            switch (opcao) {
                case 1:
                    System.out.println("***Informe os valores:***");
                    for (int i = 0; i < 5; i++) {
                        numeros[i] = leitura.nextInt();
                    }
                    System.out.println("");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Posição[" + i + "] - " + numeros[i]);
                    }
                    System.out.println("");
                    break;

                case 2:
                    for (int i = 0; i < 5; i++) {
                        numeros[i] = numAleatorio.nextInt(10);
                    }
                    System.out.println("");
                    System.out.println("***Vetor***");
                    System.out.println("");
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Posição[" + i + "] - " + numeros[i]);
                    }
                    System.out.println("");
                    break;

                case 3:
                    do {
                        System.out.println("***Informe o método de ordenação: ***");
                        System.out.println("");
                        System.out.println("1 - BubleSort");
                        System.out.println("2 - InsertSort");
                        System.out.println("3 - SelectionSort");
                        System.out.println("4 - MergeSort");
                        System.out.println("5 - QuickSort");
                        System.out.println("6 - Sair");
                        System.out.print("Opção: ");
                        opcao = leitura.nextInt();
                        System.out.println("");

                        switch (opcao) {
                            case 1:
                                System.out.println("");
                                System.out.println("**Método BubleSort***");
                                System.out.println("");
                                int aux = 0;

                                System.out.println("Vetor desordenado: ");
                                System.out.println("");
                                for (int x = 0; x < numeros.length; x++) {
                                    System.out.print(numeros[x] + " ");
                                }
                                System.out.println("");

                                System.out.println("Vetor ordenado:");
                                for (int i = 0; i < numeros.length; i++) {
                                    for (int j = i + 1; j < numeros.length; j++) {
                                        if (numeros[i] > numeros[j]) {
                                            aux = numeros[i];
                                            numeros[i] = numeros[j];
                                            numeros[j] = aux;
                                        }
                                    }
                                }

                                for (int i = 0; i < 5; i++) {
                                    System.out.print(numeros[i] + " ");
                                }
                                System.out.println("");
                                System.out.println("");

                                break;

                            case 2:
                                System.out.println("");
                                System.out.println("**Método InsertSort***");
                                System.out.println("");

                                int menor,
                                 j,
                                 i;
                                System.out.println("Vetor Original");

                                for (i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i] + " ");
                                }
                                System.out.println("");
                                // Inicio o algoritmo pela segunda posicao
                                for (i = 1; i < numeros.length; i++) {
                                    menor = numeros[i];
                                    j = i;
                                    // Enquanto o valor da posicao for maior ele faz a troca pelo valor anterior
                                    while ((j > 0) && (numeros[j - 1] > menor)) {
                                        numeros[j] = numeros[j - 1];
                                        j -= 1;
                                    }
                                    // Faz a troca do valor menor
                                    numeros[j] = menor;
                                    // Mostra o vetor resultante da troca de posiÃ§Ãµes
                                    System.out.print("Passo " + (i) + " - ");
                                    for (j = 0; j < numeros.length; j++) {
                                        System.out.print(numeros[j] + " ");
                                    }
                                    System.out.println();

                                }
                                System.out.println("");
                                System.out.println("Vetor Ordenado");
                                for (i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i] + " ");
                                }
                                System.out.println("");

                                break;

                            case 3:
                                System.out.println("");
                                System.out.println("**Método SelectionSort***");
                                System.out.println("");

                                int a;
                                System.out.println("Vetor desordenado: ");
                                for (i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i]);
                                    System.out.print(" ");
                                }
                                System.out.println("");

                                for (i = 0; i < numeros.length - 1; i++) {
                                    a = numeros[i];
                                    aux = i;
                                    for (j = i + 1; j < numeros.length; j++) {
                                        if (numeros[j] < a) {
                                            a = numeros[j];
                                            aux = j;
                                        }
                                    }
                                    a = numeros[aux];
                                    numeros[aux] = numeros[i];
                                    numeros[i] = a;
                                }

                                System.out.println("Vetor ordenado:");
                                for (i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i]);
                                    System.out.print(" ");
                                }
                                System.out.println("");

                                break;

                            case 4:
                                System.out.println("**Método MergeSort***");
                                System.out.println("");
                                System.out.println("Vetor Original");
                                for ( i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i] + " ");
                                }                                
                                mms.sort(numeros);
                                System.out.println("\n\nVetor Ordenado");
                                for ( i = 0; i < numeros.length; i++) {
                                    System.out.print(numeros[i] + " ");
                                }
                                System.out.println("");

                                break;

                            case 5:
                                System.out.println("**Método QuickSort***");
                                
                                
                                
                                break;
                        }
                    } while (opcao != 6);

                default:
                    break;
            }
        } while (opcao != 4);

    }

    // mÃ©todo de ordenaÃ§Ã£o 
    public void sort(int numeros[]) {
        this.array = numeros; // seta o vetor no array da Classe
        this.tamanho = numeros.length; // seta o tamanho do vetor a ser ordenado
        this.arrayTemporario = new int[tamanho]; // Cria o array temporÃ¡rio utilizado na ordenaÃ§Ã£o
        executeMergeSort(0, tamanho - 1); // chama o mÃ©todo para dividir o vetor, o tamanho menos -1, Ã© porque no Java o Array comeÃ§a no zero.
    }

    // Divide o vetor em vÃ¡rios elementos
    private void executeMergeSort(int menorIndice, int maiorIndice) {

        if (menorIndice < maiorIndice) {
            // descobre a media entre os 2 valores, para ser o meio do vetor 
            int meio = menorIndice + (maiorIndice - menorIndice) / 2;
            // Ordena o lado esquerdo do array 
            executeMergeSort(menorIndice, meio);
            // Ordena  o lado direito do array 
            executeMergeSort(meio + 1, maiorIndice);
            // Agora junta os 2 lados
            unaPartes(menorIndice, meio, maiorIndice);
        }
    }

    private void unaPartes(int menorIndice, int meio, int maiorIndice) {

        for (int i = menorIndice; i <= maiorIndice; i++) {
            arrayTemporario[i] = numeros[i];
        }
        int i = menorIndice;
        int j = meio + 1;
        int k = menorIndice;
        while (i <= meio && j <= maiorIndice) {
            if (arrayTemporario[i] <= arrayTemporario[j]) {
                numeros[k] = arrayTemporario[i];
                i++;
            } else {
                numeros[k] = arrayTemporario[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            numeros[k] = arrayTemporario[i];
            k++;
            i++;
        }

    }
}
