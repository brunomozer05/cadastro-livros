public class Livro {
    String titulo;
    String autor;


    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    void mostrar(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: " +autor);
        System.out.println();
    }
}
