public class Aluno {
   String nome;
   int idade;
   String curso;

   public Aluno(String nome,int idade, String curso){
       this.nome=nome;
       this.idade=idade;
       this.curso=curso;
   }

   public void exibirDados(){
       System.out.println("Nome: "+nome);
       System.out.println("Nome: "+idade);
       System.out.println("Nome: "+curso);
       System.out.print("\n");
   }
}
