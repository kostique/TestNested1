package athome.testnest1;

public class Main {

    public static void main(String[] args) {
        String line = "*************************************";
        MyPhoneBook mfb = new MyPhoneBook();
        mfb.addPhoneNumber("Vasya", "0970975845");
        mfb.addPhoneNumber("Seryi", "0631559300");
        mfb.addPhoneNumber("Ponchik", "0631559301");
        mfb.addPhoneNumber("Vadyk", "0970972837");
        mfb.addPhoneNumber("Vital'ka", "0631559315");
        mfb.addPhoneNumber("Zek", "0979658880");
        mfb.addPhoneNumber("Chibis", "0631156890");
        mfb.addPhoneNumber("Docyk", "0931146301");
        mfb.addPhoneNumber("Ryzhyi", "06704855537");
        mfb.addPhoneNumber("Karas'", "07319693415");
        System.out.println(line + "(begin)");
        mfb.printPhoneNumber();
        System.out.println(line + "(unsorted)");
        mfb.sortByName();
        mfb.printPhoneNumber();
        System.out.println(line + "(sorted by name)");
        mfb.sortByPhone();
        mfb.printPhoneNumber();
        System.out.println(line + "(sorted by phone)");
    }
}
