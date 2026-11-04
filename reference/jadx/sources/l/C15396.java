package l;

/* JADX INFO: renamed from: l.ܳܰ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: LA1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C15396 implements InterfaceC2149 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f50184;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final int m36862() {
        return this.f50184;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        C0481.m2322(i, bArr);
        this.f50184 = C0481.m2322(i + 4, bArr);
        C0481.m2322(i + 8, bArr);
        C0481.m2322(i + 12, bArr);
        int i3 = i + 16;
        int i4 = i2 - 16;
        byte[] bArr2 = new byte[i4];
        if (i4 > 0) {
            System.arraycopy(bArr, i3, bArr2, 0, i4);
        }
        return i3 - i;
    }
}
