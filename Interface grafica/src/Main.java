import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Minecraft");
        JButton botaoLogin = new JButton("Login");
        JLabel email = new JLabel("Email");
        JLabel senha = new JLabel("Senha");
        JTextField campoEmail = new JTextField();
        JPasswordField campoSenha = new JPasswordField();

        janela.setLayout(null);

        janela.setBounds(283, 134, 800, 500);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        //Textos de email e senha
        email.setBounds(300, 100, 100, 30);
        senha.setBounds(300, 160, 100, 30);

        //Campos de email e senha
        campoEmail.setBounds(300, 130, 200, 30);
        campoSenha.setBounds(300, 190, 200, 30);

        //Botao de login
        botaoLogin.setBounds(300, 250, 200, 30);
        botaoLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = campoEmail.getText();
                String senha = new String(campoSenha.getPassword());
                JOptionPane.showMessageDialog(janela, "Você está logado!\nSeu email: "+email+"\nSua senha: "+senha);
                campoEmail.setText("");
                campoSenha.setText("");
            }
        });

        //Adiconar elementos
        janela.add(botaoLogin);
        janela.add(campoEmail);
        janela.add(campoSenha);
        janela.add(email);
        janela.add(senha);
    }
}
