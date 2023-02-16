package Nov;

import java.util.ArrayList;
import java.util.Scanner;

public class DomaciOOP2 {
    public static void main(String[] args) {
//       Zadatak 2.
//        Napraviti neku listu brojeva pomocu skenera, sve dok se ne unese 0.
//        Zatim cete uneti neki broj,
//                pomocu metode napraviti novu listu koja ce u sebi sadrzati sve brojeve vece od unetog broja.
//                Novu listu pozvati pomocu metode za stampanje elemenata liste.

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Dodaj broj");
        int broj = sc.nextInt();

        while (broj !=0){
            lista.add(broj);
            System.out.println("Dodaj broj");
            broj = sc.nextInt();
        }

        System.out.println("Ubaci broj ");
        int brojNovi = sc.nextInt();
        ArrayList<Integer> novaLista = napraviListu(brojNovi,lista);
        stampanjeListe(novaLista);
    }

    public static ArrayList<Integer> napraviListu (int noviBroj, ArrayList<Integer> lista){
        ArrayList<Integer> novaLista = new ArrayList<>();
        for (int i =0 ; i < lista.size(); i++){
            if (noviBroj< lista.get(i)){
                novaLista.add(lista.get(i));
            }

        }return novaLista;

    }

    public static void stampanjeListe (ArrayList<Integer> novalista){
        System.out.println(novalista);
    }
    }

