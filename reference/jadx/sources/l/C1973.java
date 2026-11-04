package l;

/* JADX INFO: renamed from: l.֫ܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: OA16 */
/* JADX INFO: loaded from: classes3.dex */
public final class C1973 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public byte[] f6625 = new byte[16];

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f6626;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public int f6627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public int f6628;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m6793() {
        return this.f6626;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final byte[] m6794() {
        return this.f6625;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final int m6795() {
        return this.f6627;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final int m6796() {
        return this.f6628;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f6626 = C0481.m2322(i, bArr);
        System.arraycopy(bArr, i + 4, this.f6625, 0, 16);
        this.f6627 = C0481.m2318(i + 20, bArr);
        this.f6628 = C0481.m2318(i + 22, bArr);
        return (i + 24) - i;
    }
}
