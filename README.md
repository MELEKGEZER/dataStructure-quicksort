# QuickSort Ödevi

Bu proje, QuickSort algoritmasını kullanarak rastgele oluşturulan 100 elemanlı bir diziyi sıralamayı amaçlamaktadır. Program, farklı pivot noktalarını deneyerek en uygun pivot seçiminde gerçekleştirilen işlem sayısını belirlemeye çalışır.

## Kullanılan Yöntemler

- **pivotBulma(int[] dizi, int yuzde)**: Belirtilen yüzdeye göre pivot indeksini belirler.
- **quicksort(int[] dizi, int pivotIndex, int yuzdelik)**: QuickSort algoritmasını uygulayarak diziyi sıralar ve yapılan işlem sayısını döndürür.

## Program Akışı

1. 100 elemandan oluşan rastgele bir dizi oluşturulur.
2. Dizide farklı pivot noktaları kullanılarak QuickSort algoritması çalıştırılır.
3. En uygun pivot noktası ve işlem sayısı belirlenerek ekrana yazdırılır.

## Çalıştırma Talimatları

Bu projeyi çalıştırmak için aşağıdaki adımları takip edebilirsiniz:

1. Proje dosyalarını bir Java geliştirme ortamına ekleyin.
2. `QuikSortÖdevi` sınıfını çalıştırın.
3. Program, rastgele oluşturulan diziyi sıralayarak en iyi pivot noktasını belirleyecektir.

## Çıktı Örneği

```
 EN UYGUN PIVOT = %X Islem Sayisi = Y
```

Burada **X**, en uygun pivot yüzdesini; **Y**, minimum işlem sayısını temsil etmektedir.

## Geliştirme Notları

- Program, 100 elemanlı rastgele bir dizi kullanmaktadır. Daha büyük veya küçük diziler için kodun uygun şekilde değiştirilmesi gerekebilir.
- Pivot seçimi belirli yüzdelik aralıklarla yapılmaktadır. Farklı seçim stratejileri denenebilir.
- Algoritmanın performansını artırmak için ek optimizasyonlar uygulanabilir.

