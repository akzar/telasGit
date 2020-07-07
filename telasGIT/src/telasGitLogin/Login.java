package telasGitLogin;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;

public class Login extends JFrame {

	private JPanel painelGeral;
	private JTextField jtfNumVistoria;
	private JTextField jtfDataVistoria;
	private JTextField jtfFuncionarioVistoria;
	private JTextField jtfCargoVistoria;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 760, 523);
		this.setResizable(false);
		this.setLocationRelativeTo(null);
		painelGeral = new JPanel();
		painelGeral.setBackground(Color.WHITE);
		painelGeral.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(painelGeral);
		painelGeral.setLayout(null);

		JPanel painelEsquerdo = new JPanel();
		painelEsquerdo.setBounds(10, 11, 150, 462);
		painelGeral.add(painelEsquerdo);
		painelEsquerdo.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(10, 11, 97, 21);
		painelEsquerdo.add(menuBar);

		JMenu mnNewMenu = new JMenu("New menu");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("New menu item");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem menuItem = new JMenuItem("New menu item");
		mnNewMenu.add(menuItem);

		JPanel painelRodape = new JPanel();
		painelRodape.setBackground(Color.WHITE);
		painelRodape.setBounds(170, 413, 564, 60);
		painelGeral.add(painelRodape);
		painelRodape.setLayout(null);

		JButton jbSalvaVistoria = new JButton("Salvar");
		jbSalvaVistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSalvar) {
			}
		});
		jbSalvaVistoria.setBounds(10, 11, 100, 30);
		painelRodape.add(jbSalvaVistoria);

		JButton jbBaseVistoria = new JButton("Base de Conhecimento");
		jbBaseVistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoBase) {
			}
		});
		jbBaseVistoria.setBounds(120, 11, 167, 30);
		painelRodape.add(jbBaseVistoria);

		JButton jbSairVistoria = new JButton("Sair");
		jbSairVistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoSair) {				
			}
		});
		jbSairVistoria.setBounds(399, 11, 100, 30);
		painelRodape.add(jbSairVistoria);

		JButton jbPdfVistoria = new JButton("Gerar PDF");
		jbPdfVistoria.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eventoPdf) {
			}
		});
		jbPdfVistoria.setBounds(297, 11, 95, 30);
		painelRodape.add(jbPdfVistoria);

		JPanel painelCentral = new JPanel();
		painelCentral.setBounds(170, 11, 564, 391);
		painelCentral.setBackground(SystemColor.controlHighlight);
		painelGeral.add(painelCentral);
		painelCentral.setLayout(null);

		JLabel jlNumVistoria = new JLabel("Número da vistoria:");
		jlNumVistoria.setForeground(Color.GRAY);
		jlNumVistoria.setBounds(37, 11, 120, 14);
		painelCentral.add(jlNumVistoria);

		jtfNumVistoria = new JTextField();
		jtfNumVistoria.setBounds(167, 8, 86, 20);
		jtfNumVistoria.setBorder(null);
		painelCentral.add(jtfNumVistoria);
		jtfNumVistoria.setColumns(10);

		JLabel jlDataVistoria = new JLabel("Data de abertura:");
		jlDataVistoria.setForeground(Color.GRAY);
		jlDataVistoria.setBounds(263, 11, 100, 14);
		painelCentral.add(jlDataVistoria);

		jtfDataVistoria = new JTextField();
		jtfDataVistoria.setBounds(373, 8, 166, 20);
		jtfDataVistoria.setBorder(null);
		painelCentral.add(jtfDataVistoria);
		jtfDataVistoria.setColumns(10);

		JLabel jlFuncionarioVistoria = new JLabel("Responsável:");
		jlFuncionarioVistoria.setForeground(Color.GRAY);
		jlFuncionarioVistoria.setBounds(37, 42, 100, 14);
		painelCentral.add(jlFuncionarioVistoria);

		jtfFuncionarioVistoria = new JTextField();
		jtfFuncionarioVistoria.setBounds(167, 39, 190, 20);
		jtfFuncionarioVistoria.setBorder(null);
		painelCentral.add(jtfFuncionarioVistoria);
		jtfFuncionarioVistoria.setColumns(10);

		JLabel jlCargoVistoria = new JLabel("Cargo:");
		jlCargoVistoria.setForeground(Color.GRAY);
		jlCargoVistoria.setBounds(368, 42, 46, 14);
		painelCentral.add(jlCargoVistoria);

		jtfCargoVistoria = new JTextField();
		jtfCargoVistoria.setBounds(424, 39, 115, 20);
		jtfCargoVistoria.setBorder(null);
		painelCentral.add(jtfCargoVistoria);
		jtfCargoVistoria.setColumns(10);

		JLabel jlLocalVistoria = new JLabel("Área vistoriada:");
		jlLocalVistoria.setForeground(Color.GRAY);
		jlLocalVistoria.setBounds(37, 104, 100, 14);
		painelCentral.add(jlLocalVistoria);

		JComboBox<String> jcbAreaVistoria = new JComboBox<String>();
		jcbAreaVistoria.setModel(
				new DefaultComboBoxModel(new String[] { "", "Acesso primeiro", "Acesso segundo", "Acesso terceiro",
						"Acesso quarto", "Case acesso 1\u00BA", "Case acesso 2\u00BA", "Case acesso 3\u00BA" }));
		jcbAreaVistoria.setBounds(167, 101, 206, 20);
		painelCentral.add(jcbAreaVistoria);

		JLabel jlAvaliacaoVistoria = new JLabel("Avalia\u00E7\u00E3o:");
		jlAvaliacaoVistoria.setForeground(Color.GRAY);
		jlAvaliacaoVistoria.setBounds(383, 104, 60, 14);
		painelCentral.add(jlAvaliacaoVistoria);

		JComboBox<String> jcbAvaliacaoVistoria = new JComboBox<String>();
		jcbAvaliacaoVistoria.setModel(new DefaultComboBoxModel(new String[] { "", "5.1", "5.5" }));
		jcbAvaliacaoVistoria.setBounds(453, 101, 86, 20);
		painelCentral.add(jcbAvaliacaoVistoria);

		JLabel jlTipoVistoria = new JLabel("Tipo de Vistoria:");
		jlTipoVistoria.setForeground(Color.GRAY);
		jlTipoVistoria.setBounds(37, 79, 120, 14);
		painelCentral.add(jlTipoVistoria);

		JComboBox<String> jcbTipoVistoira = new JComboBox<String>();
		jcbTipoVistoira.setModel(new DefaultComboBoxModel(
				new String[] { "", "Di\u00E1ria b\u00E1sica", "Quinzenal", "Mensal Seguran\u00E7a" }));
		jcbTipoVistoira.setBounds(167, 70, 207, 20);
		painelCentral.add(jcbTipoVistoira);

		JLabel jlDescricaoVistoria = new JLabel("Descrição da Vistoria:");
		jlDescricaoVistoria.setForeground(Color.GRAY);
		jlDescricaoVistoria.setBounds(37, 148, 150, 14);
		painelCentral.add(jlDescricaoVistoria);

		JTextArea jtaDescricaoVistoria = new JTextArea();
		jtaDescricaoVistoria.setBounds(36, 186, 503, 181);
		painelCentral.add(jtaDescricaoVistoria);
	}
}
