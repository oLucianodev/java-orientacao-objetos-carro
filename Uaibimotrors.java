public class Uaibimotrors {
	public static void main(String[] args) {
		Carro c1, c2;
        c1 = new Carro("porsche","Cayenne",2022,"branca",0,2200000);
        c2 = new Carro("chevrolet","Corsa",1998,"cinza",250000,8000);
//		c1 = new Carro();
//      c2 = new Carro();
		
//		c1.setMarca  ("porsche");
//		c1.setModelo  ("Cayenne");
//		c1.setAno (2022);
//		c1.setKm (0);
//		c1.setCor ("branca");
//		c1.setPreco (2200000);
//		
//		c2.setMarca ("chevrolet");
//		c2.setModelo ("Corsa");
//		c2.setAno (1998);
//		c2.setKm (250000);
//		c2.setCor ("cinza");
//		c2.setPreco (8000);
		
		c1.exibirAnuncio();
		c1.simularSeguro(0);
		c2.exibirAnuncio();
		c2.simularSeguro(1);
		
		System.out.println("-calculando IPVA dos veiculos-");
		double ipvac1 = c1.calcularIPVA();
		double ipvac2 = c2.calcularIPVA();
		if (ipvac1 == 0) {
			System.out.println("veiculo isento");
		}
		else {
			System.out.println("valor do ipva = "+ipvac1);
		}
		if (ipvac2 == 0) {
			System.out.println("veiculo isento");
		}
		else {
			System.out.println("valor do ipva = "+ipvac2);
		}
//		System.out.println("carro: ");
//		System.out.println(c1.marca);
//		System.out.println(c1.modelo );
//		System.out.println(c1.ano);
//		System.out.println(c1.km);
//		System.out.println(c1.cor);
//		System.out.println(c1.preco);
//		 
//		System.out.println("carro: ");
//		System.out.println(c2.marca);
//		System.out.println(c2.modelo );
//		System.out.println(c2.ano);
//		System.out.println(c2.km);
//		System.out.println(c2.cor);
//		System.out.println(c2.preco);
	
		
		
		
	}

}