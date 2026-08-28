class RetoAdicional_2 {
    void cargarVariosViajes(Camion camion, double kgPorViaje, int viajes) {
        for (int i = 1; i <= viajes; i++) {
            System.out.print("Intento de viaje #" + i + ": ");
            // Llama internamente al método cargar del propio camión
            camion.cargar(kgPorViaje);
        }
    }
}