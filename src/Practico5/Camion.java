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
    public Camion(int otraChapa){
        this.color="Desconocido";
        this.chapa=otraChapa;
        this.añoCompra=0;
    }
    public Camion(int otraChapa, String otroColor){
        this.chapa=otraChapa;
        this.color=otroColor;
        this.añoCompra=0;
    }
    public Camion(int otraChapa, String otroColor,int otroAñoCompra){
        this.chapa=otraChapa;
        this.color=otroColor;
        this.añoCompra=otroAñoCompra;
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
   public void setAñoCompra(int otroAñoCompra){
        this.añoCompra=otroAñoCompra;
   }

    public boolean letocaRevision(int añoCompra){
        if (añoCompra < 2015){
            return true;
        }else{
            return false;
        }
    }

    public String tieneRevisionCamion(int añoCompra){
        String mensaje=null;
        boolean tieneRevision=letocaRevision(añoCompra);
        if (tieneRevision==true){
            return mensaje = "El camión debe ir a revisión";
        }else{
            return mensaje = "El camión no debe ir a revisión";
        }
    }

    public boolean tieneMismoColor(Camion camion){
        return this.getColor().equals(camion.getColor());
    }

    public String toString(){
        return "Camion de color: "+ this.getColor()+ " Número de chapa: "+this.getChapa()+ " Revisión: "+ tieneRevisionCamion(añoCompra);
    }





}
