package Animais;

public class Cachorro {

    // ATRIBUTOS
   private String nome;
    private String cor;
    private int altura;
    private double peso;
    private String estadoDeEspirito;
    private int tamanhoDoRabo;

    // Area CONSTRUTORES
    // CONSTRUTOR PADRÃO - Logo ABAIXO ele nao recebe argumento nenhum
    public Cachorro(){}

    // CONSTRUTORES ADCIONADOS - São criados para atender alguma demanda
    public Cachorro(String nome, String cor, int altura, double peso, String estadoDeEspirito, int tamanhoDoRabo) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    // METODOS
    // O método getter abaixo serve como validação e segurança para que os programadores definam
    // quem pode acessar o conteudo retornado
    // Get = obter
    public String getNome(){
        return this.nome;
    }

    //Já o método setter, precisa receber o parametro que ele está esperando dentro do ( )
    public void setNome(String nome){
        this.nome = nome; //Nesta linha se passa o "nome" que o this.nome ta recebendo da aplicação para o atributo " nome " pertecente a classe cachorro
        // aonde o this.nome referencia o atributo da classe e o nome apóis o = é o nome que ira ser adicionado ao " this.nome"
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }
   // NIGUEM SETTA o estado do animal.. Excliuido o treco de código
//    public void setEstadoDeEspirito(String estadoDeEspirito) {
//        this.estadoDeEspirito = estadoDeEspirito;
//    }

    public void latir(){
        System.out.println("AU AU");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        // enum - pesquisar
        // O SWITCH FUNCIONA COM STRING, INT E com ENUM - ESTE ULTIMO PESQUISAR
        switch (acao){
            case "carinho": this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!": this.estadoDeEspirito = "bravo"; break;
            default: this.estadoDeEspirito = "Neutro"; break;
            case "pisar na patinha": this.estadoDeEspirito = "triste"; break;
        }


        return this.estadoDeEspirito;
    }
}
