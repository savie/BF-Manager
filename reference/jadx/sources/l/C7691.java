package l;

/* JADX INFO: renamed from: l.۟ۛۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C7691 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f25384;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f25385;

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC2885 mo1302(InterfaceC2885 interfaceC2885) {
        return C9596.m25073(this, interfaceC2885);
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ᩷ */
    public final /* synthetic */ InterfaceC2885 mo1304(InterfaceC2885 interfaceC2885) {
        return C9596.m25074(this, interfaceC2885);
    }

    public C7691(long[] jArr, boolean z) {
        this.f25384 = jArr;
        this.f25385 = z;
    }

    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        if (i < 65536) {
            int iM41869 = C17933.m41869(i);
            long[] jArr = this.f25384;
            if (iM41869 < (jArr.length << 6)) {
                return (jArr[iM41869 >>> 6] & (1 << iM41869)) != 0;
            }
        }
        return this.f25385;
    }

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
