package Task_3;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setNumber("0550122018900");
        System.out.println(phone.getNumber());
        phone.setNumber("077202020");
        System.out.println(phone.getNumber());
        phone.setCamera("108 MP");
        phone.setFrontCamera("48MP");
        phone.setColor("Black");
        phone.setDualSim(true);
        phone.setMicroSD(false);
        phone.setModel("Galaxy S20");
        phone.setOperationMemory("128 GB");
        phone.setOperationSystem("Android");
        phone.setPrice(324_000);
        phone.setVersion("EU");
        phone.setWeight(222);
        phone.setYear(2020);

        System.out.println(phone.getVersion());
        System.out.println(phone.getWeight());
        System.out.println(phone.getOperationMemory());


        Phone phone1 = new Phone();
        phone1.setNumber("097865125");
        phone1.setCamera("64 MP");
        phone1.setFrontCamera("32MP");
        phone1.setColor("Pink");
        phone1.setDualSim(false);
        phone1.setMicroSD(false);
        phone1.setModel("Iphone 11 Pro");
        phone1.setOperationMemory("256 GB");
        phone1.setOperationSystem("IOS");
        phone1.setPrice(550000);
        phone1.setVersion("USA");
        phone1.setWeight(189);
        phone1.setYear(2019);

        System.out.println(phone1.getCamera());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getColor());
    }
}
