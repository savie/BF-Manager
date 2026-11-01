package l;

/* JADX INFO: renamed from: l.᩶ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: J9WB */
/* JADX INFO: loaded from: classes5.dex */
public final class C20352 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public final int f65917;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final C9148 f65918;

    public C20352(InterfaceC10601 interfaceC10601, int i, int i2, long j, long j2, long j3) {
        C9148 c9148 = new C9148(i2 | 128, j, j3, j2);
        super(interfaceC10601, (byte) 50, (byte) 8);
        this.f65917 = i;
        this.f65918 = c9148;
        this.f10440 = 6;
        this.f10424 = 0;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۘ */
    public final int mo6397(int i, byte[] bArr) {
        bArr[i] = m8267();
        bArr[i + 1] = 0;
        return 2;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۨ */
    public final int mo6398(byte[] bArr) {
        C4850.m13546(this.f65917, 0, bArr);
        this.f65918.getClass();
        C4850.m13546(257L, 2, bArr);
        C4850.m13546(0L, 4, bArr);
        return 6;
    }

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        int iMo1806 = this.f65918.mo1806(i, bArr) + i;
        C4850.m13548(0L, iMo1806, bArr);
        return (iMo1806 + 6) - i;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2SetFileInformation[");
        sb.append(super.toString());
        sb.append(",fid=");
        return new String(C12441.m30911(this.f65917, "]", sb));
    }
}
