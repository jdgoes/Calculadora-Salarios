/* Desenvolva um programa que funcione como uma calculadora de valor a receber para 
um professor. O programa deve solicitar ao usuário o nome do professor e seu regime 
de pagamento, que pode ser: CLT, Horista ou PJ. Em seguida, o programa deve pedir 
informações adicionais de acordo com o regime selecionado.

Caso o regime de pagamento seja CLT, o programa deve solicitar o salário mensal do 
professor. Se o regime for Horista, o programa deve pedir o número de horas 
trabalhadas pelo professor e o valor da hora de trabalho. No caso de PJ, o programa 
deve pedir o valor do contrato do professor.

Após receber as informações necessárias, o programa deverá realizar os cálculos 
adequados para determinar o valor a receber pelo professor, de acordo com seu 
regime de pagamento. O cálculo será feito da seguinte maneira:
- Para regime CLT, o valor a receber será igual ao salário mensal informado.
- Para regime Horista, o valor a receber será o produto entre o número de horas 
trabalhadas e o valor da hora de trabalho.
- Para regime PJ, o valor a receber será igual ao valor do contrato.

Por fim, o programa deverá imprimir o resultado, exibindo o nome do professor e o 
valor a receber. */

import javax.swing.JOptionPane;

public class ProgramaPrincipal{

    public static void main(String[] args) {
        
        String[] 
        informacoes = {
        "nome", 
        "regime de trabalho", 
        "salário mensal", 
        "horas trabalhadas", 
        "hora de trabalho",
        "valor de contrato"
        };

        String[] exibicao = new String[informacoes.length];


        exibicao[0] = JOptionPane.showInputDialog("Digite o seu " + informacoes[0]);
        exibicao[1] = JOptionPane.showInputDialog("Digite o seu " + informacoes[1]);
        
        char primeiraLetra = exibicao[1].toUpperCase().charAt(0);


        if(primeiraLetra == 'C'){
            exibicao[2] = JOptionPane.showInputDialog("Qual o seu " + informacoes[2] + "?");
            double clt = Double.parseDouble(exibicao[2]);

            String exibicaoClt = String.format("Olá %s\n" +
            "O seu sálario mensal é de: R$ %.2f", exibicao[0], clt);

            JOptionPane.showMessageDialog(null, exibicaoClt);
        }


        else if(primeiraLetra == 'H'){
            exibicao[3] = JOptionPane.showInputDialog("Quantas " + informacoes[3] + " você tem?");
            exibicao[4] = JOptionPane.showInputDialog("Qual o valor da sua " + informacoes[4] + "?");

            double horasTrabalhadas = (Double.parseDouble(exibicao[3]));
            double horaDeTrabalho = (Double.parseDouble(exibicao[4]));
            
            Horista horaCalculada = new Horista();
            double salarioMensal = horaCalculada.realizandoOCalculo(horasTrabalhadas, horaDeTrabalho);

            String exibicaoHorista = String.format("Olá %s\n" +
            "O seu sálario mensal é de: R$ %.2f", exibicao[0], salarioMensal);

            JOptionPane.showMessageDialog(null, exibicaoHorista);
        } 
            else if(primeiraLetra == 'P'){
            exibicao[5] = JOptionPane.showInputDialog("Qual o seu " + informacoes[5] + "?");
            double contratoPj = Double.parseDouble(exibicao[5]);

            String exibicaoPj = String.format("Olá %s\n" +
            "O seu sálario mensal é de: R$ %.2f", exibicao[0], contratoPj);
            
            JOptionPane.showMessageDialog(null, exibicaoPj);
        }


        else{
            String entradaDeDados = "Entrada de dados inválida";
            JOptionPane.showMessageDialog(null, entradaDeDados);
        }

    }

}