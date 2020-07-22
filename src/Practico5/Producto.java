package Practico5;

public class Producto {
    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private static int nroProducto;

    public Producto(){
        this.nombre="Desconocido";
        this.codigo= 0;
        this.importado= false;
        this.nroLote = "Desconocido";
        nroProducto++;
    }
    public Producto(String nombre1, int codigo1, String nroLote){
        this.nombre=nombre1;
        this.codigo=codigo1;
        this.nroLote=nroLote;
        nroProducto++;
    }
    public Producto(String nombre1, int codigo1, boolean importado1,String nroLote){
        this.nombre=nombre1;
        this.codigo=codigo1;
        this.importado=importado1;
        this.nroLote=nroLote;
        nroProducto++;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre1){
        this.nombre=nombre1;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo1){
        this.codigo=codigo1;
    }

    public boolean isImportado(){
        return importado;
    }
    public void setImportado(boolean importado1){
        this.importado=importado1;
    }

    public String getNroLote(){
        return nroLote;
    }
    public void setNroLote(String nroLote1){
        this.nroLote=nroLote1;
    }

    public int getNroProducto(){
        return nroProducto;
    }

    public String esImportado(boolean importado){
        String esimportado= " ";
        if (importado==true){
          return esimportado= "Este producto es importado";
        }else{
           return esimportado="Producto nacional";
        }
    }

    public String toString(){

        return "Producto: "+ nombre + " Codigo: " + codigo + " Importado: " + esImportado(importado)+ " Nro lote: "+nroLote + " Nro producto: " + nroProducto;
    }





}
