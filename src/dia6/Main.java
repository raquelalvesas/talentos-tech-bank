package dia6;

public class Main {

    public static void main(String[] args) {

        double saldoConta1 = 10;
        double saldoConta2 = 20;
        double saldoConta = 30;

        //Forma alternativa de distanciar o array no Java
        //double[] saldos = new double[10];
        //saldos[0] = 0;
        //saldos[1] = 20;
        //saldos[2] = 30;
        //...
        //saldos[9] = 100;
        //Array é um conjunto de vários dados do mesmo tipo


        double[] saldos = {10, 20, 30, 40, 50, 50, 60, 70, 80, 90, 100};

                for (int i=0; i < saldos.length; i++) {
                    System.out.println(saldos[i]);
                }

                // [10, 20, 30, 40] 0 - n-1
    }



    public static void selectionSort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted sub array
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;

            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void bubbleSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }
}






