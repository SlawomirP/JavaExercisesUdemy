package library;

public class Book {

    String title;
    Author author;
    Genre genre;

    public Book (String titl, Author auth, Genre genr){
        this.title = titl;
        this.author = auth;
        this.genre = genr;
    }

    public String getInfo(){
        return title + " " + author.getInfo() + " " + genre;
    }
}
