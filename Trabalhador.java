/*
Crie uma classe trabalhador, com os atributos: nome, idade, salario, salario atual, horas trabalhadas.

O método aumento salario, e implemente um aumento de 5 % se o funcionário ganhar ate 1500,00.
se ganhar ate 2500,00 aumente mais 2 %. Mostre na classe principal os dados do trabalhador,
a quantidade de horas trabalhadas no mês, seu salario com aumento e seu antigo salario, método ToString;
 */



public class Trabalhador {
    private String nome;
    private int idade;
    private Double salario;
    private Double salario_atual;
    private int horas_trabalhadas;

    public Trabalhador(String nome, int idade, Double salario, int horas_trabalhadas) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.salario_atual = salario;
        this.horas_trabalhadas = horas_trabalhadas;
    }

    @Override
    public String toString() {
        return "Trabalhador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                ", salario_atual=" + salario_atual +
                ", horas_trabalhadas=" + horas_trabalhadas +
                '}';
    }

    public void AumentoSalarial(){
        if(this.salario <= 1500.0){
            this.salario_atual = this.salario + (this.salario*0.05);
        }else if(this.salario <= 2500.0){
            this.salario_atual = this.salario + (this.salario*0.02);
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public Double getSalario_atual() {
        return salario_atual;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void setSalario_atual(Double salario_atual) {
        this.salario_atual = salario_atual;
    }

    public void setHoras_trabalhadas(int horas_trabalhadas) {
        this.horas_trabalhadas = horas_trabalhadas;
    }
}
