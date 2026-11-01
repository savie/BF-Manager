package l;

/* JADX INFO: renamed from: l.ᩴۡۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes5.dex */
public final class C18655 implements InterfaceC13717 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f60579;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final int[] f60580;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f60581;

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final /* synthetic */ InterfaceC13717 mo1812(InterfaceC13717 interfaceC13717) {
        return C4543.m12682(this, interfaceC13717);
    }

    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ܰ */
    public final /* synthetic */ InterfaceC13717 mo1814(InterfaceC13717 interfaceC13717) {
        return C4543.m12683(this, interfaceC13717);
    }

    public C18655(long[] jArr, int[] iArr, boolean z) {
        this.f60579 = jArr;
        this.f60580 = iArr;
        this.f60581 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
    @Override // l.InterfaceC13717
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1813(int i) {
        boolean z;
        long[] jArr = this.f60579;
        if (i < (jArr.length << 6)) {
            if (((1 << i) & jArr[i >>> 6]) != 0) {
                return true;
            }
            return false;
        }
        boolean z2 = this.f60581;
        if (i < 65536) {
            return z2;
        }
        int[] iArr = this.f60580;
        int length = (iArr.length / 2) - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            int i4 = i3 * 2;
            int i5 = iArr[i4];
            int i6 = iArr[i4 + 1];
            if (i < i5) {
                length = i3 - 1;
            } else {
                if (i <= i6) {
                    z = true;
                    if (z2 != z) {
                        return true;
                    }
                    return false;
                }
                i2 = i3 + 1;
            }
        }
        z = false;
        if (z2 != z) {
            return true;
        }
        return false;
    }

    @Override // l.InterfaceC13717
    public final C3111 negate() {
        C23595 c23595 = C22141.f71668;
        return C3111.m9336(this);
    }
}
