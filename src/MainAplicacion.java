public class MainAplicacion {
    static void main() {
        Aplicacion c1= new  Aplicacion("sistemaVentas", "1.0");
        Aplicacion c2= new  Aplicacion("cuchaw", "2.0");
        System.out.println(" El nombre de tu app es>"+ c1.getNombre() + " La version de tu app es"+ c1.getVersion() );
        System.out.println("numero de apps"+ Aplicacion.getTotalAplicaciones());
        System.out.println(" El nombre de tu app es>"+ c2.getNombre() + " La version de tu app es"+ c2.getVersion() );
        System.out.println("numero de apps"+ Aplicacion.getTotalAplicaciones());

    }

}
