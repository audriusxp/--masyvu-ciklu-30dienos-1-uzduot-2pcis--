import java.util.ArrayList;
import java.util.Scanner;

public class uzduotis2 {
    public static void main(String[] args) {
        ArrayList<Integer> masyvas = nuskaitytiSkaicius();
        System.out.println("masyvas = " + masyvas);
        int ilgis = daugiauDesimt(masyvas);
        System.out.println("ilgis = " + ilgis);





    }

    public static ArrayList<Integer> nuskaitytiSkaicius() {
        Scanner skaitytuvas = new Scanner(System.in);
        ArrayList<Integer> skaiciai = new ArrayList<>();
        System.out.println("Iveskite keliu skaiciu bus sarasas " + skaiciai);
        int n = skaitytuvas.nextInt();
        for (int i = 0; i < n; i++) {
            skaiciai.add(skaitytuvas.nextInt());
        }
        return skaiciai;


    }

    public static int daugiauDesimt(ArrayList<Integer> skaiciai) {
        int dydis = 0;


        for (int i = 0; i < skaiciai.size(); i++) {
            if (skaiciai.get(i) > 10) {
                dydis +=1;
            }




        }


        return dydis;
    }

}