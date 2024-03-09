import java.util.Scanner;

public class Siga {
    public static void main(String[] args) {
        //1210922311021
        Scanner scanner = new Scanner(System.in);
        
        //String nome = new String();
        long ra = 0;
        int qtdAds = 0, qtdInfo = 0, qtdAgro = 0, qtdMulher = 0, maiorIdade = 0, menorIdade = 200, qtdAgroSexto = 0;
        String nomePessoaMaisVelha = null, cursoPessoaMaisNova = null;

        do {
            System.out.println("Insira o RA (0 para sair): ");
            ra = scanner.nextLong();

            if(ra == 0) {
                continue;
            }
            
            System.out.println("Nome: ");
            String nome = scanner.next();
 
            System.out.println("Idade: ");
            int idade = scanner.nextInt();

            //definir Maior idade
            if(idade > maiorIdade) {
                maiorIdade = idade;
                nomePessoaMaisVelha = nome;
            }

            System.out.println("Sexo: ");
            String sexo = scanner.next();

            //Quantidade de mulheres
            if(sexo.equalsIgnoreCase("F")) {
                qtdMulher += 1;
            }

            scanner.nextLine();
            
            System.out.println("Curso [ADS, AGRO, INFO]");
            String curso = scanner.nextLine();
            
            System.out.println("Período: ");
            int periodo = scanner.nextInt();

            if(curso.equalsIgnoreCase("ADS")) {
                qtdAds++;
                //alunosADS += "RA: " + ra + ", Nome: " +nome+ ", Idade: "+ idade+", Sexo: "+ sexo+", Periodo: "+ periodo+" | ";

            } else if(curso.equalsIgnoreCase("AGRO")) {
                qtdAgro++;
                //alunosAgro += "RA: " + ra + ", Nome: " +nome+ ", Idade: "+ idade+", Sexo: "+ sexo+", Periodo: "+ periodo+" | ";
                
            } else if(curso.equalsIgnoreCase("INFO")) {
                qtdInfo++;
                //alunosInfo += "RA: " + ra + ", Nome: " +nome+ ", Idade: "+ idade+", Sexo: "+ sexo+", Periodo: "+ periodo+" | ";
            }

            //Quantos são do Agro e estão no 6o
            if(curso.equalsIgnoreCase("AGRO") && periodo == 6) {
                qtdAgroSexto++;
            }

            //definir Menor idade
            if(idade < menorIdade) {
                menorIdade = idade;
                cursoPessoaMaisNova = curso;
                
            }

        } while (ra != 0);

        System.out.println("---Strings---");
        System.out.println("Alunos do ADS: "+ qtdAds);
        System.out.println("Alunos do INFO: "+ qtdInfo);
        System.out.println("Alunos do AGRO: "+ qtdAgro);

        System.out.println("A quantidade de pessoas do sexo Feminino é: "+qtdMulher);
        System.out.println("A pessoa mais velha possui "+maiorIdade+" anos, e se chama "+nomePessoaMaisVelha);

        System.out.println("O curso da pessoa mais nova é "+ cursoPessoaMaisNova.toUpperCase() +", e sua idade é "+menorIdade);

        System.out.println(qtdAgroSexto+" pessoas estão no 6o Período.");
        
        scanner.close();
    }
}
