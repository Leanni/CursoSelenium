package Practico5;

public class Camion {

    private int chapa;
    private String color;
    private int añoCompra;

    public Camion(){
        this.chapa=12345;
        this.color="azul";
        this.añoCompra=2016;
    }
    public Camion(int chapa1){
        this.color="Desconocido";
        this.chapa=chapa1;
        this.añoCompra=0;
    }
    public Camion(int chapa1, String color1){
        this.chapa=chapa1;
        this.color=color1;
        this.añoCompra=0;
    }
    public Camion(int chapa1, String color1,int añoCompra1){
        this.chapa=chapa1;
        this.color=color1;
        this.añoCompra=añoCompra1;
    }

   public int getChapa(){
        return chapa;
    }
   public void setChapa(int otraChapa){
        this.chapa= otraChapa;
    }

   public String getColor(){
        return color;
    }
   public void setColor(String otroColor){
        this.color=otroColor;
    }

   public int getAñoCompra(){
        return añoCompra;
   }
   public void setAñoCompra(int añoCompra1){
        this.añoCompra=añoCompra1;
   }

    public String toString(){
        return "Camion de color: "+ this.getColor()+ " con una chapa: "+this.getChapa()+ " le toca revisión: "+ tieneRevision(añoCompra);
    }
    public boolean tieneRevision(int añoCompra){
        if (añoCompra<2015){
            return true;
        }else{
            return false;
        }
    }

    public boolean tieneMismoColor(Camion camion){
      return this.getColor().equals(camion.getColor());
    }



}
