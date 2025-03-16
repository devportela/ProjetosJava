import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora extends JFrame implements ActionListener {
    private JTextField campoTexto;
    private double num1, num2, resultado;
    private char operador;

    public calculadora() {
        setTitle("Calculadora");
        setSize(300, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        campoTexto = new JTextField();
        campoTexto.setEditable(false);
        campoTexto.setFont(new Font("Arial", Font.BOLD, 24));
        add(campoTexto, BorderLayout.NORTH);

        JPanel painelBotoes = new JPanel();
        painelBotoes.setLayout(new GridLayout(4, 4, 5, 5));

        String[] botoes = {
                "7", "8", "9", "/",
                "4", "5", "6", "*",
                "1", "2", "3", "-",
                "0", "C", "=", "+"
        };

        for (String texto : botoes) {
            JButton botao = new JButton(texto);
            botao.setFont(new Font("Arial", Font.BOLD, 20));
            botao.addActionListener(this);
            painelBotoes.add(botao);
        }

        add(painelBotoes, BorderLayout.CENTER);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if ("0123456789".contains(comando)) {
            campoTexto.setText(campoTexto.getText() + comando);
        } else if ("+-*/".contains(comando)) {
            num1 = Double.parseDouble(campoTexto.getText());
            operador = comando.charAt(0);
            campoTexto.setText("");
        } else if (comando.equals("=")) {
            num2 = Double.parseDouble(campoTexto.getText());
            switch (operador) {
                case '+': resultado = num1 + num2; break;
                case '-': resultado = num1 - num2; break;
                case '*': resultado = num1 * num2; break;
                case '/': resultado = num2 != 0 ? num1 / num2 : 0; break;
            }
            campoTexto.setText(String.valueOf(resultado));
        } else if (comando.equals("C")) {
            campoTexto.setText("");
            num1 = num2 = resultado = 0;
        }
    }

    public static void main(String[] args) {
        new calculadora();
    }
}