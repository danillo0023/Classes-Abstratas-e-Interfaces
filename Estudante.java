package classes_abstratas.exercicio1;

// Classe Estudante
class Estudante {
    private String ra;
    private String nome;
    private String email;
    private float mediaNotas;
    private int qtdAprovacoes;

    public Estudante(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.mediaNotas = mediaNotas;
        this.qtdAprovacoes = qtdAprovacoes;
    }

    public float percentualRendimento() {
        return mediaNotas * qtdAprovacoes * 0.931f;
    }

    public float percentualProgressao() {
        return qtdAprovacoes / 3f;
    }
}