package athome.testnest1;

import java.util.Arrays;
import java.util.Comparator;

class MyPhoneBook {
    private PhoneNumber[] PhoneNumbers = new PhoneNumber[10];

    void addPhoneNumber(String name, String phone ){
        for (int i = 0; i < PhoneNumbers.length; i++) {
            if (PhoneNumbers[i] == null){
                PhoneNumbers[i] = new PhoneNumber(name, phone);
                break;
            }
        }
    }
    void printPhoneNumber(){
        for (int i = 0; i < PhoneNumbers.length; i++) {
            if (PhoneNumbers[i] == null) break;
            System.out.println(PhoneNumbers[i]);
        }
    }

    public static class PhoneNumber {
        private String name;
        private String phone;
        PhoneNumber(String name, String phone){
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

    public void sortByName(){
        Comparator comparator = new Comparator<PhoneNumber>(){
            public int compare(PhoneNumber pn1, PhoneNumber pn2){
                if ((pn1.getName()).compareTo(pn2.getName()) > 0) return 1;
                if ((pn1.getName()).compareTo(pn2.getName()) < 0) return -1;
                return 0;
            }
        };
        Arrays.sort(PhoneNumbers, comparator);
    }
    public void sortByPhone(){
        Comparator comparator = new Comparator<PhoneNumber>(){
            public int compare(PhoneNumber pn1, PhoneNumber pn2){
                if ((pn1.getPhone()).compareTo(pn2.getPhone()) > 0) return 1;
                if ((pn1.getPhone()).compareTo(pn2.getPhone()) < 0) return -1;
                return 0;
            }
        };
        Arrays.sort(PhoneNumbers, comparator);
    }
}
