package Atividade4_UC09.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ApagarDados {

    public static void excluirLinhaCSV(String caminhoArquivoCSV, int indiceLinha) {
        try {
            // Ler todas as linhas do arquivo CSV
            List<String> linhas = Files.readAllLines(Paths.get(caminhoArquivoCSV));

            // Remover a linha especificada
            linhas.remove(indiceLinha);

            // Escrever as linhas atualizadas de volta no arquivo CSV
            BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoArquivoCSV));
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
