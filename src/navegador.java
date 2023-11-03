interface navegadorInternet {

    public void pesquisar();
    public Boolean conexao();
    public void exibirPagina();
    public void atualizarPagina();
  
}

/**
 * navegador
 */
public class navegador implements navegadorInternet {

    public String pesquisar;
    public Boolean status;

    public void exibirPagina(){

    };

    public void atualizarPagina(){

    };

    public void pesquisar(){
        this.conexao();
    };

    public Boolean conexao(){

        return true;
    };
}