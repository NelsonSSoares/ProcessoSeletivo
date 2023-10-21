package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        imprimirSelecionado();
    }

    static void imprimirSelecionado(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};
        System.out.println("Imprimindo a lista de candidados informando o indice do elemento");

        for(int i = 0; i < candidatos.length ; i++){
            System.out.println("O Candidato de Numero " + i +" é " + candidatos[i]);
        }

        System.out.println("Forma abreviada");
        for (String candidato: candidatos) {
            System.out.println("O candidato selecionado foi " + candidato);
        }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE","MARCIA","JULIA","PAULO","AUGUSTO","FABRICIO","MIRELA","DANIELA","JORGE"};


        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase=2000.0;
        while(candidatosSelecionados < 5 && candidatosAtual< candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato "+ candidato + " Solicitou "+ salarioPretendido);

            if(salarioBase >=salarioPretendido){
                System.out.println("O Candidato " + candidato + " Foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }

    static  void analisarCandidato(double salarioPretentido){
        double salarioBase = 2000.0;

        if(salarioBase> salarioPretentido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretentido){
            System.out.println("Ligar para candidato com contra proposta");
        }else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
