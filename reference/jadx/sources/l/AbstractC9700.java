package l;

import android.widget.CompoundButton;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.ۡ᩺֫, reason: contains not printable characters */
/* JADX INFO: compiled from: T7RP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9700 extends C19397 implements PluginCompoundButton {
    public AbstractC9700(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup, PluginButton.Style.DEFAULT);
    }

    public void setOnCheckedChangeListener(final PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            ((CompoundButton) this.f20900).setOnCheckedChangeListener(null);
        } else {
            ((CompoundButton) this.f20900).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨᩺֫
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AbstractC9700 abstractC9700 = this.f5226;
                    abstractC9700.getClass();
                    onCheckedChangeListener.onCheckedChanged(abstractC9700, z);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final boolean isChecked() {
        return ((CompoundButton) this.f20900).isChecked();
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setChecked(boolean z) {
        if (C22415.m50557()) {
            ((CompoundButton) this.f20900).setChecked(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
