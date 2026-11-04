package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginButton;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginButtonBuilder;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ۜۘ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: N7O9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C6873 extends AbstractC0161 implements PluginButtonBuilder {

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public PluginButton.Style f22832;

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C19397(pluginUI, pluginViewGroup, this.f22832);
    }

    public C6873(PluginUIBuilder pluginUIBuilder) {
        super(pluginUIBuilder);
        this.f22832 = PluginButton.Style.DEFAULT;
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        int i = C8364.f27429[this.f22832.ordinal()];
        if (i == 1) {
            return new C7836(context);
        }
        if (i == 2) {
            return new C7836(new C9370(context, R.style.MT_Protector));
        }
        if (i != 3) {
            throw new IncompatibleClassChangeError();
        }
        C7836 c7836 = new C7836(new C9370(context, R.style.MT_Protector));
        C2930.m9576(c7836);
        return c7836;
    }

    @Override // bin.mt.plugin.api.ui.builder.PluginButtonBuilder
    public final PluginButtonBuilder style(PluginButton.Style style) {
        this.f22832 = style;
        return this;
    }
}
