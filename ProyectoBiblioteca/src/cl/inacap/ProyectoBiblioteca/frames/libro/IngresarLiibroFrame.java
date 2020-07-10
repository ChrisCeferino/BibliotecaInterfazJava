/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.ProyectoBiblioteca.frames.libro;

import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.AutorDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.AutorLibroDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.CategoriaDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.EditorialDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.IdiomaDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.IdiomaLibroDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.LibroCategoriaDAO;
import cl.inacap.ProyectoBibliotecaModel.DAO.LibroDAO.LibroDAO;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Autor;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.AutorLibro;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Categoria;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Editorial;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Idioma;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.IdiomaLibro;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.Libro;
import cl.inacap.ProyectoBibliotecaModel.DTO.Libro.LibroCategoria;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Garnios
 */
public class IngresarLiibroFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form IngresarLiibroFrame
     */
    public IngresarLiibroFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        serieTxt = new javax.swing.JTextField();
        isbnTxt = new javax.swing.JTextField();
        tituloTxt = new javax.swing.JTextField();
        paginasTxt = new javax.swing.JTextField();
        precioTxt = new javax.swing.JTextField();
        anTxt = new javax.swing.JTextField();
        estadoTxt = new javax.swing.JTextField();
        editCbx = new javax.swing.JComboBox<>();
        IdiCbx = new javax.swing.JComboBox<>();
        CatCbx = new javax.swing.JComboBox<>();
        AutCbx = new javax.swing.JComboBox<>();
        ingresarBtn = new javax.swing.JButton();

        setClosable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ingreso Libro");

        jLabel2.setText("Nro. Serie:");

        jLabel3.setText("ISBN: ");

        jLabel4.setText("Titulo:");

        jLabel5.setText("Nro. Paginas: ");

        jLabel6.setText("Precio:");

        jLabel7.setText("Año:");

        jLabel8.setText("Estado:");

        jLabel9.setText("Editorial: ");

        jLabel10.setText("Idioma:");

        jLabel11.setText("Categoria: ");

        jLabel12.setText("Autor: ");

        serieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serieTxtActionPerformed(evt);
            }
        });

        anTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anTxtActionPerformed(evt);
            }
        });

        estadoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                estadoTxtActionPerformed(evt);
            }
        });

        IdiCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IdiCbxActionPerformed(evt);
            }
        });

        CatCbx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatCbxActionPerformed(evt);
            }
        });

        ingresarBtn.setText("Ingresar Libro");
        ingresarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(serieTxt)
                            .addComponent(isbnTxt)
                            .addComponent(tituloTxt)
                            .addComponent(paginasTxt)
                            .addComponent(precioTxt)
                            .addComponent(anTxt)
                            .addComponent(estadoTxt)
                            .addComponent(editCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdiCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CatCbx, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(AutCbx, 0, 203, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(serieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tituloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(paginasTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(anTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(estadoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(editCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(IdiCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(CatCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(AutCbx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingresarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarBtnActionPerformed
        // TODO add your handling code here:
        try{
            int serie=Integer.parseInt(this.serieTxt.getText().trim());
            int isbn=Integer.parseInt(this.isbnTxt.getText().trim());
            String titulo=this.tituloTxt.getText().trim();
            int npag=Integer.parseInt(this.paginasTxt.getText().trim());
            int precio=Integer.parseInt(this.precioTxt.getText().trim());
            String ano=this.anTxt.getText().trim();
            String estado=this.estadoTxt.getText().trim();
            Editorial edit= (Editorial) this.editCbx.getSelectedItem();
            int ideditorial = edit.getId();

            Libro p = new Libro();
            p.setIdSerie(serie);
            p.setIsbn(isbn);
            p.setTitulo(titulo);
            p.setNpag(npag);
            p.setPrecio(precio);
            p.setAño(ano);
            p.setEstado(estado);
            p.setId_Editorial(ideditorial);
            
            new LibroDAO().ingresarLibro(p);
            
            //
            IdiomaLibro q = new IdiomaLibro();
            Idioma i = (Idioma) this.IdiCbx.getSelectedItem();
            int ididioma = i.getIdIdioma();
            q.setIdIdioma(ididioma);
            q.setIdLibro(serie);
            
            new IdiomaLibroDAO().ingresarIdiomaLibro(q);
            
            //
            LibroCategoria w = new LibroCategoria();
            Categoria e = (Categoria) this.CatCbx.getSelectedItem();
            int idcat = e.getId();
            w.setIdCateg(idcat);
            w.setIdLibro(serie);
            
            new LibroCategoriaDAO().ingresarLibroCategoria(w);
            //
            AutorLibro r = new AutorLibro();
            Autor t = (Autor) this.AutCbx.getSelectedItem();
            int idaut= t.getId();
            r.setIdAutor(idaut);
            r.setIdLibro(serie);
            
            new AutorLibroDAO().ingresarAutorLibro(r);
            
            this.dispose();
            JOptionPane.showMessageDialog(null, "Ingresado OK");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null, "Error al Ingresar un Libro");
       }
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_ingresarBtnActionPerformed

    private void serieTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serieTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_serieTxtActionPerformed

    private void anTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anTxtActionPerformed

    private void estadoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_estadoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_estadoTxtActionPerformed

    private void CatCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatCbxActionPerformed

    private void IdiCbxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IdiCbxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IdiCbxActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        List<Editorial> e = new EditorialDAO().getEditoriales();
        this.editCbx.removeAllItems();
        for(Editorial p : e){
            this.editCbx.addItem(p);
        }
        List<Idioma> a = new IdiomaDAO().getIdiomas();
        this.IdiCbx.removeAllItems();
        for(Idioma p : a){
            this.IdiCbx.addItem(p);
        }
        List<Categoria> w = new CategoriaDAO().getCategorias();
        this.CatCbx.removeAllItems();
        for(Categoria p : w){
            this.CatCbx.addItem(p);
        }
        List<Autor> f = new AutorDAO().getAutores();
        this.AutCbx.removeAllItems();
        for(Autor p : f){
            this.AutCbx.addItem(p);
        }
        
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Autor> AutCbx;
    private javax.swing.JComboBox<Categoria> CatCbx;
    private javax.swing.JComboBox<Idioma> IdiCbx;
    private javax.swing.JTextField anTxt;
    private javax.swing.JComboBox<Editorial> editCbx;
    private javax.swing.JTextField estadoTxt;
    private javax.swing.JButton ingresarBtn;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField paginasTxt;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JTextField serieTxt;
    private javax.swing.JTextField tituloTxt;
    // End of variables declaration//GEN-END:variables
}