package library;

public class App {
    public static void main(String[] args) {
        Author tom = new Author ("Thomas","First");
        Author bil = new Author ("Billy", "Second");
        Author mik = new Author ("Mike", "Third");
        Author eli = new Author ("Elizabeth","Fourth");
        Author jul = new Author ("Julia","Fifth");

        Book spi = new Book ("Spiederman", tom, Genre.FANTASY);
        Book bat = new Book ("Batman", bil, Genre.FANTASY);
        Book saw = new Book ("SAW", mik, Genre.HORROR);
        Book dre = new Book ("Dream Land", eli, Genre.MYSTERY);
        Book won = new Book ("Wonder woman", jul,Genre.FANTASY);

        System.out.println(spi.getInfo());
        System.out.println(bat.getInfo());
        System.out.println(saw.getInfo());
        System.out.println(dre.getInfo());
        System.out.println(won.getInfo());

    }
}
