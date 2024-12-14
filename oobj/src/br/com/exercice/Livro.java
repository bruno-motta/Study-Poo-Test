package br.com.exercice;

public class Livro  {

    private String title;
    private String author;
    private int yearPublication;
    private boolean available;

    public Livro(String title, String author, int yearPublication){
        this.title = title;
        this.author = author;
        this.yearPublication = yearPublication;
        this.available = true;
    }



    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearPublication() {
        return yearPublication;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYearPublication(int yearPublication) {
        this.yearPublication = yearPublication;
    }

    public boolean isAvailable(){
        return available;

    }

    public boolean loan(){
        if(available){
        available = false;
        return true;
        } else {
            System.out.println("Erro, livro já emprestado");
            return false;
        }

    }

    public void devolver(){
         available = true;
    }




}
