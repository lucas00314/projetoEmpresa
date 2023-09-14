public class Diretor extends Funcionario {
    private String areaResponsavel;

    public Diretor(String nome, double salario, String areaResponsavel) {
        super(nome, salario);
        this.areaResponsavel = areaResponsavel;
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está supervisionando a área " + areaResponsavel);
    }

    public String getAreaResponsavel() {
        return areaResponsavel;
    }

    public void setAreaResponsavel(String areaResponsavel) {
        this.areaResponsavel = areaResponsavel;
    }
}
