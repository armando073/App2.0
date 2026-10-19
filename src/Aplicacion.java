public class Aplicacion {
    public String getTotalAplicaciones;
    private int id;
    private String nombre;
    private String version;
    private boolean ejecutando;
    private static int totalAplicaciones = 0 ;
    public Aplicacion(String nombre, String version){
        id = totalAplicaciones;
        this.nombre = nombre;
        this.version= version;
        ejecutando = false;
        totalAplicaciones++;

    }
    public Aplicacion(){
        totalAplicaciones++;
    }

    public String getNombre() {
        return nombre;
    }

    public String getVersion() {
        return version;
    }

    public boolean isEjecutando() {
        return ejecutando;
    }

    public void iniciar() {
        ejecutando = true;
    }

    public void cerrar() {
        ejecutando = false;
    }

    public static int getTotalAplicaciones(){
        return totalAplicaciones;
    }


}
