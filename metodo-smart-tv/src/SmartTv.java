public class SmartTv {
    boolean ligada = false;
    int volume = 10;
    int canal = 1;

    //Métodos que ligam e desligam a TV
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    //Método para aumentar e diminuir o volume da TV
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;
    }

    //Método avançar ou voltar canal
    public void avancarCanal(){
        canal++;
    }
    public void voltarCanal(){
        canal--;
    }

    //Método para mudar canal direto
    public void mudarCanal(int novoCanal){
        canal=novoCanal;
    }
}
