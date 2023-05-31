import Animais.Cachorro;

public class Main {
    public static void main(String[] args) {

        //Forma de se criar o objeto e instanciar a classe cachorro
        /*
        Cachorro cachorro1;
        cachorro1 = new Cachorro();
         */

        // Forma resumida e comumente utilizada abaixo
        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Puppy";
        cachorro1.cor = "Marron";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        System.out.println(cachorro1);
        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro está " + cachorro1.interagir(""));
    }
}