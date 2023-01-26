public class Magazine implements Printable {
    private String  name;
    private  String page;

    public Magazine(String name, String page) {
        this.name = name;
        this.page = page;
    }

    @Override
    public void print() {
        System.out.println("Много интересных журналов в магазиге");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

    public static void printMagazines(Printable[]printable){
        for (Printable prinable:printable) {
            if (prinable instanceof Magazine){
                System.out.println(prinable);
            }

        }

    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                ", page='" + page + '\'' +
                '}';
    }
}
