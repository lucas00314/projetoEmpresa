import java.util.Scanner;

public class EmpresaMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = scanner.nextDouble();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario(nomeFuncionario, salarioFuncionario);

        System.out.print("Digite o nome do gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Digite o salário do gerente: ");
        double salarioGerente = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Digite o departamento do gerente: ");
        String departamentoGerente = scanner.nextLine();

        Gerente gerente = new Gerente(nomeGerente, salarioGerente, departamentoGerente);

        System.out.print("Digite o nome do diretor: ");
        String nomeDiretor = scanner.nextLine();
        System.out.print("Digite o salário do diretor: ");
        double salarioDiretor = scanner.nextDouble();
        System.out.print("Digite a área responsável do diretor: ");
        String areaResponsavelDiretor = scanner.nextLine();

        Diretor diretor = new Diretor(nomeDiretor, salarioDiretor, areaResponsavelDiretor);

        System.out.println("\nInformações do Funcionário:");
        funcionario.trabalhar();
        funcionario.receberSalario();

        System.out.println("\nInformações do Gerente:");
        gerente.trabalhar();
        gerente.receberSalario();

        System.out.println("\nInformações do Diretor:");
        diretor.trabalhar();
        diretor.receberSalario();

        scanner.close();
    }
}
