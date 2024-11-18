

public class Guerreiro implements Personagem {
    private String nome;
    private int forca;
    private int vida;
    private int mana;
    private int agilidade;

    public Guerreiro(String nome) {
        this.nome = nome;
        this.forca = Dados.rolarVarios(3, 6);
        this.vida = Dados.rolarVarios(4, 6);
        this.mana = Dados.rolarVarios(1, 6);
        this.agilidade = Dados.rolarVarios(2, 6);
    }

    @Override
    public void atacar() {
        System.out.println(nome + " ataca com força de " + forca + "!");
    }

    @Override
    public void usarMagia() {
        System.out.println(nome + " não tem magias!");
    }

    @Override
    public void usarItem() {
        System.out.println(nome + " usa um item!");
    }

    @Override
    public void fugir() {
        System.out.println(nome + " tenta fugir com agilidade " + agilidade + ".");
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }
}

