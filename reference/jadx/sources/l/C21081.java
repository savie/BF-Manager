package l;

/* JADX INFO: renamed from: l.᩷᩵ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C21081 implements InterfaceC20376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f68666;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C16143.m38214(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C16143.m38215(this, interfaceC13717);
    }

    public C21081(long[] jArr) {
        this.f68666 = jArr;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        long[] jArr = this.f68666;
        return i < (jArr.length << 6) && (jArr[i >>> 6] & (1 << i)) != 0;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
