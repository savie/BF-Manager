package l;

/* JADX INFO: renamed from: l.ܳᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14687 extends AbstractC14792 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f48005;

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

    public C14687(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public final long m35216() {
        return this.f48005;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f48005 = ((long) C4850.m13545(i, bArr)) & 65535;
        return 8;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C15037.m36023(sb, this.f48005, "]"));
    }
}
