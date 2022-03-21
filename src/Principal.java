/*
 * 2) Um sistema que comercializa materiais de construção pretende 
 * vender para dois tipos de clientes. 
 * Um deles é pessoa física (código, nome, telefone, e-mail, celular, RG, CPF ) 
 * e outra é pessoa jurídica (código, nome, telefone, e-mail, razão social, IE, CNPJ );
 */

public class Principal {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		pf.setNome("João Paulo");
		pf.setCpf("123456789-00");
		pf.setRg("123456");
		
		System.out.println(pf.getNome() + " CPF: " + pf.getCpf() + " RG: " + pf.getRg());
		
	}
	
}
