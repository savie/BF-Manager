package l;

/* JADX INFO: renamed from: l.᩵ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: F9Z8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C19626 extends AbstractC11264 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f62992;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f62993;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f62994;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f62995;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public byte[] f62996;

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

    public C19626(int i, InterfaceC10601 interfaceC10601, byte[] bArr) {
        super(interfaceC10601);
        this.f62996 = bArr;
        this.f62994 = i;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final byte[] m44717() {
        return this.f62996;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final int m44719() {
        return this.f62994;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final void m44716(int i) {
        this.f62994 += i;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m44720() {
        return this.f62995;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m44718() {
        return this.f62992;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f62993 = C4850.m13545(i + 2, bArr);
        this.f62995 = C4850.m13545(i + 6, bArr);
        this.f62992 = C4850.m13545(i + 8, bArr);
        return (i + 20) - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComReadAndXResponse[");
        sb.append(super.toString());
        sb.append(",dataCompactionMode=");
        sb.append(this.f62993);
        sb.append(",dataLength=");
        sb.append(this.f62995);
        sb.append(",dataOffset=");
        return new String(C12441.m30911(this.f62992, "]", sb));
    }
}
