package l;

/* JADX INFO: renamed from: l.ۧۤۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C10936 implements InterfaceC20376 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f37194;

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

    public C10936(long[] jArr) {
        this.f37194 = jArr;
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        if (i >= 65536) {
            return false;
        }
        int iM30171 = C12123.m30171(i);
        long[] jArr = this.f37194;
        return iM30171 < (jArr.length << 6) && (jArr[iM30171 >>> 6] & (1 << iM30171)) != 0;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
