class Print {
    String documentName;
    double costperPage;

    double calculateCost(int pages) {
        return pages * costperPage;
    }

    double calculateCost(int pages, boolean colorprint) {
        if (colorprint) {
            return pages * costperPage * 2.5;
        } else {
            return pages * costperPage;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Print p = new Print();

        p.documentName = "Yamen Book";
        p.costperPage = 6.00;

        System.out.println(p.calculateCost(10));
        System.out.println(p.calculateCost(10, true));
    }
}
