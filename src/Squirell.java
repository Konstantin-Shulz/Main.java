public class Squirell {

    public static int PickingNuts(Nut[] mas, double sum) {
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i].getWeight();
            System.out.println("ура, еще орех!"+sum);
        }
        return (int) sum;
    }
}
