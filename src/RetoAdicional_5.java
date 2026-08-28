class RetoAdicional_5 {
    boolean mismoDestino(Pedido p1, Pedido p2) {
        if (p1 != null && p2 != null && p1.cliente != null && p2.cliente != null) {
            // Se utiliza.equals() para comparar el contenido del texto de las ciudades
            return p1.cliente.ciudad.equals(p2.cliente.ciudad);
        }
        return false;
    }
}