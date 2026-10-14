import org.example.ContoBancario;
import org.example.ImportoNonValidoException;
import org.example.SaldoInsufficienteException;

import static java.lang.IO.println;


void main(){
    println("Inizio programma con gestione errori per il conto corrente:\n");

    try {
        ContoBancario ContoBalestro = new ContoBancario(99999999999999999999999999999.0067);

        ContoBalestro.InserisciConto(-67);
        ContoBalestro.InserisciConto(6767);

        ContoBalestro.PrelevaConto(99999999999999999999999999999999.0067);
    }
    catch (SaldoInsufficienteException | ImportoNonValidoException s){
        println("Errore personalizzato - " + s .getMessage());
    }
    catch (Exception e) {
        println(e.getMessage());
    }

}