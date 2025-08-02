import java.io.*;

public class ArquivoUtils {
    public static void salvarTexto(String caminho, String conteudo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho, true))) {
            bw.write(conteudo);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }
}
