package l;

/* JADX INFO: renamed from: l.ۘ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: I9X5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4496 extends AbstractC3971 {

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public long f16068;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C4496(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public final long m14220() {
        return this.f16068;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f16068 = ((long) C0481.m2318(i, bArr)) & 65535;
        return 8;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComWriteResponse[");
        sb.append(super.toString());
        sb.append(",count=");
        return new String(C2764.m9137(sb, this.f16068, "]"));
    }
}
