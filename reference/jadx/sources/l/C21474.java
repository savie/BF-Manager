package l;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;

/* JADX INFO: renamed from: l.᩶ܿ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: 7A20 */
/* JADX INFO: loaded from: classes.dex */
public final class C21474 implements InterfaceC18490 {

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC25186 f68617 = C16980.m40037(C21474.class);

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public C0591 f68618;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final C14760 f68619;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C19457 f68620;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public volatile boolean f68621 = true;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public final String f68622;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public final boolean f68623;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public C8049 f68624;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f68625;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public C6558 f68626;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final int f68627;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f68628;

    @Override // java.lang.AutoCloseable
    public final synchronized void close() {
        boolean zIsOpen = isOpen();
        this.f68621 = false;
        C0591 c0591 = this.f68618;
        if (c0591 != null) {
            c0591.getClass();
            this.f68618 = null;
        }
        C8049 c8049 = this.f68624;
        if (c8049 != null) {
            c8049.getClass();
            this.f68624 = null;
        }
        try {
            if (zIsOpen) {
                this.f68626.m18470();
            } else {
                C6558 c6558 = this.f68626;
                if (c6558 != null) {
                    c6558.m18470();
                }
            }
            this.f68626 = null;
            C19457 c19457 = this.f68620;
            if (c19457 != null) {
                c19457.m44983();
            }
        } catch (Throwable th) {
            C19457 c19458 = this.f68620;
            if (c19458 != null) {
                c19458.m44983();
            }
            throw th;
        }
    }

    @Override // l.InterfaceC18490
    /* JADX INFO: renamed from: ᩸ */
    public final InterfaceC18490 mo43083() {
        if (InterfaceC18490.class.isAssignableFrom(C21474.class)) {
            return this;
        }
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final synchronized C6558 m48846() {
        if (!this.f68621) {
            throw new C20728("Pipe handle already closed");
        }
        if (!isOpen()) {
            C19457 c19457M48851 = m48851();
            try {
                if (c19457M48851.m44978()) {
                    C6558 c6558M31088 = this.f68619.m31088(this.f68622, 0, this.f68625, 7, 128, 0);
                    this.f68626 = c6558M31088;
                    c6558M31088.m18465();
                    c19457M48851.close();
                    return c6558M31088;
                }
                if (this.f68622.startsWith("\\pipe\\")) {
                    c19457M48851.m44971(new C21805(this.f68622, c19457M48851.m44979()), new C10616(c19457M48851.m44979()), new EnumC13269[0]);
                }
                if (c19457M48851.m44973(16) || this.f68622.startsWith("\\pipe\\")) {
                    this.f68626 = this.f68619.m31087(this.f68627, this.f68625, 7, 128, 0);
                } else {
                    this.f68626 = this.f68619.m31088("\\pipe" + this.f68622, this.f68627, this.f68625, 7, 128, 0);
                }
                C6558 c6558 = this.f68626;
                c6558.m18465();
                c19457M48851.close();
                return c6558;
            } catch (Throwable th) {
                try {
                    c19457M48851.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f68617.mo13717("Pipe already open");
        C6558 c6559 = this.f68626;
        c6559.m18465();
        return c6559;
    }

    public C21474(C14760 c14760) {
        this.f68619 = c14760;
        this.f68623 = (c14760.m35494() & 512) == 512;
        this.f68628 = false;
        this.f68627 = (c14760.m35494() & (-65281)) | 32;
        this.f68625 = (c14760.m35494() & 7) | WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT;
        this.f68622 = c14760.f40200.m4914();
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final C14760 m48849() {
        return this.f68619;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C19457 m48851() {
        if (this.f68620 == null) {
            this.f68620 = this.f68619.m31099();
        }
        C19457 c19457 = this.f68620;
        c19457.m44972();
        return c19457;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String m48847() {
        return this.f68622;
    }

    public final boolean isOpen() {
        C6558 c6558;
        return this.f68621 && (c6558 = this.f68626) != null && c6558.m18466();
    }

    @Override // l.InterfaceC18490
    /* JADX INFO: renamed from: ۡۙ */
    public final boolean mo43081() {
        if (!this.f68621) {
            return true;
        }
        C6558 c6558 = this.f68626;
        return (c6558 == null || c6558.m18466()) ? false : true;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C0591 m48848() throws C20728 {
        if (!this.f68621) {
            throw new C20728("Already closed");
        }
        C0591 c0591 = this.f68618;
        if (c0591 != null) {
            return c0591;
        }
        C19457 c19457M48851 = m48851();
        try {
            this.f68618 = new C0591(this, c19457M48851);
            c19457M48851.close();
            return this.f68618;
        } catch (Throwable th) {
            try {
                c19457M48851.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C8049 m48850() throws C20728 {
        if (!this.f68621) {
            throw new C20728("Already closed");
        }
        C8049 c8049 = this.f68624;
        if (c8049 != null) {
            return c8049;
        }
        C19457 c19457M48851 = m48851();
        try {
            this.f68624 = new C8049(this, c19457M48851);
            c19457M48851.close();
            return this.f68624;
        } catch (Throwable th) {
            try {
                c19457M48851.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // l.InterfaceC18490
    /* JADX INFO: renamed from: ۙ */
    public final int mo43079(int i, byte[] bArr, int i2, byte[] bArr2, int i3) {
        C6558 c6558M48846 = m48846();
        try {
            C19457 c19457M18468 = c6558M48846.m18468();
            try {
                if (c19457M18468.m44978()) {
                    C10921 c10921 = new C10921(c19457M18468.m44979(), c6558M48846.m18469(), bArr2);
                    c10921.m27717();
                    c10921.m27716(new C23187(bArr, i, i2));
                    c10921.m27718(i3);
                    int iM51577 = ((C22856) c19457M18468.m44971(c10921, null, EnumC13269.NO_RETRY)).m51577();
                    c19457M18468.close();
                    c6558M48846.m18470();
                    return iM51577;
                }
                if (this.f68623) {
                    C14190 c14190 = new C14190(c19457M18468.m44979(), c6558M48846.m18467(), bArr, i, i2);
                    C4651 c4651 = new C4651(c19457M18468.m44979(), bArr2);
                    if ((this.f68619.m35494() & 1536) == 1536) {
                        c14190.m26884();
                    }
                    c19457M18468.m44971(c14190, c4651, EnumC13269.NO_RETRY);
                    int iM14506 = c4651.m14506();
                    c19457M18468.close();
                    c6558M48846.m18470();
                    return iM14506;
                }
                if (this.f68628) {
                    c19457M18468.m44971(new C21805(this.f68622, c19457M18468.m44979()), new C10616(c19457M18468.m44979()), new EnumC13269[0]);
                    C3004 c3004 = new C3004(c19457M18468.m44979(), bArr2);
                    c19457M18468.m44971(new C9715(c19457M18468.m44979(), this.f68622, bArr, i, i2), c3004, new EnumC13269[0]);
                    int iM9809 = c3004.m9809();
                    c19457M18468.close();
                    c6558M48846.m18470();
                    return iM9809;
                }
                C8049 c8049M48850 = m48850();
                C0591 c0591M48848 = m48848();
                c8049M48850.m13815(i, bArr, i2, 0);
                c0591M48848.getClass();
                int iM54710 = c0591M48848.m54710(0, bArr2.length, bArr2);
                c19457M18468.close();
                c6558M48846.m18470();
                return iM54710;
            } catch (Throwable th) {
                try {
                    c19457M18468.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (Throwable th3) {
            try {
                c6558M48846.m18470();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @Override // l.InterfaceC18490
    /* JADX INFO: renamed from: ۤ */
    public final int mo43082(int i, int i2, byte[] bArr) {
        return m48848().m54710(i, i2, bArr);
    }

    @Override // l.InterfaceC18490
    /* JADX INFO: renamed from: ۙ */
    public final void mo43080(int i, int i2, byte[] bArr) throws IOException {
        m48850().m13815(i, bArr, i2, 1);
    }
}
