package l;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import bin.mt.plugin.api.ui.PluginCompoundButton;
import bin.mt.plugin.api.ui.PluginRadioButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;

/* JADX INFO: renamed from: l.֫ۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: K7OU */
/* JADX INFO: loaded from: classes3.dex */
public final class C1653 extends AbstractC9700 implements PluginRadioButton {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f5726;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public PluginCompoundButton.OnCheckedChangeListener f5727;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public int f5728;

    @Override // l.C6128
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo5941(View view) {
        RadioButton radioButton = (RadioButton) view;
        this.f20900 = radioButton;
        radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.ۚۘ֫
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                C1653.m5939(this.f18872, z);
            }
        });
    }

    public C1653(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        super(pluginUI, pluginViewGroup);
        this.f5728 = -1;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m5939(C1653 c1653, boolean z) {
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener = c1653.f5727;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(c1653, z);
        }
        PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener2 = c1653.f5726;
        if (onCheckedChangeListener2 != null) {
            onCheckedChangeListener2.onCheckedChanged(c1653, z);
        }
    }

    @Override // l.AbstractC9700, bin.mt.plugin.api.ui.PluginCompoundButton
    public final void setOnCheckedChangeListener(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5727 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5942(PluginCompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f5726 = onCheckedChangeListener;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m5940(int i) {
        this.f5728 = i;
    }

    @Override // bin.mt.plugin.api.ui.PluginRadioButton
    public final int getPositionInRadioGroup() {
        return this.f5728;
    }
}
