package classes;

import javax.swing.JOptionPane;

public class PaineisDefaultJava {
    public static void main(String[] args) {

        // O método showMessageDialog é usado para exibir uma caixa de diálogo com uma mensagem, um título e um ícone. O primeiro parâmetro é o componente pai (null para centralizar na tela), o segundo é a mensagem a ser exibida, o terceiro é o título da caixa de diálogo e o quarto é o tipo de mensagem (INFORMATION_MESSAGE para um ícone de informação).
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);

        // O método showInputDialog é usado para exibir uma caixa de diálogo que solicita ao usuário que insira um valor. O primeiro parâmetro é o componente pai (null para centralizar na tela), o segundo é a mensagem a ser exibida, o terceiro é o título da caixa de diálogo e o quarto é o tipo de mensagem (QUESTION_MESSAGE para um ícone de pergunta). O valor retornado por showInputDialog é uma string, então precisamos convertê-lo para um número inteiro usando Integer.parseInt() para armazená-lo na variável n.
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE));

    }
}
