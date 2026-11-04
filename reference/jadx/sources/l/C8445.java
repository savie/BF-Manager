package l;

/* JADX INFO: renamed from: l.۠ۛ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: JA0A */
/* JADX INFO: loaded from: classes4.dex */
public final class C8445 extends AbstractC6209 implements InterfaceC0416 {

    /* JADX INFO: renamed from: ֡ۙ, reason: not valid java name and contains not printable characters */
    public int f27612;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public int f27613;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public int f27614;

    /* JADX INFO: renamed from: ۟ۙ, reason: not valid java name and contains not printable characters */
    public int f27615;

    /* JADX INFO: renamed from: ۢۙ, reason: not valid java name and contains not printable characters */
    public byte f27616;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public int f27617;

    /* JADX INFO: renamed from: ܿۙ, reason: not valid java name and contains not printable characters */
    public int f27618;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public int f27619;

    /* JADX INFO: renamed from: ᩶ۙ, reason: not valid java name and contains not printable characters */
    public int f27620;

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۤ */
    public final int mo1722(int i, byte[] bArr) {
        return 0;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1725(int i, byte[] bArr) {
        return 0;
    }

    public C8445(InterfaceC5878 interfaceC5878, String str, int i, int i2, int i3, int i4, int i5) {
        super(interfaceC5878, (byte) -94, str);
        this.f27620 = i2 | 137;
        this.f27618 = i4;
        this.f27613 = i3;
        if ((i & 64) == 64) {
            if ((i & 16) == 16) {
                this.f27614 = 5;
            } else {
                this.f27614 = 4;
            }
        } else if ((i & 16) != 16) {
            this.f27614 = 1;
        } else if ((i & 32) == 32) {
            this.f27614 = 2;
        } else {
            this.f27614 = 3;
        }
        if ((i5 & 1) == 0) {
            this.f27617 = i5 | 64;
        } else {
            this.f27617 = i5;
        }
        this.f27615 = 2;
        this.f27616 = (byte) 3;
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final AbstractC3971 mo1727() {
        return (C6954) super.mo1727();
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC17965 mo1727() {
        return (C6954) super.mo1727();
    }

    @Override // l.AbstractC3971, l.InterfaceC21299, l.InterfaceC14585
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18315 mo1727() {
        return (C6954) super.mo1727();
    }

    @Override // l.InterfaceC0416
    /* JADX INFO: renamed from: ᩷ */
    public final InterfaceC18315 mo1726(InterfaceC23032 interfaceC23032) {
        C6954 c6954 = new C6954(interfaceC23032.mo2875());
        mo12766((InterfaceC18315) c6954);
        return c6954;
    }

    /* JADX INFO: renamed from: ܺۙ, reason: not valid java name and contains not printable characters */
    public final void m22631() {
        this.f27612 |= 22;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ۫ */
    public final int mo1723(int i, byte[] bArr) {
        bArr[i] = 0;
        this.f27619 = i + 1;
        C0481.m2323(this.f27612, i + 3, bArr);
        C0481.m2323(0, i + 7, bArr);
        C0481.m2323(this.f27620, i + 11, bArr);
        C0481.m2321(0L, i + 15, bArr);
        C0481.m2323(this.f27618, i + 23, bArr);
        C0481.m2323(this.f27613, i + 27, bArr);
        C0481.m2323(this.f27614, i + 31, bArr);
        C0481.m2323(this.f27617, i + 35, bArr);
        C0481.m2323(this.f27615, i + 39, bArr);
        bArr[i + 43] = this.f27616;
        return (i + 44) - i;
    }

    @Override // l.AbstractC3971
    /* JADX INFO: renamed from: ᩴ */
    public final int mo1724(int i, byte[] bArr) {
        int iM12758 = m12758(this.f13608, i, bArr);
        C0481.m2319(m12781() ? this.f13608.length() * 2 : iM12758, this.f27619, bArr);
        return iM12758;
    }

    @Override // l.AbstractC6209, l.AbstractC3971
    public final String toString() {
        StringBuilder sb = new StringBuilder("SmbComNTCreateAndX[");
        sb.append(super.toString());
        sb.append(",flags=0x");
        C8008.m21876(this.f27612, 2, ",rootDirectoryFid=0,desiredAccess=0x", sb);
        C8008.m21876(this.f27620, 4, ",allocationSize=0,extFileAttributes=0x", sb);
        C8008.m21876(this.f27618, 4, ",shareAccess=0x", sb);
        C8008.m21876(this.f27613, 4, ",createDisposition=0x", sb);
        C8008.m21876(this.f27614, 4, ",createOptions=0x", sb);
        C8008.m21876(this.f27617, 8, ",impersonationLevel=0x", sb);
        C8008.m21876(this.f27615, 4, ",securityFlags=0x", sb);
        C8008.m21876(this.f27616, 2, ",name=", sb);
        return new String(C8947.m23910(sb, this.f13608, "]"));
    }
}
