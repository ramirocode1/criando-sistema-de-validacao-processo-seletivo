import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo{
    public static void main(String[] args) {
        selecaoDeCandidato();
        imprimindoSelecionado();
       
    }
        

    public static void imprimindoSelecionado(){
        String[] candidatos ={"Ramiro ", "Rodrigo ", "Junior ", "Matheus ", "Victor "};
        System.out.println("Lista  de candidatos selecionado...");

        for( int indice = 0; indice < candidatos.length; indice++){
        System.out.println("O candidato de Nº " + (indice +1) + " é " + candidatos[indice]);
        }

        System.out.println("Forma abreviada chamada foreach");
        for(String candidato: candidatos){
            System.out.println("Os candidatos selecionados são: " + candidato);
        }

        System.out.println("PARABÉNS AOS SELECIONADOS!!!");
    }

public static void selecaoDeCandidato() {

    String [] candidatos = {"Ramiro ", "Rodrigo ", "Junior ", "Matheus ", "Victor ", "João ", "Diogo ", "Felipe "};

    int candidatoSelecionado = 0; 
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatoSelecionado < 5 && candidatoAtual < candidatos.length) {
        String candidato = candidatos [candidatoAtual];
        double salarioPretendido = valorPretendido();
        System.out.println("O candidato " + candidatoAtual + " solicitou este valor " + salarioPretendido);

        if (salarioBase >= salarioPretendido) {
            System.out.println("O cadidato " + candidato + " foi selecionado.");
            candidatoSelecionado++;
        }
        if (salarioBase < salarioPretendido) {
            System.out.println(" Candidato não selecionado.");

        }
        candidatoAtual++;
    }
 }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}