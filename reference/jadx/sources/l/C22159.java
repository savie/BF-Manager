package l;

/* JADX INFO: renamed from: l.᩹۠۠, reason: contains not printable characters */
/* JADX INFO: compiled from: XA2J */
/* JADX INFO: loaded from: classes2.dex */
public final class C22159 extends AbstractC6240 {

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public byte f72478;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public byte f72479;

    /* JADX INFO: renamed from: ᩵ۙ, reason: not valid java name and contains not printable characters */
    public InterfaceC7778 f72480;

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ۖ */
    public final int mo3796(int i, byte[] bArr) {
        return 0;
    }

    public C22159(InterfaceC10601 interfaceC10601, byte b, byte b2) {
        super(interfaceC10601);
        this.f72478 = b;
        this.f72479 = b2;
    }

    /* JADX INFO: renamed from: ۠ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC7778 m49168() throws C8484 {
        if (InterfaceC1903.class.isAssignableFrom(this.f72480.getClass())) {
            return this.f72480;
        }
        throw new C8484("Incompatible file information class");
    }

    @Override // l.AbstractC12591
    /* JADX INFO: renamed from: ܰ */
    public final int mo3800(int i, byte[] bArr) throws C2796 {
        InterfaceC7778 c0679;
        if (C4850.m13545(i, bArr) != 9) {
            throw new C2796("Expected structureSize = 9");
        }
        int iM31366 = m31366() + C4850.m13545(i + 2, bArr);
        int iM13549 = C4850.m13549(i + 4, bArr);
        int i2 = i + 8;
        byte b = this.f72478;
        byte b2 = this.f72479;
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    if (b != 4) {
                        throw new C2796(C8479.m22141(b, "Unknwon information type "));
                    }
                    throw new C2796(C8479.m22141(b2, "Unknown quota info class "));
                }
                c0679 = new C8442();
            } else if (b2 == 3) {
                c0679 = new C16203();
            } else {
                if (b2 != 7) {
                    throw new C2796(C8479.m22141(b2, "Unknown filesystem info class "));
                }
                c0679 = new C21141();
            }
        } else {
            if (b2 != 6) {
                throw new C2796(C8479.m22141(b2, "Unknown file info class "));
            }
            c0679 = new C0679();
        }
        c0679.mo1805(iM31366, iM13549, bArr);
        int iMax = Math.max(i2, iM31366 + iM13549);
        this.f72480 = c0679;
        return iMax - i;
    }
}
