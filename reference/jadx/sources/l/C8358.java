package l;

/* JADX INFO: renamed from: l.۠ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: D9UF */
/* JADX INFO: loaded from: classes4.dex */
public final class C8358 extends AbstractC2712 {

    /* JADX INFO: renamed from: ֨ܰ, reason: not valid java name and contains not printable characters */
    public long f28989;

    /* JADX INFO: renamed from: ۘܰ, reason: not valid java name and contains not printable characters */
    public int f28990;

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public String f28991;

    /* JADX INFO: renamed from: ۬ܰ, reason: not valid java name and contains not printable characters */
    public int f28992;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public int f28993;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C8358(int i, int i2, int i3, int i4, String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 50, (byte) 2);
        this.f28990 = i;
        this.f28992 = i2;
        this.f28991 = str;
        this.f28993 = 260;
        this.f10440 = 8;
        this.f28989 = i3;
        this.f10424 = i4;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m21882(int i, String str) {
        reset();
        this.f28992 = i;
        this.f28991 = str;
        this.f48356 = 0;
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
        C4850.m13546(this.f28990, 0, bArr);
        C4850.m13546(this.f28989, 2, bArr);
        C4850.m13546(this.f28993, 4, bArr);
        C4850.m13550(this.f28992, 6, bArr);
        C4850.m13546(0, 10, bArr);
        return m35440(this.f28991, 12, bArr) + 12;
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2FindNext2[");
        sb.append(super.toString());
        sb.append(",sid=");
        sb.append(this.f28990);
        sb.append(",searchCount=");
        sb.append(((C9895) m35454()).m25070());
        sb.append(",informationLevel=0x");
        C18855.m43491(this.f28993, 3, ",resumeKey=0x", sb);
        C18855.m43491(this.f28992, 4, ",flags=0x", sb);
        C18855.m43491(0, 2, ",filename=", sb);
        return new String(C22697.m50267(sb, this.f28991, "]"));
    }
}
