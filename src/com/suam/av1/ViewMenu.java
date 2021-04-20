package com.suam.av1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;



public class ViewMenu {

	private JFrame frmCadastro;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewMenu window = new ViewMenu();
					window.frmCadastro.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ViewMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCadastro = new JFrame();
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setSize(800,600);
		frmCadastro.setResizable(false);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frmCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCadastro.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 216, 553);
		frmCadastro.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(228, -24, 587, 605);
		frmCadastro.getContentPane().add(tabbedPane);	
		
		JPanel panel_6 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_6, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnCadastrarEmpresa = new JButton("Cadastrar Empresa");
		btnCadastrarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(1);

			}
		});


		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmed = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Confirmação de saída", JOptionPane.YES_NO_OPTION);
				if (confirmed == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		
		sl_panel.putConstraint(SpringLayout.NORTH, btnCadastrarEmpresa, 38, SpringLayout.NORTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarEmpresa, 0, SpringLayout.WEST, panel);
		panel.add(btnCadastrarEmpresa);
		
		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcionário");
		sl_panel.putConstraint(SpringLayout.NORTH, btnCadastrarFuncionrio, 25, SpringLayout.SOUTH, btnCadastrarEmpresa);
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarFuncionrio, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		sl_panel.putConstraint(SpringLayout.EAST, btnCadastrarFuncionrio, 36, SpringLayout.EAST, btnCadastrarEmpresa);
		panel.add(btnCadastrarFuncionrio);
		
		JButton btnCadastrarClientes = new JButton("Cadastrar Clientes");
		sl_panel.putConstraint(SpringLayout.NORTH, btnCadastrarClientes, 21, SpringLayout.SOUTH, btnCadastrarFuncionrio);
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarClientes, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		panel.add(btnCadastrarClientes);
		
		JButton btnListarEmpresa = new JButton("Listar Empresa");
		sl_panel.putConstraint(SpringLayout.NORTH, btnListarEmpresa, 27, SpringLayout.SOUTH, btnCadastrarClientes);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarEmpresa, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		panel.add(btnListarEmpresa);
		
		JButton btnListarClientes = new JButton("Listar Clientes");
		sl_panel.putConstraint(SpringLayout.NORTH, btnListarClientes, 29, SpringLayout.SOUTH, btnListarEmpresa);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarClientes, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		panel.add(btnListarClientes);
		
		JButton btnListarFuncionrios = new JButton("Listar Funcionários");
		sl_panel.putConstraint(SpringLayout.NORTH, btnListarFuncionrios, 28, SpringLayout.SOUTH, btnListarClientes);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarFuncionrios, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		panel.add(btnListarFuncionrios);
		
		JLabel lblCadastroDaEmpresa = new JLabel("Cadastro da Empresa");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCadastroDaEmpresa, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCadastroDaEmpresa, 183, SpringLayout.WEST, panel_1);
		panel_1.add(lblCadastroDaEmpresa);
				
		lblCadastroDaEmpresa.setFont(new Font("Times new Roman", Font.BOLD, 18));
		
		Empresa empresa = new Empresa();
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				empresa.nome = textField.getText();
				empresa.cnpj = textField_1.getText();
				
				if ((textField.getText().trim().isEmpty()) || (textField_1.getText().trim().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Contém campo vazio", "Erro", JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(0);
					textField.setText("");
					textField_1.setText("");
				} else {
					tabbedPane.setSelectedIndex(0);
					textField.setText("");
					textField_1.setText("");
					btnCadastrarEmpresa.setEnabled(false);
					btnCadastrarFuncionrio.setEnabled(true);
					btnCadastrarClientes.setEnabled(true);
					btnListarEmpresa.setEnabled(true);
					btnListarClientes.setEnabled(true);
					btnListarFuncionrios.setEnabled(true);
					
					
				}
				

					
			}
		});
		
		btnListarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(4);
				textField_2.setText(""+ empresa.nome);
				textField_3.setText(""+ empresa.cnpj);
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				
			}
		});
		sl_panel_1.putConstraint(SpringLayout.WEST, btnRegistrar, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnRegistrar, -27, SpringLayout.SOUTH, panel_1);
		panel_1.add(btnRegistrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnRegistrar);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnCancelar, -39, SpringLayout.EAST, panel_1);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
				textField.setText("");
				textField_1.setText("");
				
			}
		});
		panel_1.add(btnCancelar);
		
		
		JLabel lblNome = new JLabel("Nome:");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNome, 97, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNome, 30, SpringLayout.WEST, panel_1);
		panel_1.add(lblNome);
		
		JLabel lblCnpj = new JLabel("CNPJ:");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCnpj, 41, SpringLayout.SOUTH, lblNome);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCnpj, 0, SpringLayout.WEST, lblNome);
		panel_1.add(lblCnpj);
		
		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, 63, SpringLayout.SOUTH, lblCadastroDaEmpresa);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 5, SpringLayout.EAST, lblNome);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, 220, SpringLayout.EAST, lblNome);
		panel_1.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_1, -2, SpringLayout.NORTH, lblCnpj);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, textField);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		SpringLayout sl_panel_2 = new SpringLayout();
		panel_2.setLayout(sl_panel_2);
		
		JLabel lblCadastroDoFuncionrio = new JLabel("Cadastro do Funcionário");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblCadastroDoFuncionrio, 10, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblCadastroDoFuncionrio, 166, SpringLayout.WEST, panel_2);
		panel_2.add(lblCadastroDoFuncionrio);
		
		lblCadastroDoFuncionrio.setFont(new Font("Times new Roman", Font.BOLD, 18));
		
		JLabel lblNome_2 = new JLabel("Nome:");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblNome_2, 64, SpringLayout.NORTH, panel_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblNome_2, 10, SpringLayout.WEST, panel_2);
		panel_2.add(lblNome_2);
		
		JLabel lblIdade = new JLabel("Idade:");
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblIdade, 52, SpringLayout.SOUTH, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblIdade, 0, SpringLayout.WEST, lblNome_2);
		panel_2.add(lblIdade);
		
		JButton btnRegistrar_1 = new JButton("Registrar");
		sl_panel_2.putConstraint(SpringLayout.WEST, btnRegistrar_1, 0, SpringLayout.WEST, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnRegistrar_1, -24, SpringLayout.SOUTH, panel_2);
		panel_2.add(btnRegistrar_1);
		
		JButton btnCancelar_1 = new JButton("Cancelar");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnCancelar_1, 0, SpringLayout.NORTH, btnRegistrar_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnCancelar_1, -44, SpringLayout.EAST, panel_2);
		panel_2.add(btnCancelar_1);
		
		textField_4 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_4, -2, SpringLayout.NORTH, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_4, 6, SpringLayout.EAST, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_4, 252, SpringLayout.EAST, lblNome_2);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_5, -2, SpringLayout.NORTH, lblIdade);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_5, 6, SpringLayout.EAST, lblIdade);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_5, 6, SpringLayout.EAST, btnRegistrar_1);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		SpringLayout sl_panel_3 = new SpringLayout();
		panel_3.setLayout(sl_panel_3);
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblCadastroDeCliente, 10, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, lblCadastroDeCliente, -209, SpringLayout.EAST, panel_3);
		panel_3.add(lblCadastroDeCliente);
		
		lblCadastroDeCliente.setFont(new Font("Times new Roman", Font.BOLD, 18));
		
		JLabel lblNome_3 = new JLabel("Nome:");
		panel_3.add(lblNome_3);
		
		JLabel lblIdade_1 = new JLabel("Idade:");
		sl_panel_3.putConstraint(SpringLayout.NORTH, lblIdade_1, 120, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblNome_3, 0, SpringLayout.WEST, lblIdade_1);
		sl_panel_3.putConstraint(SpringLayout.SOUTH, lblNome_3, -29, SpringLayout.NORTH, lblIdade_1);
		sl_panel_3.putConstraint(SpringLayout.WEST, lblIdade_1, 10, SpringLayout.WEST, panel_3);
		panel_3.add(lblIdade_1);
		
		textField_6 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_6, 42, SpringLayout.SOUTH, lblCadastroDeCliente);
		sl_panel_3.putConstraint(SpringLayout.WEST, textField_6, 6, SpringLayout.EAST, lblNome_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, lblCadastroDeCliente);
		panel_3.add(textField_6);
		textField_6.setColumns(10);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("", null, panel_4, null);
		tabbedPane.setEnabledAt(4, false);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);
		
		JLabel lblEmpresaCadastrada = new JLabel("Empresa Cadastrada");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblEmpresaCadastrada, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.EAST, lblEmpresaCadastrada, -208, SpringLayout.EAST, panel_4);
		panel_4.add(lblEmpresaCadastrada);
		lblEmpresaCadastrada.setFont(new Font("Times new Roman", Font.BOLD, 18));
		
		JLabel lblNome_1 = new JLabel("Nome:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNome_1, 63, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNome_1, 10, SpringLayout.WEST, panel_4);
		panel_4.add(lblNome_1);
		
		JLabel lblCnpj_1 = new JLabel("CNPJ:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblCnpj_1, 29, SpringLayout.SOUTH, lblNome_1);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblCnpj_1, 10, SpringLayout.WEST, panel_4);
		panel_4.add(lblCnpj_1);
		
		textField_2 = new JTextField();
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_2, 36, SpringLayout.SOUTH, lblEmpresaCadastrada);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, lblNome_1);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_2, 223, SpringLayout.EAST, lblNome_1);
		panel_4.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_3, 25, SpringLayout.SOUTH, textField_2);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_3, 14, SpringLayout.EAST, lblCnpj_1);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_2);
		panel_4.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnRegistrar_2 = new JButton("Registrar");
		sl_panel_4.putConstraint(SpringLayout.WEST, btnRegistrar_2, 0, SpringLayout.WEST, lblNome_1);
		sl_panel_4.putConstraint(SpringLayout.SOUTH, btnRegistrar_2, -21, SpringLayout.SOUTH, panel_4);
		panel_4.add(btnRegistrar_2);
		
		JButton btnCancelar_2 = new JButton("Cancelar");
		sl_panel_4.putConstraint(SpringLayout.NORTH, btnCancelar_2, 0, SpringLayout.NORTH, btnRegistrar_2);
		sl_panel_4.putConstraint(SpringLayout.EAST, btnCancelar_2, -30, SpringLayout.EAST, panel_4);
		panel_4.add(btnCancelar_2);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		SpringLayout sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);
		
		JLabel lblListaDeFuncionrios = new JLabel("Lista de Funcionários");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblListaDeFuncionrios, 10, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblListaDeFuncionrios, -200, SpringLayout.EAST, panel_5);
		panel_5.add(lblListaDeFuncionrios);
		



		sl_panel.putConstraint(SpringLayout.NORTH, btnSair, -25, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.WEST, btnSair, 0, SpringLayout.WEST, btnCadastrarEmpresa);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSair, 0, SpringLayout.SOUTH, panel);
		panel.add(btnSair);
		
		btnCadastrarFuncionrio.setEnabled(false);
		btnCadastrarClientes.setEnabled(false);
		btnListarEmpresa.setEnabled(false);
		btnListarClientes.setEnabled(false);
		btnListarFuncionrios.setEnabled(false);
		

		

		
	}
}
