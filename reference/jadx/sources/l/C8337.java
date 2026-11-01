package l;

/* JADX INFO: renamed from: l.۠ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9YR */
/* JADX INFO: loaded from: classes4.dex */
public final class C8337 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f28867;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f28868;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f28869;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f28870;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f28871;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f28872;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

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

    public C8337(InterfaceC10601 interfaceC10601, int i, long j, int i2) {
        super(interfaceC10601, (byte) 46, (AbstractC14792) null);
        this.f28872 = i;
        this.f28867 = j;
        this.f28871 = i2;
        this.f28869 = i2;
        this.f28870 = -1;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m21767(int i) {
        this.f28869 = i;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final void m21768() {
        this.f28871 = 1024;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final void m21770(int i) {
        this.f28870 = i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final void m21769() {
        this.f28868 = 1024;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f28872, i, bArr);
        long j = this.f28867;
        C4850.m13550(j, i + 2, bArr);
        C4850.m13546(this.f28869, i + 6, bArr);
        C4850.m13546(this.f28871, i + 8, bArr);
        C4850.m13550(this.f28870, i + 10, bArr);
        C4850.m13546(this.f28868, i + 14, bArr);
        C4850.m13550(j >> 32, i + 16, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f28872);
        sb.append(",offset=");
        long j = this.f28867;
        sb.append(j);
        sb.append(",maxCount=");
        sb.append(this.f28869);
        sb.append(",minCount=");
        sb.append(this.f28871);
        sb.append(",openTimeout=");
        sb.append(this.f28870);
        sb.append(",remaining=");
        sb.append(this.f28868);
        sb.append(",offset=");
        sb.append(j);
        sb.append("]");
        return new String(sb.toString());
    }
}
