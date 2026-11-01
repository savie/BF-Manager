package l;

import android.content.Intent;
import bin.mt.plugin.api.ui.dialog.PluginDialog;
import bin.mt.plugin.api.util.Consumer;
import java.io.BufferedOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: l.֨᩷ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: 09LR */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C1359 implements InterfaceC8395, InterfaceC18848, InterfaceC21921, Consumer, InterfaceC17547, InterfaceC13320 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f5705;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5706;

    public /* synthetic */ C1359(int i, Object obj) {
        this.f5705 = i;
        this.f5706 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((PluginDialog) this.f5706).setTitle((CharSequence) obj);
    }

    @Override // l.InterfaceC21921
    /* JADX INFO: renamed from: ۙ */
    public void mo1855(int i) {
        ((C2935) this.f5706).mo21455(i);
    }

    @Override // l.InterfaceC8395
    /* JADX INFO: renamed from: ۙ */
    public void mo1796(Intent intent, int i) {
        C20409.m46067((C20409) this.f5706, i);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        switch (this.f5705) {
            case 7:
                ((C3836) this.f5706).f14281.mo1179(abstractC23903);
                break;
            default:
                C12325.m30623((C12325) this.f5706, abstractC23903);
                break;
        }
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        switch (this.f5705) {
        }
        return false;
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ */
    public void mo4355(AbstractC20745 abstractC20745) throws Throwable {
        C8265.m21679((C11545) this.f5706, abstractC20745);
    }

    @Override // l.InterfaceC6258
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo4798(AbstractC20745 abstractC20745) throws IOException {
        C6527 c6527 = (C6527) this.f5706;
        BufferedOutputStream bufferedOutputStreamM46708 = abstractC20745.m46708();
        try {
            c6527.m17733(bufferedOutputStreamM46708);
            bufferedOutputStreamM46708.close();
        } catch (Throwable th) {
            try {
                bufferedOutputStreamM46708.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
