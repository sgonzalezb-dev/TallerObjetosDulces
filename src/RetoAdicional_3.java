class RetoAdicional_3 {
    int viajesNecesarios(Camion camion, double kgTotales) {
        if (kgTotales <= 0 || camion.capacidadKg <= 0) {
            return 0;
        }
        int viajes = (int) (kgTotales / camion.capacidadKg);
        // Si la capacidad multiplicada por los viajes no cubre la carga, se suma un viaje
        if (viajes * camion.capacidadKg < kgTotales) {
            viajes++;
        }
        return viajes;
    }
}