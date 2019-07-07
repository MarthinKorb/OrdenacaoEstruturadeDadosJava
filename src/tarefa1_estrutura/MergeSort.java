/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarefa1_estrutura;

/**
 *
 * @author marth
 */
public class MergeSort {
     
    private int[] array;
    private int[] arrayTemporario;
    private int tamanho;
 
   
    public static void main(String a[]){
         
        int[] vetor = {45,23,11,89,77,98,4,28,65,43};
        System.out.println("Vetor Original");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print( vetor[i]+" ");
        }
        MergeSort mms = new MergeSort();
        mms.sort(vetor);
        System.out.println("\n\nVetor Ordenado");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print( vetor[i]+" ");
        }
    }
    
    
    // mÃ©todo de ordenaÃ§Ã£o 
    public void sort(int vetor[]) {
        this.array = vetor; // seta o vetor no array da Classe
        this.tamanho = vetor.length; // seta o tamanho do vetor a ser ordenado
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
            arrayTemporario[i] = array[i];
        }
        int i = menorIndice;
        int j = meio + 1;
        int k = menorIndice;
        while (i <= meio && j <= maiorIndice) {
            if (arrayTemporario[i] <= arrayTemporario[j]) {
                array[k] = arrayTemporario[i];
                i++;
            } else {
                array[k] = arrayTemporario[j];
                j++;
            }
            k++;
        }
        while (i <= meio) {
            array[k] = arrayTemporario[i];
            k++;
            i++;
        }
 
    }
}

