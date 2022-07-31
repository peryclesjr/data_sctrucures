package sort.quicksort;

public class QuickSort {

    static void quickSort(int[] array, int start, int end){
        //if right - left index < 2 we need to
        // return because we have only one element
        if (end - start < 2){
            return;
        }

        int pivotIndex = partition(array, start, end);
        quickSort(array, start, pivotIndex );
        quickSort(array, pivotIndex + 1, end );
    }

    private static int partition(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while(i < j){

            //empty loop body
            while (i < j && array[--j] >= pivot);
            if(i < j){
                array[i] = array[j];
            }
            //empty loop body
            while (i < j && array[++i] <= pivot);
            if(i < j){
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }

    //first implementetion I think was a little confuse.
    //    static void quickSort(int[] array, int left, int right){
//        if(left< right){
//            int pivot = partition(array, left, right);
//            quickSort(array, left, pivot );
//            quickSort(array, pivot+1, right );
//        }
//
//    }
//
//    private static int partition(int[] array, int left, int right) {
//        int middle = (int) (left+right)/2;
//        int pivot = array[middle];
//        int i = left -1;
//        int j = right +1;
//        while(true){
//            do{
//                i++;
//            }while( array[i] < pivot);
//            do{
//                j--;
//            }while (array[j]>pivot);
//            if (i >= j){
//                return j;
//            }
//            int aux = array[i];
//            array[i] = array[j];
//            array[j] = aux;
//        }
//    }
}


