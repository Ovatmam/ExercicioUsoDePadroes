# Patch Notes
Versão 0.5
   - Instanciação de novo objeto Carro do tipo Econo, é movido a gasolina, consome 20 Km/lt, e o tanque tem capacidade para 55 litros. O consumo deste quando novo é de 20 Km/litro, porém este consumo reduz 1 Km/litro a cada 5000 Km até que se estabiliza em 10 Km/litro.
   - A função "Percorre" da classe Motor agora troca desgasta conforme a distância percorrida, até se estabilizar em 10 Km/lt.


Versão 0.4
   - Instanciação de novo objeto Carro do tipo SUV, é FLEX, consome 8 Km/lt na gasolina e 6 Km/lt no etanol, e o tanque tem capacidade para 65 litros.
   - A classe Carro agora tem sobrecarga de construtor, para quando um Carro Flex possuir consumos diferentes entre gasolina e etanol.
   - A função "Abastece" da classe Carro agora troca o combustível ativo do motor.
   - O atributo "consumo" da classe Motor foi alterado para um vetor de inteiros "consumos" para acomodar motores Flex.
   - A classe Motor agora tem sobrecarga de construtor, para quando um Carro Flex possuir consumos diferentes entre gasolina e etanol.
   - A função "getConsumo" da classe Motor foi alterada para retornar o consumo baseado no ultimo tipo de combustível abastecido.
   - A função "combustivelNecessario" da classe Motor foi alterada para retornar o consumo baseado no ultimo tipo de combustível abastecido.
   - A função "combustivelNecessario" da classe Motor foi alterada para retornar um double.
   - A classe Motor agora tem uma função "combustivelAtivo" que define qual consumo usar.
   - A função "toString" da classe Motor foi alterada para exibir as informações de um Carro Flex.
   - O programa agora imprime o "toString" de todos os objetos Carro criados.

Versão 0.3
   - Instanciação de novo objeto Carro do tipo SUV, é movido a gasolina, preparado para ser FLEX, consome 8 Km/lt e o tanque tem capacidade para 55 litros.

Versão 0.2
   - Criação de novo tipo de combustível Diesel.
   - Instanciação de novo modelo de carro tipo utilitário, consome 5 Km/lt e o tanque tem capacidade para 70 litros.

Versão 0.1
   -  Instanciação de novo objeto Carro do tipo esportivo, é movido a gasolina, consome 6 Km/lt e o tanque tem capacidade para 45 litros.
