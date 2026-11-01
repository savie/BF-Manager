package l;

/* JADX INFO: renamed from: l.ۛᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: DA0R */
/* JADX INFO: loaded from: classes3.dex */
public final class C6219 extends AbstractC14792 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f21133;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f21134;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public int f21135;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f21136;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f21137;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f21138;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C6219(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 11);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m17256(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f21135 = i;
        this.f21138 = (int) (j & 4294967295L);
        this.f21136 = i2;
        this.f21137 = bArr;
        this.f21133 = i3;
        this.f21134 = i4;
        this.f48373 = null;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f21135, i, bArr);
        C4850.m13546(this.f21134, i + 2, bArr);
        C4850.m13550(this.f21138, i + 4, bArr);
        C4850.m13546(this.f21136, i + 8, bArr);
        return (i + 10) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        bArr[i] = 1;
        C4850.m13546(this.f21134, i + 1, bArr);
        int i2 = i + 3;
        System.arraycopy(this.f21137, this.f21133, bArr, i2, this.f21134);
        return (i2 + this.f21134) - i;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWrite[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f21135);
        sb.append(",count=");
        sb.append(this.f21134);
        sb.append(",offset=");
        sb.append(this.f21138);
        sb.append(",remaining=");
        return new String(C12441.m30911(this.f21136, "]", sb));
    }
}
