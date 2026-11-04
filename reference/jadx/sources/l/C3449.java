package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginRadioButtonBuilder;

/* JADX INFO: renamed from: l.ۗܰ֫, reason: contains not printable characters */
/* JADX INFO: compiled from: D7PL */
/* JADX INFO: loaded from: classes3.dex */
public final class C3449 extends AbstractC7619 implements PluginRadioButtonBuilder {

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public Integer f11247;

    @Override // l.AbstractC7619, l.AbstractC9855, l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final void mo3674(C6128 c6128) {
        C1653 c1653 = (C1653) c6128;
        Integer num = this.f11247;
        if (num != null) {
            c1653.m5940(num.intValue());
        }
        super.mo3674((AbstractC9700) c1653);
    }

    @Override // l.AbstractC7619
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3674(AbstractC9700 abstractC9700) {
        C1653 c1653 = (C1653) abstractC9700;
        Integer num = this.f11247;
        if (num != null) {
            c1653.m5940(num.intValue());
        }
        super.mo3674((AbstractC9700) c1653);
    }

    @Override // l.AbstractC7619, l.AbstractC9855
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo3674(C23282 c23282) {
        C1653 c1653 = (C1653) c23282;
        Integer num = this.f11247;
        if (num != null) {
            c1653.m5940(num.intValue());
        }
        super.mo3674((AbstractC9700) c1653);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final C6128 mo2280(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C1653(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC0907
    /* JADX INFO: renamed from: ۙ */
    public final View mo2279(Context context) {
        return new C25386(context);
    }
}
