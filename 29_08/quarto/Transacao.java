package quarto;

interface Transacao {
    String getDescricao();
    double getValor();
    boolean isDespesa();
}
