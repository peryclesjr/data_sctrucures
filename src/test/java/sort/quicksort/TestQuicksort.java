package sort.quicksort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import sort.quicksort.QuickSort;

import java.util.Arrays;

public class TestQuicksort {
    @Test
    public void testeQuickjsort(){
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        int[] vetorExpected = vetor;
        //make better our test
        // vetorExpected after Arrays.sort will be sorted
        Arrays.sort(vetorExpected);

        //sort vetor using QuickSort implemented by me
        QuickSort.quickSort(vetor, 0, vetor.length);

        // make a comparision for verify our method is ok.
        Assertions.assertEquals(vetorExpected, vetor);
    }


    @Test
    public void testeQuickSortWithNegativeNumbers(){
        int[] vetor = {20,35,-15,7,55,1,-22};


        System.out.println("Desordenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        QuickSort.quickSort(vetor, 0, vetor.length );

        System.out.println("\n\nOrdenado");
        for(int i = 0; i < vetor.length; i++){
            System.out.print(vetor[i] + " ");
        }

        Assertions.assertArrayEquals(new int[]{-22, -15 ,1, 7 ,20, 35 ,55}, vetor);
    }
}
