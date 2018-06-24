package athome.testnest1;

import java.util.Arrays;
import java.util.Comparator;

class MyPhone {
    private MyPhoneBook phonebook;

    MyPhone() {
        phonebook = new MyPhoneBook();
    }

    void switchOn() {
        System.out.print("Loading PhoneBook records...");
        MyPhoneBook mpb2 = new MyPhoneBook();
        mpb2.addPhoneNumber("Vasya", "0970975845");
        mpb2.addPhoneNumber("Seryi", "0631559300");
        mpb2.addPhoneNumber("Ponchik", "0631559301");
        mpb2.addPhoneNumber("Vadyk", "0970972837");
        mpb2.addPhoneNumber("Vital'ka", "0631559315");
        mpb2.addPhoneNumber("Zek", "0979658880");
        mpb2.addPhoneNumber("Chibis", "0631156890");
        mpb2.addPhoneNumber("Docyk", "0931146301");
        mpb2.addPhoneNumber("Ryzhyi", "06704855537");
        mpb2.addPhoneNumber("Karas'", "07319693415");
        phonebook = mpb2;
        System.out.println("OK!");
    }

    void call(int callTo) {
        System.out.println("Calling to: " + phonebook.PhoneNumbers[callTo]);
    }

    class MyPhoneBook {
        private PhoneNumber[] PhoneNumbers = new PhoneNumber[10];

        void addPhoneNumber(String name, String phone) {
            for (int i = 0; i < PhoneNumbers.length; i++) {
                if (PhoneNumbers[i] == null) {
                    PhoneNumbers[i] = new PhoneNumber(name, phone);
                    break;
                }
            }
        }

        void printPhoneNumber() {
            for (int i = 0; i < PhoneNumbers.length; i++) {
                if (PhoneNumbers[i] == null) break;
                System.out.println(PhoneNumbers[i]);
            }
        }

        public class PhoneNumber {
            private String name;
            private String phone;

            PhoneNumber(String name, String phone) {
                this.name = name;
                this.phone = phone;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPhone() {
                return phone;
            }

            public void setPhone(String phone) {
                this.phone = phone;
            }

            @Override
            public String toString() {
                return "Name: " + name + ", phone: " + phone;
            }
        }

        public void sortByName() {
            Comparator comparator = new Comparator<PhoneNumber>() {
                public int compare(PhoneNumber pn1, PhoneNumber pn2) {
                    if ((pn1.getName()).compareTo(pn2.getName()) > 0) return 1;
                    if ((pn1.getName()).compareTo(pn2.getName()) < 0) return -1;
                    return 0;
                }
            };
            Arrays.sort(PhoneNumbers, comparator);
        }

        public void sortByPhone() {
            Comparator comparator = new Comparator<PhoneNumber>() {
                public int compare(PhoneNumber pn1, PhoneNumber pn2) {
                    if ((pn1.getPhone()).compareTo(pn2.getPhone()) > 0) return 1;
                    if ((pn1.getPhone()).compareTo(pn2.getPhone()) < 0) return -1;
                    return 0;
                }
            };
            Arrays.sort(PhoneNumbers, comparator);
        }
    }
}
