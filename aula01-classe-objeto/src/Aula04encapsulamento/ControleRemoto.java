package Aula04encapsulamento;

public class ControleRemoto implements Controlador {

    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean getLigado() {
        return ligado;
    }

  private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean getTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {

    }

    @Override
    public void desliagr() {

    }

    @Override
    public void abirmenu() {

    }

    @Override
    public void fecharmenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() + 5);
        }

    }

    @Override
    public void menosvolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume() - 5);
        }

    }

    @Override
    public void ligarmudo() {
        if (this.getLigado() && this.getVolume() > 0){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarmudo() {
        if(this.getLigado() &&  this.getVolume() == 0){
            this.setVolume(50);
        }

    }

    @Override
    public void play() {
        if(this.getLigado() && ! (this.getTocando())){
            this.setTocando(true);
        }

    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            this.setTocando(false);
        }

    }



}
