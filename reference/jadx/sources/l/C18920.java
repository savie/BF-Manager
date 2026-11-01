package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ᩴᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 19VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class C18920 extends AbstractC14792 implements InterfaceC22553 {

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public long f61211;

    /* JADX INFO: renamed from: ۡۙ, reason: not valid java name and contains not printable characters */
    public int f61212;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public long f61213;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public int f61214;

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

    public C18920(InterfaceC10601 interfaceC10601, long j) {
        super(interfaceC10601, (byte) 8);
        this.f61214 = 0;
        this.f61213 = 0L;
        this.f61212 = 0;
        this.f61211 = j;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f61214;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return this.f61213 + this.f61211;
    }

    @Override // l.InterfaceC22553
    public final long getSize() {
        return this.f61212;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        if (this.f48376 == 0) {
            return 0;
        }
        this.f61214 = C4850.m13545(i, bArr);
        this.f61213 = (((long) C4850.m13549(i + 2, bArr)) & 4294967295L) * 1000;
        this.f61212 = C4850.m13549(i + 6, bArr);
        return 20;
    }

    @Override // l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComQueryInformationResponse[");
        sb.append(super.toString());
        sb.append(",fileAttributes=0x");
        sb.append(C5993.m16280(this.f61214, 4));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f61213));
        sb.append(",fileSize=");
        return new String(C12441.m30911(this.f61212, "]", sb));
    }
}
