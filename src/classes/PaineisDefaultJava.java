package classes;

import javax.swing.JOptionPane;

public class ExercicioRepita {
    public static void main(String[] args) {

        // O método showMessageDialog é usado para exibir uma caixa de diálogo com uma mensagem, um título e um ícone. O primeiro parâmetro é o componente pai (null para centralizar na tela), o segundo é a mensagem a ser exibida, o terceiro é o título da caixa de diálogo e o quarto é o tipo de mensagem (INFORMATION_MESSAGE para um ícone de informação).
        //JOptionPane.showMessageDialog(null, "Olá, mundo!", "Boas Vindas", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showInputDialog(null, "Digite um número: ", "Entrada de Dados", JOptionPane.QUESTION_MESSAGE);

    }
}
