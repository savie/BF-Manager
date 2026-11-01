package l;

import android.widget.CompoundButton;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.۬۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T7RP */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC13126 extends C5364 implements PluginCompoundButton {
    public AbstractC13126(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup, PluginButton.Style.DEFAULT);
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public void setOnCheckedChangeListener(final PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            ((CompoundButton) this.f12078).setOnCheckedChangeListener(null);
        } else {
            ((CompoundButton) this.f12078).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.֨۬ۘ
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    AbstractC13126 abstractC13126 = this.f5098;
                    abstractC13126.getClass();
                    onCheckedChangeListener.onCheckedChanged(abstractC13126, z);
                }
            });
        }
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final boolean isChecked() {
        return ((CompoundButton) this.f12078).isChecked();
    }

    @Override // bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setChecked(boolean z) {
        if (C13890.m33728()) {
            ((CompoundButton) this.f12078).setChecked(z);
            return;
        }
        throw new IllegalStateException("This method must be called on the UI thread");
    }
}
