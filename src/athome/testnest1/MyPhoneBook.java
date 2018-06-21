package athome.testnest1;

public class MyPhoneBook {
    private PhoneNumber[] PhoneNumbers = new PhoneNumber[10];

    // add a new entry (PhoneNumber object) to PhoneNumbers array
    public void addPhoneNumber(String name, String phone ){
        for (int i = 1; i < PhoneNumbers.length; i++) {
            if (PhoneNumbers[i] == null){
                PhoneNumbers[i] = new PhoneNumber(name, phone);
                break;
            }
        }
    }
    // print out PhoneNumbers array
    public void printPhoneNumber(){
        for (int i = 1; i < PhoneNumbers.length; i++) {
            if (PhoneNumbers[i] == null) break;
            System.out.println(PhoneNumbers[i]);
        }
    }


    public static class PhoneNumber {
        private String name;
        private String phone;
        public PhoneNumber(String name, String phone){
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
}
