package l;

/* JADX INFO: renamed from: l.ۧۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 5A0Y */
/* JADX INFO: loaded from: classes4.dex */
public final class C11428 implements InterfaceC17395, InterfaceC17064 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public long f35935 = 0;

    @Override // l.InterfaceC17064
    public final int size() {
        return 8;
    }

    @Override // l.InterfaceC17395
    /* JADX INFO: renamed from: ᩷ */
    public final byte mo10574() {
        return (byte) 20;
    }

    @Override // l.InterfaceC2149
    /* JADX INFO: renamed from: ۙ */
    public final int mo6138(int i, int i2, byte[] bArr) {
        this.f35935 = C0481.m2320(i, bArr);
        return 8;
    }

    @Override // l.InterfaceC17064
    /* JADX INFO: renamed from: ۙ */
    public final int mo10573(int i, byte[] bArr) {
        C0481.m2321(this.f35935, i, bArr);
        return 8;
    }

    public final String toString() {
        return new String(C2764.m9137(new StringBuilder("EndOfFileInformation[endOfFile="), this.f35935, "]"));
    }
}
