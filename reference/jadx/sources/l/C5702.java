package l;

/* JADX INFO: renamed from: l.ۚܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: B9ZO */
/* JADX INFO: loaded from: classes3.dex */
public final class C5702 implements InterfaceC17064 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f19685;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f19686;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int[] f19687;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public byte[] f19688;

    public C5702(int i, byte[] bArr, int i2, int[] iArr) {
        this.f19686 = i;
        this.f19688 = bArr;
        this.f19685 = i2;
        this.f19687 = iArr;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2323(this.f19686, i, bArr);
        System.arraycopy(this.f19688, 0, bArr, i + 4, 16);
        C0481.m2319(this.f19685, i + 20, bArr);
        int[] iArr = this.f19687;
        C0481.m2319(iArr.length, i + 22, bArr);
        int i2 = i + 24;
        for (int i3 : iArr) {
            C0481.m2319(i3, i2, bArr);
            i2 += 2;
        }
        return i2 - i;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return (this.f19687.length * 2) + 24;
    }
}
