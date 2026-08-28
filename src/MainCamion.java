public class MainCamion {
    public static void main(String[] args) {
        //Creación de los camiones
        Camion camion = new Camion();
        camion.placa = "GHZ-085";
        camion.capacidadKg = 1500.0;
        camion.cargaActualKg = 500.5;
        camion.ciudadAsignada = "Madrid";
        camion.disponible = true;

        Camion camion2 = new Camion();
        camion2.placa = "MAL-190";
        camion2.capacidadKg = 1100.9;
        camion2.cargaActualKg  = 420.7;
        camion.ciudadAsignada = "Paris";
        camion2.disponible = true;

        Camion camion3 = new Camion();
        camion.placa = "HOA-891";
System.out.println("=======CAMIONES=======");
System.out.println("Camion 1:" + "Placa:" +camion.placa +"|"+ "Capacidad:"+ camion.capacidadKg +"|"+ "Carga Actual:"+ camion.cargaActualKg  +"|"+  "Ciudad:"+ camion.ciudadAsignada +"|"+  "Disponible:"+ camion.disponible);
System.out.println("Camion 2:"+"Placa:" + camion2.placa +"|"+ "Capacidad:"+ camion2.capacidadKg +"|"+"Carga Actual:"+  camion2.cargaActualKg  +"|"+ "Ciudad:"+ camion2.ciudadAsignada+"|"+ camion2.disponible);
System.out.println("Camion 3:" + "Placa:" +camion3.placa +"|"+ "Capacidad:"+ camion3.capacidadKg +"|"+"Carga Actual:"+  camion3.cargaActualKg  +"|"+ "Ciudad:"+ camion3.ciudadAsignada+"|"+ camion3.disponible);
//Modificaciones
camion.cargaActualKg  += 200;
camion2.disponible = false;
//Vuelta a imprimir los datos
        System.out.println("====OPERACION DEL DIA====");
        System.out.println("Camion 1:" + "Placa:" +camion.placa +"|"+ "Capacidad:"+ camion.capacidadKg +"|"+ "Carga Actual:"+ camion.cargaActualKg  +"|"+  "Ciudad:"+ camion.ciudadAsignada+"|"+  "Disponible:"+ camion.disponible);
        System.out.println("Camion 2:"+"Placa:" + camion2.placa +"|"+ "Capacidad:"+ camion2.capacidadKg +"|"+"Carga Actual:"+  camion2.cargaActualKg  +"|"+ "Ciudad:"+ camion2.ciudadAsignada+"|"+ camion2.disponible);
        System.out.println("Camion 3:" + "Placa:" +camion3.placa +"|"+ "Capacidad:"+ camion3.capacidadKg +"|"+"Carga Actual:"+  camion3.cargaActualKg  +"|"+ "Ciudad:"+ camion3.ciudadAsignada+"|"+ camion3.disponible);

    }


}
