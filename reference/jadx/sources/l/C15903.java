package l;

/* JADX INFO: renamed from: l.ܶۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: R9WA */
/* JADX INFO: loaded from: classes5.dex */
public final class C15903 implements InterfaceC17395 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f51674;

    @Override // l.InterfaceC17064
    public final int size() {
        return 8;
    }

    @Override // l.InterfaceC17395
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10574() {
        return (byte) 6;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f51674 = C0481.m2320(i, bArr);
        return 8;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2321(this.f51674, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C2764.m9137(new StringBuilder("SmbQueryFileInternalInfo[indexNumber="), this.f51674, "]"));
    }
}
