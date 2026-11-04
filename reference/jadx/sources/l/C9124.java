package l;

/* JADX INFO: renamed from: l.ۡۘ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2J */
/* JADX INFO: loaded from: classes4.dex */
public final class C9124 extends AbstractC12108 {

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public byte f29617;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC2149 f29618;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public byte f29619;

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩸ */
    public final int mo1472(int i, byte[] bArr) {
        return 0;
    }

    public C9124(InterfaceC5878 interfaceC5878, byte b, byte b2) {
        super(interfaceC5878);
        this.f29617 = b;
        this.f29619 = b2;
    }

    /* JADX INFO: renamed from: ۗۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC2149 m24273() throws C20048 {
        if (InterfaceC4145.class.isAssignableFrom(this.f29618.getClass())) {
            return this.f29618;
        }
        throw new C20048("Incompatible file information class");
    }

    @Override // l.AbstractC3159
    /* JADX INFO: renamed from: ᩷ */
    public final int mo1470(int i, byte[] bArr) throws C19061 {
        InterfaceC2149 c15903;
        if (C0481.m2318(i, bArr) != 9) {
            throw new C19061("Expected structureSize = 9");
        }
        int iM10327 = m10327() + C0481.m2318(i + 2, bArr);
        int iM2322 = C0481.m2322(i + 4, bArr);
        int i2 = i + 8;
        byte b = this.f29617;
        byte b2 = this.f29619;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        throw new C19061(C13645.m33382(b, "Unknwon information type "));
                    }
                    throw new C19061(C13645.m33382(b2, "Unknown quota info class "));
                }
                c15903 = new C15157();
            } else if (b2 == 3) {
                c15903 = new C16649();
            } else {
                if (b2 != 7) {
                    throw new C19061(C13645.m33382(b2, "Unknown filesystem info class "));
                }
                c15903 = new C24855();
            }
        } else {
            if (b2 != 6) {
                throw new C19061(C13645.m33382(b2, "Unknown file info class "));
            }
            c15903 = new C15903();
        }
        c15903.mo6138(iM10327, iM2322, bArr);
        int iMax = Math.max(i2, iM10327 + iM2322);
        this.f29618 = c15903;
        return iMax - i;
    }
}
