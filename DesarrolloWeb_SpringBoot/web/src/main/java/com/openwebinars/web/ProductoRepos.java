package com.openwebinars.web;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepos {
    List<Producto> listaProd = new ArrayList<>();

    //    public ProductoRepos(){
//        cargarLista();
//    }
    public List<Producto> cargarLista() {
        if (listaProd.isEmpty()) {
            listaProd.add(new Producto(1L, "Frigorífico combi Candy CCG1S 518EW", 295.0, true));
            listaProd.add(new Producto(2L, "Lavavajillas Bosch SMS25AI05E", 399.0, false));
            listaProd.add(new Producto(3L, "Vitrocerámica Balay 3EB965LR", 359.0, false));
            listaProd.add(new Producto(4L, "Frigorífico combi Balay 3KFE763WI", 529.0, false));
            listaProd.add(new Producto(5L, "Freidora sin aceite Cosori Dual Blaze 6,4L", 135.0, true));
            listaProd.add(new Producto(6L, "Televisor LG 50UR78006LK LED Smart TV 50\" 4K", 365.0, true));
            listaProd.add(new Producto(7L, "Portátil HP 15-fd0100ns (i5, 16GB, 1TB SSD)", 749.0, false));
            listaProd.add(new Producto(8L, "Auriculares Apple AirPods 4", 189.0, true));
            listaProd.add(new Producto(9L, "Smartwatch Samsung Galaxy Watch6 Classic 47mm", 349.0, false));
            listaProd.add(new Producto(10L, "Cámara Nikon Z 6II + Adaptador FTZ II", 2199.0, false));
            listaProd.add(new Producto(11L, "Aceite de oliva virgen extra (1L)", 10.5, true));
            listaProd.add(new Producto(12L, "Azúcar blanco (1 kg)", 1.4, false));
            listaProd.add(new Producto(13L, "Zumo de naranja (1L)", 2.1, false));
            listaProd.add(new Producto(14L, "Media docena de huevos talla M", 1.9, false));
            listaProd.add(new Producto(15L, "Arroz redondo (1 kg)", 1.45, false));
            listaProd.add(new Producto(16L, "Zanahorias (1 kg)", 1.2, true));
            listaProd.add(new Producto(17L, "Yogur natural, pack 4x125 g", 1.6, false));
            listaProd.add(new Producto(18L, "Rodajas de salmón (1 kg)", 19.0, true));
            listaProd.add(new Producto(19L, "Macarrones (500 g)", 1.3, false));
            listaProd.add(new Producto(20L, "Barra de helado (1 L)", 2.5, true));
            listaProd.add(new Producto(21L, "Calefactor portátil", 16.95, false));
            listaProd.add(new Producto(22L, "Quitapelusas eléctrico", 12.99, true));
            listaProd.add(new Producto(23L, "Picadora manual", 10.99, false));
            listaProd.add(new Producto(24L, "Espumador eléctrico", 9.99, true));
            listaProd.add(new Producto(25L, "Hervidor de agua Aigostar", 19.49, false));
            listaProd.add(new Producto(26L, "Báscula de peso electrónica", 13.99, false));
            listaProd.add(new Producto(27L, "Termómetro digital", 15.99, true));
            listaProd.add(new Producto(28L, "Cafetera Nespresso Inissia", 69.0, true));
            listaProd.add(new Producto(29L, "Plancha de vapor Philips DST3031/20", 29.99, false));
            listaProd.add(new Producto(30L, "Microondas Cecotec ProClean 3010", 59.0, true));
            listaProd.add(new Producto(31L, "Batidora de mano Taurus Robot 600", 24.99, false));
            listaProd.add(new Producto(32L, "Tostadora Moulinex Subito", 19.99, true));
            listaProd.add(new Producto(33L, "Secador de pelo Rowenta Studio Dry", 17.99, false));
            listaProd.add(new Producto(34L, "Cuchillo de chef Arcos Universal 20cm", 13.5, true));
            listaProd.add(new Producto(35L, "Set de sartenes BRA Efficient (3 uds)", 49.99, false));
            listaProd.add(new Producto(36L, "Olla a presión Monix Quick", 39.99, true));
            listaProd.add(new Producto(37L, "Colchón viscoelástico Pikolin", 229.0, false));
            listaProd.add(new Producto(38L, "Almohada viscoelástica Pikolin", 29.0, true));
            listaProd.add(new Producto(39L, "Silla de oficina ergonómica", 89.0, false));
            listaProd.add(new Producto(40L, "Mesa de escritorio 120x60cm", 69.0, true));
            listaProd.add(new Producto(41L, "Lámpara LED de escritorio", 18.99, false));
            listaProd.add(new Producto(42L, "Reloj despertador digital", 14.99, true));
            listaProd.add(new Producto(43L, "Cargador USB múltiple", 11.99, false));
            listaProd.add(new Producto(44L, "Regleta inteligente WiFi", 21.99, true));
            listaProd.add(new Producto(45L, "Ratón inalámbrico Logitech M185", 12.99, false));
            listaProd.add(new Producto(46L, "Teclado mecánico Mars Gaming", 29.99, true));
            listaProd.add(new Producto(47L, "Memoria USB 128GB SanDisk", 15.99, false));
            listaProd.add(new Producto(48L, "Disco duro externo 1TB WD", 54.99, true));
            listaProd.add(new Producto(49L, "Mochila para portátil HP", 24.99, false));
            listaProd.add(new Producto(50L, "Botella de agua reutilizable 1L", 9.99, true));
        }
        return listaProd;

    }
}
