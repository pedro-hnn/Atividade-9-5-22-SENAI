/*
Crie uma classe Jogo com os atributos,
time da casa, time visitante, placar do primeiro tempo, placar do segundo tempo,
Crie o metodo placar final, recebendo o valor do primeiro tempo e do segundo tempo,
método ToString;
 */

public class Jogo {
    private String time_casa;
    private String time_visitante;
    private int gols_casa_primeiro;
    private int gols_visita_primeiro;
    private int gols_casa_segundo;
    private int gols_visita_segundo;

    public Jogo(String time_casa, String time_visitante, int gols_casa_primeiro, int gols_visita_primeiro, int gols_casa_segundo, int gols_visita_segundo) {
        this.time_casa = time_casa;
        this.time_visitante = time_visitante;
        this.gols_casa_primeiro = gols_casa_primeiro;
        this.gols_visita_primeiro = gols_visita_primeiro;
        this.gols_casa_segundo = gols_casa_segundo;
        this.gols_visita_segundo = gols_visita_segundo;
    }

    public String PlacarFinal(){
        int gols_casa = this.gols_casa_primeiro + this.gols_casa_segundo;
        int gols_visita = this.gols_visita_primeiro + this.gols_visita_segundo;
        return this.time_casa +"\t | \t"+ this.time_visitante+"\n"+
                gols_casa+"\t X \t"+gols_visita;
    }

    @Override
    public String toString() {
        return "Jogo{" +
                "time_casa='" + time_casa + '\'' +
                ", time_visitante='" + time_visitante + '\'' +
                ", gols_casa_primeiro=" + gols_casa_primeiro +
                ", gols_visita_primeiro=" + gols_visita_primeiro +
                ", gols_casa_segundo=" + gols_casa_segundo +
                ", gols_visita_segundo=" + gols_visita_segundo +
                '}';
    }

    public void setTime_casa(String time_casa) {
        this.time_casa = time_casa;
    }

    public void setTime_visitante(String time_visitante) {
        this.time_visitante = time_visitante;
    }

    public void setGols_casa_primeiro(int gols_casa_primeiro) {
        this.gols_casa_primeiro = gols_casa_primeiro;
    }

    public void setGols_visita_primeiro(int gols_visita_primeiro) {
        this.gols_visita_primeiro = gols_visita_primeiro;
    }

    public void setGols_casa_segundo(int gols_casa_segundo) {
        this.gols_casa_segundo = gols_casa_segundo;
    }

    public void setGols_visita_segundo(int gols_visita_segundo) {
        this.gols_visita_segundo = gols_visita_segundo;
    }
}
