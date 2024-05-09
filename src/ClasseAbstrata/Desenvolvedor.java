package ClasseAbstrata;

public class Desenvolvedor extends Funcionario implements Trabalhavel{

    private String tecDomina;

    

    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String tecDomina) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.tecDomina = tecDomina;
    }

    public String getTecDomina() {
        return tecDomina;
    }
    public void setTecDomina(String tecDomina) {
        this.tecDomina = tecDomina;
    }


    @Override
    public float calcularSalario() {
        return (getHorasTrabalhadas() * getValorHora());        
    }

    @Override
    public String toString() {
        
        return super.toString() + 
        "\nCargo: Desenvolvedor" +
        "\nTecnologia que domina: " + tecDomina +
        "\nSalario: R$:" + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return "O desenvolvedor " + getNome() + " está trabalhando...";
    }
    @Override
    public String relatarProgresso() {
        return"O desenvolvedor " + getNome() + " está finalizando o projeto.";
    }
}
