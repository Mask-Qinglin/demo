/**
 * @author: liqinglin
 * @create: 2023/3/6
 **/
public class Quick_Sort {

    public static void quickSort(int[] arr, int low, int high){
        if (low >= high){
            return;
        }
        int key = arr[low];
        int start = low;
        int end = high;
        while (low < high){

            while (arr[high] >= key && low < high){
                high--;
            }
            while (arr[low] <= key && low < high){
                low++;
            }
            swap(arr, high, low);
            //low++;
            //high--;
        }
        swap(arr, start, high);
        quickSort(arr, start, high -1);
        quickSort(arr, high+1, end);
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
