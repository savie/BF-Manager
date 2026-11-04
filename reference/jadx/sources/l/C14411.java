package l;

/* JADX INFO: renamed from: l.ܰۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: VA0B */
/* JADX INFO: loaded from: classes5.dex */
public final class C14411 implements InterfaceC17064, InterfaceC2149 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public int f45410;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f45411;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public long f45412;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f45413;

    public C14411(boolean z) {
        this.f45413 = z;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        if (this.f45413) {
            this.f45410 = C0481.m2318(i, bArr);
            this.f45411 = (C0481.m2322(i + 4, bArr) << 32) | C0481.m2322(i + 8, bArr);
            this.f45412 = C0481.m2322(i + 16, bArr) | (C0481.m2322(i + 12, bArr) << 32);
            return 20;
        }
        this.f45410 = C0481.m2318(i, bArr);
        this.f45411 = C0481.m2322(i + 2, bArr);
        this.f45412 = C0481.m2322(i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        if (this.f45413) {
            C0481.m2319(this.f45410, i, bArr);
            C0481.m2323(this.f45411 >> 32, i + 4, bArr);
            C0481.m2323(this.f45411, i + 8, bArr);
            C0481.m2323(this.f45412 >> 32, i + 12, bArr);
            C0481.m2323(this.f45412, i + 16, bArr);
            return 20;
        }
        C0481.m2319(this.f45410, i, bArr);
        C0481.m2323(this.f45411, i + 2, bArr);
        C0481.m2323(this.f45412, i + 6, bArr);
        return 10;
    }

    @Override // l.InterfaceC17064
    public final int size() {
        return this.f45413 ? 20 : 10;
    }
}
