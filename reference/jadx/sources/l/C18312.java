package l;

import com.google.android.material.motion.MotionUtils;

/* JADX INFO: renamed from: l.ܿۨܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: CBF0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C18312 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public C9230 f59713;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f59714;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C19630 f59715;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C13836 f59716;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean f59717;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public InterfaceC11050 f59718;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final String f59719;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public C1028 f59720;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C21868 f59721;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C10107 f59722;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22460 f59723;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public C1028 f59724;

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final void m42708() {
        this.f59722 = C10107.f32378;
    }

    public C18312(String str, boolean z, byte[] bArr) {
        C22460 c22460 = new C22460(bArr);
        if (str == null) {
            throw new NullPointerException("filePath == null");
        }
        this.f59719 = str;
        this.f59723 = c22460;
        this.f59717 = z;
        this.f59714 = -1;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final String m42706() {
        return this.f59719;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C22460 m42713() {
        return this.f59723;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final void m42700() {
        m42698();
        this.f59723.m50643(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final int m42701() {
        m42698();
        return this.f59714;
    }

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final C1028 m42710() {
        m42698();
        return this.f59720;
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final C1028 m42709() {
        m42698();
        return this.f59724;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final C9230 m42711() {
        m42698();
        return this.f59713;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m42703() {
        m42698();
        return this.f59718;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final InterfaceC11050 m42702(int i, int i2) {
        if (i2 == 0) {
            return C13705.f43487;
        }
        C9230 c9230 = this.f59713;
        if (c9230 == null) {
            throw new IllegalStateException("pool not yet initialized");
        }
        return new C21296(this.f59723, i, i2, c9230);
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    private void m42698() {
        if (this.f59714 == -1) {
            m42699();
        }
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final C20791 m42704() {
        if (this.f59716 == null) {
            m42699();
        }
        C21034 c21034 = (C21034) this.f59716.m33788("BootstrapMethods");
        if (c21034 != null) {
            return c21034.m48073();
        }
        return C20791.f66600;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C19630 m42705() {
        if (this.f59716 == null) {
            m42699();
        }
        return this.f59715;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final C21868 m42707() {
        if (this.f59716 == null) {
            m42699();
        }
        return this.f59721;
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C13836 m42712() {
        if (this.f59716 == null) {
            m42699();
        }
        return this.f59716;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final C9976 m42714() {
        if (this.f59716 == null) {
            m42699();
        }
        InterfaceC1159 interfaceC1159M33788 = this.f59716.m33788("SourceFile");
        if (interfaceC1159M33788 instanceof C20045) {
            return ((C20045) interfaceC1159M33788).m46103();
        }
        return null;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    private void m42699() {
        String str = this.f59719;
        try {
            m42697();
        } catch (C7125 e) {
            e.m12508("...while parsing " + str);
            throw e;
        } catch (RuntimeException e2) {
            C7125 c7125 = new C7125(null, e2);
            c7125.m12508("...while parsing " + str);
            throw c7125;
        }
    }

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    private void m42697() {
        AbstractC13487 abstractC13487;
        C22460 c22460 = this.f59723;
        if (c22460.m50636() < 10) {
            throw new C7125("severely truncated class file", null);
        }
        boolean z = this.f59717;
        if (z) {
            if (c22460.m50643(0) != -889275714) {
                throw new C7125("bad class file magic (" + C5306.m15938(c22460.m50643(0)) + MotionUtils.EASING_TYPE_FORMAT_END, null);
            }
            int iM50641 = c22460.m50641(4);
            int iM50642 = c22460.m50641(6);
            if (iM50641 < 0 || (iM50642 != 53 ? iM50642 >= 53 || iM50642 < 45 : iM50641 > 0)) {
                throw new C7125("unsupported class file version " + c22460.m50641(6) + "." + c22460.m50641(4), null);
            }
        }
        C6380 c6380 = new C6380(c22460);
        C9230 c9230M18127 = c6380.m18127();
        this.f59713 = c9230M18127;
        c9230M18127.mo15005();
        int iM18126 = c6380.m18126();
        int iM50643 = c22460.m50641(iM18126);
        this.f59720 = (C1028) this.f59713.get(c22460.m50641(iM18126 + 2));
        int iM50644 = c22460.m50641(iM18126 + 4);
        C9230 c9230 = this.f59713;
        if (iM50644 == 0) {
            c9230.getClass();
            abstractC13487 = null;
        } else {
            abstractC13487 = c9230.get(iM50644);
        }
        this.f59724 = (C1028) abstractC13487;
        int iM50645 = c22460.m50641(iM18126 + 6);
        int i = iM18126 + 8;
        this.f59718 = m42702(i, iM50645);
        int i2 = (iM50645 * 2) + i;
        if (z) {
            String strM15373 = this.f59720.m3933().m15373();
            String str = this.f59719;
            if (!str.endsWith(".class") || !str.startsWith(strM15373) || str.length() != strM15373.length() + 6) {
                throw new C7125(C3188.m10404("class name (", strM15373, ") does not match path (", str, MotionUtils.EASING_TYPE_FORMAT_END), null);
            }
        }
        this.f59714 = iM50643;
        C0413 c0413 = new C0413(this, this.f59720, i2, this.f59722);
        this.f59721 = c0413.m2220();
        C19058 c19058 = new C19058(this, this.f59720, c0413.m21401(), this.f59722);
        this.f59715 = c19058.m44163();
        C14582 c14582 = new C14582(this, 0, c19058.m21401(), this.f59722);
        C13836 c13836M35182 = c14582.m35182();
        this.f59716 = c13836M35182;
        c13836M35182.mo15005();
        int iM35181 = c14582.m35181();
        if (iM35181 != c22460.m50636()) {
            throw new C7125("extra bytes at end of class file, at offset ".concat(C5306.m15938(iM35181)), null);
        }
    }
}
