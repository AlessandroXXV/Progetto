package Prodotto; 

public class User 
{
    private String nome; 
    private String cognome;
    private String username; 
    private String password;
    private Potere potere;
    
    
   






    public User(String string, String string2, String username, String password, Potere potere1) {
        this.nome = string; 
        this.cognome = string2; 
        this.username = username;  
        this.password = password;
        this.potere = potere1;
    }
    
    
    
    
    
    
    // GETTER E SETTER
    
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
    public Object getPassword() {
        return null;
    }
    public void setPassword(String password) {
        this.password = password;
    }
     public Potere getPotere() {
        return potere;
    }
    public void setPotere(Potere potere) {
        this.potere = potere;
    }
}