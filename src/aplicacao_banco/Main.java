package aplicacao_banco;

import java.sql.SQLException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws SQLException {		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("覧覧覧覧覧覧覧覧覧覧覧覧覧覧 SISTEMA +HOSPITAL 覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧");
		System.out.println("| - Digite o n�mero da consulta desejada e em seguida pressione enter         |");
		System.out.println("|	                                                                          |");
		System.out.println("| (1) - Exibir o nome e id_registro de todos os m馘icos que est縊 no hospital |");
		System.out.println("|       e que possuem a especialidade de Cl�nico Geral.                       |");
		System.out.println("| (2) - Listar o n�mero de prontu疵io e nome de todos os pacientes que possuem|");
		System.out.println("|       um acompanhante associado.                                            |");
		System.out.println("| (3) - Listar os nomes, id_registro e especialidades dos m馘icos que possuem |");
		System.out.println("|       registro CRM (Conselho Regional de Medicina) ativo.                   |");
		System.out.println("| (4) - Exibir o nome de todos os pacientes cadastrados que possuem letra     |");
		System.out.println("|       inicial do primeiro nome a vogal 'A'.                                 |");
		System.out.println("| (5) - Apresentar o valor m痊imo e o m�nimo dos sal疵ios dos m馘icos que pos-|");
		System.out.println("|       suem CRM ativo, onde os m馘icos est縊 agrupados por especialidade.    |");
		System.out.println("| (6) - Listar o nome de todos os pacientes que t麥 consultas marcadas com o  |");
		System.out.println("|       Cl�nico Geral.                                                        |");
		System.out.println("| (7) - Exibir todos os medicamentos prescritos pelos m馘icos que realizaram  |");
		System.out.println("|       exames com o diagn�stico positivo.                                    |");
		System.out.println("| (8) - Apresentar a quantidade de m馘icos por especialidade, exceto os que   |");
		System.out.println("|       possuem especialidade gastrointestinal.                               |");
		System.out.println("| (9) - Exibir os n�meros de prontu疵ios dos pacientes que n縊 foram cadastra-|");
		System.out.println("|       dos no ano de 2015.                                                   |");
		System.out.println("| (10) - Listar o nome, sobrenome e especialidade de todos os m馘icos que     |");
		System.out.println("|        possuem sal疵io superior ou igual a m馘ia salario dos m馘icos no     |");
		System.out.println("|        hospital, onde os mesmos est縊 agrupados por especialidade e         |");
		System.out.println("|        ordenados por ordem crescente de sal疵io.                            |");
		System.out.println("|                                                                             |");
		System.out.println("|          -  Para fechar o programa digite 0 e pressione enter -             |");
		System.out.println(" N�mero da consulta: ");
		int opcao= entrada.nextInt();
		System.out.println(" 覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧覧�");
	
	}

}
