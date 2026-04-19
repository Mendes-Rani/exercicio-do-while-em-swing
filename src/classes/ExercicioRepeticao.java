/**Programa para ler vários números e informar:
 * a) Quantos números foram digitados;
 * b) Quantos números pares foram digitados;
 * c) Quantos números ímpares foram digitados;
 * d) Quantos números acima de 100 foram digitados;
 * e) A média dos números digitados.
 * Utilizando a biblioteca JOptionPane para entrada e saída de dados. O programa deve ser encerrado quando o usuário digitar o número 0 (zero).
 * O número 0 não deve ser contabilizado como um valor digitado, ou seja, ele serve apenas para encerrar o programa e não deve ser incluído nas contagens ou na média.
 *
 * @author Ranieri Mendes
 */

package classes;

import javax.swing.*;

public class ExercicioRepeticao {
    public static void main(String[] args) {
        int n, totalValores = 0;
        int numPar = 0;
        int numImpar = 0;
        int maiorCem = 0;
        int valorDigitado = 0;
        float media;

        do{
            // O bloco de código dentro do do-while será executado pelo menos uma vez, mesmo que a condição seja falsa, ou seja, o usuário poderá digitar um número e as contagens e a média serão realizadas pelo menos uma vez, mesmo que ele escolha não continuar.
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um valor:" +
                    "<br><em>Digite 0 para sair</em>",
                    "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));
            totalValores++;

            if(n % 2 == 0){
                numPar++; // O operador % é o operador de módulo, que retorna o resto da divisão entre dois números. Se n % 2 for igual a 0, significa que n é um número par, pois ele é divisível por 2 sem deixar resto. Caso contrário, se n % 2 for diferente de 0, significa que n é um número ímpar, pois ele não é divisível por 2 e deixa um resto de 1.
            }else{
                numImpar++;
            }
            if(n > 100){
                maiorCem++; // Se n for maior que 100, incrementamos a variável maiorCem para contar quantos números acima de 100 foram digitados.
            }
            valorDigitado += n; // A variável valorDigitado é usada para acumular a soma de todos os números digitados, para que possamos calcular a média posteriormente. A cada número digitado, adicionamos seu valor à variável valorDigitado usando o operador +=, que é uma forma abreviada de escrever valorDigitado = valorDigitado + n.

        }while (n != 0); // O loop continuará executando enquanto n for diferente de 0. Quando o usuário digitar 0, a condição n != 0 se tornará falsa, e o loop será encerrado.
        media = (float) (valorDigitado / (totalValores - 1)); // Para calcular a média, dividimos a soma total dos valores digitados (valorDigitado) pelo número total de valores digitados (totalValores - 1). Subtraímos 1 de totalValores porque o número 0 não deve ser contabilizado como um valor digitado, ou seja, ele serve apenas para encerrar o programa e não deve ser incluído nas contagens ou na média. O resultado da divisão é convertido para float para obter uma média com casas decimais.
        JOptionPane.showMessageDialog(null, "<html>Resultado<hr>" +
                        "<br>Total de Valores: " + (totalValores - 1) +
                        "<br>Total de Pares: " + (numPar - 1) +
                        "<br>Total de Ímpares: " + numImpar +
                        "<br>Acima de 100: " + maiorCem +
                        "<br>Média dos Valores: " + media,
                "Resultado Final", JOptionPane.INFORMATION_MESSAGE
        );


    }
}
