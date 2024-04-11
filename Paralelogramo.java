package classes_abstratas.exercicio1;

class Paralelogramo extends Quadrilatero {
    public Paralelogramo(float base, float altura) {
        super(base, altura);
    }

    @Override
    public float calcArea() {
        return getBase() * getAltura();
    }
}
