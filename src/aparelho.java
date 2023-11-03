interface aparelhoTelefonico {

    public void ligar();
    public Boolean redeMovelStatus();
    public void atender();
    public void correioVoz();
    
}

public class aparelho implements aparelhoTelefonico{

    public Boolean status;
    public String mensagemVoz; 

    public void ligar(){

    };

    public Boolean redeMovelStatus(){


        return this.status;

    };

    public void atender(){

    };

    public void correioVoz(){

    };
    
}
