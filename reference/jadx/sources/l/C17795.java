package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ᩳۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O9 */
/* JADX INFO: loaded from: classes5.dex */
public final class C17795 extends AbstractC22029 implements PluginButtonBuilder {

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public PluginButton.Style f56411;

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C5364(pluginUI, pluginViewGroup, this.f56411);
    }

    public C17795(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f56411 = PluginButton.Style.DEFAULT;
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        int i = C21323.f69392[this.f56411.ordinal()];
        if (i == 1) {
            return new C0236(context);
        }
        if (i == 2) {
            return new C0236(new C5716(context, R.style.MT_Protector));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        C0236 c0236 = new C0236(new C5716(context, R.style.MT_Protector));
        C9682.m24639(c0236);
        return c0236;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginButtonBuilder
    public final PluginButtonBuilder style(PluginButton.Style style) {
        this.f56411 = style;
        return this;
    }
}
