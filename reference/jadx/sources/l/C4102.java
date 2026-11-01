package l;

import java.util.Date;

/* JADX INFO: renamed from: l.ۘᩳ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: K9W0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4102 extends AbstractC11264 implements InterfaceC22553 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public long f15026;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public long f15027;

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte f15028;

    /* JADX INFO: renamed from: ۛۙ, reason: not valid java name and contains not printable characters */
    public int f15029;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public long f15030;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public int f15031;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public boolean f15032;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public boolean f15033;

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public long f15034;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public int f15035;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public long f15036;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f15037;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public long f15038;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public int f15039;

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

    public C4102(InterfaceC10601 interfaceC10601) {
        super(interfaceC10601);
    }

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public final int m11646() {
        return this.f15039;
    }

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public final boolean m11647() {
        return this.f15033;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final void m11644() {
        this.f15033 = true;
    }

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public final int m11648() {
        return this.f15031;
    }

    @Override // l.InterfaceC22553
    public final int getAttributes() {
        return this.f15029;
    }

    @Override // l.InterfaceC22553
    /* JADX INFO: renamed from: ᩻ */
    public final long mo10132() {
        return this.f15030;
    }

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public final long m11645() {
        return this.f15036;
    }

    @Override // l.AbstractC14792
    /* JADX INFO: renamed from: ۨ */
    public final int mo2726(int i, byte[] bArr) {
        this.f15028 = bArr[i];
        this.f15031 = C4850.m13545(i + 1, bArr);
        this.f15037 = C4850.m13549(i + 3, bArr);
        this.f15026 = C4850.m13543(i + 7, bArr);
        this.f15027 = C4850.m13543(i + 15, bArr);
        this.f15030 = C4850.m13543(i + 23, bArr);
        this.f15034 = C4850.m13543(i + 31, bArr);
        this.f15029 = C4850.m13549(i + 39, bArr);
        this.f15038 = C4850.m13547(i + 43, bArr);
        this.f15036 = C4850.m13547(i + 51, bArr);
        this.f15039 = C4850.m13545(i + 59, bArr);
        this.f15035 = C4850.m13545(i + 61, bArr);
        int i2 = i + 64;
        this.f15032 = (bArr[i + 63] & 255) > 0;
        return i2 - i;
    }

    @Override // l.AbstractC11264, l.AbstractC14792
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndXResponse[");
        sb.append(super.toString());
        sb.append(",oplockLevel=");
        sb.append((int) this.f15028);
        sb.append(",fid=");
        sb.append(this.f15031);
        sb.append(",createAction=0x");
        sb.append(C5993.m16280(this.f15037, 4));
        sb.append(",creationTime=");
        sb.append(new Date(this.f15026));
        sb.append(",lastAccessTime=");
        sb.append(new Date(this.f15027));
        sb.append(",lastWriteTime=");
        sb.append(new Date(this.f15030));
        sb.append(",changeTime=");
        sb.append(new Date(this.f15034));
        sb.append(",extFileAttributes=0x");
        C18855.m43491(this.f15029, 4, ",allocationSize=", sb);
        sb.append(this.f15038);
        sb.append(",endOfFile=");
        sb.append(this.f15036);
        sb.append(",fileType=");
        sb.append(this.f15039);
        sb.append(",deviceState=");
        sb.append(this.f15035);
        sb.append(",directory=");
        sb.append(this.f15032);
        sb.append("]");
        return new String(sb.toString());
    }
}
