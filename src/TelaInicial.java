import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TelaInicial extends JFrame implements ActionListener {

    private int vrVoto, vrTotal, vrBranco, vrCdt1, vrCdt2; //Variáveis de atribuição do if
    private JButton btnVotar, btnApurar;
    private JLabel txtCandidatos, txtNome1, txtNome2, txtVotoBranco, txtVoto, divLinha;
    private JLabel txtTotalVotos, txtTotalBranco, txtTotalNome1, txtTotalNome2;
    private JLabel RsTotal, RsBranco, RsNome1, RsNome2;
    private JTextField cxVoto;
    private Container ctn;

    public TelaInicial() {
        setSize(250, 370);
        setTitle("Sistema de votação");
        ctn = getContentPane();
        ctn.setLayout(null);
        btnVotar = new JButton ("VOTAR");
        btnApurar = new JButton ("Apuração dos votos");
        divLinha = new JLabel("-----------------------------------------------------------");
        txtCandidatos = new JLabel ("Candidatos:");
        txtNome1 = new JLabel ("1 - Joaquim Santos");
        txtNome2 = new JLabel ("2 - Karina Costa");
        txtVotoBranco = new JLabel ("0 - Voto em Branco");
        txtVoto = new JLabel ("Voto:");
        txtTotalVotos = new JLabel ("Total de votos:");
        txtTotalBranco = new JLabel ("Votos em Branco:");
        txtTotalNome1 = new JLabel ("Votos do Candidato 1:");
        txtTotalNome2 = new JLabel ("Votos do Candidato 2:");
        cxVoto = new JTextField();
        RsTotal = new JLabel ("---");
        RsBranco = new JLabel ("---");
        RsNome1 = new JLabel ("---");
        RsNome2 = new JLabel ("---");

        txtCandidatos.setBounds(10, 10, 100, 25);
        txtNome1.setBounds(100, 10, 120, 25);
        txtNome2.setBounds(100, 35, 120, 25);
        txtVotoBranco.setBounds(100, 60, 120, 25);
        txtVoto.setBounds(10, 110, 100, 25);
        cxVoto.setBounds(45, 110, 25, 25);
        btnVotar.setBounds(110, 110, 80, 25);
        divLinha.setBounds(0, 150, 250, 10);
        btnApurar.setBounds(40, 180, 150, 25);
        txtTotalVotos.setBounds(10, 220, 120, 25);
        txtTotalBranco.setBounds(10, 245, 120, 25);
        txtTotalNome1.setBounds(10, 270, 130, 25);
        txtTotalNome2.setBounds(10, 295, 130, 25);
        RsTotal.setBounds(100, 220, 120, 25);
        RsBranco.setBounds(120, 245, 120, 25);
        RsNome1.setBounds(140, 270, 130, 25);
        RsNome2.setBounds(140, 295, 130, 25);

        ctn.add(txtCandidatos);
        ctn.add(txtNome1);
        ctn.add(txtNome2);
        ctn.add(txtVotoBranco);
        ctn.add(txtVoto);
        ctn.add(cxVoto);
        ctn.add(btnVotar);
        ctn.add(divLinha);
        ctn.add(btnApurar);
        ctn.add(txtTotalVotos);
        ctn.add(txtTotalBranco);
        ctn.add(txtTotalNome1);
        ctn.add(txtTotalNome2);
        ctn.add(RsTotal);
        ctn.add(RsBranco);
        ctn.add(RsNome1);
        ctn.add(RsNome2);

        btnVotar.addActionListener(this);
        btnApurar.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getActionCommand().equals("VOTAR")) {
            vrVoto = Integer.parseInt(cxVoto.getText());
            if(vrVoto == 0) {
                vrBranco++;
                vrTotal++;
            } else if(vrVoto == 1) {
                vrCdt1++;
                vrTotal++;
            } else if(vrVoto == 2 ) {
                vrCdt2++;
                vrTotal++;
            }

            cxVoto.setText("");
            //cxVoto.setText(Integer.toString(vrVoto));
        } else if (e.getActionCommand().equals("Apuração dos votos")) {

            RsTotal.setText(Integer.toString(vrTotal));
            RsBranco.setText(Integer.toString(vrBranco));
            RsNome1.setText(Integer.toString(vrCdt1));
            RsNome2.setText(Integer.toString(vrCdt2));
        }
    }


    public static void main(String[] args) {

        TelaInicial tela = new TelaInicial();

    }

}
