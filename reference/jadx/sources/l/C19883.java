package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.᩶ۖܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C19883 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public InterfaceC14093 f63742;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14009 f63743;

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public C11083 f63744;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f63745;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C4442 f63746;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean f63747;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C9300 f63748;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public C2325 f63749;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C17060 f63750;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public C6143 f63751;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final String f63752;

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public C6143 f63753;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public final void m45139() {
        this.f63750 = C17060.f54469;
    }

    public C19883(String str, boolean z, byte[] bArr) {
        C14009 c14009 = new C14009(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f63752 = str;
        this.f63743 = c14009;
        this.f63747 = z;
        this.f63745 = -1;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final String m45128() {
        return this.f63752;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C14009 m45129() {
        return this.f63743;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final void m45130() {
        m45127();
        this.f63743.m33870(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m45131() {
        m45127();
        return this.f63745;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C6143 m45140() {
        m45127();
        return this.f63751;
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final C6143 m45138() {
        m45127();
        return this.f63753;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final C11083 m45133() {
        m45127();
        return this.f63744;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m45136() {
        m45127();
        return this.f63742;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC14093 m45132(int i, int i2) {
        if (i2 == 0) {
            return C9672.f32573;
        }
        C11083 c11083 = this.f63744;
        if (c11083 == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new C15650(this.f63743, i, i2, c11083);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m45127() {
        if (this.f63745 == -1) {
            m45126();
        }
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2325 m45134() {
        if (this.f63748 == null) {
            m45126();
        }
        return this.f63749;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final C8157 m45135() {
        if (this.f63748 == null) {
            m45126();
        }
        C15981 c15981 = (C15981) this.f63748.m23873("BootstrapMethods");
        if (c15981 != null) {
            return c15981.m37960();
        }
        return C8157.f28509;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C9300 m45137() {
        if (this.f63748 == null) {
            m45126();
        }
        return this.f63748;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final C4442 m45141() {
        if (this.f63748 == null) {
            m45126();
        }
        return this.f63746;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final C17432 m45142() {
        if (this.f63748 == null) {
            m45126();
        }
        InterfaceC5771 interfaceC5771M23873 = this.f63748.m23873("SourceFile");
        if (interfaceC5771M23873 instanceof C2511) {
            return ((C2511) interfaceC5771M23873).m7698();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    private void m45126() {
        String str = this.f63752;
        try {
            m45125();
        } catch (C1537 e) {
            e.m20021("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C1537 c1537 = new C1537(null, e2);
            c1537.m20021("...while parsing " + str);
            throw c1537;
        }
    }

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    private void m45125() {
        AbstractC9901 abstractC9901;
        C14009 c14009 = this.f63743;
        if (c14009.m33864() < 10) {
            throw new C1537("severely truncated class file", null);
        }
        boolean z = this.f63747;
        if (z) {
            if (c14009.m33870(0) != -889275714) {
                throw new C1537("bad class file magic (" + C22475.m49978(c14009.m33870(0)) + MotionUtils.EASING_TYPE_FORMAT_END, null);
            }
            int iM33871 = c14009.m33871(4);
            int iM33872 = c14009.m33871(6);
            if (iM33871 < 0 || (iM33872 != 53 ? iM33872 >= 53 || iM33872 < 45 : iM33871 > 0)) {
                throw new C1537("unsupported class file version " + c14009.m33871(6) + "." + c14009.m33871(4), null);
            }
        }
        C8594 c8594 = new C8594(c14009);
        C11083 c11083M22375 = c8594.m22375();
        this.f63744 = c11083M22375;
        c11083M22375.mo9637();
        int iM22374 = c8594.m22374();
        int iM33873 = c14009.m33871(iM22374);
        this.f63751 = (C6143) this.f63744.get(c14009.m33871(iM22374 + 2));
        int iM33874 = c14009.m33871(iM22374 + 4);
        C11083 c11083 = this.f63744;
        if (iM33874 == 0) {
            c11083.getClass();
            abstractC9901 = null;
        } else {
            abstractC9901 = c11083.get(iM33874);
        }
        this.f63753 = (C6143) abstractC9901;
        int iM33875 = c14009.m33871(iM22374 + 6);
        int i = iM22374 + 8;
        this.f63742 = m45132(i, iM33875);
        int i2 = (iM33875 * 2) + i;
        if (z) {
            String strM9840 = this.f63751.m17128().m9840();
            String str = this.f63752;
            if (!str.endsWith(".class") || !str.startsWith(strM9840) || str.length() != strM9840.length() + 6) {
                throw new C1537(C0242.m1617("class name (", strM9840, ") does not match path (", str, MotionUtils.EASING_TYPE_FORMAT_END), null);
            }
        }
        this.f63745 = iM33873;
        C0126 c0126 = new C0126(this, this.f63751, i2, this.f63750);
        this.f63746 = c0126.m1188();
        C12122 c12122 = new C12122(this, this.f63751, c0126.m38523(), this.f63750);
        this.f63749 = c12122.m30162();
        C20588 c20588 = new C20588(this, 0, c12122.m38523(), this.f63750);
        C9300 c9300M46447 = c20588.m46447();
        this.f63748 = c9300M46447;
        c9300M46447.mo9637();
        int iM46446 = c20588.m46446();
        if (iM46446 != c14009.m33864()) {
            throw new C1537("extra bytes at end of class file, at offset ".concat(C22475.m49978(iM46446)), null);
        }
    }
}
