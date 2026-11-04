package l;

/* JADX INFO: renamed from: l.᩻ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VY */
/* JADX INFO: loaded from: classes.dex */
public final class C25094 implements InterfaceC16888, InterfaceC17634 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int[] f81154;

    @Override // l.InterfaceC16888, l.InterfaceC17634
    /* JADX INFO: renamed from: ۙ */
    public final int mo38322() {
        return 2;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int[] m55944() {
        return this.f81154;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        int[] iArr = this.f81154;
        C0481.m2319(iArr != null ? iArr.length : 0L, i, bArr);
        int i2 = i + 2;
        int[] iArr2 = this.f81154;
        if (iArr2 != null) {
            for (int i3 : iArr2) {
                C0481.m2319(i3, i2, bArr);
                i2 += 2;
            }
        }
        return i2 - i;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        int iM2318 = C0481.m2318(i, bArr);
        int i3 = i + 2;
        this.f81154 = new int[iM2318];
        for (int i4 = 0; i4 < iM2318; i4++) {
            this.f81154[i4] = C0481.m2318(i3, bArr);
            i3 += 2;
        }
        return i3 - i;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        int[] iArr = this.f81154;
        return (iArr != null ? iArr.length * 2 : 0) + 4;
    }
}
