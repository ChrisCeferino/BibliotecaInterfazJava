/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBiblioteca.FrameP;

import cl.inacap.ProyectoBiblioteca.SistemaArriendo.SistemaArriendoFrame;
import cl.inacap.ProyectoBiblioteca.frame.Arriendo.IngresarArriendoFrame;
import cl.inacap.ProyectoBiblioteca.frame.Arriendo.MostrarArriendoFrame;
import cl.inacap.ProyectoBiblioteca.frame.Distribuidor.EliminarDistribuidorFrame;
import cl.inacap.ProyectoBiblioteca.frame.Distribuidor.IngresarDistribuidorFrame;
import cl.inacap.ProyectoBiblioteca.frame.Distribuidor.MostrarDistribuidorFrame;
import cl.inacap.ProyectoBiblioteca.frame.SistemaCompra.SistemaCompraFrame;
import cl.inacap.ProyectoBiblioteca.frame.SistemaVenta.IngresarSistemaVentaFrame;
import cl.inacap.ProyectoBiblioteca.frame.Telefono.EliminarTelefonoFrame;
import cl.inacap.ProyectoBiblioteca.frame.Telefono.IngresarTelefonoFrame;
import cl.inacap.ProyectoBiblioteca.frame.Telefono.MostrarTelefonoFrame;
import cl.inacap.ProyectoBiblioteca.frames.Boleta.IngresarBoletaFrame;
import cl.inacap.ProyectoBiblioteca.frames.Boleta.MostrarBoletaFrame;
import cl.inacap.ProyectoBiblioteca.frames.Cliente.EliminarClienteFrame;
import cl.inacap.ProyectoBiblioteca.frames.Cliente.IngresarClienteFrame;
import cl.inacap.ProyectoBiblioteca.frames.Cliente.MostrarClienteFrame;
import cl.inacap.ProyectoBiblioteca.frames.Compra.IngresarCompraFrame;
import cl.inacap.ProyectoBiblioteca.frames.Compra.MostrarCompraFrame;
import cl.inacap.ProyectoBiblioteca.frames.Correo.EliminarCorreoFrame;
import cl.inacap.ProyectoBiblioteca.frames.Correo.IngresarCorreoFrame;
import cl.inacap.ProyectoBiblioteca.frames.Correo.MostrarCorreoFrame;
import cl.inacap.ProyectoBiblioteca.frames.Direccion.IngresarDireccionFrame;
import cl.inacap.ProyectoBiblioteca.frames.Direccion.MostrarDireccionFrame;
import cl.inacap.ProyectoBiblioteca.frames.Factura.IngresarFacturaFrame;
import cl.inacap.ProyectoBiblioteca.frames.Factura.MostrarFacturaFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoDePago.EliminarTipoDePagoFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoDePago.IngresarTipoDePagoFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoDePago.MostrarTipoDePagoFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoTrabajador.EliminarTipoTrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoTrabajador.IngresarTipotrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.TipoTrabajador.MostrarTipoTrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.Trabajador.EliminarTrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.Trabajador.IngresarTrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.Trabajador.MostrarTrabajadorFrame;
import cl.inacap.ProyectoBiblioteca.frames.Venta.IngresarVentaFrame;
import cl.inacap.ProyectoBiblioteca.frames.Venta.MostrarVentaFrame;
import cl.inacap.ProyectoBiblioteca.frames.autor.EliminarAutorFrame;
import cl.inacap.ProyectoBiblioteca.frames.autor.IngresarAutorFrame;
import cl.inacap.ProyectoBiblioteca.frames.autor.MostrarAutorFrame;
import cl.inacap.ProyectoBiblioteca.frames.categoria.EliminarCategoriaFrame;
import cl.inacap.ProyectoBiblioteca.frames.categoria.IngresarCategoriaFrame;
import cl.inacap.ProyectoBiblioteca.frames.categoria.MostrarCategoriaFrame;
import cl.inacap.ProyectoBiblioteca.frames.editorial.EliminarEditorialFrame;
import cl.inacap.ProyectoBiblioteca.frames.editorial.IngresarEdiitorialFrame;
import cl.inacap.ProyectoBiblioteca.frames.editorial.MostrarEditorialFrame;
import cl.inacap.ProyectoBiblioteca.frames.idioma.EliminarIdioma;
import cl.inacap.ProyectoBiblioteca.frames.idioma.IngresarIdiomaFrame;
import cl.inacap.ProyectoBiblioteca.frames.idioma.MostrarIdioma;
import cl.inacap.ProyectoBiblioteca.frames.libro.EliminarLibroFrame;
import cl.inacap.ProyectoBiblioteca.frames.libro.IngresarLiibroFrame;
import cl.inacap.ProyectoBiblioteca.frames.libro.MostrarLibroFrame;

/**
 *
 * @author Garnios
 */
public class FramePrincipal extends javax.swing.JFrame {

    private IngresarLiibroFrame ingresarLibroFrame;
    private IngresarIdiomaFrame ingresarIdiomaFrame;
    private IngresarCategoriaFrame ingresarCategoriaFrame;
    private IngresarAutorFrame ingresarAutorFrame;
    private IngresarEdiitorialFrame ingresarEditorialFrame;
    private IngresarClienteFrame ingresarClienteFrame;
    private IngresarTipotrabajadorFrame ingresarTipoTrabajadorFrame;
    private IngresarDireccionFrame ingresarDireccionFrame;
    private IngresarCorreoFrame ingresarCorreoFrame;
    private IngresarTrabajadorFrame ingresarTrabajadorFrame;
    private IngresarTelefonoFrame ingresarTelefonoFrame;
    private IngresarTipoDePagoFrame ingresarTipoDePagoFrame;
    private IngresarBoletaFrame ingresarBoletaFrame;
    private IngresarVentaFrame ingresarVentaFrame;
    private IngresarSistemaVentaFrame ingresarSistemaVentaFrame;
    private IngresarFacturaFrame ingresarFacturaFrame;
    private IngresarCompraFrame ingresarCompraFrame;
    private IngresarDistribuidorFrame ingresarDistribuidorFrame;
    private IngresarArriendoFrame ingresarArriendoFrame;
    private SistemaCompraFrame sistemaCompraFrame;
    private SistemaArriendoFrame sistemaArriendoFrame;
    ///////////////////////////////////////////////////////
    private MostrarAutorFrame mostrarAutorFrame;
    private MostrarCategoriaFrame mostrarCategoriaFrame;
    private MostrarIdioma mostrarIdiomaFrame;
    private MostrarEditorialFrame mostrarEditorialFrame;
    private MostrarLibroFrame mostrarLibroFrame;
    private MostrarClienteFrame mostrarClienteFrame;
    private MostrarTipoTrabajadorFrame mostrarTipoTrabajadorFrame;
    private MostrarDireccionFrame mostrarDireccionFrame;
    private MostrarCorreoFrame mostrarCorreoFrame;
    private MostrarTrabajadorFrame mostrarTrabajadorFrame;
    private MostrarTelefonoFrame mostrarTelefonoFrame;
    private MostrarTipoDePagoFrame mostrarTipoDePagoFrame;
    private MostrarBoletaFrame mostrarBoletaFrame;
    private MostrarVentaFrame mostrarVentaFrame;
    private MostrarFacturaFrame mostrarFacturaFrame;
    private MostrarCompraFrame mostrarCompraFrame;
    private MostrarDistribuidorFrame mostrarDistribuidorFrame;
    private MostrarArriendoFrame mostrarArriendoFrame;
    ///////////////////////////////////////////////////////
    private EliminarAutorFrame eliminarAutorFrame;
    private EliminarCategoriaFrame eliminarCategoriaFrame;
    private EliminarIdioma eliminarIdiomaFrame;
    private EliminarEditorialFrame eliminarEditorialFrame;
    private EliminarLibroFrame eliminarLibroFrame;
    private EliminarClienteFrame eliminarClienteFrame;
    private EliminarTipoTrabajadorFrame eliminarTipoTrabajadorFrame;
    private EliminarCorreoFrame eliminarCorreoFrame;
    private EliminarTrabajadorFrame eliminarTrabajadorFrame;
    private EliminarTelefonoFrame eliminarTelefonoFrame;
    private EliminarTipoDePagoFrame eliminarTipoDePagoFrame;
    private EliminarDistribuidorFrame eliminarDistribuidorFrame;

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu14 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JSeparator();
        jMenuItem21 = new javax.swing.JMenuItem();
        jMenuItem29 = new javax.swing.JMenuItem();
        jMenuItem37 = new javax.swing.JMenuItem();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem22 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem48 = new javax.swing.JMenuItem();
        jMenuItem49 = new javax.swing.JMenuItem();
        jMenuItem55 = new javax.swing.JMenuItem();
        jSeparator7 = new javax.swing.JPopupMenu.Separator();
        jMenuItem28 = new javax.swing.JMenuItem();
        jMenuItem30 = new javax.swing.JMenuItem();
        jMenuItem52 = new javax.swing.JMenuItem();
        jMenuItem34 = new javax.swing.JMenuItem();
        jMenuItem31 = new javax.swing.JMenuItem();
        jMenuItem32 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jSeparator8 = new javax.swing.JPopupMenu.Separator();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem50 = new javax.swing.JMenuItem();
        jMenuItem51 = new javax.swing.JMenuItem();
        jMenuItem56 = new javax.swing.JMenuItem();
        jSeparator9 = new javax.swing.JPopupMenu.Separator();
        jSeparator12 = new javax.swing.JPopupMenu.Separator();
        jMenuItem35 = new javax.swing.JMenuItem();
        jMenuItem36 = new javax.swing.JMenuItem();
        jMenuItem53 = new javax.swing.JMenuItem();
        jMenuItem38 = new javax.swing.JMenuItem();
        jMenuItem39 = new javax.swing.JMenuItem();
        jMenuItem40 = new javax.swing.JMenuItem();
        jMenuItem41 = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jSeparator6 = new javax.swing.JPopupMenu.Separator();
        jMenuItem20 = new javax.swing.JMenuItem();
        jSeparator10 = new javax.swing.JPopupMenu.Separator();
        jMenuItem42 = new javax.swing.JMenuItem();
        jMenuItem43 = new javax.swing.JMenuItem();
        jMenuItem54 = new javax.swing.JMenuItem();
        jMenuItem44 = new javax.swing.JMenuItem();
        jMenuItem46 = new javax.swing.JMenuItem();
        jMenuItem47 = new javax.swing.JMenuItem();
        jSeparator11 = new javax.swing.JPopupMenu.Separator();
        jMenu10 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenuItem45 = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("File");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("Edit");
        jMenuBar4.add(jMenu8);

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu14.setText("jMenu14");

        jMenuItem21.setText("jMenuItem21");

        jMenuItem29.setText("jMenuItem29");

        jMenuItem37.setText("jMenuItem37");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 901, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );

        jMenu1.setText("Ingresar");

        jMenuItem3.setText("Libro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem4.setText("Idioma");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem5.setText("Categoria");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuItem6.setText("Autor");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem6);

        jMenuItem7.setText("Editorial");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);
        jMenu1.add(jSeparator2);

        jMenuItem8.setText("TipoDePago");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuItem22.setText("Boleta");
        jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem22ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem22);

        jMenuItem23.setText("Venta");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem23);

        jMenuItem48.setText("Factura");
        jMenuItem48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem48ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem48);

        jMenuItem49.setText("Compra");
        jMenuItem49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem49ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem49);

        jMenuItem55.setText("Arriendo");
        jMenuItem55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem55ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem55);
        jMenu1.add(jSeparator7);

        jMenuItem28.setText("Cliente");
        jMenuItem28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem28ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem28);

        jMenuItem30.setText("Trabajador");
        jMenuItem30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem30ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem30);

        jMenuItem52.setText("Distribuidor");
        jMenuItem52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem52ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem52);

        jMenuItem34.setText("TipoDeTrabajador");
        jMenuItem34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem34ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem34);

        jMenuItem31.setText("Direccion");
        jMenuItem31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem31ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem31);

        jMenuItem32.setText("Correo");
        jMenuItem32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem32ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem32);

        jMenuItem33.setText("Telefono");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem33);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Mostrar");

        jMenuItem9.setText("Autor");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem12.setText("Categoria");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem14.setText("Idioma");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem14);

        jMenuItem16.setText("Editorial");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem16);

        jMenuItem17.setText("Libro");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem17);
        jMenu2.add(jSeparator8);
        jMenu2.add(jSeparator5);

        jMenuItem19.setText("TipoDePago");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem19);

        jMenuItem24.setText("Boleta");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem24);

        jMenuItem25.setText("Venta");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem25);

        jMenuItem50.setText("Factura");
        jMenuItem50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem50ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem50);

        jMenuItem51.setText("Compra");
        jMenuItem51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem51ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem51);

        jMenuItem56.setText("Arriendo");
        jMenuItem56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem56ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem56);
        jMenu2.add(jSeparator9);
        jMenu2.add(jSeparator12);

        jMenuItem35.setText("Cliente");
        jMenuItem35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem35ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem35);

        jMenuItem36.setText("Trabajador");
        jMenuItem36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem36ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem36);

        jMenuItem53.setText("Distribuidor");
        jMenuItem53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem53ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem53);

        jMenuItem38.setText("TipoTrabajador");
        jMenuItem38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem38ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem38);

        jMenuItem39.setText("Direccion");
        jMenuItem39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem39ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem39);

        jMenuItem40.setText("Correo");
        jMenuItem40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem40ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem40);

        jMenuItem41.setText("Telefono");
        jMenuItem41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem41ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem41);
        jMenu2.add(jSeparator4);

        jMenuBar1.add(jMenu2);

        jMenu9.setText("Eliminar");

        jMenuItem10.setText("Autor");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem10);

        jMenuItem11.setText("Categoria");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem11);

        jMenuItem13.setText("Idioma");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem13);

        jMenuItem15.setText("Editorial");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem15);

        jMenuItem18.setText("Libro");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem18);
        jMenu9.add(jSeparator6);

        jMenuItem20.setText("TipoDePago");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem20);
        jMenu9.add(jSeparator10);

        jMenuItem42.setText("Cliente");
        jMenuItem42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem42ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem42);

        jMenuItem43.setText("Trabajador");
        jMenuItem43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem43ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem43);

        jMenuItem54.setText("Distribuidor");
        jMenuItem54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem54ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem54);

        jMenuItem44.setText("TipoTrabajador");
        jMenuItem44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem44ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem44);

        jMenuItem46.setText("Correo");
        jMenuItem46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem46ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem46);

        jMenuItem47.setText("Telefono");
        jMenuItem47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem47ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem47);
        jMenu9.add(jSeparator11);

        jMenuBar1.add(jMenu9);

        jMenu10.setText("Sistema Ventas");

        jMenuItem26.setText("Venta");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem26);

        jMenuItem27.setText("Compra");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem27);

        jMenuItem45.setText("Arriendo");
        jMenuItem45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem45ActionPerformed(evt);
            }
        });
        jMenu10.add(jMenuItem45);

        jMenuBar1.add(jMenu10);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
// TODO add your handling code here:
        if (ingresarLibroFrame != null) {
            this.jDesktopPane1.remove(ingresarLibroFrame);
        }
        ingresarLibroFrame = new IngresarLiibroFrame();
        this.jDesktopPane1.add(ingresarLibroFrame);
        ingresarLibroFrame.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if (ingresarIdiomaFrame != null) {
            this.jDesktopPane1.remove(ingresarIdiomaFrame);
        }
        ingresarIdiomaFrame = new IngresarIdiomaFrame();
        this.jDesktopPane1.add(ingresarIdiomaFrame);
        ingresarIdiomaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        if (ingresarCategoriaFrame != null) {
            this.jDesktopPane1.remove(ingresarCategoriaFrame);
        }
        ingresarCategoriaFrame = new IngresarCategoriaFrame();
        this.jDesktopPane1.add(ingresarCategoriaFrame);
        ingresarCategoriaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        if (ingresarAutorFrame != null) {
            this.jDesktopPane1.remove(ingresarAutorFrame);
        }
        ingresarAutorFrame = new IngresarAutorFrame();
        this.jDesktopPane1.add(ingresarAutorFrame);
        ingresarAutorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        if (ingresarEditorialFrame != null) {
            this.jDesktopPane1.remove(ingresarEditorialFrame);
        }
        ingresarEditorialFrame = new IngresarEdiitorialFrame();
        this.jDesktopPane1.add(ingresarEditorialFrame);
        ingresarEditorialFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        if (mostrarAutorFrame != null) {
            this.jDesktopPane1.remove(mostrarAutorFrame);
        }
        mostrarAutorFrame = new MostrarAutorFrame();
        this.jDesktopPane1.add(mostrarAutorFrame);
        mostrarAutorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        if (eliminarAutorFrame != null) {
            this.jDesktopPane1.remove(eliminarAutorFrame);
        }
        eliminarAutorFrame = new EliminarAutorFrame();
        this.jDesktopPane1.add(eliminarAutorFrame);
        eliminarAutorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        if (mostrarCategoriaFrame != null) {
            this.jDesktopPane1.remove(mostrarCategoriaFrame);
        }
        mostrarCategoriaFrame = new MostrarCategoriaFrame();
        this.jDesktopPane1.add(mostrarCategoriaFrame);
        mostrarCategoriaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:

        if (eliminarCategoriaFrame != null) {
            this.jDesktopPane1.remove(eliminarCategoriaFrame);
        }
        eliminarCategoriaFrame = new EliminarCategoriaFrame();
        this.jDesktopPane1.add(eliminarCategoriaFrame);
        eliminarCategoriaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        if (mostrarIdiomaFrame != null) {
            this.jDesktopPane1.remove(mostrarIdiomaFrame);
        }
        mostrarIdiomaFrame = new MostrarIdioma();
        this.jDesktopPane1.add(mostrarIdiomaFrame);
        mostrarIdiomaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        if (eliminarIdiomaFrame != null) {
            this.jDesktopPane1.remove(eliminarIdiomaFrame);
        }
        eliminarIdiomaFrame = new EliminarIdioma();
        this.jDesktopPane1.add(eliminarIdiomaFrame);
        eliminarIdiomaFrame.setVisible(true);

    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // TODO add your handling code here:
        if (mostrarEditorialFrame != null) {
            this.jDesktopPane1.remove(mostrarEditorialFrame);
        }
        mostrarEditorialFrame = new MostrarEditorialFrame();
        this.jDesktopPane1.add(mostrarEditorialFrame);
        mostrarEditorialFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
        if (eliminarEditorialFrame != null) {
            this.jDesktopPane1.remove(eliminarEditorialFrame);
        }
        eliminarEditorialFrame = new EliminarEditorialFrame();
        this.jDesktopPane1.add(eliminarEditorialFrame);
        eliminarEditorialFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        // TODO add your handling code here:
        if (mostrarLibroFrame != null) {
            this.jDesktopPane1.remove(mostrarLibroFrame);
        }
        mostrarLibroFrame = new MostrarLibroFrame();
        this.jDesktopPane1.add(mostrarLibroFrame);
        mostrarLibroFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        
        if (eliminarLibroFrame != null) {
            this.jDesktopPane1.remove(eliminarLibroFrame);
        }
        eliminarLibroFrame = new EliminarLibroFrame();
        this.jDesktopPane1.add(eliminarLibroFrame);
        eliminarLibroFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        if (eliminarTipoDePagoFrame != null) {
            this.jDesktopPane1.remove(eliminarTipoDePagoFrame);
        }
        eliminarTipoDePagoFrame = new EliminarTipoDePagoFrame();
        this.jDesktopPane1.add(eliminarTipoDePagoFrame);
        eliminarTipoDePagoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        // TODO add your handling code here:
        if (mostrarBoletaFrame != null) {
            this.jDesktopPane1.remove(mostrarBoletaFrame);
        }
        mostrarBoletaFrame = new MostrarBoletaFrame();
        this.jDesktopPane1.add(mostrarBoletaFrame);
        mostrarBoletaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenuItem28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem28ActionPerformed
        // TODO add your handling code here:
        if (ingresarClienteFrame != null) {
            this.jDesktopPane1.remove(ingresarClienteFrame);
        }
        ingresarClienteFrame = new IngresarClienteFrame();
        this.jDesktopPane1.add(ingresarClienteFrame);
        ingresarClienteFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem28ActionPerformed

    private void jMenuItem38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem38ActionPerformed
        // TODO add your handling code here:
        if (mostrarTipoTrabajadorFrame != null) {
            this.jDesktopPane1.remove(mostrarTipoTrabajadorFrame);
        }
        mostrarTipoTrabajadorFrame = new MostrarTipoTrabajadorFrame();
        this.jDesktopPane1.add(mostrarTipoTrabajadorFrame);
        mostrarTipoTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem38ActionPerformed

    private void jMenuItem47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem47ActionPerformed
        // TODO add your handling code here:
        if (eliminarTelefonoFrame != null) {
            this.jDesktopPane1.remove(eliminarTelefonoFrame);
        }
        eliminarTelefonoFrame = new EliminarTelefonoFrame();
        this.jDesktopPane1.add(eliminarTelefonoFrame);
        eliminarTelefonoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem47ActionPerformed

    private void jMenuItem35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem35ActionPerformed
        // TODO add your handling code here:
        if (mostrarClienteFrame != null) {
            this.jDesktopPane1.remove(mostrarClienteFrame);
        }
        mostrarClienteFrame = new MostrarClienteFrame();
        this.jDesktopPane1.add(mostrarClienteFrame);
        mostrarClienteFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem35ActionPerformed

    private void jMenuItem42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem42ActionPerformed
        // TODO add your handling code here:
        if (eliminarClienteFrame != null) {
            this.jDesktopPane1.remove(eliminarClienteFrame);
        }
        eliminarClienteFrame = new EliminarClienteFrame();
        this.jDesktopPane1.add(eliminarClienteFrame);
        eliminarClienteFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem42ActionPerformed

    private void jMenuItem34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem34ActionPerformed
        // TODO add your handling code here:
        if (ingresarTipoTrabajadorFrame != null) {
            this.jDesktopPane1.remove(ingresarTipoTrabajadorFrame);
        }
        ingresarTipoTrabajadorFrame = new IngresarTipotrabajadorFrame();
        this.jDesktopPane1.add(ingresarTipoTrabajadorFrame);
        ingresarTipoTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem34ActionPerformed

    private void jMenuItem44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem44ActionPerformed
        // TODO add your handling code here:
        if (eliminarTipoTrabajadorFrame != null) {
            this.jDesktopPane1.remove(eliminarTipoTrabajadorFrame);
        }
        eliminarTipoTrabajadorFrame = new EliminarTipoTrabajadorFrame();
        this.jDesktopPane1.add(eliminarTipoTrabajadorFrame);
        eliminarTipoTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem44ActionPerformed

    private void jMenuItem31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem31ActionPerformed
        // TODO add your handling code here:
        if (ingresarDireccionFrame != null) {
            this.jDesktopPane1.remove(ingresarDireccionFrame);
        }
        ingresarDireccionFrame = new IngresarDireccionFrame();
        this.jDesktopPane1.add(ingresarDireccionFrame);
        ingresarDireccionFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem31ActionPerformed

    private void jMenuItem39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem39ActionPerformed
        // TODO add your handling code here:
        if (mostrarDireccionFrame != null) {
            this.jDesktopPane1.remove(mostrarDireccionFrame);
        }
        mostrarDireccionFrame = new MostrarDireccionFrame();
        this.jDesktopPane1.add(mostrarDireccionFrame);
        mostrarDireccionFrame.setVisible(true);                                           
    }//GEN-LAST:event_jMenuItem39ActionPerformed

    private void jMenuItem32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem32ActionPerformed

        // TODO add your handling code here:
        if (ingresarCorreoFrame != null) {
            this.jDesktopPane1.remove(ingresarCorreoFrame);
        }
        ingresarCorreoFrame = new IngresarCorreoFrame();
        this.jDesktopPane1.add(ingresarCorreoFrame);
        ingresarCorreoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem32ActionPerformed

    private void jMenuItem30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem30ActionPerformed
        // TODO add your handling code here:
        if (ingresarTrabajadorFrame != null) {
            this.jDesktopPane1.remove(ingresarTrabajadorFrame);
        }
        ingresarTrabajadorFrame = new IngresarTrabajadorFrame();
        this.jDesktopPane1.add(ingresarTrabajadorFrame);
        ingresarTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem30ActionPerformed

    private void jMenuItem40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem40ActionPerformed
        // TODO add your handling code here:
        if (mostrarCorreoFrame != null) {
            this.jDesktopPane1.remove(mostrarCorreoFrame);
        }
        mostrarCorreoFrame = new MostrarCorreoFrame();
        this.jDesktopPane1.add(mostrarCorreoFrame);
        mostrarCorreoFrame.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem40ActionPerformed

    private void jMenuItem46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem46ActionPerformed
        // TODO add your handling code here:
        if (eliminarCorreoFrame != null) {
            this.jDesktopPane1.remove(eliminarCorreoFrame);
        }
        eliminarCorreoFrame = new EliminarCorreoFrame();
        this.jDesktopPane1.add(eliminarCorreoFrame);
        eliminarCorreoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem46ActionPerformed

    private void jMenuItem43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem43ActionPerformed
        // TODO add your handling code here:
        if (eliminarTrabajadorFrame != null) {
            this.jDesktopPane1.remove(eliminarTrabajadorFrame);
        }
        eliminarTrabajadorFrame = new EliminarTrabajadorFrame();
        this.jDesktopPane1.add(eliminarTrabajadorFrame);
        eliminarTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem43ActionPerformed

    private void jMenuItem36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem36ActionPerformed
        // TODO add your handling code here:
        if (mostrarTrabajadorFrame != null) {
            this.jDesktopPane1.remove(mostrarTrabajadorFrame);
        }
        mostrarTrabajadorFrame = new MostrarTrabajadorFrame();
        this.jDesktopPane1.add(mostrarTrabajadorFrame);
        mostrarTrabajadorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem36ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        // TODO add your handling code here:
        if (ingresarTelefonoFrame != null) {
            this.jDesktopPane1.remove(ingresarTelefonoFrame);
        }
        ingresarTelefonoFrame = new IngresarTelefonoFrame();
        this.jDesktopPane1.add(ingresarTelefonoFrame);
        ingresarTelefonoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem41ActionPerformed
        // TODO add your handling code here:
        if (mostrarTelefonoFrame != null) {
            this.jDesktopPane1.remove(mostrarTelefonoFrame);
        }
        mostrarTelefonoFrame = new MostrarTelefonoFrame();
        this.jDesktopPane1.add(mostrarTelefonoFrame);
        mostrarTelefonoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem41ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        if (ingresarTipoDePagoFrame != null) {
            this.jDesktopPane1.remove(ingresarTipoDePagoFrame);
        }
        ingresarTipoDePagoFrame = new IngresarTipoDePagoFrame();
        this.jDesktopPane1.add(ingresarTipoDePagoFrame);
        ingresarTipoDePagoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
        if (mostrarTipoDePagoFrame != null) {
            this.jDesktopPane1.remove(mostrarTipoDePagoFrame);
        }
        mostrarTipoDePagoFrame = new MostrarTipoDePagoFrame();
        this.jDesktopPane1.add(mostrarTipoDePagoFrame);
        mostrarTipoDePagoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
        // TODO add your handling code here:
        if (ingresarBoletaFrame != null) {
            this.jDesktopPane1.remove(ingresarBoletaFrame);
        }
        ingresarBoletaFrame = new IngresarBoletaFrame();
        this.jDesktopPane1.add(ingresarBoletaFrame);
        ingresarBoletaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem22ActionPerformed

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        // TODO add your handling code here:
        if (ingresarVentaFrame != null) {
            this.jDesktopPane1.remove(ingresarVentaFrame);
        }
        ingresarVentaFrame = new IngresarVentaFrame();
        this.jDesktopPane1.add(ingresarVentaFrame);
        ingresarVentaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        // TODO add your handling code here:
        if (mostrarVentaFrame != null) {
            this.jDesktopPane1.remove(mostrarVentaFrame);
        }
        mostrarVentaFrame = new MostrarVentaFrame();
        this.jDesktopPane1.add(mostrarVentaFrame);
        mostrarVentaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        // TODO add your handling code here:
        if (ingresarSistemaVentaFrame != null) {
            this.jDesktopPane1.remove(ingresarSistemaVentaFrame);
        }
        ingresarSistemaVentaFrame = new IngresarSistemaVentaFrame();
        this.jDesktopPane1.add(ingresarSistemaVentaFrame);
        ingresarSistemaVentaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem48ActionPerformed
        // TODO add your handling code here:
        if (ingresarFacturaFrame != null) {
            this.jDesktopPane1.remove(ingresarFacturaFrame);
        }
        ingresarFacturaFrame = new IngresarFacturaFrame();
        this.jDesktopPane1.add(ingresarFacturaFrame);
        ingresarFacturaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem48ActionPerformed

    private void jMenuItem50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem50ActionPerformed
        // TODO add your handling code here:
        if (mostrarFacturaFrame != null) {
            this.jDesktopPane1.remove(mostrarFacturaFrame);
        }
        mostrarFacturaFrame = new MostrarFacturaFrame();
        this.jDesktopPane1.add(mostrarFacturaFrame);
        mostrarFacturaFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem50ActionPerformed

    private void jMenuItem49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem49ActionPerformed
        // TODO add your handling code here:
        if (ingresarCompraFrame != null) {
            this.jDesktopPane1.remove(ingresarCompraFrame);
        }
        ingresarCompraFrame = new IngresarCompraFrame();
        this.jDesktopPane1.add(ingresarCompraFrame);
        ingresarCompraFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem49ActionPerformed

    private void jMenuItem51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem51ActionPerformed
        // TODO add your handling code here:
        if (mostrarCompraFrame != null) {
            this.jDesktopPane1.remove(mostrarCompraFrame);
        }
        mostrarCompraFrame = new MostrarCompraFrame();
        this.jDesktopPane1.add(mostrarCompraFrame);
        mostrarCompraFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem51ActionPerformed

    private void jMenuItem52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem52ActionPerformed
        // TODO add your handling code here:
        if (ingresarDistribuidorFrame != null) {
            this.jDesktopPane1.remove(ingresarDistribuidorFrame);
        }
        ingresarDistribuidorFrame = new IngresarDistribuidorFrame();
        this.jDesktopPane1.add(ingresarDistribuidorFrame);
        ingresarDistribuidorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem52ActionPerformed

    private void jMenuItem53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem53ActionPerformed
        // TODO add your handling code here:
        if (mostrarDistribuidorFrame != null) {
            this.jDesktopPane1.remove(mostrarDistribuidorFrame);
        }
        mostrarDistribuidorFrame = new MostrarDistribuidorFrame();
        this.jDesktopPane1.add(mostrarDistribuidorFrame);
        mostrarDistribuidorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem53ActionPerformed

    private void jMenuItem54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem54ActionPerformed
        // TODO add your handling code here:
        if (eliminarDistribuidorFrame != null) {
            this.jDesktopPane1.remove(eliminarDistribuidorFrame);
        }
        eliminarDistribuidorFrame = new EliminarDistribuidorFrame();
        this.jDesktopPane1.add(eliminarDistribuidorFrame);
        eliminarDistribuidorFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem54ActionPerformed

    private void jMenuItem55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem55ActionPerformed
        // TODO add your handling code here:
        if (ingresarArriendoFrame != null) {
            this.jDesktopPane1.remove(ingresarArriendoFrame);
        }
        ingresarArriendoFrame = new IngresarArriendoFrame();
        this.jDesktopPane1.add(ingresarArriendoFrame);
        ingresarArriendoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem55ActionPerformed

    private void jMenuItem56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem56ActionPerformed
        // TODO add your handling code here:
        if (mostrarArriendoFrame != null) {
            this.jDesktopPane1.remove(mostrarArriendoFrame);
        }
        mostrarArriendoFrame = new MostrarArriendoFrame();
        this.jDesktopPane1.add(mostrarArriendoFrame);
        mostrarArriendoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem56ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        // TODO add your handling code here:
        if (sistemaCompraFrame != null) {
            this.jDesktopPane1.remove(sistemaCompraFrame);
        }
        sistemaCompraFrame = new SistemaCompraFrame();
        this.jDesktopPane1.add(sistemaCompraFrame);
        sistemaCompraFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem45ActionPerformed
        // TODO add your handling code here:
        
        if (sistemaArriendoFrame != null) {
            this.jDesktopPane1.remove(sistemaArriendoFrame);
        }
        sistemaArriendoFrame = new SistemaArriendoFrame();
        this.jDesktopPane1.add(sistemaArriendoFrame);
        sistemaArriendoFrame.setVisible(true);
    }//GEN-LAST:event_jMenuItem45ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem22;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem28;
    private javax.swing.JMenuItem jMenuItem29;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem30;
    private javax.swing.JMenuItem jMenuItem31;
    private javax.swing.JMenuItem jMenuItem32;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JMenuItem jMenuItem34;
    private javax.swing.JMenuItem jMenuItem35;
    private javax.swing.JMenuItem jMenuItem36;
    private javax.swing.JMenuItem jMenuItem37;
    private javax.swing.JMenuItem jMenuItem38;
    private javax.swing.JMenuItem jMenuItem39;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem40;
    private javax.swing.JMenuItem jMenuItem41;
    private javax.swing.JMenuItem jMenuItem42;
    private javax.swing.JMenuItem jMenuItem43;
    private javax.swing.JMenuItem jMenuItem44;
    private javax.swing.JMenuItem jMenuItem45;
    private javax.swing.JMenuItem jMenuItem46;
    private javax.swing.JMenuItem jMenuItem47;
    private javax.swing.JMenuItem jMenuItem48;
    private javax.swing.JMenuItem jMenuItem49;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem50;
    private javax.swing.JMenuItem jMenuItem51;
    private javax.swing.JMenuItem jMenuItem52;
    private javax.swing.JMenuItem jMenuItem53;
    private javax.swing.JMenuItem jMenuItem54;
    private javax.swing.JMenuItem jMenuItem55;
    private javax.swing.JMenuItem jMenuItem56;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator10;
    private javax.swing.JPopupMenu.Separator jSeparator11;
    private javax.swing.JPopupMenu.Separator jSeparator12;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JPopupMenu.Separator jSeparator6;
    private javax.swing.JPopupMenu.Separator jSeparator7;
    private javax.swing.JPopupMenu.Separator jSeparator8;
    private javax.swing.JPopupMenu.Separator jSeparator9;
    // End of variables declaration//GEN-END:variables
}
