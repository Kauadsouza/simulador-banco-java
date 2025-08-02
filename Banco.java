import java.util.ArrayList;

public class Banco {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();

    public static void cadastrarUsuario(String nome, String email, String senha) {
        usuarios.add(new Usuario(nome, email, senha));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public static Usuario login(String email, String senha) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.verificarSenha(senha)) {
                System.out.println("Login bem-sucedido!");
                return u;
            }
        }
        System.out.println("Email ou senha incorretos.");
        return null;
    }
}
