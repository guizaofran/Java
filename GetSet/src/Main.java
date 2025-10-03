
public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João",34,176);
        Conta conta = new Conta();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        System.out.println(conta.getSaldo());
        conta.depositar(314.15);
        System.out.println(conta.getSaldo());
    }
}