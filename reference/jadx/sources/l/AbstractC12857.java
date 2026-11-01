package l;

import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.۬ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7N9 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC12857 extends AbstractC14974 implements PluginBaseLinearLayoutBuilder {

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public Integer f42767;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f42768;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C3247 c3247) {
        C7481 c7481 = (C7481) c3247;
        ((LinearLayout) c7481.m9720()).setOrientation(this.f42768);
        super.mo1252(c7481);
        Integer num = this.f42767;
        if (num != null) {
            c7481.setGravity(num.intValue());
        }
    }

    public AbstractC12857(PluginUIBuilder pluginUIBuilder, PluginUI.Style style, int i) {
        super(pluginUIBuilder, style);
        this.f42768 = i;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public PluginUIBuilder gravity(int i) {
        this.f42767 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isHorizontal() {
        return this.f42768 == 0;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isVertical() {
        return this.f42768 == 1;
    }
}
