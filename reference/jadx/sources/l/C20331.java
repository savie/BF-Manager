package l;

/* JADX INFO: renamed from: l.᩶ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F9ZZ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20331 extends AbstractC14792 {

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public long f65851;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f65852;

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

    public C20331(InterfaceC10601 interfaceC10601, String str, int i, long j) {
        super(interfaceC10601, (byte) 9, str);
        this.f65852 = i;
        this.f65851 = j;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        C4850.m13546(this.f65852, i, bArr);
        C4850.m13550(this.f65851 / 1000, i + 2, bArr);
        return (i + 16) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2 = i + 1;
        bArr[i] = 4;
        return (i2 + m35440(this.f48357, i2, bArr)) - i;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComSetInformation[");
        sb.append(super.toString());
        sb.append(",filename=");
        sb.append(this.f48357);
        sb.append(",fileAttributes=");
        sb.append(this.f65852);
        sb.append(",lastWriteTime=");
        return new String(C15037.m36023(sb, this.f65851, "]"));
    }
}
