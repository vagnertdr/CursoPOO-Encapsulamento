import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Forma de se criar o objeto e instanciar a classe cachorro
        /*
        Cachorro cachorro1;
        cachorro1 = new Cachorro();
         */

        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Puppy", "Marrom", 25, 5.5, "nada", 5);

        // O Código abaixo nao é mais necessario pois acima ja esta sendo usado o construtor
//        cachorro1.setNome("Puppy"); // passando o nome para a classe encapsulada
//        cachorro1.setCor("Marrom");
//        cachorro1.setAltura(25);
//        cachorro1.setPeso(5.5);
//        cachorro1.setTamanhoDoRabo(5);

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("pisar na patinha"));
        System.out.println("O cachorro está " + cachorro1.interagir(""));
    }
}