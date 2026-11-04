package l;

import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;

/* JADX INFO: renamed from: l.ᩳۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Q7N9 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18806 extends AbstractC2398 implements PluginBaseLinearLayoutBuilder {

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public Integer f61078;

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public final int f61079;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        C15076 c15076 = (C15076) c6128;
        ((LinearLayout) c15076.m17689()).setOrientation(this.f61079);
        super.mo3674(c15076);
        Integer num = this.f61078;
        if (num != null) {
            c15076.setGravity(num.intValue());
        }
    }

    public AbstractC18806(PluginUIBuilder pluginUIBuilder, PluginUI.Style style, int i) {
        super(pluginUIBuilder, style);
        this.f61079 = i;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public PluginUIBuilder gravity(int i) {
        this.f61078 = Integer.valueOf(i);
        return this;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isHorizontal() {
        return this.f61079 == 0;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginBaseLinearLayoutBuilder
    public boolean isVertical() {
        return this.f61079 == 1;
    }
}
