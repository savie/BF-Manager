package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ᩴ᩺᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 19VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C20158 extends AbstractC3971 implements InterfaceC1162 {

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f64758;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public int f64759;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f64760;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public long f64761;

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

    public C20158(InterfaceC5878 interfaceC5878, long j) {
        super(interfaceC5878, (byte) 8);
        this.f64760 = 0;
        this.f64758 = 0L;
        this.f64759 = 0;
        this.f64761 = j;
    }

    @Override // l.InterfaceC1162
    public final int getAttributes() {
        return this.f64760;
    }

    @Override // l.InterfaceC1162
    /* JADX INFO: renamed from: ۡ */
    public final long mo4305() {
        return this.f64758 + this.f64761;
    }

    @Override // l.InterfaceC1162
    public final long getSize() {
        return this.f64759;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        if (this.f13609 == 0) {
            return 0;
        }
        this.f64760 = C0481.m2318(i, bArr);
        this.f64758 = (((long) C0481.m2322(i + 2, bArr)) & 4294967295L) * 1000;
        this.f64759 = C0481.m2322(i + 6, bArr);
        return 20;
    }

    @Override // l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComQueryInformationResponse[");
        sb.append(super.toString());
        sb.append(",fileAttributes=0x");
        sb.append(C6033.m17503(this.f64760, 4));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f64758));
        sb.append(",fileSize=");
        return new String(C12669.m31437(this.f64759, "]", sb));
    }
}
