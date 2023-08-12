public class Motor {

    private TipoCombustivel tipoMotor;
    private TipoCombustivel ultimoAbastecimento;
    private int[] consumos; // em quilometros por unidade. Ex: Km/Lt
    private int quilometragem;

    public Motor(TipoCombustivel tipoMotor, int consumo) {
        this.tipoMotor = tipoMotor;
        this.ultimoAbastecimento = tipoMotor;
        this.consumos = new int[2];
        this.consumos[0] = consumo;
        this.consumos[1] = -1;
    }

    public Motor(TipoCombustivel tipoMotor, int consumo_gasolina, int consumo_etanol) {
        this.tipoMotor = tipoMotor;
        this.ultimoAbastecimento = tipoMotor;
        this.consumos = new int[2];
        this.consumos[0] = consumo_gasolina;
        this.consumos[1] = consumo_etanol;
    }

    public int getConsumo() {
        if(ultimoAbastecimento == TipoCombustivel.GASOLINA || ultimoAbastecimento == TipoCombustivel.DIESEL)
            return consumos[0];
        else
            return consumos[1];
    }

    public TipoCombustivel getTipoMotor(){
        return this.tipoMotor;
    }

    public int getQuilometragem(){
        return this.quilometragem;
    }

    public double combustivelNecessario(int distancia) {
        if(ultimoAbastecimento == TipoCombustivel.GASOLINA || ultimoAbastecimento == TipoCombustivel.DIESEL)
            return (double)distancia / (double)consumos[0];
        else
            return (double)distancia / (double)consumos[1];
    }

    public void percorre(int distancia) {
        quilometragem += distancia;
        if(consumos[0] > 10) {
            int desgaste = quilometragem / 5000;
            consumos[0] = 20 - desgaste;
        }
    }

    public void combustivelAtivo(TipoCombustivel combustivelAbastecido) {
        this.ultimoAbastecimento = combustivelAbastecido;
    }

    @Override
    public String toString() {
        if(tipoMotor == TipoCombustivel.FLEX)
            return "Motor [consumo gas=" + consumos[0] + ", consumo eta=" + consumos[1] + ", combustível ativo=" + ultimoAbastecimento + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
        else
            return "Motor [consumo=" + consumos[0] + ", quilometragem=" + quilometragem + ", tipoMotor=" + tipoMotor + "]";
    }
}