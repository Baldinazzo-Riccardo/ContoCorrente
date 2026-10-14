package org.example;


import static java.lang.IO.println;

public class ContoBancario {

    private double SaldoUtente;

    public ContoBancario(double money){
        if(money < 0 ) throw new ImportoNonValidoException("ERRORE: L'importo non può essere negativo.");
        SaldoUtente = money;
    }

    public void InserisciConto(double d){
        if(d < 0 ) throw new ImportoNonValidoException("ERRORE: L'importo non può essere negativo.");

        SaldoUtente += d;
    }

    public void PrelevaConto(double d) throws SaldoInsufficienteException {
        if(SaldoUtente < d) throw new SaldoInsufficienteException("ERRORE: Il saldo non dispone di questi soldi.");

        SaldoUtente -= d;
    }

    public double getSaldoUtente() {
        return SaldoUtente;
    }
}
