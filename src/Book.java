public class Book implements Printable {
    private String  name;
    private  String page;

    public Book(String name, String page) {
        this.name = name;
        this.page = page;
    }

    @Override
    public void print() {
        System.out.println("Печаттать книги в большом абьеме");

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



    public static void printBook(Printable[]printable){
        for (Printable printamle:printable) {
            if (printamle instanceof Book){
                System.out.println(printamle);

        }

        }

    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", page='" + page + '\'' +
                '}';
    }
    }






