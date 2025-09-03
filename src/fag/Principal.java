package fag;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Cria a branch com seu nome
		System.out.println("git branch -M patrick-issler");
		//verifica os arquivos alterados
		System.out.println("git status");
		//adicionar os arquivos alterados
		System.out.println("git add .");
		//verificar se ficou verde para adicionar 
		System.out.println("git status - verificar se ficou tudo verde");
		//realiza o commit para salvar os arquivos
		System.out.println("git commit -m 'feature: trabalho concluido'");
		//Envia a sua branch para o git com as alterações
		System.out.println("git push -u origin patrick-issler");

		
	}
	

}
