package l;

/* JADX INFO: renamed from: l.ۛ᩵۬, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes2.dex */
public final class C6265 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final C2031 f21235;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 f21236;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final String f21237;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean f21238;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final InterfaceC23905 f21239;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC17554 f21240;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final C6265 f21234 = new C6265(EnumC17554.UNSUPPORTED, null, null, null, null, false);

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public static final C6265 f21233 = new C6265(EnumC17554.WAITING_FOR_CACHE, null, null, null, null, false);

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final C6265 f21232 = new C6265(EnumC17554.BLACK_ONLY, null, null, null, null, false);

    public C6265(EnumC17554 enumC17554, AbstractC20745 abstractC20745, C2031 c2031, InterfaceC23905 interfaceC23905, String str, boolean z) {
        this.f21240 = enumC17554;
        this.f21236 = abstractC20745;
        this.f21235 = c2031;
        this.f21239 = interfaceC23905;
        this.f21237 = str;
        this.f21238 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6265 m17336(AbstractC20745 abstractC20745, boolean z) {
        return new C6265(EnumC17554.LOCAL_FILE, abstractC20745, null, null, null, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6265 m17335(C2031 c2031) {
        return new C6265(EnumC17554.NETWORK_CACHE, null, c2031, null, null, m17337(c2031.f7576.getPath()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6265 m17334(String str, InterfaceC23905 interfaceC23905, boolean z) {
        return new C6265(EnumC17554.PAGED, null, null, interfaceC23905, str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17337(String str) {
        return str != null && str.length() >= 3 && str.regionMatches(true, str.length() + (-3), ".ts", 0, 3);
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17342() {
        return this.f21238;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m17340() {
        return this.f21240 == EnumC17554.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final boolean m17344() {
        return this.f21240 == EnumC17554.BLACK_ONLY;
    }

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public final boolean m17345() {
        EnumC17554 enumC17554 = EnumC17554.LOCAL_FILE;
        EnumC17554 enumC17555 = this.f21240;
        return enumC17555 == enumC17554 || enumC17555 == EnumC17554.NETWORK_CACHE || enumC17555 == EnumC17554.PAGED;
    }

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final boolean m17339() {
        return this.f21240 == EnumC17554.LOCAL_FILE;
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final boolean m17347() {
        return this.f21240 == EnumC17554.NETWORK_CACHE;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m17338() {
        return this.f21240 == EnumC17554.PAGED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC20745 m17341() {
        return this.f21236;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final C2031 m17343() {
        return this.f21235;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final InterfaceC3153 m17348() {
        InterfaceC23905 interfaceC23905;
        C2031 c2031;
        AbstractC20745 abstractC20745;
        EnumC17554 enumC17554 = EnumC17554.LOCAL_FILE;
        EnumC17554 enumC17555 = this.f21240;
        if (enumC17555 == enumC17554 && (abstractC20745 = this.f21236) != null) {
            return new C16849(abstractC20745);
        }
        if (enumC17555 == EnumC17554.NETWORK_CACHE && (c2031 = this.f21235) != null) {
            return c2031.m6522();
        }
        if (enumC17555 != EnumC17554.PAGED || (interfaceC23905 = this.f21239) == null) {
            return null;
        }
        return interfaceC23905.mo32704();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String m17346() {
        C2031 c2031 = this.f21235;
        if (c2031 != null) {
            return c2031.m6521();
        }
        String str = this.f21237;
        if (str != null) {
            return "paged:".concat(str);
        }
        AbstractC20745 abstractC20745 = this.f21236;
        if (abstractC20745 != null) {
            return "local:" + abstractC20745.mo33986() + ":" + abstractC20745.mo33964();
        }
        return this.f21240.name();
    }
}
