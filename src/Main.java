import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizi elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = scanner.nextInt();
        }

        Map<Integer, Integer> frekanslar = new HashMap<>();

        for (int eleman : dizi) {
            if (frekanslar.containsKey(eleman)) {
                int frekans = frekanslar.get(eleman);
                frekans++;
                frekanslar.put(eleman, frekans);
            } else {
                frekanslar.put(eleman, 1);
            }
        }

        System.out.println("Eleman Frekansları:");
        for (Map.Entry<Integer, Integer> entry : frekanslar.entrySet()) {
            int eleman = entry.getKey();
            int frekans = entry.getValue();
            System.out.println(eleman + " - Frekans: " + frekans);
        }

    }
}