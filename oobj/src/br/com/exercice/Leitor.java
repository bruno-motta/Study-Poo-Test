package br.com.exercice;

public class Leitor  {
    private String name;
    private int age;
    public int numberLoan;

    public Leitor(String name, int age){
        this.name = name;
        this.age = age;
        this.numberLoan = 0;

    }

    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getNumberLoan(){
        return numberLoan;
    }

    public void setName(String name){
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }



    public void pegarLivroEmprestado(){
        this.numberLoan++;
    }
    public void devolverLivroEmprestado(){
        if(this.numberLoan > 0){
            this.numberLoan--;
        }
        else {
            System.out.println("Nenhum emprestimo a ser devolvido!");
        }
    }

}
