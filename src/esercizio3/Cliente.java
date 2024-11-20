package esercizio3;

import java.time.LocalDate;

public class Cliente {
    private String codiceCliente;
    private String nome;
    private String cognome;
    private String email;
    private LocalDate dataDiIscrizione;

    public Cliente (String codiceCliente, String nome,  String cognome, String email, LocalDate dataDiIscrizione) {
        this.codiceCliente = codiceCliente;
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataDiIscrizione = dataDiIscrizione;
    }

    public String getCodiceCliente() {
        return codiceCliente;
    }

    public void setCodiceCliente(String codiceCliente) {
        this.codiceCliente = codiceCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDataDiIscrizione() {
        return dataDiIscrizione;
    }

    public void setDataDiIscrizione(LocalDate dataDiIscrizione) {
        this.dataDiIscrizione = dataDiIscrizione;
    }

    //metodo per stampa dati cliente
    @Override
    public String toString() {
        return  "Cliente: " + nome + " " + cognome + " [Codice: " + codiceCliente +
                ", Email: " + email + ", Iscrizione: " + dataDiIscrizione + "]";
    }
}
