import java.util.Scanner;

public class Main {

    public static Boolean SairPrograma(){
        System.out.println("\n\nDeseja fechar o programa?\nS/s = SAIR\nQualquer outra tecla = NÃO");
        String sair = new Scanner(System.in).nextLine();
        System.out.println("\n\n");
        sair = sair.toUpperCase();
        if(sair.equals("S")){
            return true;
        }else{
            return false;
        }
    }

    public static int SelecaoTexto(){
        int selecao;
        while(true){
            try{
                System.out.println("1\t\t=>\t\tEditar Jogo\n" +
                        "2\t\t=>\t\tEditar Jogador\n" +
                        "3\t\t=>\t\tEditar Trabalhador\n" +
                        "4\t\t=>\t\tVer Placar do Jogo\n" +
                        "5\t\t=>\t\tAumentar Salário do Trabalhador\n\n");

                System.out.print("Digite sua opção: ");
                selecao = new Scanner(System.in).nextInt();

                if (selecao <= 0) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                } else if (selecao > 5) {
                    System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                    continue;
                }else{
                    break;
                }
            } catch (Exception e) {
                System.out.println("\n\nDIGITE UMA OPÇÃO VÁLIDA!\n\n");
                continue;
            }
        }
        return selecao;

    }


    public static void main(String[] args) {
        System.out.println("Atividade SENAI 9/5/2022 - Exercício 4 Orientação a Objetos - Curso: Desenvolvedor Java Vespertino\n\n");

        Boolean sair;


        String time1,time2,nome;
        int gols1,gols2,gols3,gols4,idade,cartoes,gols,horas_trabalhadas;
        Double salario,peso;

        Jogo jogo;
        Jogador jogador;
        Trabalhador trabalhador;


        while(true) {
            try {
                //Jogo
                System.out.println("\n\nCADASTRO DE JOGO\n\n");
                System.out.println("Qual é o time de casa?\n");
                time1 = new Scanner(System.in).nextLine();
                System.out.println("Qual é o time visitante?\n");
                time2 = new Scanner(System.in).nextLine();
                System.out.println("Quantos gols o time "+time1+" fez no primeiro tempo?\n");
                gols1 = new Scanner(System.in).nextInt();
                System.out.println("Quantos gols o time "+time1+" fez no segundo tempo?\n");
                gols3 = new Scanner(System.in).nextInt();
                System.out.println("Quantos gols o time "+time2+" fez no primeiro tempo?\n");
                gols2 = new Scanner(System.in).nextInt();
                System.out.println("Quantos gols o time "+time2+" fez no segundo tempo?\n");
                gols4 = new Scanner(System.in).nextInt();

                jogo = new Jogo(time1,time2,gols1,gols2,gols3,gols4);
                System.out.println("\n\n");
                System.out.println(jogo.toString());
                System.out.println("\n\n");

                //Jogador
                System.out.println("\n\nCADASTRO DE JOGADOR\n\n");
                System.out.println("Qual é o nome do jogador?\n");
                nome = new Scanner(System.in).nextLine();
                System.out.println("Quanto o jogador "+nome+" pesa?\n");
                peso = new Scanner(System.in).nextDouble();
                System.out.println("Quantos anos o jogador "+nome+" tem?\n");
                idade = new Scanner(System.in).nextInt();
                System.out.println("Quantos cartões o jogador "+nome+" já recebeu?\n");
                cartoes = new Scanner(System.in).nextInt();
                System.out.println("Quantos gols o jogador "+nome+" já fez?\n");
                gols = new Scanner(System.in).nextInt();
                System.out.println("Quanto é o salário do jogador "+nome+"?\n");
                salario = new Scanner(System.in).nextDouble();

                jogador = new Jogador(nome,peso,idade,cartoes,gols,salario);
                System.out.println("\n\n");
                System.out.println(jogador.toString());
                System.out.println("\n\n");

                //Trabalhador
                System.out.println("\n\nCADASTRO DE TRABALHADOR\n\n");
                System.out.println("Qual é o nome do trabalhador?\n");
                nome = new Scanner(System.in).nextLine();
                System.out.println("Quantos anos o trabalhador "+nome+" tem?\n");
                idade = new Scanner(System.in).nextInt();
                System.out.println("Quanto é o salário do trabalhador "+nome+"?\n");
                salario = new Scanner(System.in).nextDouble();
                System.out.println("Quantas horas trabalhadas o trabalhador "+nome+" faz?\n");
                horas_trabalhadas = new Scanner(System.in).nextInt();

                trabalhador = new Trabalhador(nome,idade,salario,horas_trabalhadas);

                System.out.println("\n\n");
                System.out.println(trabalhador.toString());
                System.out.println("\n\n");
                break;

            } catch (Exception e) {
                System.out.println("\n\nDIGITE UM VALOR VÁLIDO!\n\n");
                continue;
            }
        }

        Boolean run = true;
        while(run){
            int selecionado = SelecaoTexto();

            switch (selecionado) {
                case 1:
                    //editar jogo

                    System.out.println("Qual é o novo time de casa?\n");
                    time1 = new Scanner(System.in).nextLine();
                    System.out.println("Qual é o novo time visitante?\n");
                    time2 = new Scanner(System.in).nextLine();
                    System.out.println("Quantos gols o time "+time1+" fez no primeiro tempo?\n");
                    gols1 = new Scanner(System.in).nextInt();
                    System.out.println("Quantos gols o time "+time1+" fez no segundo tempo?\n");
                    gols3 = new Scanner(System.in).nextInt();
                    System.out.println("Quantos gols o time "+time2+" fez no primeiro tempo?\n");
                    gols2 = new Scanner(System.in).nextInt();
                    System.out.println("Quantos gols o time "+time2+" fez no segundo tempo?\n");
                    gols4 = new Scanner(System.in).nextInt();

                    jogo.setTime_casa(time1);
                    jogo.setTime_visitante(time2);
                    jogo.setGols_casa_primeiro(gols1);
                    jogo.setGols_casa_segundo(gols3);
                    jogo.setGols_visita_primeiro(gols2);
                    jogo.setGols_visita_segundo(gols4);
                    System.out.println("\n\n");
                    System.out.println(jogo.toString());
                    System.out.println("\n\n");

                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 2:
                    //editar jogador
                    System.out.println("\n\nCADASTRO DE JOGADOR\n\n");
                    System.out.println("Qual é o nome do jogador?\n");
                    nome = new Scanner(System.in).nextLine();
                    System.out.println("Quanto o jogador "+nome+" pesa?\n");
                    peso = new Scanner(System.in).nextDouble();
                    System.out.println("Quantos anos o jogador "+nome+" tem?\n");
                    idade = new Scanner(System.in).nextInt();
                    System.out.println("Quantos cartões o jogador "+nome+" já recebeu?\n");
                    cartoes = new Scanner(System.in).nextInt();
                    System.out.println("Quantos gols o jogador "+nome+" já fez?\n");
                    gols = new Scanner(System.in).nextInt();
                    System.out.println("Quanto é o salário do jogador "+nome+"?\n");
                    salario = new Scanner(System.in).nextDouble();

                    jogador.setNome(nome);
                    jogador.setPeso(peso);
                    jogador.setIdade(idade);
                    jogador.setQuant_cartoes(cartoes);
                    jogador.setQuant_gols(gols);
                    jogador.setSalario(salario);
                    System.out.println("\n\n");
                    System.out.println(jogador.toString());
                    System.out.println("\n\n");

                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 3:
                    //editar trabalhador

                    System.out.println("\n\nCADASTRO DE TRABALHADOR\n\n");
                    System.out.println("Qual é o nome do trabalhador?\n");
                    nome = new Scanner(System.in).nextLine();
                    System.out.println("Quantos anos o trabalhador "+nome+" tem?\n");
                    idade = new Scanner(System.in).nextInt();
                    System.out.println("Quanto é o salário do trabalhador "+nome+"?\n");
                    salario = new Scanner(System.in).nextDouble();
                    System.out.println("Quantas horas trabalhadas o trabalhador "+nome+" faz?\n");
                    horas_trabalhadas = new Scanner(System.in).nextInt();

                    trabalhador.setNome(nome);
                    trabalhador.setIdade(idade);
                    trabalhador.setSalario(salario);
                    trabalhador.setHoras_trabalhadas(horas_trabalhadas);
                    System.out.println("\n\n");
                    System.out.println(trabalhador.toString());
                    System.out.println("\n\n");

                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 4:
                    //ver placar do jogo
                    System.out.println("\n\n");
                    System.out.println(jogo.PlacarFinal());
                    System.out.println("\n\n");

                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }
                case 5:
                    //aumentar salário
                    trabalhador.AumentoSalarial();
                    System.out.println("Salário Base = "+trabalhador.getSalario()+"\nSalário atual = "+trabalhador.getSalario_atual()+"\n\n");

                    sair = SairPrograma();

                    if(sair){
                        run = false;
                        break;
                    }else{
                        continue;
                    }

            }


        }
    }
}