public class WalnutTree extends Nut{
        public Nut[] growNuts(int k) {
            Nut[] mas = new Nut[k]; //растит орехи k раз
            for (int i = 0; i < k; i++) {
                mas[i] = new Nut();
            }
            return mas;
        }
    }