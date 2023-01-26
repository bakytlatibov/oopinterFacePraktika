public class Main {
    public static void main(String[] args) {
        Book book=new Book("sbs","3");

        Magazine magazine=new Magazine("333","333");

        Printable[]printables={new Book("33","33"),new Magazine("32","45")};
        for (Printable a:printables) {
            a.print();
           Book.printBook(printables);
           Magazine.printMagazines(printables);



            }

            }

        }


