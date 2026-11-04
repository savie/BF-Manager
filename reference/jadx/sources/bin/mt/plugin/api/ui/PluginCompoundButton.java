package bin.mt.plugin.api.ui;

/* JADX INFO: loaded from: classes.dex */
public interface PluginCompoundButton extends PluginButton {

    public interface OnCheckedChangeListener {
        void onCheckedChanged(PluginCompoundButton pluginCompoundButton, boolean z);
    }

    @Override // bin.mt.plugin.api.ui.PluginButton
    @Deprecated
    PluginButton.Style getStyle();

    boolean isChecked();

    void setChecked(boolean z);

    void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener);
}
