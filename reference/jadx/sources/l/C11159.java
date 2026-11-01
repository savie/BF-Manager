package l;

/* JADX INFO: renamed from: l.ۧᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 39YC */
/* JADX INFO: loaded from: classes4.dex */
public final class C11159 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f37828;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f37829;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f37830;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public long f37831;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f37832;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f37833;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f37834;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f37835;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f37836;

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

    public C11159(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 47, (AbstractC14792) null);
    }

    public C11159(InterfaceC10601 interfaceC10601, int i, long j, int i2, byte[] bArr, int i3, int i4) {
        super(interfaceC10601, (byte) 47, (AbstractC14792) null);
        this.f37828 = i;
        this.f37831 = j;
        this.f37829 = i2;
        this.f37836 = bArr;
        this.f37833 = i3;
        this.f37832 = i4;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m28096(int i, long j, int i2, byte[] bArr, int i3, int i4) {
        this.f37828 = i;
        this.f37831 = j;
        this.f37829 = i2;
        this.f37836 = bArr;
        this.f37833 = i3;
        this.f37832 = i4;
        this.f48373 = null;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m28097(int i) {
        this.f37830 = i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        int i2 = this.f48358;
        int i3 = (i - i2) + 26;
        this.f37835 = i3;
        int i4 = (i3 - i2) % 4;
        this.f37834 = i4;
        int i5 = i4 == 0 ? 0 : 4 - i4;
        this.f37834 = i5;
        this.f37835 = i3 + i5;
        C4850.m13546(this.f37828, i, bArr);
        C4850.m13550(this.f37831, i + 2, bArr);
        int i6 = i + 6;
        int i7 = 0;
        while (i7 < 4) {
            bArr[i6] = -1;
            i7++;
            i6++;
        }
        C4850.m13546(this.f37830, i6, bArr);
        C4850.m13546(this.f37829, i6 + 2, bArr);
        bArr[i6 + 4] = 0;
        bArr[i6 + 5] = 0;
        C4850.m13546(this.f37832, i6 + 6, bArr);
        C4850.m13546(this.f37835, i6 + 8, bArr);
        C4850.m13550(this.f37831 >> 32, i6 + 10, bArr);
        return (i6 + 14) - i;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        int i2 = i;
        while (true) {
            int i3 = this.f37834;
            this.f37834 = i3 - 1;
            if (i3 > 0) {
                bArr[i2] = -18;
                i2++;
            } else {
                System.arraycopy(this.f37836, this.f37833, bArr, i2, this.f37832);
                return (i2 + this.f37832) - i;
            }
        }
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndX[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f37828);
        sb.append(",offset=");
        sb.append(this.f37831);
        sb.append(",writeMode=");
        sb.append(this.f37830);
        sb.append(",remaining=");
        sb.append(this.f37829);
        sb.append(",dataLength=");
        sb.append(this.f37832);
        sb.append(",dataOffset=");
        return new String(C12441.m30911(this.f37835, "]", sb));
    }
}
