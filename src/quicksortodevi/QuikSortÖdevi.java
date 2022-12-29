package quicksortodevi;

import java.util.Random;

public class QuikSortÖdevi {

    public static int pivotBulma(int[] dizi, int yuzde) {
        return (int) Math.floor(dizi.length * yuzde / 100.0);
    }

    public static int quicksort(int[] dizi, int pivotIndex,int yuzdelik) {
        int temp = 0;
        if (dizi.length <= 1) {
            return temp;
        }
        //System.out.println(array.length);
        int pivot = dizi[pivotIndex];
        int i = 0;
        int j = dizi.length - 1;
        while (i < j) {
            while (dizi[i] < pivot) {
                i++;
            }
            while (dizi[j] > pivot) {
                j--;
            }
            if (i < j) {
                int temp2 = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp2;
                temp++;
            }
        }
        int[] sol = new int[i];
        int[] sag = new int[dizi.length - i - 1];
        System.arraycopy(dizi, 0, sol, 0, i);
        System.arraycopy(dizi, i + 1, sag, 0, dizi.length - i - 1);
        int yeniYuzde=100-yuzdelik;
        int yeniSolYuzde=100-yeniYuzde;
        temp += quicksort(sol, pivotBulma(sol, yuzdelik),yuzdelik);
        temp += quicksort(sag, pivotBulma(sag, yuzdelik),yuzdelik);
        return temp;//yapılan işlem sayısını geri döndürme
    }

    public static void main(String[] args) {
        int[] dizi = new int[100];
        Random random = new Random();
        int rand;
        int[] kontrol = new int[100];
        rand = random.nextInt();

        for (int i = 0; i < 100; i++) {
            do {
                rand = random.nextInt(100) + 1;
            } while (kontrol[rand - 1] == 1);

            kontrol[rand - 1] = 1;
            dizi[i] = rand;
            System.out.print(dizi[i] + ",");

        }

        int işlemSayısı = Integer.MAX_VALUE;//en iyi işlemi bulmak için
        int EnİyiPivot = 0;
        for (int i = 0; i < 100; i += 10) {
            int pivotIndex = pivotBulma(dizi, i);
            //System.out.println("ilk pivot"+pivotIndex);
            int gecici = quicksort(dizi, pivotIndex,i);
            if (gecici < işlemSayısı) {
                işlemSayısı = gecici;
                EnİyiPivot = pivotIndex;
            }
        }

        System.out.println();
        System.out.println("\n**********************\n");
        System.out.println(" EN UYGUN PIVOT = %" + EnİyiPivot + " Islem Sayisi = " + işlemSayısı);
        System.out.println();

    }

}
