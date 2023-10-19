import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WalnutTree tree = new WalnutTree();
        int k =5; //кол-во орехов
        Nut[] mas = tree.growNuts(k);
        double summ=0; //общий вес орехов
        System.out.println("На дереве выросло орехов "+k+" шт.");
        System.out.println(Arrays.toString(mas));
        summ = Squirell.PickingNuts(mas,summ);
        System.out.println("Вес всех орехов = "+summ);
    }
}