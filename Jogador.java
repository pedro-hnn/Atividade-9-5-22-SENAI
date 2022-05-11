/*
Crie uma classe jogador e os atributos:
nome, peso, idade, quantidade de cartões, quantidade de gols na temporada, e salario
e mostre os dados na classe principal, tente usar o método ToString;
 */

public class Jogador {

    private String nome;
    private Double peso;
    private int idade;
    private int quant_cartoes;
    private int quant_gols;
    private Double salario;

    public Jogador(String nome, Double peso, int idade, int quant_cartoes, int quant_gols, Double salario) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.quant_cartoes = quant_cartoes;
        this.quant_gols = quant_gols;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Jogador{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", idade=" + idade +
                ", quant_cartoes=" + quant_cartoes +
                ", quant_gols=" + quant_gols +
                ", salario=" + salario +
                '}';
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setQuant_cartoes(int quant_cartoes) {
        this.quant_cartoes = quant_cartoes;
    }

    public void setQuant_gols(int quant_gols) {
        this.quant_gols = quant_gols;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
