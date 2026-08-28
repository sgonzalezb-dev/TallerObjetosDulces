public class RetoAdicional_1 {
    public static void main(String[] args) {
        Camion c1 = new Camion();
        c1.placa = "ABC-123";
        c1.capacidadKg = 1200.0;
        c1.cargaActualKg = 350.5;
        c1.disponible = true;

        Camion c2 = new Camion();
        c2.placa = "XYZ-789";
        c2.capacidadKg = 2000.0;
        c2.cargaActualKg = 1700.0;
        c2.disponible = true;

        Camion c3 = new Camion();
        c3.placa = "DEF-456";
        c3.capacidadKg = 1000.0;
        c3.cargaActualKg = 100.0;
        c3.disponible = false;

        double pedidoKg = 400.0;

        // Evaluación del Camión 1
        if (c1.disponible && (c1.cargaActualKg + pedidoKg <= c1.capacidadKg)) {
            System.out.println("El camión " + c1.placa + " SÍ puede recibir el pedido de " + pedidoKg + " kg.");
        } else {
            System.out.println("El camión " + c1.placa + " NO puede recibir el pedido.");
        }

        // Evaluación del Camión 2
        if (c2.disponible && (c2.cargaActualKg + pedidoKg <= c2.capacidadKg)) {
            System.out.println("El camión " + c2.placa + " SÍ puede recibir el pedido de " + pedidoKg + " kg.");
        } else {
            System.out.println("El camión " + c2.placa + " NO puede recibir el pedido.");
        }

        // Evaluación del Camión 3
        if (c3.disponible && (c3.cargaActualKg + pedidoKg <= c3.capacidadKg)) {
            System.out.println("El camión " + c3.placa + " SÍ puede recibir el pedido de " + pedidoKg + " kg.");
        } else {
            System.out.println("El camión " + c3.placa + " NO puede recibir el pedido.");
        }
    }
}


