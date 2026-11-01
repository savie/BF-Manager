package l;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;

/* JADX INFO: renamed from: l.ܿۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7PH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17090 extends AbstractC12857 implements PluginLinearLayoutBuilder {
    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C7481(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new LinearLayout(context);
    }
}
