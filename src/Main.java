import java.util.Scanner;

import controller.Biblioteca;
import controller.ManagementSystem;
import model.Livro;
public class Main {

    private static final Biblioteca Biblioteca = null;

    public static void main(String[] args) {
        Biblioteca lista = new Biblioteca(15); // ou ListaEncadeada
        Scanner scanner = new Scanner(System.in);
        ManagementSystem sistema = new ManagementSystem(Biblioteca);
        boolean sair = false;
        while (!sair) {
            System.out.println("******************************************************");
            System.out.println("******************************************************");
            System.out.println(" *                     Menu                          *");
            System.out.println(" *              1. Adicionar Livro                   *");
            System.out.println(" *              2. Listar Livros                     *");
            System.out.println(" *              3. Ordenar por Título                *");
            System.out.println(" *              4. Ordenar por Autor                 *");
            System.out.println(" *              5. Sair                              *");
            System.out.println("******************************************************");
            System.out.println("******************************************************");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir nova linha

            switch (opcao){

            case 1: 
            System.out.print("Digite o título do livro: ");
            String titulo = scanner.nextLine();
            System.out.print("Digite o autor do livro: ");
            String autor = scanner.nextLine();
            System.out.print("Digite o ano de publicação: ");
            int ano = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha após o número
            sistema.adicionarLivro(titulo, autor, ano);
            System.out.println("Livro adicionado com sucesso.");
            break;

            case 2: 
            Livro[] livros = sistema.listarLivros();
            if (livros[0] == null) {
                System.out.println("Nenhum livro cadastrado.");
            } else {
                System.out.println("Livros cadastrados:");
                for (Livro livro : livros) {
                    if (livro != null) {
                        System.out.println(livro.getTitulo() + " - " + livro.getAutor() + " (" + livro.getAnoDePublicacao() + ")");
                    }
                }
            }
            break;

            case 3: 
            sistema.ordenarLivrosPorTitulo();
            System.out.println("Livros ordenados por Titulo");
            break;

            case 4: 
            sistema.ordenarLivrosPorAutor();
            System.out.println("Livros ordenados por Autor");
            break;
            case 5:
          // Sair
             sair = true;
          System.out.println("Saindo do sistema.");
          break;
        default: 
        System.out.println("Opção inválida");
            }
            }
            scanner.close();
        }
}
