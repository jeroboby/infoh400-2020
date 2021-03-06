/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ulb.lisa.infoh400.labs2020.view;

import java.awt.Color;
import java.util.List;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import ulb.lisa.infoh400.labs2020.controller.FHIRServices;
import ulb.lisa.infoh400.labs2020.controller.PatientJpaController;
import ulb.lisa.infoh400.labs2020.controller.PersonJpaController;
import ulb.lisa.infoh400.labs2020.model.Patient;

/**
 *
 * @author Adrien Foucart
 */
public class FHIRSearchWindow extends javax.swing.JFrame {
    
    private final EntityManagerFactory emfac = Persistence.createEntityManagerFactory("infoh400_PU");
    private final PatientJpaController patientCtrl = new PatientJpaController(emfac);
    private final PersonJpaController personCtrl = new PersonJpaController(emfac);
    
    /**
     * Creates new form FHIRSearchWindow
     */
    public FHIRSearchWindow() {
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

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        patientNameTextField = new javax.swing.JTextField();
        searchPatientButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        fhirServerBaseTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        searchPatientResultsList = new javax.swing.JList<>();
        savePatientButton = new javax.swing.JButton();
        searchResultLabel = new javax.swing.JLabel();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search Patient");

        jLabel2.setText("Patient Name:");

        searchPatientButton.setText("Search");
        searchPatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchPatientButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Server:");

        fhirServerBaseTextField.setText("http://fhirtest.uhn.ca/baseDstu3");

        jScrollPane1.setViewportView(searchPatientResultsList);

        savePatientButton.setText("Save");
        savePatientButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savePatientButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fhirServerBaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchPatientButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(savePatientButton))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(patientNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fhirServerBaseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(searchPatientButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(searchResultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(savePatientButton))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchPatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchPatientButtonActionPerformed
        FHIRServices fhir = new FHIRServices();
        List<Patient> found = fhir.searchPatientsByName(patientNameTextField.getText(), fhirServerBaseTextField.getText());
        if( found.isEmpty() ){
            searchResultLabel.setText("No patient found.");
            searchResultLabel.setBackground(Color.red);
            searchResultLabel.setOpaque(true);
        }
        else{
            searchResultLabel.setText(found.size() + " patients found.");
            searchResultLabel.setBackground(Color.green);
            searchResultLabel.setOpaque(true);
        }
                
        EntityListModel<Patient> model = new EntityListModel(found);
        searchPatientResultsList.setModel(model);
    }//GEN-LAST:event_searchPatientButtonActionPerformed

    private void savePatientButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savePatientButtonActionPerformed
        if( searchPatientResultsList.getSelectedIndex() < 0 ){
            return;
        }
        EntityListModel<Patient> model = (EntityListModel) searchPatientResultsList.getModel();
        Patient selected = model.getList().get(searchPatientResultsList.getSelectedIndex());
        
        personCtrl.create(selected.getIdperson());
        patientCtrl.create(selected);
        
        searchResultLabel.setText("Patient saved to database.");
        searchResultLabel.setBackground(Color.yellow);
        searchResultLabel.setOpaque(true);
    }//GEN-LAST:event_savePatientButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField fhirServerBaseTextField;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField patientNameTextField;
    private javax.swing.JButton savePatientButton;
    private javax.swing.JButton searchPatientButton;
    private javax.swing.JList<String> searchPatientResultsList;
    private javax.swing.JLabel searchResultLabel;
    // End of variables declaration//GEN-END:variables
}
