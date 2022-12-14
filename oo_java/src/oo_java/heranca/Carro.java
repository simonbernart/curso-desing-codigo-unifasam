package oo_java.heranca;

public class Carro extends Veiculo {
    public boolean ligado;	

		public Carro() {
			ligado = false;
		}

	    public void ligar() {
			ligado = true;
	        System.out.println("O veículo ligou!");
	    }

	    public void desligar() {
			ligado = false;
	        System.out.println("O veículo desligou!");
	    }
		
		public void acelerar() {
			if (!ligado){
				try {
					throw new Exception("O carro não pode ser acelerado, pois ele está desligado.");
				} catch (Exception e) {
					
					e.printStackTrace();
				} // Erro: o carro está desligado!
			}
			System.out.println("O carro foi acelerado");
		}
		
		public boolean estaLigado() {
			return ligado;
		}
    
}
