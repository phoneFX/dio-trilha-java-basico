package iphoneFuncoes;


interface ReprodutorMusical {
	
	void iniciar();
	void pausar();
}

interface NavegadorInternet{
	
	void novaPagina(String url);
	void apgarPagina(String url);
	void exibirPagina(String url);
	
}

interface Telefone{
	
	void ligar(String numero);
	void atender();
	void desligar();
	
}


public class Funcoes implements ReprodutorMusical, NavegadorInternet, Telefone {
	
	@Override
	public void iniciar() {System.out.println("Tocando música...");}
	
	@Override
	public void pausar() {System.out.println("Música pausada...");}
	
	
	
	@Override
	public void novaPagina(String url) {System.out.println("Adicionando nova página: " + url + "...");}
	
	@Override
	public void apgarPagina(String url) {System.out.println("Apagando página: " + url + "...");}
	
	@Override
	public void exibirPagina(String url) {System.out.println("Exibindo página: "+ url + "...");}
	
	
	
	@Override
	public void ligar(String numero) {System.out.println("Ligando para " + numero + "...");}
	
	@Override
	public void atender(){System.out.println("Atendendo...");}
	
	@Override
	public void desligar(){System.out.println("Desligando...");}
	

}
