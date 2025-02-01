package quicksortodevi;

import java.util.Random;
import java.util.Arrays;

public class QuickSortOdevi {

    public static int pivotBulma(int[] dizi, int yuzde) {
        return (int) Math.floor(dizi.length * yuzde / 100.0);
    }

    public static int quicksort(int[] dizi, int low, int high) {
        if (low >= high) {
            return 0;
        }

        int pivot = dizi[high];
        int i = low - 1;
        int swapCount = 0;

        for (int j = low; j < high; j++) {
            if (dizi[j] < pivot) {
                i++;
                int temp = dizi[i];
                dizi[i] = dizi[j];
                dizi[j] = temp;
                swapCount++;
            }
        }

        int temp = dizi[i + 1];
        dizi[i + 1] = dizi[high];
        dizi[high] = temp;
        swapCount++;

        int partitionIndex = i + 1;
        swapCount += quicksort(dizi, low, partitionIndex - 1);
        swapCount += quicksort(dizi, partitionIndex + 1, high);

        return swapCount;
    }

    public static void main(String[] args) {
        int[] dizi = new int[100];
        Random random = new Random();
        boolean[] kontrol = new boolean[101];

        for (int i = 0; i < 100; i++) {
            int rand;
            do {
                rand = random.nextInt(100) + 1;
            } while (kontrol[rand]);

            kontrol[rand] = true;
            dizi[i] = rand;
        }

        System.out.println("Başlangıç Dizisi: " + Arrays.toString(dizi));

        int enIyiIslemSayisi = Integer.MAX_VALUE;
        int enIyiPivot = 0;
        int[] enIyiDizi = new int[100];

        for (int i = 10; i <= 90; i += 10) {
            int[] kopyaDizi = Arrays.copyOf(dizi, dizi.length);
            int pivotIndex = pivotBulma(kopyaDizi, i);

            int islemSayisi = quicksort(kopyaDizi, 0, kopyaDizi.length - 1);

            if (islemSayisi < enIyiIslemSayisi) {
                enIyiIslemSayisi = islemSayisi;
                enIyiPivot = i;
                enIyiDizi = Arrays.copyOf(kopyaDizi, kopyaDizi.length);
            }
        }

        System.out.println("\n**********************\n");
        System.out.println("EN UYGUN PIVOT = %" + enIyiPivot + " İşlem Sayısı = " + enIyiIslemSayisi);
        System.out.println("Sıralı Dizi: " + Arrays.toString(enIyiDizi));
    }
}
