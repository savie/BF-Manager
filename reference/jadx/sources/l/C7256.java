package l;

import android.graphics.Bitmap;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import bin.mt.plugin.api.util.Consumer;

/* JADX INFO: renamed from: l.ۜܺܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: A5XF */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C7256 implements InterfaceC17544, InterfaceC2017, InterfaceC21100, Consumer, InterfaceC3543 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f23912;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f23913;

    public /* synthetic */ C7256(int i, Object obj) {
        this.f23912 = i;
        this.f23913 = obj;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    public void accept(Object obj) {
        ((DualProgressDialog) this.f23913).lambda$new$0((CharSequence) obj);
    }

    @Override // l.InterfaceC17544
    /* JADX INFO: renamed from: ۙ */
    public void mo1209(int i) {
        AbstractC18900 abstractC18900;
        switch (this.f23912) {
            case 1:
                abstractC18900 = (C5300) this.f23913;
                break;
            default:
                abstractC18900 = (C14295) this.f23913;
                break;
        }
        abstractC18900.mo16839(i);
    }

    @Override // l.InterfaceC2017
    /* JADX INFO: renamed from: ᩷ */
    public void mo1355(Object obj, Throwable th) {
        C1863 c1863 = (C1863) this.f23913;
        c1863.f6273.post(new Runnable() { // from class: l.۫ۤᩴ
            @Override // java.lang.Runnable
            public final void run() {
                C1863.m6395(enumC19743, c1863, th);
            }
        });
    }

    @Override // l.InterfaceC21100
    /* JADX INFO: renamed from: ᩷ */
    public Bitmap mo6272() {
        return C8275.m22351(new C9020((AbstractC22044) this.f23913));
    }

    @Override // l.InterfaceC3543
    /* JADX INFO: renamed from: ᩷ */
    public InterfaceC15475 mo1860(int i) {
        return ((AbstractC22044[]) this.f23913)[i].mo4276("r");
    }
}
