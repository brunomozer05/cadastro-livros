import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int idMenu = 0;
        while (idMenu != 5){
        System.out.println();
        System.out.println("=== Cadastro de Livros ===");
        System.out.println();
        System.out.println("1 - Cadastrar novo livro");
        System.out.println("2 - Listar livros");
        System.out.println("3 - Remover livro");
        System.out.println("4 - Atualizar livro");
        System.out.println("5 - Sair");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        idMenu = scanner.nextInt();
        if (idMenu == 1){
            System.out.println();
            scanner.nextLine();
            System.out.println("=== Cadastrar novo livro ===");
            System.out.println();
            System.out.print("Digite o Título: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o autor: ");
            String autor = scanner.nextLine();
            Livro l = new Livro(titulo,autor);
            livros.add(l);
        } else if (idMenu == 2) {
            System.out.println();
            System.out.println("=== Listar livros ===");
            System.out.println();
            System.out.println("Total de livros: " + livros.size());
            System.out.println();
            for (int c = 0;c < livros.size();c++){
                System.out.println("Id:" + c);
                livros.get(c).mostrar();
            }
        } else if (idMenu == 3) {
            System.out.println();
            System.out.println("=== Remover livro ===");
            System.out.println();
            System.out.print("Digite o Id do livro que deseja remover: ");
            int idLivroRemover = scanner.nextInt();
            System.out.println();
            System.out.println("O Livro com o titulo : " + livros.get(idLivroRemover).titulo + " Foi removido com sucesso!");
            livros.remove(idLivroRemover);
        } else if (idMenu == 4) {
            System.out.println();
            System.out.println("=== Atualizar livro ===");
            System.out.println();
            System.out.print("Digite o Id do livro que deseja atualizar: ");
            int idLivroAtualizar = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Digite o nome do livro: ");
            livros.get(idLivroAtualizar).titulo = scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            livros.get(idLivroAtualizar).autor = scanner.nextLine();
            System.out.println();
            System.out.println("Livro cadastrado com sucesso!");
            System.out.println();
            livros.get(idLivroAtualizar).mostrar();
        }

        }
    }
}
