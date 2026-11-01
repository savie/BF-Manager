package l;

import bin.mt.plus.R;

/* JADX INFO: renamed from: l.ܽۢ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: D1K5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16567 implements InterfaceC22438 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C12334 f53199;

    public C16567(C12334 c12334) {
        this.f53199 = c12334;
    }

    @Override // l.InterfaceC22438
    /* JADX INFO: renamed from: ܰ */
    public final void mo29544(int i) {
        C12334 c12334 = this.f53199;
        if (i == -1) {
            c12334.m41562(R.string.MT_Protector);
        } else {
            c12334.m46157(i);
        }
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return this.f53199.mo2357();
    }
}
