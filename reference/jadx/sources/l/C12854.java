package l;

/* JADX INFO: renamed from: l.۫ۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: G9V0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C12854 extends AbstractC10461 {

    /* JADX INFO: renamed from: ܳ᩷, reason: not valid java name and contains not printable characters */
    public final C21871 f41157;

    /* JADX INFO: renamed from: ᩴ᩷, reason: not valid java name and contains not printable characters */
    public int f41158;

    @Override // l.AbstractC10461
    /* JADX INFO: renamed from: ۚ */
    public final int mo3143(int i, byte[] bArr) {
        return 0;
    }

    public C12854(String str, InterfaceC5878 interfaceC5878) {
        super(interfaceC5878, (byte) 50, (byte) 16);
        this.f41158 = 3;
        this.f41157 = new C21871(str);
        this.f33300 = 0;
        this.f33281 = 0;
        this.f33296 = 4096;
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
        return this.f41157.mo10573(0, bArr);
    }

    @Override // l.AbstractC10461, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2GetDfsReferral[");
        sb.append(super.toString());
        sb.append(",maxReferralLevel=0x");
        sb.append(this.f41158);
        sb.append(",filename=");
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
