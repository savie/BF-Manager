package l;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginLinearLayoutBuilder;

/* JADX INFO: renamed from: l.ܽܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: Z7PH */
/* JADX INFO: loaded from: classes5.dex */
public final class C17619 extends AbstractC18806 implements PluginLinearLayoutBuilder {
    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C15076(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new LinearLayout(context);
    }
}
