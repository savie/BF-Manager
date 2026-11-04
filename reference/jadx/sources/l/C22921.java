package l;

/* JADX INFO: renamed from: l.᩸ܺᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: V702 */
/* JADX INFO: loaded from: classes.dex */
public final class C22921 implements InterfaceC12720 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public int f74489;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public int f74490 = -1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C16207 f74491;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C12831[] f74492;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f74493;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public int[] f74494;

    public C22921(C16207 c16207) {
        this.f74491 = c16207;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩷ */
    public final int mo31527() {
        return this.f74490 < 0 ? this.f74491.f52678 : this.f74493;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩳ */
    public final int mo31523(int i) {
        return this.f74491.f52653[i].f42262.f55380;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩵ */
    public final int mo31525(int i) {
        return this.f74491.f52653[i].f42276;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۗ */
    public final int mo31504(int i) {
        return this.f74491.f52653[i].f42262.f55374;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩷ */
    public final int mo31528(int i) {
        return this.f74491.f52653[i].f42222;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܳ */
    public final int mo31518(int i) {
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42226);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۙ */
    public final int mo31507(int i) {
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42232);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩶ */
    public final int mo31526(int i) {
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42212);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩸ */
    public final int mo31529(int i) {
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42256);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ֫ */
    public final int mo31503(int i) {
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42254);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۢ */
    public final int mo31511(int i) {
        int i2 = this.f74490;
        if (i2 >= 0 && i == this.f74493 - 1) {
            return i2;
        }
        C16207 c16207 = this.f74491;
        long j = c16207.f52653[i].f42218;
        if (j < 0) {
            return (int) j;
        }
        long j2 = ((long) c16207.f52653[i].f42244) + ((long) ((int) j));
        int i3 = (int) j2;
        if (j2 == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩺ */
    public final int mo31531(int i) {
        return this.f74491.f52653[i].f42234;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۫ */
    public final int mo31516(int i) {
        return this.f74491.f52653[i].f42225;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ֡ */
    public final int mo31501(int i) {
        return this.f74491.f52653[i].f42274;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܿ */
    public final int mo31522(int i) {
        return this.f74491.f52653[i].f42220;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۤ */
    public final long mo31513(int i) {
        return this.f74491.f52653[i].f42223;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩴ */
    public final int mo31524(int i) {
        return this.f74490 >= 0 ? this.f74494[i] : this.f74491.f52653[i].f42215;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۨ */
    public final C12831 mo31515(int i) {
        return this.f74490 >= 0 ? this.f74492[i] : this.f74491.f52653[i].f42241;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ֨ */
    public final int mo31502(int i) {
        return this.f74491.f52653[i].f42242.f6782;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۘ */
    public final int mo31505(int i) {
        C2038 c2038 = this.f74491.f52653[i].f42242;
        long j = ((long) c2038.f6782) + ((long) c2038.f6783);
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܽ */
    public final int mo31521(int i) {
        if (!m51680(i)) {
            return -1;
        }
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42252);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܰ */
    public final int mo31517(int i) {
        if (!m51680(i)) {
            return -1;
        }
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42229);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۛ */
    public final int mo31509(int i) {
        if (!m51680(i)) {
            return -1;
        }
        C16207 c16207 = this.f74491;
        return m51679(c16207.f52653[i], c16207.f52653[i].f42233);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܶ */
    public final int mo31519(int i) {
        return this.f74491.f52653[i].f42217;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۚ */
    public final int mo31508(int i) {
        return this.f74491.f52653[i].f42261;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۧ */
    public final int mo31514(int i) {
        int i2 = this.f74490;
        if (i2 >= 0 && i == this.f74493 - 1) {
            return i2;
        }
        C13224 c13224 = this.f74491.f52653[i];
        C2038 c2038 = c13224.f42231;
        if (c2038 == null) {
            return -1;
        }
        long j = ((long) c2038.f6782) + ((long) c13224.f42237);
        int i3 = (int) j;
        if (j == i3) {
            return i3;
        }
        throw new ArithmeticException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۟ */
    public final int mo31510(int i) {
        C13224 c13224 = this.f74491.f52653[i];
        boolean z = c13224.f42224;
        ?? r0 = z;
        if (c13224.f42211) {
            r0 = (z ? 1 : 0) | 2;
        }
        ?? r1 = r0;
        if (c13224.f42227) {
            r1 = (r0 == true ? 1 : 0) | 4;
        }
        if (c13224.f42222 == 15) {
            return c13224.f42219 ? r1 | 24 : r1 | 8;
        }
        return r1;
    }

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    private boolean m51680(int i) {
        C13224 c13224 = this.f74491.f52653[i];
        AbstractC2016 abstractC2016 = c13224.f42278;
        if (!(abstractC2016 instanceof C16185) || ((C16185) abstractC2016).f52535 == null) {
            return false;
        }
        int i2 = c13224.f42222;
        return (i2 == 12 || i2 == 13 || i2 == 15) && c13224.f42224;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۙ */
    public final int mo31506() {
        C16207 c16207 = this.f74491;
        if (c16207.f52626 == null) {
            return 1;
        }
        return c16207.f52653[0].f42265;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ۤ */
    public final int mo31512() {
        if (this.f74490 >= 0) {
            return this.f74489;
        }
        C16207 c16207 = this.f74491;
        if (c16207.f52626 == null) {
            return 0;
        }
        return c16207.f52626.m26947() - c16207.f52653[0].f42265;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩻ */
    public final int mo31532(int i) {
        C16207 c16207 = this.f74491;
        if (c16207.f52626 == null) {
            return 0;
        }
        return c16207.f52653[i].f42265 - c16207.f52653[0].f42265;
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ᩹ */
    public final int mo31530(int i) {
        return m51678(this.f74491.f52653[i].f42243);
    }

    @Override // l.InterfaceC12720
    /* JADX INFO: renamed from: ܺ */
    public final int mo31520(int i) {
        C13224 c13224 = this.f74491.f52653[i];
        AbstractC2016 abstractC2016 = c13224.f42278;
        if (!(abstractC2016 instanceof C16185) || ((C16185) abstractC2016).f52535 == null) {
            return -1;
        }
        int i2 = c13224.f42222;
        if (i2 == 12 || i2 == 13 || i2 == 15) {
            return m51678(c13224.f42221);
        }
        return -1;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    private int m51678(int i) {
        C16207 c16207 = this.f74491;
        if (c16207.f52626 == null || i == 0) {
            return -1;
        }
        int i2 = i - c16207.f52653[0].f42265;
        if (i2 >= 0) {
            return i2;
        }
        throw new C5767(EnumC19937.INVALID_RESULT);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m51679(C13224 c13224, int i) {
        if (i < 0) {
            return i;
        }
        long j = ((long) c13224.f42244) + ((long) i);
        int i2 = (int) j;
        if (j == i2) {
            return i2;
        }
        throw new ArithmeticException();
    }
}
