import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        WalnutTree tree = new WalnutTree();
        int k =15; //кол-во орехов
        Nut[] mas = tree.growNuts(k);
        int count=0; //счетчик у белочки
        System.out.println("На дереве выросло орехов "+k+" шт.");
        System.out.println(Arrays.toString(mas));

        count = Squirell.PickingNuts(mas,count);
        System.out.println("Вес всех орехов = "+count*12.5);
    }
}