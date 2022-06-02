package br.com.agenda.aplicacao;

import java.util.Date;

import javax.swing.JOptionPane;

import br.com.agenda.dao.ContatoDAO;
import br.com.agenda.model.Contato;

public class Main {

	public static void main(String[] args) {

		ContatoDAO contatoDao = new ContatoDAO();
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Selecione o que deseja fazer: "
																+ "\n[1] - Inserir "
																+ "\n[2] - Ver os dados "
																+ "\n[3] - Atualizar "
																+ "\n[4] - Deletar"));
		
		if (num == 1) {
			
			//Caixa de texto para inserir o valor que deseja enviar para o banco
			String Nome = JOptionPane.showInputDialog("digite um nome ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade "));

			Contato contato = new Contato();
			contato.setNome(Nome);
			contato.setIdade(idade);
			contato.setDataCadastro(new Date());
			
			
			contatoDao.save(contato);
		}else if (num == 2) {
			//visualizaçao do registros em banco de dados 
			
			for(Contato c : contatoDao.getContatos()) {
				System.out.println("Contato :"+ c.getNome());
				//JOptionPane.showMessageDialog(null, "Contato :"+ c.getNome());
			}
		}else if(num == 3){
			String Nome = JOptionPane.showInputDialog("Digite para atualizado ");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade atualizada "));
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id que deseja alterar "));
			
			//atualizar o contato
			Contato contato = new Contato();
			contato.setNome(Nome);
			contato.setIdade(idade);
			contato.setDataCadastro(new Date());
			contato.setId(id);
			
			contatoDao.update(contato);
			
		}else if (num == 4) {
			
			int id = Integer.parseInt(JOptionPane.showInputDialog("Digite o id que deseja deletar: "));
			//Deletar o contato via id
			contatoDao.deleteById(id);
			
		}else {
			JOptionPane.showMessageDialog(null, "Nenhum item foi selecionado, até a proxima");
		}
		
		
	
		
		
	}

}
