package l;

import android.content.Context;
import android.view.View;
import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.PluginViewGroup;
import bin.mt.plugin.api.ui.builder.PluginRadioButtonBuilder;

/* JADX INFO: renamed from: l.᩻ۘۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: D7PL */
/* JADX INFO: loaded from: classes2.dex */
public final class C23441 extends AbstractC0861 implements PluginRadioButtonBuilder {

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public Integer f75876;

    @Override // l.AbstractC0861, l.AbstractC3683, l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C3247 c3247) {
        C20182 c20182 = (C20182) c3247;
        Integer num = this.f75876;
        if (num != null) {
            c20182.m45616(num.intValue());
        }
        super.mo1252((AbstractC13126) c20182);
    }

    @Override // l.AbstractC0861, l.AbstractC3683
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(C11010 c11010) {
        C20182 c20182 = (C20182) c11010;
        Integer num = this.f75876;
        if (num != null) {
            c20182.m45616(num.intValue());
        }
        super.mo1252((AbstractC13126) c20182);
    }

    @Override // l.AbstractC0861
    /* JADX INFO: renamed from: ۙ */
    public final void mo1252(AbstractC13126 abstractC13126) {
        C20182 c20182 = (C20182) abstractC13126;
        Integer num = this.f75876;
        if (num != null) {
            c20182.m45616(num.intValue());
        }
        super.mo1252((AbstractC13126) c20182);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final C3247 mo1251(PluginUI pluginUI, PluginViewGroup pluginViewGroup) {
        return new C20182(pluginUI, pluginViewGroup);
    }

    @Override // l.AbstractC6506
    /* JADX INFO: renamed from: ۙ */
    public final View mo1250(Context context) {
        return new C4241(context);
    }
}
