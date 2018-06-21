package athome.testnest1;

public class Main {

    public static void main(String[] args) {
	MyPhoneBook mfb = new MyPhoneBook();
        mfb.addPhoneNumber("Vasya", "0970975845");
        mfb.addPhoneNumber("Seryi", "0631559300");
        mfb.addPhoneNumber("Ponchik", "0631559300");
        mfb.addPhoneNumber("Vadyk", "0970972837");
        mfb.addPhoneNumber("Vital'ka", "0631559315");
        mfb.printPhoneNumber();
    }
}
