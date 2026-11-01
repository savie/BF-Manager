package l;

/* JADX INFO: renamed from: l.᩸ᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: 99TX */
/* JADX INFO: loaded from: classes5.dex */
public final class C21742 extends AbstractC11264 implements InterfaceC22553 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f70472;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public long f70473;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f70474;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public int f70475;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public int f70476;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f70477;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f70478;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f70479;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public int f70480;

    @Override // l.InterfaceC22553
    public final long getSize() {
        throw null;
    }

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

    public C21742(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m48510() {
        return this.f70479;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final int m48508() {
        return this.f70477;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f70472;
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m48509() {
        return this.f70475;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return this.f70473;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f70479 = C4850.m13545(i, bArr);
        this.f70472 = C4850.m13545(i + 2, bArr);
        this.f70473 = (((long) C4850.m13549(i + 4, bArr)) & 4294967295L) * 1000;
        this.f70477 = C4850.m13549(i + 8, bArr);
        this.f70478 = C4850.m13545(i + 12, bArr);
        this.f70475 = C4850.m13545(i + 14, bArr);
        this.f70476 = C4850.m13545(i + 16, bArr);
        this.f70480 = C4850.m13545(i + 18, bArr);
        this.f70474 = C4850.m13549(i + 20, bArr);
        return (i + 26) - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComOpenAndXResponse[");
        sb.append(super.toString());
        sb.append(",fid=");
        sb.append(this.f70479);
        sb.append(",fileAttributes=");
        sb.append(this.f70472);
        sb.append(",lastWriteTime=");
        sb.append(this.f70473);
        sb.append(",dataSize=");
        sb.append(this.f70477);
        sb.append(",grantedAccess=");
        sb.append(this.f70478);
        sb.append(",fileType=");
        sb.append(this.f70475);
        sb.append(",deviceState=");
        sb.append(this.f70476);
        sb.append(",action=");
        sb.append(this.f70480);
        sb.append(",serverFid=");
        return new String(C12441.m30911(this.f70474, "]", sb));
    }
}
