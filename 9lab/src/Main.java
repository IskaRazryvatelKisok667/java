class Instrument {
    public void playSound() {
        System.out.println("Инструмент издает звук");
    }
}

class Guitar extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Гитара играет: дрынь-дрынь");
    }
}

class Piano extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Пианино играет: динь-динь");
    }
}

class Drums extends Instrument {
    @Override
    public void playSound() {
        System.out.println("Барабаны играют: бум-бум");
    }
}

public class Main {
    public static void main(String[] args) {
        Instrument guitar = new Guitar();
        Instrument piano = new Piano();
        Instrument drums = new Drums();

        guitar.playSound();
        piano.playSound();
        drums.playSound();
    }
}