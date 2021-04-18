package com.suam.av1;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class ViewMenu {

	private JFrame frmCadastro;

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
		frmCadastro.setEnabled(false);
		frmCadastro.setTitle("Cadastro");
		frmCadastro.setSize(800,600);
		frmCadastro.setResizable(false);
		frmCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		SpringLayout springLayout = new SpringLayout();
		frmCadastro.getContentPane().setLayout(springLayout);
		
		JPanel panel = new JPanel();
		springLayout.putConstraint(SpringLayout.NORTH, panel, 0, SpringLayout.NORTH, frmCadastro.getContentPane());
		springLayout.putConstraint(SpringLayout.WEST, panel, 10, SpringLayout.WEST, frmCadastro.getContentPane());
		springLayout.putConstraint(SpringLayout.SOUTH, panel, 553, SpringLayout.NORTH, frmCadastro.getContentPane());
		springLayout.putConstraint(SpringLayout.EAST, panel, 226, SpringLayout.WEST, frmCadastro.getContentPane());
		frmCadastro.getContentPane().add(panel);
		SpringLayout sl_panel = new SpringLayout();
		panel.setLayout(sl_panel);
		
		JButton btnCadastrarEmpresa = new JButton("Cadastrar Empresa");

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
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int confirmed = JOptionPane.showConfirmDialog(null, "Você tem certeza que quer sair?", "Confirmação de saída", JOptionPane.YES_NO_CANCEL_OPTION);
				if (confirmed == JOptionPane.YES_OPTION)
					System.exit(0);
			}
		});


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
