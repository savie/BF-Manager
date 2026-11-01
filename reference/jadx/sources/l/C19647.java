package l;

/* JADX INFO: renamed from: l.᩵ᩴ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: G9V0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19647 extends AbstractC2712 {

    /* JADX INFO: renamed from: ۚܰ, reason: not valid java name and contains not printable characters */
    public int f63098;

    /* JADX INFO: renamed from: ᩹ܰ, reason: not valid java name and contains not printable characters */
    public final C5124 f63099;

    @Override // l.AbstractC2712
    /* JADX INFO: renamed from: ۬ */
    public final int mo6399(int i, byte[] bArr) {
        return 0;
    }

    public C19647(String str, InterfaceC10601 interfaceC10601) {
        super(interfaceC10601, (byte) 50, (byte) 16);
        this.f63098 = 3;
        this.f63099 = new C5124(str);
        this.f10437 = 0;
        this.f10440 = 0;
        this.f10424 = 4096;
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
        return this.f63099.mo1806(0, bArr);
    }

    @Override // l.AbstractC2712, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("Trans2GetDfsReferral[");
        sb.append(super.toString());
        sb.append(",maxReferralLevel=0x");
        sb.append(this.f63098);
        sb.append(",filename=");
        return new String(C22697.m50267(sb, this.f48357, "]"));
    }
}
