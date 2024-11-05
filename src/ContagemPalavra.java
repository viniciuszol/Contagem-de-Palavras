import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    private Map<String, Integer> palavras;

    public ContagemPalavra() {
    this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavras.put(palavra, contagem);
    }

    public void removePalavra(String palavra) {
        if (!palavras.isEmpty()) {
            palavras.remove(palavra);
        }
        else {
            System.out.println("O Map está vazio");
        }
    }

    public int exibirContagemPalavras() {
        int contagemTotal = 0;

        for (int contagem : palavras.values()) {
            contagemTotal += contagem;
        }
        return contagemTotal;
    }

    public String encontrarPalavraMaisFrequente() {
        String lpMaisFrequente = null;
        //lp = linguagem de programação
        int maiorContagem = 0;

        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                lpMaisFrequente = entry.getKey();
            }
        }
        return lpMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavra contagemLP = new ContagemPalavra();
        //lp = linguagem de programação

        //adicionando palavras
        contagemLP.adicionarPalavra("Java", 15);
        contagemLP.adicionarPalavra("Python", 6);
        contagemLP.adicionarPalavra("C#", 11);
        contagemLP.adicionarPalavra("JavaScript", 7);
        contagemLP.adicionarPalavra("Kotlin", 4);
        contagemLP.adicionarPalavra("PHP", 5);

        //exibindo contagem total
        System.out.println("Sua lista possui " + contagemLP.exibirContagemPalavras() + " palavras");

        //encontrando a linguagem de programação mais frequenete
        String lpMaisFrequente = contagemLP.encontrarPalavraMaisFrequente();
        System.out.println("A linguagem de programação mais frequente: " + lpMaisFrequente);
    }
}
