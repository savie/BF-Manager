package l;

import android.util.SparseArray;

/* JADX INFO: renamed from: l.۠ܶ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: K8JQ */
/* JADX INFO: loaded from: classes4.dex */
public final class C8729 implements InterfaceC12789 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final SparseArray f28405 = new SparseArray();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC12789 f28406;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final InterfaceC1272 f28407;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public boolean f28408;

    public C8729(InterfaceC12789 interfaceC12789, InterfaceC1272 interfaceC1272) {
        this.f28406 = interfaceC12789;
        this.f28407 = interfaceC1272;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final InterfaceC22024 mo16658(int i, int i2) {
        InterfaceC12789 interfaceC12789 = this.f28406;
        if (i2 != 3) {
            this.f28408 = true;
            return interfaceC12789.mo16658(i, i2);
        }
        SparseArray sparseArray = this.f28405;
        C13949 c13949 = (C13949) sparseArray.get(i);
        if (c13949 != null) {
            return c13949;
        }
        C13949 c139410 = new C13949(interfaceC12789.mo16658(i, i2), this.f28407);
        sparseArray.put(i, c139410);
        return c139410;
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ܳ */
    public final void mo16661() {
        this.f28406.mo16661();
        if (!this.f28408) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f28405;
            if (i >= sparseArray.size()) {
                return;
            }
            ((C13949) sparseArray.valueAt(i)).m33995();
            i++;
        }
    }

    @Override // l.InterfaceC12789
    /* JADX INFO: renamed from: ۙ */
    public final void mo16659(InterfaceC9060 interfaceC9060) {
        this.f28406.mo16659(interfaceC9060);
    }
}
