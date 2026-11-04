package l;

import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ܽۚۧ, reason: contains not printable characters */
/* JADX INFO: compiled from: 31K1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C17365 implements InterfaceC19795, InterfaceC21100, Consumer, InterfaceC18006, InterfaceC14852 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f56506;

    public /* synthetic */ C17365(Object obj) {
        this.f56506 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((PluginDialog) this.f56506).setTitle((CharSequence) obj);
    }

    @Override // l.InterfaceC18006
    /* JADX INFO: renamed from: ۙ */
    public void mo1736(Object obj) {
        ((ActivityC0848) this.f56506).m3376((InterfaceC7206) obj);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۙ */
    public void mo11629(AbstractC11781 abstractC11781) {
        C19571.m45167((C19571) this.f56506, abstractC11781);
    }

    @Override // l.InterfaceC14852
    /* JADX INFO: renamed from: ۤ */
    public /* synthetic */ boolean mo11630() {
        return false;
    }

    @Override // l.InterfaceC19795
    public void invoke(Object obj) {
        ((InterfaceC10582) obj).mo7221((C0733) this.f56506);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22342(new C9020((AbstractC22044) this.f56506));
    }
}
