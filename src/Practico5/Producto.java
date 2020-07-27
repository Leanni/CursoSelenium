package Practico5;

public class Producto {
    private String nombre;
    private int codigo;
    private boolean importado;
    private String nroLote;
    private static int NRO_PRODUCTO;

    public Producto(){
        this.nombre="Desconocido";
        this.codigo= 0;
        this.importado= false;
        this.nroLote = "Desconocido";
        NRO_PRODUCTO++;
    }
    public Producto(String unNombre, int unCodigo, String nroLote){
        this.nombre=unNombre;
        this.codigo=unCodigo;
        this.nroLote=nroLote;
        NRO_PRODUCTO++;
    }
    public Producto(String unNombre, int unCodigo, boolean esImportado,String nroLote){
        this.nombre=unNombre;
        this.codigo=unCodigo;
        this.importado=esImportado;
        this.nroLote=nroLote;
        NRO_PRODUCTO++;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String unNombre){
        this.nombre=unNombre;
    }

    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int unCodigo){
        this.codigo=unCodigo;
    }

    public boolean isImportado(){
        return importado;
    }
    public void setImportado(boolean esImportado){
        this.importado=esImportado;
    }

    public String getNroLote(){
        return nroLote;
    }
    public void setNroLote(String unNroLote){
        this.nroLote=unNroLote;
    }

    public int getNroProducto(){
        return NRO_PRODUCTO;
    }

    public String esImportado(boolean importado){
        String esImportado= " ";
        if (importado==true){
          return esImportado= "Este producto es importado";
        }else{
           return esImportado="Producto nacional";
        }
    }

    public String toString(){

        return "Producto: "+ this.nombre + " Codigo: " + this.codigo + " Importado: " + esImportado(importado)+ " Nro lote: "+ this.nroLote + " Nro producto: " + NRO_PRODUCTO;
    }





}
