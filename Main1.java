class Phone {
    String model;
    int storageGB;
    double price;

    Phone(String model, int storageGB, double price) {
        this.model = model;
        this.storageGB = storageGB;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Yemendetectorphone 1282", 4, 999.00);

        System.out.println("model: " + phone.model);
        System.out.println("Storage in gigabyte: " + phone.storageGB);
        System.out.println("The price: " + phone.price);
    }
}
