package Prodotto;

public class Admin {
    
    private String nome; 
    private String cognome;
    private String username; 
    private String password; 
    private Potere potere;


    public Admin(String nome, String cognome, String username, String password, Potere potere) {
        this.nome = nome;
        this.cognome = cognome;
        this.username = username;
        this.password = password;
        this.potere = potere;
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
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public Potere getPotere() {
        return potere;
    }
    public void setPotere(Potere potere) {
        this.potere = potere;
    }
    public String getPassword () {
        return password;
    }
    public void setPassword (String password) {
        this.password = password;
    }
}



