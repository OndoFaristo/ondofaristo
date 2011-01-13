/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * LauncherAdvOptsDialog.java
 *
 * Created on Jan 5, 2011, 11:43:55 AM
 */
package com.wavemaker.desktop.launcher.ui;

import com.wavemaker.desktop.launcher.Main;
import java.io.File;

import java.io.IOException;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author cconover
 */
public class LauncherAdvOptsDialog extends javax.swing.JDialog
{
    private MainConsole console;
    private String folder = null;

    /** Creates new form LauncherAdvOptsDialog */
    public LauncherAdvOptsDialog(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        console = (MainConsole)parent;
        initComponents();
        initOptions();
    }

    private void initOptions()
    {
        ckbAutoLaunch.setSelected(console.prefs.getBoolean(MainConsole.OPTION_AUTO_LAUNCH, false));
        tfBrowser.setText(console.prefs.get(MainConsole.OPTION_STUDIO_BROWSER, MainConsole.VAL_SYS_DEF_BROWSER));
        ckbStudioDebug.setSelected(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_DEBUG, false));
        ckbLiveLayout.setSelected(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_LIVELAYOUT, true));
        ckbSubPageDisplay.setSelected(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_SUBPAGES, true));
        tfNewServerPort.setText(String.valueOf(console.tomcatConfig.getServicePort()));
        tfNewShutdownPort.setText(String.valueOf(console.tomcatConfig.getShutdownPort()));

        console.optionsSave.put(MainConsole.OPTION_AUTO_LAUNCH,
            String.valueOf(console.prefs.getBoolean(MainConsole.OPTION_AUTO_LAUNCH, true)));

        console.optionsSave.put(MainConsole.OPTION_STUDIO_BROWSER, 
            String.valueOf(console.prefs.get(MainConsole.OPTION_STUDIO_BROWSER, MainConsole.VAL_SYS_DEF_BROWSER)));

        console.optionsSave.put(MainConsole.OPTION_ENABLE_DEBUG,
            String.valueOf(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_DEBUG, false)));

        console.optionsSave.put(MainConsole.OPTION_ENABLE_LIVELAYOUT, 
            String.valueOf(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_LIVELAYOUT, true)));

        console.optionsSave.put(MainConsole.OPTION_ENABLE_SUBPAGES, 
            String.valueOf(console.prefs.getBoolean(MainConsole.OPTION_ENABLE_SUBPAGES, true)));

        console.optionsSave.put(MainConsole.OPTION_SERVER_PORT, 
            String.valueOf(console.tomcatConfig.getServicePort()));

        console.optionsSave.put(MainConsole.OPTION_SHUTDOWN_PORT,
            String.valueOf(console.tomcatConfig.getShutdownPort()));
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnReset = new javax.swing.JButton();
        ckbAutoLaunch = new javax.swing.JCheckBox();
        lblBrowser = new javax.swing.JLabel();
        tfBrowser = new javax.swing.JTextField();
        btnFileChooser = new javax.swing.JButton();
        btnDefBrowser = new javax.swing.JButton();
        pnlPorts = new javax.swing.JPanel();
        lblNewServerPort = new javax.swing.JLabel();
        tfNewServerPort = new javax.swing.JTextField();
        lblNewShutdownPort = new javax.swing.JLabel();
        tfNewShutdownPort = new javax.swing.JTextField();
        pnlCheckboxes = new javax.swing.JPanel();
        ckbLiveLayout = new javax.swing.JCheckBox();
        ckbSubPageDisplay = new javax.swing.JCheckBox();
        ckbStudioDebug = new javax.swing.JCheckBox();
        pnlButtons = new javax.swing.JPanel();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("com/wavemaker/desktop/launcher/ui/Bundle"); // NOI18N
        btnReset.setText(bundle.getString("LauncherAdvOptsDialog.btnReset.text")); // NOI18N
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(bundle.getString("LauncherAdvOptsDialog.title")); // NOI18N
        setAlwaysOnTop(true);
        setModalityType(java.awt.Dialog.ModalityType.APPLICATION_MODAL);
        setName("LaunchAdvOptsDlg"); // NOI18N

        ckbAutoLaunch.setBackground(new java.awt.Color(255, 255, 255));
        ckbAutoLaunch.setSelected(true);
        ckbAutoLaunch.setText(bundle.getString("LauncherAdvOptsDialog.ckbAutoLaunch.text")); // NOI18N

        lblBrowser.setLabelFor(tfBrowser);
        lblBrowser.setText(bundle.getString("LauncherAdvOptsDialog.lblBrowser.text")); // NOI18N

        tfBrowser.setEditable(false);
        tfBrowser.setText(bundle.getString("SYSTEM_DEFAULT_BROWSER")); // NOI18N

        btnFileChooser.setText("...");
        btnFileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFileChooserActionPerformed(evt);
            }
        });

        btnDefBrowser.setText(bundle.getString("LauncherAdvOptsDialog.btnDefBrowser.text")); // NOI18N
        btnDefBrowser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDefBrowserActionPerformed(evt);
            }
        });

        pnlPorts.setBackground(new java.awt.Color(255, 255, 255));
        pnlPorts.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LauncherAdvOptsDialog.pnlPorts.border.title"))); // NOI18N

        lblNewServerPort.setLabelFor(tfNewServerPort);
        lblNewServerPort.setText(bundle.getString("LauncherAdvOptsDialog.lblNewServerPort.text")); // NOI18N

        tfNewServerPort.setText("8194");
        tfNewServerPort.setToolTipText(bundle.getString("LauncherAdvOptsDialog.tfNewServerPort.toolTipText")); // NOI18N
        tfNewServerPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNewServerPortFocusLost(evt);
            }
        });

        lblNewShutdownPort.setLabelFor(tfNewShutdownPort);
        lblNewShutdownPort.setText(bundle.getString("LauncherAdvOptsDialog.lblNewShutdownPort.text")); // NOI18N

        tfNewShutdownPort.setText("8119");
        tfNewShutdownPort.setToolTipText(bundle.getString("LauncherAdvOptsDialog.tfNewShutdownPort.toolTipText")); // NOI18N
        tfNewShutdownPort.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tfNewShutdownPortFocusLost(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlPortsLayout = new org.jdesktop.layout.GroupLayout(pnlPorts);
        pnlPorts.setLayout(pnlPortsLayout);
        pnlPortsLayout.setHorizontalGroup(
            pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPortsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(lblNewShutdownPort, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(lblNewServerPort, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(tfNewShutdownPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(tfNewServerPort, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlPortsLayout.setVerticalGroup(
            pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlPortsLayout.createSequentialGroup()
                .add(6, 6, 6)
                .add(pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNewServerPort)
                    .add(tfNewServerPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(pnlPortsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(lblNewShutdownPort)
                    .add(tfNewShutdownPort, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        pnlCheckboxes.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheckboxes.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("LauncherAdvOptsDialog.pnlCheckboxes.border.title"))); // NOI18N

        ckbLiveLayout.setBackground(new java.awt.Color(255, 255, 255));
        ckbLiveLayout.setSelected(true);
        ckbLiveLayout.setText(bundle.getString("LauncherAdvOptsDialog.ckbLiveLayout.text")); // NOI18N
        ckbLiveLayout.setToolTipText(bundle.getString("LauncherAdvOptsDialog.ckbLiveLayout.toolTipText")); // NOI18N

        ckbSubPageDisplay.setBackground(new java.awt.Color(255, 255, 255));
        ckbSubPageDisplay.setSelected(true);
        ckbSubPageDisplay.setText(bundle.getString("LauncherAdvOptsDialog.ckbSubPageDisplay.text")); // NOI18N
        ckbSubPageDisplay.setToolTipText(bundle.getString("LauncherAdvOptsDialog.ckbSubPageDisplay.toolTipText")); // NOI18N

        ckbStudioDebug.setBackground(new java.awt.Color(255, 255, 255));
        ckbStudioDebug.setText(bundle.getString("LauncherAdvOptsDialog.ckbStudioDebug.text")); // NOI18N
        ckbStudioDebug.setToolTipText(bundle.getString("LauncherAdvOptsDialog.ckbStudioDebug.toolTipText")); // NOI18N

        org.jdesktop.layout.GroupLayout pnlCheckboxesLayout = new org.jdesktop.layout.GroupLayout(pnlCheckboxes);
        pnlCheckboxes.setLayout(pnlCheckboxesLayout);
        pnlCheckboxesLayout.setHorizontalGroup(
            pnlCheckboxesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlCheckboxesLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlCheckboxesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, ckbStudioDebug, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, ckbLiveLayout, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, ckbSubPageDisplay, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlCheckboxesLayout.setVerticalGroup(
            pnlCheckboxesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlCheckboxesLayout.createSequentialGroup()
                .addContainerGap()
                .add(ckbLiveLayout, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(ckbSubPageDisplay, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(ckbStudioDebug, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlButtons.setBackground(new java.awt.Color(255, 255, 255));
        pnlButtons.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlButtonsMouseClicked(evt);
            }
        });

        btnCancel.setText(bundle.getString("LauncherAdvOptsDialog.btnCancel.text")); // NOI18N
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setText(bundle.getString("LauncherAdvOptsDialog.btnSave.text")); // NOI18N
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout pnlButtonsLayout = new org.jdesktop.layout.GroupLayout(pnlButtons);
        pnlButtons.setLayout(pnlButtonsLayout);
        pnlButtonsLayout.setHorizontalGroup(
            pnlButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, pnlButtonsLayout.createSequentialGroup()
                .addContainerGap(249, Short.MAX_VALUE)
                .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 80, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlButtonsLayout.setVerticalGroup(
            pnlButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pnlButtonsLayout.createSequentialGroup()
                .addContainerGap()
                .add(pnlButtonsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(btnCancel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnSave, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, ckbAutoLaunch, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(lblBrowser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(btnDefBrowser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(layout.createSequentialGroup()
                                .add(tfBrowser, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(btnFileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 30, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(pnlCheckboxes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(pnlPorts, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(pnlButtons, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(ckbAutoLaunch)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE, false)
                    .add(lblBrowser)
                    .add(tfBrowser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(btnFileChooser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(btnDefBrowser, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(pnlPorts, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(pnlCheckboxes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(20, 20, 20)
                .add(pnlButtons, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnSaveActionPerformed
    {//GEN-HEADEREND:event_btnSaveActionPerformed
//        if (JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(),
//                "Save current Studio launch options for future sessions?",
//                "Save Launch Options", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
//        {
        console.prefs.putBoolean(MainConsole.OPTION_AUTO_LAUNCH, ckbAutoLaunch.isSelected());
        console.prefs.put(MainConsole.OPTION_STUDIO_BROWSER, tfBrowser.getText());
        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_LIVELAYOUT, ckbLiveLayout.isSelected());
        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_SUBPAGES, ckbSubPageDisplay.isSelected());
        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_DEBUG, ckbStudioDebug.isSelected());

        try
        {
            int newPort = Integer.parseInt(tfNewServerPort.getText());
            if (newPort != console.tomcatConfig.getServicePort())
            {
                console.tomcatConfig.setServicePort(newPort);
            }

            newPort = Integer.parseInt(tfNewShutdownPort.getText());
            if (newPort != console.tomcatConfig.getShutdownPort())
            {
                console.tomcatConfig.setShutdownPort(newPort);
            }

            Main.setDefaultTomcatConfiguration(console.tomcatConfig);
        }
        catch (IOException e)
        {
            e.printStackTrace();
            JOptionPane.showConfirmDialog(JOptionPane.getRootFrame(),
                "Error storing server configuration information:\n"
                + e.getMessage(), "Save Preferences",
                JOptionPane.OK_OPTION,
                JOptionPane.ERROR_MESSAGE);
        }
        catch (URISyntaxException e)
        {
            e.printStackTrace();
        }

        initOptions();
        dispose();
//        }
}//GEN-LAST:event_btnSaveActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnResetActionPerformed
    {//GEN-HEADEREND:event_btnResetActionPerformed
        console.prefs.putBoolean(MainConsole.OPTION_AUTO_LAUNCH, Boolean.parseBoolean(
            console.optionsSave.get(MainConsole.OPTION_AUTO_LAUNCH)));

        console.prefs.put(MainConsole.OPTION_STUDIO_BROWSER,
            console.optionsSave.get(MainConsole.OPTION_STUDIO_BROWSER));

        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_DEBUG, Boolean.parseBoolean(
            console.optionsSave.get(MainConsole.OPTION_ENABLE_DEBUG)));

        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_LIVELAYOUT,
            Boolean.parseBoolean(console.optionsSave.get(MainConsole.OPTION_ENABLE_LIVELAYOUT)));

        console.prefs.putBoolean(MainConsole.OPTION_ENABLE_SUBPAGES,
            Boolean.parseBoolean(console.optionsSave.get(MainConsole.OPTION_ENABLE_SUBPAGES)));

        console.tomcatConfig.setServicePort(Integer.parseInt(
            console.optionsSave.get(MainConsole.OPTION_SERVER_PORT)));

        console.tomcatConfig.setShutdownPort(Integer.parseInt(
            console.optionsSave.get(MainConsole.OPTION_SHUTDOWN_PORT)));

        initOptions();
}//GEN-LAST:event_btnResetActionPerformed

    private void tfNewServerPortFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_tfNewServerPortFocusLost
    {//GEN-HEADEREND:event_tfNewServerPortFocusLost
        try
        {
            int newPort = Integer.parseInt(tfNewServerPort.getText());
        }
        catch (NumberFormatException e)
        {
            tfNewServerPort.setText(Integer.toString(console.tomcatConfig.getServicePort()));
        }
}//GEN-LAST:event_tfNewServerPortFocusLost

    private void tfNewShutdownPortFocusLost(java.awt.event.FocusEvent evt)//GEN-FIRST:event_tfNewShutdownPortFocusLost
    {//GEN-HEADEREND:event_tfNewShutdownPortFocusLost
        try
        {
            int newPort = Integer.parseInt(tfNewShutdownPort.getText());
        }
        catch (NumberFormatException e)
        {
            tfNewShutdownPort.setText(Integer.toString(console.tomcatConfig.getShutdownPort()));
        }
}//GEN-LAST:event_tfNewShutdownPortFocusLost

    private void btnFileChooserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnFileChooserActionPerformed
    {//GEN-HEADEREND:event_btnFileChooserActionPerformed
        final JFileChooser chooser = new JFileChooser();
        if (folder != null)
        {
            chooser.setCurrentDirectory(new File(folder));
        }

        if (chooser.showOpenDialog(getParent()) == JFileChooser.APPROVE_OPTION)
        {
            tfBrowser.setText(chooser.getSelectedFile().getAbsolutePath());
            folder = chooser.getCurrentDirectory().getAbsolutePath();
        }
    }//GEN-LAST:event_btnFileChooserActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnCancelActionPerformed
    {//GEN-HEADEREND:event_btnCancelActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnDefBrowserActionPerformed(java.awt.event.ActionEvent evt)//GEN-FIRST:event_btnDefBrowserActionPerformed
    {//GEN-HEADEREND:event_btnDefBrowserActionPerformed
        tfBrowser.setText(MainConsole.VAL_SYS_DEF_BROWSER);
    }//GEN-LAST:event_btnDefBrowserActionPerformed

    private void pnlButtonsMouseClicked(java.awt.event.MouseEvent evt)//GEN-FIRST:event_pnlButtonsMouseClicked
    {//GEN-HEADEREND:event_pnlButtonsMouseClicked
        if (evt.isControlDown()) btnReset.doClick();
    }//GEN-LAST:event_pnlButtonsMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                LauncherAdvOptsDialog dialog = new LauncherAdvOptsDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter()
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e)
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDefBrowser;
    private javax.swing.JButton btnFileChooser;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JCheckBox ckbAutoLaunch;
    private javax.swing.JCheckBox ckbLiveLayout;
    private javax.swing.JCheckBox ckbStudioDebug;
    private javax.swing.JCheckBox ckbSubPageDisplay;
    private javax.swing.JLabel lblBrowser;
    private javax.swing.JLabel lblNewServerPort;
    private javax.swing.JLabel lblNewShutdownPort;
    private javax.swing.JPanel pnlButtons;
    private javax.swing.JPanel pnlCheckboxes;
    private javax.swing.JPanel pnlPorts;
    private javax.swing.JTextField tfBrowser;
    private javax.swing.JTextField tfNewServerPort;
    private javax.swing.JTextField tfNewShutdownPort;
    // End of variables declaration//GEN-END:variables
}
