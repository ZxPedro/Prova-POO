package com.suam.av1;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import javax.swing.table.DefaultTableModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import java.awt.Color;

public class ViewMenu {

	private JFrame frmCadastro;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTable tableCliente;
	private JTable tableFunc;

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
		frmCadastro.getContentPane().setBackground(Color.WHITE);
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setSize(800, 470);
		frmCadastro.setResizable(false);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCadastro.setLocationRelativeTo(null);

		frmCadastro.setFont(new Font("Arial", Font.PLAIN, 12));
		frmCadastro.getContentPane().setLayout(null);

		ArrayList<Funcionario> listafunc = new ArrayList<Funcionario>();
		ArrayList<Cliente> listacliente = new ArrayList<Cliente>();

		JPanel panel = new JPanel();
		panel.setBackground(Color.decode("#fffffe"));
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
		btnCadastrarEmpresa.setForeground(Color.WHITE);
		btnCadastrarEmpresa.setBackground(Color.decode("#6246ea"));
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarEmpresa, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnCadastrarEmpresa, 206, SpringLayout.WEST, panel);
		btnCadastrarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(1);

			}
		});

		JButton btnSair = new JButton("Sair");
		sl_panel.putConstraint(SpringLayout.WEST, btnSair, 10, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnSair, -122, SpringLayout.SOUTH, panel);
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmed = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?",
						"Confirmação de saída", JOptionPane.YES_NO_OPTION);
				if (confirmed == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});
		panel.add(btnCadastrarEmpresa);

		JButton btnCadastrarFuncionrio = new JButton("Cadastrar Funcionário");
		btnCadastrarFuncionrio.setForeground(Color.WHITE);
		btnCadastrarFuncionrio.setBackground(Color.decode("#6246ea"));
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCadastrarEmpresa, -26, SpringLayout.NORTH,
				btnCadastrarFuncionrio);
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarFuncionrio, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnCadastrarFuncionrio, -10, SpringLayout.EAST, panel);
		btnCadastrarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(2);
			}
		});
		panel.add(btnCadastrarFuncionrio);

		JButton btnCadastrarClientes = new JButton("Cadastrar Clientes");
		btnCadastrarClientes.setForeground(Color.WHITE);
		btnCadastrarClientes.setBackground(Color.decode("#6246ea"));
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCadastrarFuncionrio, -26, SpringLayout.NORTH,
				btnCadastrarClientes);
		sl_panel.putConstraint(SpringLayout.WEST, btnCadastrarClientes, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnCadastrarClientes, 206, SpringLayout.WEST, panel);
		btnCadastrarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(3);
			}
		});
		panel.add(btnCadastrarClientes);

		JButton btnListarEmpresa = new JButton("Listar Empresa");
		btnListarEmpresa.setBackground(Color.decode("#6246ea"));
		btnListarEmpresa.setForeground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnListarEmpresa, -337, SpringLayout.SOUTH, panel);
		sl_panel.putConstraint(SpringLayout.SOUTH, btnCadastrarClientes, -26, SpringLayout.NORTH, btnListarEmpresa);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarEmpresa, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnListarEmpresa, 206, SpringLayout.WEST, panel);
		panel.add(btnListarEmpresa);

		JButton btnListarClientes = new JButton("Listar Clientes");
		btnListarClientes.setBackground(Color.decode("#6246ea"));
		btnListarClientes.setForeground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, btnListarClientes, 26, SpringLayout.SOUTH, btnListarEmpresa);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarClientes, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnListarClientes, 206, SpringLayout.WEST, panel);
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(4);
				DefaultTableModel modelo = new DefaultTableModel();
				tableCliente.setModel(modelo);
				modelo.addColumn("Nome");
				modelo.addColumn("Idade");

				tableCliente.getColumnModel().getColumn(0).setPreferredWidth(100);
				tableCliente.getColumnModel().getColumn(1).setPreferredWidth(100);

				if (listacliente.size() == 0) {
					JOptionPane.showMessageDialog(null, "Você não possui clientes cadastrados", "Erro",
							JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(3);
				} else {
					for (int i = 0; i < listacliente.size(); i++) {
						modelo.addRow(new Object[] { listacliente.get(i).nome, listacliente.get(i).idade });
					}
				}
			}
		});
		panel.add(btnListarClientes);

		JButton btnListarFuncionrios = new JButton("Listar Funcionários");
		sl_panel.putConstraint(SpringLayout.NORTH, btnSair, 88, SpringLayout.SOUTH, btnListarFuncionrios);
		btnListarFuncionrios.setBackground(Color.decode("#6246ea"));
		btnListarFuncionrios.setForeground(Color.WHITE);
		sl_panel.putConstraint(SpringLayout.NORTH, btnListarFuncionrios, 26, SpringLayout.SOUTH, btnListarClientes);
		sl_panel.putConstraint(SpringLayout.WEST, btnListarFuncionrios, 0, SpringLayout.WEST, panel);
		sl_panel.putConstraint(SpringLayout.EAST, btnListarFuncionrios, 206, SpringLayout.WEST, panel);
		btnListarFuncionrios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(6);
				DefaultTableModel modelo2 = new DefaultTableModel();
				tableFunc.setModel(modelo2);
				modelo2.addColumn("Nome");
				modelo2.addColumn("Idade");

				tableFunc.getColumnModel().getColumn(0).setPreferredWidth(100);
				tableFunc.getColumnModel().getColumn(1).setPreferredWidth(100);

				if (listafunc.size() == 0) {
					JOptionPane.showMessageDialog(null, "Você não possui funcionários cadastrados", "Erro",
							JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(2);
				} else {
					for (int i = 0; i < listafunc.size(); i++) {
						modelo2.addRow(new Object[] { listafunc.get(i).nome, listafunc.get(i).idade });
					}
				}

			}
		});
		panel.add(btnListarFuncionrios);

		JLabel lblCadastroDaEmpresa = new JLabel("Cadastro da Empresa");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCadastroDaEmpresa, 10, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCadastroDaEmpresa, 183, SpringLayout.WEST, panel_1);
		panel_1.add(lblCadastroDaEmpresa);

		lblCadastroDaEmpresa.setFont(new Font("Times new Roman", Font.BOLD, 18));

		Empresa empresa = new Empresa();

		JButton btnRegistrar = new JButton("Registrar");
		sl_panel_1.putConstraint(SpringLayout.WEST, btnRegistrar, 10, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnRegistrar, -151, SpringLayout.SOUTH, panel_1);
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if ((textField.getText().trim().isEmpty()) || (textField_1.getText().trim().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(1);
					textField.setText("");
					textField_1.setText("");
				} else {
					if(isCNPJ(textField_1.getText()) == false) {
						JOptionPane.showMessageDialog(null, "CNPJ invalido", "Erro", JOptionPane.ERROR_MESSAGE);
						textField.setText("");
						textField_1.setText("");
					}else {
						empresa.nome = textField.getText();
						empresa.cnpj = textField_1.getText();
						tabbedPane.setSelectedIndex(1);
						textField.setText("");
						textField_1.setText("");
						JOptionPane.showMessageDialog(null, "Empresa cadastrada com sucesso!");
						btnCadastrarEmpresa.setEnabled(false);
						btnCadastrarFuncionrio.setEnabled(true);
						btnCadastrarClientes.setEnabled(true);
						btnListarEmpresa.setEnabled(true);
						btnListarClientes.setEnabled(true);
						btnListarFuncionrios.setEnabled(true);
					}
				}

			}
		});
		btnListarEmpresa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(5);
				textField_2.setText("" + empresa.nome);
				textField_3.setText("" + empresa.cnpj);
				textField_8.setText("" + listacliente.size());
				textField_9.setText("" + listafunc.size());
				textField_2.setEnabled(false);
				textField_3.setEnabled(false);
				textField_8.setEnabled(false);
				textField_9.setEnabled(false);

			}
		});
		panel_1.add(btnRegistrar);

		JButton btnCancelar = new JButton("Cancelar");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnCancelar, 0, SpringLayout.NORTH, btnRegistrar);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnCancelar, -22, SpringLayout.EAST, panel_1);
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
				textField.setText("");
				textField_1.setText("");

			}
		});
		panel_1.add(btnCancelar);

		JLabel lblNome = new JLabel("Nome:");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNome, 70, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNome, 0, SpringLayout.WEST, btnRegistrar);
		panel_1.add(lblNome);

		JLabel lblCnpj = new JLabel("CNPJ:");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCnpj, 53, SpringLayout.SOUTH, lblNome);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCnpj, 0, SpringLayout.WEST, btnRegistrar);
		panel_1.add(lblCnpj);

		textField = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField, -2, SpringLayout.NORTH, lblNome);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField, 6, SpringLayout.EAST, lblNome);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField, -306, SpringLayout.EAST, panel_1);
		panel_1.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_1, -2, SpringLayout.NORTH, lblCnpj);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_1, 15, SpringLayout.EAST, lblCnpj);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_1, -325, SpringLayout.EAST, panel_1);
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
		sl_panel_2.putConstraint(SpringLayout.NORTH, lblIdade, 34, SpringLayout.SOUTH, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, lblIdade, 0, SpringLayout.WEST, lblNome_2);
		panel_2.add(lblIdade);

		// Registro de Funcionário//
		JButton btnRegistrar_1 = new JButton("Registrar");
		sl_panel_2.putConstraint(SpringLayout.WEST, btnRegistrar_1, 0, SpringLayout.WEST, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.SOUTH, btnRegistrar_1, -160, SpringLayout.SOUTH, panel_2);
		btnRegistrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if ((textField_4.getText().trim().isEmpty()) || (textField_5.getText().trim().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(2);
					textField_4.setText("");
					textField_5.setText("");
				} else {
					Funcionario func = new Funcionario();
					func.nome = textField_4.getText();
					func.idade = Integer.parseInt(textField_5.getText());
					listafunc.add(func);
					tabbedPane.setSelectedIndex(2);
					textField_4.setText("");
					textField_5.setText("");
					JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
					btnCadastrarEmpresa.setEnabled(false);
					btnCadastrarFuncionrio.setEnabled(true);
					btnCadastrarClientes.setEnabled(true);
					btnListarEmpresa.setEnabled(true);
					btnListarClientes.setEnabled(true);
					btnListarFuncionrios.setEnabled(true);

				}
			}
		});
		panel_2.add(btnRegistrar_1);

		JButton btnCancelar_1 = new JButton("Cancelar");
		sl_panel_2.putConstraint(SpringLayout.NORTH, btnCancelar_1, 0, SpringLayout.NORTH, btnRegistrar_1);
		sl_panel_2.putConstraint(SpringLayout.EAST, btnCancelar_1, -28, SpringLayout.EAST, panel_2);
		btnCancelar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
				textField_4.setText("");
				textField_5.setText("");
			}
		});
		panel_2.add(btnCancelar_1);

		textField_4 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_4, -2, SpringLayout.NORTH, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_4, 6, SpringLayout.EAST, lblNome_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_4, 252, SpringLayout.EAST, lblNome_2);
		panel_2.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		sl_panel_2.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, lblIdade);
		sl_panel_2.putConstraint(SpringLayout.WEST, textField_5, 61, SpringLayout.WEST, panel_2);
		sl_panel_2.putConstraint(SpringLayout.EAST, textField_5, -466, SpringLayout.EAST, panel_2);
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

		textField_7 = new JTextField();
		sl_panel_3.putConstraint(SpringLayout.NORTH, textField_7, 25, SpringLayout.SOUTH, textField_6);
		sl_panel_3.putConstraint(SpringLayout.WEST, textField_7, 6, SpringLayout.EAST, lblIdade_1);
		sl_panel_3.putConstraint(SpringLayout.EAST, textField_7, 99, SpringLayout.EAST, lblIdade_1);
		panel_3.add(textField_7);
		textField_7.setColumns(10);

		// Registrar Cliente//
		JButton btnRegistrar_3 = new JButton("Registrar");
		sl_panel_3.putConstraint(SpringLayout.WEST, btnRegistrar_3, 0, SpringLayout.WEST, lblNome_3);
		btnRegistrar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ((textField_6.getText().trim().isEmpty()) || (textField_7.getText().trim().isEmpty())) {
					JOptionPane.showMessageDialog(null, "Preencha todos os campos", "Erro", JOptionPane.ERROR_MESSAGE);
					tabbedPane.setSelectedIndex(3);
					textField_6.setText("");
					textField_7.setText("");
				} else {
					Cliente cli = new Cliente();
					cli.nome = textField_6.getText();
					cli.idade = Integer.parseInt(textField_7.getText());
					listacliente.add(cli);
					tabbedPane.setSelectedIndex(3);
					textField_6.setText("");
					textField_7.setText("");
					JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
					btnCadastrarEmpresa.setEnabled(false);
					btnCadastrarFuncionrio.setEnabled(true);
					btnCadastrarClientes.setEnabled(true);
					btnListarEmpresa.setEnabled(true);
					btnListarClientes.setEnabled(true);
					btnListarFuncionrios.setEnabled(true);

				}
			}
		});
		panel_3.add(btnRegistrar_3);

		JButton btnCancelar_3 = new JButton("Cancelar");
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnRegistrar_3, 0, SpringLayout.NORTH, btnCancelar_3);
		sl_panel_3.putConstraint(SpringLayout.NORTH, btnCancelar_3, 392, SpringLayout.NORTH, panel_3);
		sl_panel_3.putConstraint(SpringLayout.EAST, btnCancelar_3, -22, SpringLayout.EAST, panel_3);
		btnCancelar_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tabbedPane.setSelectedIndex(0);
				textField_6.setText("");
				textField_7.setText("");
			}
		});
		panel_3.add(btnCancelar_3);

		JPanel panel_7 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_7, null);
		SpringLayout sl_panel_7 = new SpringLayout();
		panel_7.setLayout(sl_panel_7);

		JLabel lblListaDeCliente = new JLabel("Lista de Cliente");
		sl_panel_7.putConstraint(SpringLayout.NORTH, lblListaDeCliente, 10, SpringLayout.NORTH, panel_7);
		sl_panel_7.putConstraint(SpringLayout.WEST, lblListaDeCliente, 231, SpringLayout.WEST, panel_7);
		panel_7.add(lblListaDeCliente);

		lblListaDeCliente.setFont(new Font("Times new Roman", Font.BOLD, 18));

		tableCliente = new JTable();
		sl_panel_7.putConstraint(SpringLayout.NORTH, tableCliente, 6, SpringLayout.SOUTH, lblListaDeCliente);
		sl_panel_7.putConstraint(SpringLayout.WEST, tableCliente, 10, SpringLayout.WEST, panel_7);
		sl_panel_7.putConstraint(SpringLayout.EAST, tableCliente, 550, SpringLayout.WEST, panel_7);
		tableCliente.setModel(new DefaultTableModel(new Object[][] {}, new String[] { "Nome", "Idade" }));
		sl_panel_7.putConstraint(SpringLayout.SOUTH, tableCliente, 521, SpringLayout.SOUTH, lblListaDeCliente);
		panel_7.add(tableCliente);

		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("", null, panel_4, null);
		tabbedPane.setEnabledAt(5, false);
		SpringLayout sl_panel_4 = new SpringLayout();
		panel_4.setLayout(sl_panel_4);

		JLabel lblEmpresaCadastrada = new JLabel("Empresa Cadastrada");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblEmpresaCadastrada, 10, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblEmpresaCadastrada, 183, SpringLayout.WEST, panel_4);
		panel_4.add(lblEmpresaCadastrada);
		lblEmpresaCadastrada.setFont(new Font("Times new Roman", Font.BOLD, 18));

		JLabel lblNome_1 = new JLabel("Nome:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblNome_1, 63, SpringLayout.NORTH, panel_4);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblNome_1, 10, SpringLayout.WEST, panel_4);
		panel_4.add(lblNome_1);

		JLabel lblCnpj_1 = new JLabel("CNPJ:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblCnpj_1, 29, SpringLayout.SOUTH, lblNome_1);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblCnpj_1, 0, SpringLayout.WEST, lblNome_1);
		panel_4.add(lblCnpj_1);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Dialog", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_2, 29, SpringLayout.SOUTH, lblEmpresaCadastrada);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_2, 6, SpringLayout.EAST, lblNome_1);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_2, -304, SpringLayout.EAST, panel_4);
		panel_4.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Dialog", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_3, 25, SpringLayout.SOUTH, textField_2);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField_2);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, textField_2);
		panel_4.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblClientes = new JLabel("Clientes:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblClientes, 27, SpringLayout.SOUTH, textField_3);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblClientes, 0, SpringLayout.WEST, lblNome_1);
		panel_4.add(lblClientes);

		textField_8 = new JTextField();
		textField_8.setFont(new Font("Dialog", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_8, 25, SpringLayout.SOUTH, textField_3);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_8, 12, SpringLayout.EAST, lblClientes);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_8, -409, SpringLayout.EAST, panel_4);
		panel_4.add(textField_8);
		textField_8.setColumns(10);

		JLabel lblFuncionrios = new JLabel("Funcionários:");
		sl_panel_4.putConstraint(SpringLayout.NORTH, lblFuncionrios, 25, SpringLayout.SOUTH, textField_8);
		sl_panel_4.putConstraint(SpringLayout.WEST, lblFuncionrios, 0, SpringLayout.WEST, lblNome_1);
		panel_4.add(lblFuncionrios);

		textField_9 = new JTextField();
		textField_9.setFont(new Font("Dialog", Font.BOLD, 12));
		sl_panel_4.putConstraint(SpringLayout.NORTH, textField_9, 23, SpringLayout.SOUTH, textField_8);
		sl_panel_4.putConstraint(SpringLayout.WEST, textField_9, 6, SpringLayout.EAST, lblFuncionrios);
		sl_panel_4.putConstraint(SpringLayout.EAST, textField_9, -396, SpringLayout.EAST, panel_4);
		panel_4.add(textField_9);
		textField_9.setColumns(10);

		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_5, null);
		SpringLayout sl_panel_5 = new SpringLayout();
		panel_5.setLayout(sl_panel_5);

		JLabel lblListaDeFuncionrios = new JLabel("Lista de Funcionários");
		sl_panel_5.putConstraint(SpringLayout.NORTH, lblListaDeFuncionrios, 10, SpringLayout.NORTH, panel_5);
		sl_panel_5.putConstraint(SpringLayout.EAST, lblListaDeFuncionrios, -182, SpringLayout.EAST, panel_5);
		panel_5.add(lblListaDeFuncionrios);

		lblListaDeFuncionrios.setFont(new Font("Times new Roman", Font.BOLD, 18));

		tableFunc = new JTable();
		sl_panel_5.putConstraint(SpringLayout.NORTH, tableFunc, 11, SpringLayout.SOUTH, lblListaDeFuncionrios);
		sl_panel_5.putConstraint(SpringLayout.WEST, tableFunc, 10, SpringLayout.WEST, panel_5);
		sl_panel_5.putConstraint(SpringLayout.SOUTH, tableFunc, 520, SpringLayout.SOUTH, lblListaDeFuncionrios);
		sl_panel_5.putConstraint(SpringLayout.EAST, tableFunc, 558, SpringLayout.WEST, panel_5);
		panel_5.add(tableFunc);
		panel.add(btnSair);

		btnCadastrarFuncionrio.setEnabled(false);
		btnCadastrarClientes.setEnabled(false);
		btnListarEmpresa.setEnabled(false);
		btnListarClientes.setEnabled(false);
		btnListarFuncionrios.setEnabled(false);

	}

	public static boolean isCNPJ(String CNPJ) {
		if (CNPJ.equals("00000000000000") || CNPJ.equals("11111111111111") || CNPJ.equals("22222222222222")
				|| CNPJ.equals("33333333333333") || CNPJ.equals("44444444444444") || CNPJ.equals("55555555555555")
				|| CNPJ.equals("66666666666666") || CNPJ.equals("77777777777777") || CNPJ.equals("88888888888888")
				|| CNPJ.equals("99999999999999") || (CNPJ.length() != 14))
			return (false);

		char dig13, dig14;
		int sm, i, r, num, peso;

		try {

			sm = 0;
			peso = 2;
			for (i = 11; i >= 0; i--) {

				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig13 = '0';
			else
				dig13 = (char) ((11 - r) + 48);

			sm = 0;
			peso = 2;
			for (i = 12; i >= 0; i--) {
				num = (int) (CNPJ.charAt(i) - 48);
				sm = sm + (num * peso);
				peso = peso + 1;
				if (peso == 10)
					peso = 2;
			}

			r = sm % 11;
			if ((r == 0) || (r == 1))
				dig14 = '0';
			else
				dig14 = (char) ((11 - r) + 48);

			if ((dig13 == CNPJ.charAt(12)) && (dig14 == CNPJ.charAt(13)))
				return (true);
			else
				return (false);
		} catch (InputMismatchException erro) {
			return (false);
		}
	}

}
