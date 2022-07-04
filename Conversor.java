import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("o que você deseja converter?");
		System.out.println("digite 1 para temperatura");
		System.out.println("digite 2 para peso");
		System.out.println("digite 3 para comprimento");
		System.out.println("digite 4 para volume");
		int forma = input.nextInt();
		
		
		switch (forma) {
		case 1:
			System.out.println("qual modelo de temperatura você deseja converter");
			System.out.println("digite 1 para celsius");
			System.out.println("digite 2 para fahrenheit");
			System.out.println("digite 3 para kelvin");
			int forma1 = input.nextInt();
			
			switch (forma1) {
			case 1:
				System.out.println("você deseja converter celsius para qual temperatura?");
				System.out.println("digite 1 para fahrenheit");
				System.out.println("digite 2 para kelvin");
				int modelo = input.nextInt();
				
				switch (modelo) {
				case 1:
					System.out.println("entre com a temperatura");
					int temperatura = input.nextInt();
					System.out.println((9 * temperatura + 160 ) /5 + " graus em fahrenheit");
					break;
					
				case 2:
					System.out.println("entre com a temperatura");
					int temperatura2 = input.nextInt();
					System.out.println((temperatura2 + 273.15) + " graus em kelvin");
					break;
					
					default:
						System.out.println("comando invalido");
						break;
						
				}
				
			}
					
					switch (forma1) {
					case 2:
						System.out.println("voce deseja converter fahrenheit para qual temperatura?");
						System.out.println("digite 1 para celsius");
						System.out.println("digite 2 para kelvin");
						int forma2 = input.nextInt();
						
						switch (forma2) {
						case 1:
							System.out.println("entre com a temperatura");
							int temperatura = input.nextInt();
							System.out.println((temperatura - 32.0) * (5.0 / 9.0) + "graus em celsius");
							break;
							
						case 2:
							System.out.println("entre com a temperatura");
							int temperatura2 = input.nextInt();
							System.out.println(273.5 + (temperatura2 - 32.0) * (5.0 / 9.0) + "graus em kelvin");
							break;
							
							default:
								System.out.println("comando invalido");
								break;
					
				}
				
			}
					
					switch (forma1) {
					case 3:
						System.out.println("você deseja converter kelvin para qual temperatura?");
						System.out.println("digite 1 para celsius");
						System.out.println("digite 2 para fahrenheit");
						int forma3 = input.nextInt();
						
						switch (forma3) {
						case 1:
							System.out.println("entre com a temperatura");
							int temperatura = input.nextInt();
							System.out.println(temperatura - 273.15);
							break;
							
						case 2:
							System.out.println("entre com a temperatura");
							int temperatura2 = input.nextInt();
							System.out.println((temperatura2 - 273.15) * 1.8 + 32); //observação conta 
							break;
							
							default:
								System.out.println("comando invalido");
								break;
								
						}
						
					}
					break;
					
		case 2:
			System.out.println("qual peso você deseja converter");
			System.out.println("digite 1 para quilos");
			System.out.println("digite 2 para libras");
			System.out.println("digite 3 para onças");
			int forma2 = input.nextInt();
			
			switch (forma2) {
			case 1:
				System.out.println("você deseja converter quilos para qual tipo de peso?");
				System.out.println("digite 1 para libras");
				System.out.println("digite 2 para onças");
				int formaQuilo = input.nextInt();
				
				switch (formaQuilo) {
				case 1:
					System.out.println("entre com o peso");
					double peso = input.nextDouble();
					System.out.println("conta");
					break;
					
				case 2:
					System.out.println("entre com o peso");
					double peso2 = input.nextDouble();
					System.out.println("conta");
					break;
					
					default:
						System.out.println("comando invalido");
						break;
					
				}
				
			}
			
				
				switch (forma2) {
				case 2:
					System.out.println("você deseja converter libras para qual tipo de peso?");
					System.out.println("digite 1 para quilos");
					System.out.println("digite 2 para onças");
					int formaQuilo1 = input.nextInt();
					
					switch (formaQuilo1) {
					case 1:
						System.out.println("entre com o peso");
						double peso = input.nextDouble();
						System.out.println("conta");
						break;
						
					case 2:
						System.out.println("entre com o peso");
						double peso2 = input.nextDouble();
						System.out.println("conta");
						break;
						
						default:
							System.out.println("comando invalido");
					}
					
				}
				
				switch (forma2) {
				case 3:
					System.out.println("você deseja converter onças para qual peso?");
					System.out.println("digite 1 para quilos");
					System.out.println("digite 2 para libras");
					int formaQuilo3 = input.nextInt();
					
					switch (formaQuilo3) {
					case 1:
						System.out.println("entre com o peso");
						double peso = input.nextDouble();
						System.out.println("conta");
						break;
						
					case 2:
						System.out.println("entre com o peso");
						double peso2 = input.nextDouble();
						System.out.println("conta");
						break;
						
						default:
							System.out.println("comando invalido");
							break;
						
					}
					
				}
				break;
				
		}
		
		switch (forma) {
		case 3:
			System.out.println("qual comprimento voce deseja converter?");
			System.out.println("digite 1 para metros");
			System.out.println("digite 2 para pés");
			System.out.println("digite 3 para polegadas");
			int forma1 = input.nextInt();
			
			switch (forma1) {
			case 1:
				System.out.println("você deseja converter metros para qual tipo de metro");
				System.out.println("digite 1 para pés");
				System.out.println("digite 2 para polegadas");
				int conv = input.nextInt();
				
				switch (conv) {
				case 1:
					System.out.println("entre com o metro");
					double metro1 = input.nextDouble();
					System.out.println("conta");
					break;
					
				case 2:
					System.out.println("entre com o peso");
					double peso2 = input.nextDouble();
					System.out.println("conta");
					break;
					
					default:
						System.out.println("comando invalido");
						break;
					
				}
				
			}
			
			switch (forma) {
			case 4:
				System.out.println("qual volume você deseja converter?");
				System.out.println("digite 1 para litros");
				System.out.println("digite 2 para galão");
				System.out.println("dugite 3 para onças liquidas");
				int forma4 = input.nextInt();
				
				switch (forma4) {
				case 1:
					System.out.println("você deseja converter litros para qual tipo de volume?");
					System.out.println("digite 1 para galão");
					System.out.println("digite 2 para onças liquidas");
					int form = input.nextInt();
					
					switch (form) {
					case 1:
						System.out.println("entre com o volume");
						double volume = input.nextDouble();
						System.out.println("conta");
						break;
						
					case 2:
						System.out.println("entre com o volume");
						double volume2 = input.nextDouble();
						System.out.println("conta");
						break;
						
						default:
							System.out.println("comando invalido");
					}
					
				}
				
			}
		
		}
		
	}
	
}
