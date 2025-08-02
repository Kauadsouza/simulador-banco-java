import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);

    public static void exibirMenuPrincipal() {
        while (true) {
            System.out.println("\n===== Banco Simulado =====");
            System.out.println("1. Criar conta");
            System.out.println("2. Login");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    loginUsuario();
                    break;
                case 3:
                    System.out.println("Saindo do sistema. Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void cadastrarUsuario() {
        System.out.println("\n===== Cadastro de Usuário =====");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Banco.cadastrarUsuario(nome, email, senha);
    }

    private static void loginUsuario() {
        System.out.println("\n===== Login =====");
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        Usuario usuarioLogado = Banco.login(email, senha);
        if (usuarioLogado != null) {
            exibirMenuUsuario(usuarioLogado);
        }
    }

    private static void exibirMenuUsuario(Usuario usuario) {
        while (true) {
            System.out.println("\n===== Conta de " + usuario.getEmail() + " =====");
            System.out.println("1. Visualizar saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair da conta");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Saldo: (implemente na classe Conta)");
                    break;
                case 2:
                    System.out.println("Valor a depositar: ");
                    double valorDep = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Depositar ainda não implementado (adicione na Conta)");
                    break;
                case 3:
                    System.out.println("Valor a sacar: ");
                    double valorSaq = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Saque ainda não implementado (adicione na Conta)");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
