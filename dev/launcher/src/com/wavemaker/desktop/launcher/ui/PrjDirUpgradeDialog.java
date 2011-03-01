/*
 * Copyright (C) 2011 WaveMaker Software, Inc.
 *
 * This file is part of WaveMaker Studio.
 *
 * WaveMaker Studio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, version 3 of the License, only.
 *
 * WaveMaker Studio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with WaveMaker Studio.  If not, see <http://www.gnu.org/licenses/>.
 */ 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PrjDirUpgradeDialog.java
 *
 * Created on Jan 5, 2011, 8:42:15 AM
 */
package com.wavemaker.desktop.launcher.ui;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cconover
 */
public class PrjDirUpgradeDialog extends javax.swing.JFrame
{

    private boolean normalClose = false;
    protected String version;
    protected File projectsDir;
    protected File existingDir;

    /** Creates new form PrjDirUpgradeDialog */
    public PrjDirUpgradeDialog(
            String version,
            File existingProjectsDirectory,
            File defaultProjectsDirectory)
    {
        this(version, existingProjectsDirectory, defaultProjectsDirectory, false);
    }

    public PrjDirUpgradeDialog(
            String version, File existingProjectsDirectory,
            File defaultProjectsDirectory, boolean majorUpgrade)
    {
        initComponents();

        this.version = version;
        this.existingDir = existingProjectsDirectory;
        this.projectsDir = existingProjectsDirectory;
        if (defaultProjectsDirectory != null)
        {
            this.projectsDir = defaultProjectsDirectory;
        }

        if (majorUpgrade)
        {
//            this.copyProjectsButton.setSelected(true);
        }
        else
        {
//            this.oldProjectsButton.setSelected(true);
        }
        
//        this.setModal(true);
        this.setSize(this.getPreferredSize());
    }

    


    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgPrjDir = new javax.swing.ButtonGroup();
        lblCongrats = new javax.swing.JLabel();
        lblClearCache = new javax.swing.JLabel();
        rbUseCurDir = new javax.swing.JRadioButton();
        rbUseNewDir = new javax.swing.JRadioButton();
        pnlNewDirFields = new javax.swing.JPanel();
        lblChooseDir = new javax.swing.JLabel();
        tfNewPrjDir = new javax.swing.JTextField();
        btnFileChooser = new javax.swing.JButton();
        ckbCopyProjects = new javax.swing.JCheckBox();
        btnOk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/wavemaker/desktop/launcher/ui/Bundle"); // NOI18N
        setTitle(bundle.getString("PrjDirUpgradeDialog.title")); // NOI18N
        setBackground(new java.awt.Color(255, 255, 255));

        lblCongrats.setBackground(new java.awt.Color(255, 255, 255));
        lblCongrats.setText(bundle.getString("PrjDirUpgradeDialog.lblCongrats.text")); // NOI18N
        lblCongrats.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        lblClearCache.setBackground(new java.awt.Color(255, 255, 255));
        lblClearCache.setText(bundle.getString("PrjDirUpgradeDialog.lblClearCache.text")); // NOI18N

        rbUseCurDir.setBackground(new java.awt.Color(255, 255, 255));
        rbgPrjDir.add(rbUseCurDir);
        rbUseCurDir.setSelected(true);
        rbUseCurDir.setText(bundle.getString("PrjDirUpgradeDialog.rbUseCurDir.text")); // NOI18N
        rbUseCurDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUseCurDirActionPerformed(evt);
            }
        });

        rbUseNewDir.setBackground(new java.awt.Color(255, 255, 255));
        rbgPrjDir.add(rbUseNewDir);
        rbUseNewDir.setText(bundle.getString("PrjDirUpgradeDialog.rbUseNewDir.text")); // NOI18N
        rbUseNewDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbUseNewDirActionPerformed(evt);
            }
        });

        pnlNewDirFields.setBackground(new java.awt.Color(255, 255, 255));
        pnlNewDirFields.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblChooseDir.setLabelFor(tfNewPrjDir);
        lblChooseDir.setText(bundle.getString("PrjDirUpgradeDialog.lblChooseDir.text")); // NOI18N

        tfNewPrjDir.setEditable(false);
        tfNewPrjDir.setText("c:\\dev\\wavemaker");
        tfNewPrjDir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNewPrjDirActionPerformed(evt);
            }
        });

        btnFileChooser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wavemaker/desktop/launcher/ui/folder.png"))); // NOI18N
        btnFileChooser.setText(bundle.getString("PrjDirUpgradeDialog.btnFileChooser.text")); // NOI18N
        btnFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooserActionPerformed(evt);
            }
        });

        ckbCopyProjects.setBackground(new java.awt.Color(255, 255, 255));
        ckbCopyProjects.setText(bundle.getString("PrjDirUpgradeDialog.ckbCopyProjects.text")); // NOI18N

        org.jdesktop.layout.GroupLayout pnlNewDirFieldsLayout = new org.jdesktop.layout.GroupLayout(pnlNewDirFields);
        pnlNewDirFields.setLayout(pnlNewDirFieldsLayout);
        pnlNewDirFieldsLayout.setHorizontalGroup(
            pnlNewDirFieldsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlNewDirFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlNewDirFieldsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(ckbCopyProjects, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .add(pnlNewDirFieldsLayout.createSequentialGroup()
                        .add(lblChooseDir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 162, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(tfNewPrjDir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(btnFileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlNewDirFieldsLayout.setVerticalGroup(
            pnlNewDirFieldsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlNewDirFieldsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlNewDirFieldsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(tfNewPrjDir, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(lblChooseDir)
                    .add(btnFileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(ckbCopyProjects)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnOk.setText(bundle.getString("PrjDirUpgradeDialog.btnOk.text")); // NOI18N
        btnOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(lblClearCache, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(lblCongrats, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(pnlNewDirFields, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(rbUseCurDir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(rbUseNewDir, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 536, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, btnOk, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 63, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(lblCongrats)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(lblClearCache)
                .add(18, 18, 18)
                .add(rbUseCurDir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(rbUseNewDir)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlNewDirFields, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnOk, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNewPrjDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_tfNewPrjDirActionPerformed
    {//GEN-HEADEREND:event_tfNewPrjDirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNewPrjDirActionPerformed

    private void btnFileChooserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFileChooserActionPerformed
    {//GEN-HEADEREND:event_btnFileChooserActionPerformed
        final JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        
        if (projectsDir != null)
        {
            chooser.setCurrentDirectory(projectsDir);
        }

        if (chooser.showOpenDialog(getParent()) == JFileChooser.APPROVE_OPTION)
        {
            tfNewPrjDir.setText(chooser.getSelectedFile().getAbsolutePath());
            projectsDir = chooser.getCurrentDirectory();
        }
    }//GEN-LAST:event_btnFileChooserActionPerformed

    private void btnOkActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnOkActionPerformed
    {//GEN-HEADEREND:event_btnOkActionPerformed
        boolean success = true;
        
        if (rbUseNewDir.isSelected())
        {
            // Test Projects directory
                // Check if path exists
                if (projectsDir.exists())
                {
                    // Check if a directory
                    if (projectsDir.isDirectory())
                    {
                        // Check if writable
                        if (!ckbCopyProjects.isSelected() && projectsDir.canWrite())
                        {
                            JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), 
                                "Unable to write to \"" + projectsDir.getAbsolutePath() 
                                + "\".\nPlease correct the permissions or select a different location.", 
                                "Error Opening Projects Directory:", JOptionPane.ERROR_MESSAGE);
                            
                            success = false;
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(), "\"" 
                            + projectsDir.getAbsolutePath() 
                            + "\" is not a directory.\nPlease select a different location.", 
                            "Error Opening Projects Directory:", JOptionPane.ERROR_MESSAGE);
                        
                        success = false;
                    }
                }
                else
                {
                    // Create
                    if (!projectsDir.mkdirs())
                    {
                        // Unable to create directories
                        JOptionPane.showMessageDialog(JOptionPane.getRootFrame(),
                            "", "Error Creating Projects Directory:", 
                            JOptionPane.ERROR_MESSAGE);
                        
                        success = false;
                    }
            }
        }
        
        if (success)
        {
            normalClose = true;
            dispose();
        }
    }//GEN-LAST:event_btnOkActionPerformed

    private void rbUseNewDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUseNewDirActionPerformed
    {//GEN-HEADEREND:event_rbUseNewDirActionPerformed
        enablePrjDirFields(rbUseNewDir.isSelected());
    }//GEN-LAST:event_rbUseNewDirActionPerformed

    private void rbUseCurDirActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_rbUseCurDirActionPerformed
    {//GEN-HEADEREND:event_rbUseCurDirActionPerformed
        enablePrjDirFields(rbUseNewDir.isSelected());
    }//GEN-LAST:event_rbUseCurDirActionPerformed

    private void enablePrjDirFields(boolean enable)
    {
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFileChooser;
    private javax.swing.JButton btnOk;
    private javax.swing.JCheckBox ckbCopyProjects;
    private javax.swing.JLabel lblChooseDir;
    private javax.swing.JLabel lblClearCache;
    private javax.swing.JLabel lblCongrats;
    private javax.swing.JPanel pnlNewDirFields;
    private javax.swing.JRadioButton rbUseCurDir;
    private javax.swing.JRadioButton rbUseNewDir;
    private javax.swing.ButtonGroup rbgPrjDir;
    private javax.swing.JTextField tfNewPrjDir;
    // End of variables declaration//GEN-END:variables
}
