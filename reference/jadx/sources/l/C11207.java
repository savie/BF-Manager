package l;

/* JADX INFO: renamed from: l.ۤ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 99TX */
/* JADX INFO: loaded from: classes4.dex */
public final class C11207 extends AbstractC6209 implements InterfaceC1162 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f35352;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f35353;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f35354;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f35355;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public long f35356;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f35357;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f35358;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f35359;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f35360;

    @Override // l.InterfaceC1162
    public final long getSize() {
        throw null;
    }

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

    public C11207(InterfaceC5878 interfaceC5878) {
        super(interfaceC5878);
    }

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public final int m28240() {
        return this.f35360;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final int m28239() {
        return this.f35352;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f35358;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m28238() {
        return this.f35355;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f35356;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        this.f35360 = C0481.m2318(i, bArr);
        this.f35358 = C0481.m2318(i + 2, bArr);
        this.f35356 = (((long) C0481.m2322(i + 4, bArr)) & 4294967295L) * 1000;
        this.f35352 = C0481.m2322(i + 8, bArr);
        this.f35359 = C0481.m2318(i + 12, bArr);
        this.f35355 = C0481.m2318(i + 14, bArr);
        this.f35357 = C0481.m2318(i + 16, bArr);
        this.f35354 = C0481.m2318(i + 18, bArr);
        this.f35353 = C0481.m2322(i + 20, bArr);
        return (i + 26) - i;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndXResponse[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f35360);
        sb.append(",fileAttributes=");
        sb.append(this.f35358);
        sb.append(",lastWriteTime=");
        sb.append(this.f35356);
        sb.append(",dataSize=");
        sb.append(this.f35352);
        sb.append(",grantedAccess=");
        sb.append(this.f35359);
        sb.append(",fileType=");
        sb.append(this.f35355);
        sb.append(",deviceState=");
        sb.append(this.f35357);
        sb.append(",action=");
        sb.append(this.f35354);
        sb.append(",serverFid=");
        return new String(C12669.m31437(this.f35353, "]", sb));
    }
}
