package l;

/* JADX INFO: renamed from: l.ۧۨۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: Z6QT */
/* JADX INFO: loaded from: classes4.dex */
public final class C11593 implements InterfaceC2885 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final long[] f36391;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] f36392;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final boolean f36393;

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

    public C11593(long[] jArr, int[] iArr, boolean z) {
        this.f36391 = jArr;
        this.f36392 = iArr;
        this.f36393 = z;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0042 A[RETURN] */
    @Override // l.InterfaceC2885
    /* JADX INFO: renamed from: ۙ */
    public final boolean mo1303(int i) {
        boolean z;
        long[] jArr = this.f36391;
        if (i < (jArr.length << 6)) {
            if (((1 << i) & jArr[i >>> 6]) != 0) {
                return true;
            }
            return false;
        }
        boolean z2 = this.f36393;
        if (i < 65536) {
            return z2;
        }
        int[] iArr = this.f36392;
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

    @Override // l.InterfaceC2885
    public final C0891 negate() {
        C0407 c0407 = C5233.f18438;
        return C0891.m3623(this);
    }
}
