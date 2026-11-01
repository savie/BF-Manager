package l;

import bin.mt.plugin.api.ui.PluginUI;
import bin.mt.plugin.api.ui.builder.PluginUIBuilder;
import bin.mt.plugin.api.ui.dialog.LoadingDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.᩷᩵ۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: P44J */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C21079 implements InterfaceC20544, InterfaceC0380, InterfaceC18848, Consumer, InterfaceC23218 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f68664;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f68665;

    public /* synthetic */ C21079(int i, Object obj) {
        this.f68664 = i;
        this.f68665 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        LoadingDialog.lambda$new$0((PluginUI) this.f68665, (PluginUIBuilder) obj);
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ۙ */
    public /* synthetic */ void mo20358(AbstractC14730 abstractC14730, int i) {
    }

    @Override // l.InterfaceC23218
    /* JADX INFO: renamed from: ܰ */
    public void mo20359(AbstractC14730 abstractC14730, int i) {
        C0617.m2827((StringBuilder) this.f68665, abstractC14730);
    }

    @Override // l.InterfaceC0380
    /* JADX INFO: renamed from: ۙ */
    public void mo1825(Object obj) {
        switch (this.f68664) {
            case 2:
                ((C14063) this.f68665).m34022((String) obj);
                break;
            default:
                ((RunnableC4263) this.f68665).run();
                break;
        }
    }

    @Override // l.InterfaceC20544
    /* JADX INFO: renamed from: ۙ */
    public boolean mo2120(String str) {
        return ((String) this.f68665).equals(str);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) {
        C23319.m51397((C11545) this.f68665, abstractC20745);
    }
}
