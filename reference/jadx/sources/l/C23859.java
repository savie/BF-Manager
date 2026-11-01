package l;

/* JADX INFO: renamed from: l.᩻ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0W */
/* JADX INFO: loaded from: classes2.dex */
public final class C23859 extends AbstractC11264 {

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f77128;

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ֨ */
    public final int mo2724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۚ */
    public final int mo2725(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ܰ */
    public final int mo2727(int i, byte[] bArr) {
        return 0;
    }

    public C23859(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final long m52588() {
        return this.f77128;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f77128 = ((long) C4850.m13545(i, bArr)) & 65535;
        return 8;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteAndXResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C15037.m36023(sb, this.f77128, "]"));
    }
}
