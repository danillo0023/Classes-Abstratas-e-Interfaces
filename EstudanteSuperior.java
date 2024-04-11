package classes_abstratas.exercicio1;

class EstudanteSuperior extends Estudante {
    private String insituicaoSegundoGrau;
    private int anoConclusaoSegundoGrau;

    public EstudanteSuperior(String ra, String nome, String email, float mediaNotas, int qtdAprovacoes,
                             String insituicaoSegundoGrau, int anoConclusaoSegundoGrau) {
        super(ra, nome, email, mediaNotas, qtdAprovacoes);
        this.insituicaoSegundoGrau = insituicaoSegundoGrau;
        this.anoConclusaoSegundoGrau = anoConclusaoSegundoGrau;
    }

    @Override
    public float percentualRendimento() {
             return mediaNotas * qtdAprovacoes * 0.972f;
    }

    @Override
    public float percentualProgressao() {
        return qtdAprovacoes / 6f;
    }
}
