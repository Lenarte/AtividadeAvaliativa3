package ClasseAbstrata;

public abstract class Funcionario{
    
    private String nome;
    private int matricula;
    private float valorHora;
    private int horasTrabalhadas;

    
    public Funcionario(){
    }
    public Funcionario(String nome, int matricula, float valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getValorHora() {
        return valorHora;
    }
    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public abstract float calcularSalario();

    @Override
    public String toString() {
        return "\nNome: " + nome +
        "\nMatricula: " + matricula;
    }


}
