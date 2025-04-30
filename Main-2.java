// Ana Luisa Licurci Baggio - 10297891
public class Main{
    
    public static void main(String[] args){
        
        Veiculo v = new Veiculo ("Fiat", "Uno", 1999, true);
        Carro c = new Carro("Ford", "Fiesta", 1987, false, 4, 4);
        System.out.println(v.getInfo());
        System.out.println(c.getInfo());
    }
}