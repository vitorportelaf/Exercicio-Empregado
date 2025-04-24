public class Main {
    public static void main(String[] args) {
        Empregado [] empregado = new Empregado[3];
        empregado[0] = new EmpregadoComissionado();
        empregado[1] = new EmpregadoHorista();
        empregado[2] = new EmpregadoComissionado();

        for(Empregado e : empregado){
            System.out.println("Salário: "+e.calcularSalario());
        }
    }
}
