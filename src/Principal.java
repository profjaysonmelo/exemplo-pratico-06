/*
 * 2) Um sistema que comercializa materiais de constru��o pretende 
 * vender para dois tipos de clientes. 
 * Um deles � pessoa f�sica (c�digo, nome, telefone, e-mail, celular, RG, CPF ) 
 * e outra � pessoa jur�dica (c�digo, nome, telefone, e-mail, raz�o social, IE, CNPJ );
 */

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("Jo�o Paulo");
		pf.setCpf("123456789-00");
		pf.setRg("123456");
		
		System.out.println(pf.getNome() + " CPF: " + pf.getCpf() + " RG: " + pf.getRg());
		
	}
	
}
