package l;

import android.content.Intent;
import android.graphics.Bitmap;
import android.view.KeyEvent;

/* JADX INFO: renamed from: l.ᩳܿ᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: P9S5 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C19241 implements InterfaceC8103, InterfaceC21100, InterfaceC16025, InterfaceC16478, InterfaceC17544 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f62244;

    public /* synthetic */ C19241(Object obj) {
        this.f62244 = obj;
    }

    @Override // l.InterfaceC8103
    public void accept(Object obj) {
        C18425.m42953((C18425) this.f62244, (C16187) obj);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        ((InterfaceC4361) this.f62244).mo12482(i);
    }

    @Override // l.InterfaceC16025
    /* JADX INFO: renamed from: ۙ */
    public void mo8384(Intent intent, int i) {
        AbstractActivityC17204.m40386((AbstractActivityC17204) this.f62244, i);
    }

    @Override // l.InterfaceC16478
    /* JADX INFO: renamed from: ۙ */
    public boolean mo24198(C17224 c17224, int i, KeyEvent keyEvent) {
        return C7308.m19995((C7308) this.f62244, i);
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22352((AbstractC22044) this.f62244);
    }
}
