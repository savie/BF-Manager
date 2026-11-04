package l;

/* JADX INFO: renamed from: l.ۧ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11834 implements InterfaceC12580 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f38163;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C20785.m47569(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C20785.m47570(this, interfaceC2885);
    }

    public C11834(long[] jArr) {
        this.f38163 = jArr;
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        if (i >= 65536) {
            return false;
        }
        if (C12690.m31484(i)) {
            i = C12690.m31488(i);
        }
        long[] jArr = this.f38163;
        return i < (jArr.length << 6) && (jArr[i >>> 6] & (1 << i)) != 0;
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
