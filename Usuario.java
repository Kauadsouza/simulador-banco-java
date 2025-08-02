public class Usuario {
    private String email;
    private String senha;

    public Usuario(String nome, String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public boolean verificarSenha(String senhaDigitada) {
        return this.senha.equals(senhaDigitada);
    }

    // Getters e Setters omitidos para simplificar
}
