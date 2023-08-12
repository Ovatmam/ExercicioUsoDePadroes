public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitario", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        Carro suv_flex = new Carro("SUV Flex", TipoCombustivel.FLEX, 8, 6, 65);
        Carro econo = new Carro("Econo", TipoCombustivel.GASOLINA, 20, 55);
        
        System.out.println("Tipos de veiculos:");
        System.out.println(basico.toString());
        System.out.println(esportivo.toString());
        System.out.println(utilitario.toString());
        System.out.println(suv.toString());
        System.out.println(suv_flex.toString());  
        System.out.println(econo.toString());    
    }
}
