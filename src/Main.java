import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ==========================================
        // NIVEL 1: El molde de los productos
        // ==========================================
        System.out.println("====== NIVEL 1 ======");
        Camion camion1 = new Camion();
        camion1.placa = "ABC-123";
        camion1.capacidadKg = 1200.0;
        camion1.cargaActualKg = 350.5;
        camion1.ciudadAsignada = "Armenia";
        camion1.disponible = true;

        Camion camion2 = new Camion();
        camion2.placa = "XYZ-789";
        camion2.capacidadKg = 2000.0;
        camion2.cargaActualKg = 800.0;
        camion2.ciudadAsignada = "Pereira";
        camion2.disponible = true;

        Camion camion3 = new Camion();
        camion3.placa = "DEF-456";

        System.out.println("=== FLOTA INICIAL ===");
        System.out.println("Placa " + camion1.placa + " | " + camion1.ciudadAsignada + " | " + camion1.capacidadKg + " kg máx | carga: " + camion1.cargaActualKg + " kg | disponible: " + camion1.disponible);
        System.out.println("Placa " + camion2.placa + " | " + camion2.ciudadAsignada + " | " + camion2.capacidadKg + " kg máx | carga: " + camion2.cargaActualKg + " kg | disponible: " + camion2.disponible);
        System.out.println("Placa " + camion3.placa + " | " + camion3.ciudadAsignada + " | " + camion3.capacidadKg + " kg máx | carga: " + camion3.cargaActualKg + " kg | disponible: " + camion3.disponible);

        camion1.cargaActualKg += 200.0;
        camion2.disponible = false;

        System.out.println("\n=== FLOTA TRAS OPERACIONES ===");
        System.out.println("Placa " + camion1.placa + " | " + camion1.ciudadAsignada + " | " + camion1.capacidadKg + " kg máx | carga: " + camion1.cargaActualKg + " kg | disponible: " + camion1.disponible);
        System.out.println("Placa " + camion2.placa + " | " + camion2.ciudadAsignada + " | " + camion2.capacidadKg + " kg máx | disponible: " + camion2.disponible);


        // ==========================================
        // NIVEL 2: Productos que actúan
        // ==========================================
        System.out.println("\n====== NIVEL 2 ======");
        Camion camionN2 = new Camion();
        camionN2.placa = "ABC-123";
        camionN2.capacidadKg = 1000.0;
        camionN2.cargaActualKg = 0.0;
        camionN2.ciudadAsignada = "Armenia";
        camionN2.disponible = true;

        camionN2.mostrarFicha();
        camionN2.cargar(400);
        camionN2.cargar(700);
        camionN2.cargar(500);
        camionN2.descargar(200);
        camionN2.enviarATaller();
        camionN2.cargar(100);
        camionN2.mostrarFicha();


        // ==========================================
        // NIVEL 3: Productos que responden
        // ==========================================
        System.out.println("\n====== NIVEL 3 ======");
        Camion camionN3 = new Camion();
        camionN3.placa = "ABC-123";
        camionN3.capacidadKg = 1000.0;
        camionN3.cargaActualKg = 350.0;
        camionN3.ciudadAsignada = "Armenia";
        camionN3.disponible = true;

        System.out.println(camionN3.ficha());

        if (camionN3.cabe(700.0)) {
            System.out.println("El pedido de 700 kg SÍ cabe.");
        } else {
            System.out.println("El pedido de 700 kg NO cabe.");
        }
        camionN3.cargar(500.0);
        System.out.println(camionN3.ficha());


        // ==========================================
        // NIVEL 4: La máquina de nacer
        // ==========================================
        System.out.println("\n====== NIVEL 4 ======");
        Camion c1_n4 = new Camion("ABC-123", 1200.0, "Armenia");
        Camion c2_n4 = new Camion("XYZ-789", 1500.0, "Pereira");
        Camion c3_n4 = new Camion("DEF-456", 50.0, "Manizales");

        c1_n4.cargar(400.0);
        c2_n4.cargar(600.0);
        c3_n4.cargar(80.0);

        System.out.println("\n=== FICHAS DE LOS CAMIONES ===");
        System.out.println(c1_n4.ficha());
        System.out.println(c2_n4.ficha());
        System.out.println(c3_n4.ficha());


        // ==========================================
        // NIVEL 5: La planta en movimiento
        // ==========================================
        System.out.println("\n====== NIVEL 5 ======");
        Cliente cliente = new Cliente("Dulcería El Trébol", "Armenia");
        Producto caramelos = new Producto("Caramelos de café", 6.2, 50);
        Producto arequipe = new Producto("Arequipe de café", 4.8, 30);
        Camion camionN5 = new Camion("ABC-123", 500.0);

        Pedido p1 = new Pedido(cliente, arequipe, 15);
        Pedido p2 = new Pedido(cliente, caramelos, 60);
        Pedido p3 = new Pedido(cliente, arequipe, 5);

        p1.procesar(camionN5);
        p2.procesar(camionN5);
        p3.procesar(camionN5);
        p3.procesar(camionN5); // Intento duplicado

        System.out.println("\n=== FICHAS FINALES ===");
        System.out.println(p1.ficha());
        System.out.println(p2.ficha());
        System.out.println(p3.ficha());


        // ==========================================
        // JEFE FINAL: BODEGA MAESTRA (SIBOM)
        // ==========================================
        System.out.println("\n====== JEFE FINAL: SIBOM ======");
        Scanner scanner = new Scanner(System.in);

        // Se usa double para el precio y diferenciar el constructor del Jefe Final
        Producto prod1 = new Producto("Caramelos de café", 6.2, 18500.0);
        Producto prod2 = new Producto("Arequipe de café", 4.8, 21000.0);
        Producto prod3 = new Producto("Galletas de café", 3.0, 15000.0);

        Camion cam1 = new Camion("ABC-123", 1000.0);
        Camion cam2 = new Camion("XYZ-789", 800.0);

        int opcion = 0;
        do {
            System.out.println("\n===== SIBOM Dulce Café S.A. =====");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Recibir producción");
            System.out.println("3. Cargar camión");
            System.out.println("4. Ver flota");
            System.out.println("5. Reporte general");
            System.out.println("6. Cerrar bodega");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                scanner.next();
                opcion = 0;
            }

            switch (opcion) {
                case 1:
                    System.out.println("\n--- CATÁLOGO ---");
                    System.out.println("1. " + prod1.fichaCatalogo());
                    System.out.println("2. " + prod2.fichaCatalogo());
                    System.out.println("3. " + prod3.fichaCatalogo());
                    break;
                case 2:
                    System.out.print("Seleccione producto (1: Caramelos, 2: Arequipe, 3: Galletas): ");
                    int prodRecibir = scanner.nextInt();
                    System.out.print("Ingrese número de cajas a recibir: ");
                    int cajasRecibir = scanner.nextInt();

                    if (prodRecibir == 1) prod1.recibir(cajasRecibir);
                    else if (prodRecibir == 2) prod2.recibir(cajasRecibir);
                    else if (prodRecibir == 3) prod3.recibir(cajasRecibir);
                    break;
                case 3:
                    System.out.print("Seleccione producto (1: Caramelos, 2: Arequipe, 3: Galletas): ");
                    int prodCargar = scanner.nextInt();
                    System.out.print("Seleccione camión (1: " + cam1.placa + ", 2: " + cam2.placa + "): ");
                    int camionSel = scanner.nextInt();
                    System.out.print("Ingrese número de cajas a cargar: ");
                    int cajasCargar = scanner.nextInt();

                    Producto pSeleccionado = (prodCargar == 1) ? prod1 : (prodCargar == 2) ? prod2 : (prodCargar == 3) ? prod3 : null;
                    Camion cSeleccionado = (camionSel == 1) ? cam1 : (camionSel == 2) ? cam2 : null;

                    if (pSeleccionado != null && cSeleccionado != null) {
                        cSeleccionado.cargarProducto(pSeleccionado, cajasCargar);
                    } else {
                        System.out.println("Selección inválida.");
                    }
                    break;
                case 4:
                    System.out.println("\n--- FLOTA ---");
                    System.out.println(cam1.ficha());
                    System.out.println(cam2.ficha());
                    break;
                case 5:
                    System.out.println("\n--- REPORTE ---");
                    System.out.println("Valor inventario: $" + (prod1.valorInventario() + prod2.valorInventario() + prod3.valorInventario()));
                    System.out.println("Peso en bodega: " + (prod1.pesoTotal() + prod2.pesoTotal() + prod3.pesoTotal()) + " kg");
                    break;
                case 6:
                    System.out.println("Cerrando SIBOM...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}

// ==========================================
// CLASES DE SOPORTE INTEGRALES
// ==========================================

class Camion {
    String placa;
    double capacidadKg;
    double cargaActualKg;
    String ciudadAsignada;
    boolean disponible;

    // Constructor vacío para permitir la sintaxis de los Niveles 1 al 3
    Camion() {}

    // Constructor para el Nivel 4
    Camion(String placa, double capacidadKg, String ciudadAsignada) {
        this.placa = placa;
        this.ciudadAsignada = ciudadAsignada;
        this.cargaActualKg = 0.0;
        this.disponible = true;

        if (capacidadKg < 100.0) {
            this.capacidadKg = 100.0;
            System.out.println("! Capacidad ajustada a 100.0 kg");
        } else {
            this.capacidadKg = capacidadKg;
        }
    }

    // Constructor para el Nivel 5 y Jefe Final
    Camion(String placa, double capacidadKg) {
        this.placa = placa;
        this.capacidadKg = capacidadKg >= 100.0 ? capacidadKg : 100.0;
        this.cargaActualKg = 0.0;
        this.disponible = true;
    }

    void mostrarFicha() {
        System.out.println("Placa: " + this.placa + " | Carga: " + this.cargaActualKg + " / " + this.capacidadKg + " kg | Disponible: " + this.disponible);
    }

    double espacioLibre() {
        return this.capacidadKg - this.cargaActualKg;
    }

    boolean cabe(double kg) {
        return kg > 0 && this.disponible && kg <= this.espacioLibre();
    }

    double porcentajeOcupacion() {
        if (this.capacidadKg == 0) return 0;
        return (this.cargaActualKg / this.capacidadKg) * 100.0;
    }

    String ficha() {
        return "Camión " + this.placa + " | Carga: " + this.cargaActualKg + " / " + this.capacidadKg + " kg | Espacio libre: " + this.espacioLibre() + " kg";
    }

    void cargar(double kg) {
        if (kg <= 0) {
            System.out.println("Cantidad inválida");
        } else if (!this.disponible) {
            System.out.println("Camión " + this.placa + " fuera de servicio");
        } else if (this.cargaActualKg + kg > this.capacidadKg) {
            System.out.println("Capacidad superada");
        } else {
            this.cargaActualKg += kg;
            System.out.println("Cargados " + kg + " kg en " + this.placa);
        }
    }

    void descargar(double kg) {
        if (kg > 0 && this.cargaActualKg - kg >= 0) {
            this.cargaActualKg -= kg;
            System.out.println("Descargados " + kg + " kg de " + this.placa);
        } else {
            System.out.println("Operación de descarga inválida");
        }
    }

    void enviarATaller() {
        this.disponible = false;
        System.out.println("Camión " + this.placa + " fuera de servicio");
    }

    void cargarProducto(Producto p, int cajas) {
        double pesoRequerido = cajas * p.pesoCajakg;
        if (!p.puedeDespachar(cajas)) {
            System.out.println("Rechazado: Stock insuficiente de " + p.nombre);
        } else if (!this.cabe(pesoRequerido)) {
            System.out.println("Rechazado: Capacidad o disponibilidad insuficiente en camión " + this.placa);
        } else {
            p.despachar(cajas);
            this.cargaActualKg += pesoRequerido;
            System.out.println("Carga exitosa: " + cajas + " cajas en " + this.placa);
        }
    }
}

class Producto {
    String nombre;
    double pesoCajakg;
    int stockCajas;
    int precioCaja;
    int totalDespachado;

    // Constructor para el Nivel 5 (Stock inicial)
    Producto(String nombre, double pesoCajakg, int stockInicial) {
        this.nombre = nombre;
        this.pesoCajakg = pesoCajakg;
        this.stockCajas = stockInicial;
        this.precioCaja = 1000;
        this.totalDespachado = 0;
    }

    // Constructor para el Jefe Final (Precio de la caja en double para diferenciar firma)
    Producto(String nombre, double pesoCajakg, double precioCaja) {
        this.nombre = nombre;
        this.pesoCajakg = pesoCajakg;
        this.precioCaja = (int) precioCaja;
        this.stockCajas = 0;
        this.totalDespachado = 0;
    }

    void recibir(int cajas) {
        if (cajas > 0) {
            this.stockCajas += cajas;
            System.out.println("Ingresaron " + cajas + " cajas de " + this.nombre);
        }
    }

    boolean puedeDespachar(int cajas) {
        return cajas > 0 && cajas <= this.stockCajas;
    }

    void despachar(int cajas) {
        if (this.puedeDespachar(cajas)) {
            this.stockCajas -= cajas;
            this.totalDespachado += cajas;
        }
    }

    double pesoTotal() {
        return this.stockCajas * this.pesoCajakg;
    }

    int valorInventario() {
        return this.stockCajas * this.precioCaja;
    }

    String fichaCatalogo() {
        return this.nombre + " | Stock: " + this.stockCajas + " cajas | Valor Total: $" + this.valorInventario();
    }
}

class Cliente {
    String nombre;
    String ciudad;

    Cliente(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}

class Pedido {
    Cliente cliente;
    Producto producto;
    int cajas;
    boolean despachado;

    Pedido(Cliente cliente, Producto producto, int cajas) {
        this.cliente = cliente;
        this.producto = producto;
        this.cajas = cajas;
        this.despachado = false;
    }

    double pesoDelPedido() {
        return this.cajas * this.producto.pesoCajakg;
    }

    void procesar(Camion camion) {
        if (this.despachado) {
            System.out.println("El pedido de " + this.cliente.nombre + " ya está despachado.");
            return;
        }
        if (this.producto.puedeDespachar(this.cajas)) {
            double stockAntes = this.producto.stockCajas;
            camion.cargarProducto(this.producto, this.cajas);
            if (this.producto.stockCajas < stockAntes) {
                this.despachado = true;
            }
        } else {
            System.out.println("No se puede procesar el pedido por falta de stock.");
        }
    }

    String ficha() {
        return "Pedido de " + this.cliente.nombre + " (" + this.cliente.ciudad + "): " + this.cajas + " cajas | despachado: " + this.despachado;
    }
}