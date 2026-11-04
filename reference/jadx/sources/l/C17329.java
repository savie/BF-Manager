package l;

/* JADX INFO: renamed from: l.ܽۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WB */
/* JADX INFO: loaded from: classes5.dex */
public final class C17329 extends AbstractC10461 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final C5463 f56428;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public final int f56429;

    public C17329(InterfaceC5878 interfaceC5878, int i, int i2, long j, long j2, long j3) {
        C5463 c5463 = new C5463(i2 | 128, j, j3, j2);
        super(interfaceC5878, (byte) 50, (byte) 8);
        this.f56429 = i;
        this.f56428 = c5463;
        this.f33281 = 6;
        this.f33296 = 0;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ֫ */
    public final int mo3142(int i, byte[] bArr) {
        bArr[i] = m26887();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۤ */
    public final int mo3144(byte[] bArr) {
        C0481.m2319(this.f56429, 0, bArr);
        this.f56428.getClass();
        C0481.m2319(257L, 2, bArr);
        C0481.m2319(0L, 4, bArr);
        return 6;
    }

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        int iMo10573 = this.f56428.mo10573(i, bArr) + i;
        C0481.m2321(0L, iMo10573, bArr);
        return (iMo10573 + 6) - i;
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2SetFileInformation[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C12669.m31437(this.f56429, "]", sb));
    }
}
