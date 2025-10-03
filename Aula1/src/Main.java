public class Main {
    public static void main(String[] args) {
        Heroi heroi = new Heroi("Batman",20,2,10);
        Heroi heroi2 = new Heroi("Superman",11,19,20);
        Vilao vilao = new Vilao("DarkSide",9,20,20);

        System.out.println("---------Herói----------");
        heroi.mostrarStatus();
        System.out.println("\n---------Herói 2----------");
        heroi2.mostrarStatus();

        System.out.println("\n---------Vilão----------");
        vilao.mostrarStatus();

        System.out.println("\n---------Ações----------");
        heroi2.atacar("DarkSide","Visão de Calor");
        vilao.atacar("Superman","Super Força");
        heroi.atacar("DarkSide","Morcego Arremessável");

    }
}