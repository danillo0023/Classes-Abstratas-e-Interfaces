package classes_abstratas.exercicio1;

public class MainTeste {
    public static void main(String[] args) {
        // Testando as operações

        // Testando Quadrilátero
        Quadrilatero quadrilatero = new Paralelogramo(5, 3);
        System.out.println("Área do Paralelogramo: " + quadrilatero.calcArea());
        System.out.println("Perímetro do Paralelogramo: " + quadrilatero.calcPerimetro());

        // Testando Trapézio
        Quadrilatero trapezio = new Trapezio(5, 3, 2);
        System.out.println("Área do Trapézio: " + trapezio.calcArea());
        System.out.println("Perímetro do Trapézio: " + trapezio.calcPerimetro());

        // Testando Estudante
        Estudante estudante = new Estudante("123", "João", "joao@example.com", 8.5f, 4);
        System.out.println("Percentual de rendimento do estudante: " + estudante.percentualRendimento());
        System.out.println("Percentual de progressão do estudante: " + estudante.percentualProgressao());

        // Testando Estudante Técnico
        EstudanteTecnico estudanteTecnico = new EstudanteTecnico("456", "Maria", "maria@example.com", 7.5f, 6);
        System.out.println("Percentual de rendimento do estudante técnico: " + estudanteTecnico.percentualRendimento());
        System.out.println("Percentual de progressão do estudante técnico: " + estudanteTecnico.percentualProgressao());

        // Testando Estudante Superior
        EstudanteSuperior estudanteSuperior = new EstudanteSuperior("789", "Pedro", "pedro@example.com", 9.0f, 8,
                "Escola X", 2018);
        System.out.println("Percentual de rendimento do estudante superior: " + estudanteSuperior.percentualRendimento());
        System.out.println("Percentual de progressão do estudante superior: " + estudanteSuperior.percentualProgressao());
    }
}
