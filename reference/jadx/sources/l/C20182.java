package l;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.᩶۬ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: K7OU */
/* JADX INFO: loaded from: classes5.dex */
public final class C20182 extends AbstractC13126 implements PluginRadioButton {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public int f65510;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f65511;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f65512;

    @Override // l.C3247
    /* JADX INFO: renamed from: ۙ */
    public final void mo9723(View view) {
        RadioButton radioButton = (RadioButton) view;
        this.f12078 = radioButton;
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ܺ۬ۘ
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C20182.m45615(this.f51658, z);
            }
        });
    }

    public C20182(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f65510 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m45615(C20182 c20182, boolean z) {
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = c20182.f65512;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(c20182, z);
        }
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = c20182.f65511;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(c20182, z);
        }
    }

    @Override // l.AbstractC13126, bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setOnCheckedChangeListener(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f65512 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45617(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f65511 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m45616(int i) {
        this.f65510 = i;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioButton
    public final int getPositionInRadioGroup() {
        return this.f65510;
    }
}
