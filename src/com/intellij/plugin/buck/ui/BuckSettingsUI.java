package com.intellij.plugin.buck.ui;

import com.intellij.openapi.fileChooser.FileChooserDescriptor;
import com.intellij.openapi.ui.TextComponentAccessor;
import com.intellij.openapi.ui.TextFieldWithBrowseButton;
import com.intellij.openapi.util.Comparing;
import com.intellij.plugin.buck.config.BuckSettingsProvider;
import com.intellij.ui.IdeBorderFactory;
import com.intellij.ui.components.JBTextField;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class BuckSettingsUI extends JPanel {

  public static final String CUSTOMIZED_INSTALL_COMMAND_HINT = "input your command here: eg. -r --no-cache";

  private TextFieldWithBrowseButton myBuckPathField;
  private JBTextField myCustomizedInstallSettingField;
  private JCheckBox myRunAfterInstall;
  private JCheckBox myMultiInstallMode;
  private JCheckBox myUninstallBeforeInstall;
  private JCheckBox myCustomizedInstallSetting;
  private BuckSettingsProvider myOptionsProvider;

  public BuckSettingsUI() {
    myOptionsProvider = BuckSettingsProvider.getInstance();
    init();
  }

  private void init() {
    setLayout(new BorderLayout());
    JPanel container = this;

    myBuckPathField = new TextFieldWithBrowseButton();
    FileChooserDescriptor fileChooserDescriptor =
        new FileChooserDescriptor(true, false, false, false, false, false);
    myBuckPathField.addBrowseFolderListener(
        "",
        "Buck Executable Path",
        null,
        fileChooserDescriptor,
        TextComponentAccessor.TEXT_FIELD_WHOLE_TEXT,
        false
    );
    myCustomizedInstallSettingField = new JBTextField();
    myCustomizedInstallSettingField.getEmptyText().setText(CUSTOMIZED_INSTALL_COMMAND_HINT);
    myCustomizedInstallSettingField.setEnabled(false);

    myRunAfterInstall = new JCheckBox("Run after install (-r)");
    myMultiInstallMode = new JCheckBox("Multi-install mode (-x)");
    myUninstallBeforeInstall = new JCheckBox("Uninstall before installing (-u)");
    myCustomizedInstallSetting = new JCheckBox("Use customized install setting:  ");
    initCustomizedInstallCommandListener();

    JPanel buckSettings = new JPanel(new GridBagLayout());
    buckSettings.setBorder(IdeBorderFactory.createTitledBorder("Buck Settings", true));
    container.add(container = new JPanel(new BorderLayout()), BorderLayout.NORTH);
    container.add(buckSettings, BorderLayout.NORTH);
    final GridBagConstraints constraints = new GridBagConstraints(0, 0, 1, 1, 0, 0,
        GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);

    buckSettings.add(new JLabel("Buck Executable Path:"), constraints);
    constraints.gridx = 1;
    constraints.weightx = 1;
    constraints.fill = GridBagConstraints.HORIZONTAL;
    buckSettings.add(myBuckPathField, constraints);

    JPanel installSettings = new JPanel(new BorderLayout());
    installSettings.setBorder(IdeBorderFactory.createTitledBorder("Buck Install Settings", true));
    container.add(container = new JPanel(new BorderLayout()), BorderLayout.SOUTH);
    container.add(installSettings, BorderLayout.NORTH);

    installSettings.add(myRunAfterInstall, BorderLayout.NORTH);
    installSettings.add(installSettings = new JPanel(new BorderLayout()), BorderLayout.SOUTH);

    installSettings.add(myMultiInstallMode, BorderLayout.NORTH);
    installSettings.add(installSettings = new JPanel(new BorderLayout()), BorderLayout.SOUTH);

    installSettings.add(myUninstallBeforeInstall, BorderLayout.NORTH);
    installSettings.add(installSettings = new JPanel(new BorderLayout()), BorderLayout.SOUTH);

    final GridBagConstraints customConstraints = new GridBagConstraints(0, 0, 1, 1, 0, 0,
        GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0);
    JPanel customizedInstallSetting = new JPanel(new GridBagLayout());
    customizedInstallSetting.add(myCustomizedInstallSetting, customConstraints);
    customConstraints.gridx = 1;
    customConstraints.weightx = 1;
    customConstraints.fill = GridBagConstraints.HORIZONTAL;
    customizedInstallSetting.add(myCustomizedInstallSettingField, customConstraints);
    installSettings.add(customizedInstallSetting, BorderLayout.NORTH);
  }

  public boolean isModified() {
    return !Comparing.equal(myBuckPathField.getText(),
        myOptionsProvider.getState().buckExecutable) ||
        myOptionsProvider.getState().runAfterInstall != myRunAfterInstall.isSelected() ||
        myOptionsProvider.getState().multiInstallMode != myMultiInstallMode.isSelected() ||
        myOptionsProvider.getState().uninstallBeforeInstalling !=
            myUninstallBeforeInstall.isSelected() ||
        myOptionsProvider.getState().customizedInstallSetting !=
            myCustomizedInstallSetting.isSelected() ||
        !myOptionsProvider.getState().customizedInstallSettingCommand
            .equals(myCustomizedInstallSettingField.getText());
  }

  public void apply() {
    myOptionsProvider.getState().buckExecutable = myBuckPathField.getText();
    myOptionsProvider.getState().runAfterInstall = myRunAfterInstall.isSelected();
    myOptionsProvider.getState().multiInstallMode = myMultiInstallMode.isSelected();
    myOptionsProvider.getState().uninstallBeforeInstalling = myUninstallBeforeInstall.isSelected();
    myOptionsProvider.getState().customizedInstallSetting = myCustomizedInstallSetting.isSelected();
    myOptionsProvider.getState().customizedInstallSettingCommand = myCustomizedInstallSettingField.getText();
  }

  public void reset() {
    myBuckPathField.setText(myOptionsProvider.getState().buckExecutable);
    myRunAfterInstall.setSelected(myOptionsProvider.getState().runAfterInstall);
    myMultiInstallMode.setSelected(myOptionsProvider.getState().multiInstallMode);
    myUninstallBeforeInstall.setSelected(myOptionsProvider.getState().uninstallBeforeInstalling);
    myCustomizedInstallSetting.setSelected(myOptionsProvider.getState().customizedInstallSetting);
    myCustomizedInstallSettingField.setText(myOptionsProvider.getState().customizedInstallSettingCommand);
  }

  private void initCustomizedInstallCommandListener() {
    myCustomizedInstallSetting.addItemListener(new ItemListener() {
      @Override
      public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED) {
          myCustomizedInstallSettingField.setEnabled(true);
          myRunAfterInstall.setEnabled(false);
          myMultiInstallMode.setEnabled(false);
          myUninstallBeforeInstall.setEnabled(false);
        } else {
          myCustomizedInstallSettingField.setEnabled(false);
          myRunAfterInstall.setEnabled(true);
          myMultiInstallMode.setEnabled(true);
          myUninstallBeforeInstall.setEnabled(true);
        }
      }
    });
  }
}
