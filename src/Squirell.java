public class Squirell {

    public static int PickingNuts(Nut[] mas, int cou) {
        for (int i = 0; i < mas.length; i++) {
            cou++;
            System.out.println("ура, еще орех!");
        }
        return cou;
    }
}
