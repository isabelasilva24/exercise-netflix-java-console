import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Catalogo c = new Catalogo();

        int op;

        do {
            System.out.println("\n1 - Adicionar filme");
            System.out.println("2 - Listar filmes");
            System.out.println("0 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Genero: ");
                    String genero = sc.nextLine();

                    c.adicionar(new Filme(nome, genero));
                    break;

                case 2:
                    c.listar();
                    break;
            }

        } while (op != 0);
    }
}