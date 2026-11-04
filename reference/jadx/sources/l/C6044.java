package l;

/* JADX INFO: renamed from: l.ۛ֨ۚ, reason: contains not printable characters */
/* JADX INFO: compiled from: Q8FL */
/* JADX INFO: loaded from: classes3.dex */
public final class C6044 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 f20675;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean f20676;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final EnumC12009 f20677;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final String f20678;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InterfaceC3806 f20679;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C20960 f20680;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C6044 f20673 = new C6044(EnumC12009.UNSUPPORTED, null, null, null, null, false);

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final C6044 f20672 = new C6044(EnumC12009.WAITING_FOR_CACHE, null, null, null, null, false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final C6044 f20674 = new C6044(EnumC12009.BLACK_ONLY, null, null, null, null, false);

    public C6044(EnumC12009 enumC12009, AbstractC22044 abstractC22044, C20960 c20960, InterfaceC3806 interfaceC3806, String str, boolean z) {
        this.f20677 = enumC12009;
        this.f20675 = abstractC22044;
        this.f20680 = c20960;
        this.f20679 = interfaceC3806;
        this.f20678 = str;
        this.f20676 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6044 m17540(AbstractC22044 abstractC22044, boolean z) {
        return new C6044(EnumC12009.LOCAL_FILE, abstractC22044, null, null, null, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6044 m17539(C20960 c20960) {
        return new C6044(EnumC12009.NETWORK_CACHE, null, c20960, null, null, m17541(c20960.f67037.getPath()));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static C6044 m17538(String str, InterfaceC3806 interfaceC3806, boolean z) {
        return new C6044(EnumC12009.PAGED, null, null, interfaceC3806, str, z);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static boolean m17541(String str) {
        return str != null && str.length() >= 3 && str.regionMatches(true, str.length() + (-3), ".ts", 0, 3);
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m17549() {
        return this.f20676;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m17542() {
        return this.f20677 == EnumC12009.UNSUPPORTED;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final boolean m17545() {
        return this.f20677 == EnumC12009.BLACK_ONLY;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m17544() {
        EnumC12009 enumC12009 = EnumC12009.LOCAL_FILE;
        EnumC12009 enumC120010 = this.f20677;
        return enumC120010 == enumC12009 || enumC120010 == EnumC12009.NETWORK_CACHE || enumC120010 == EnumC12009.PAGED;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m17551() {
        return this.f20677 == EnumC12009.LOCAL_FILE;
    }

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public final boolean m17548() {
        return this.f20677 == EnumC12009.NETWORK_CACHE;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m17547() {
        return this.f20677 == EnumC12009.PAGED;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final AbstractC22044 m17543() {
        return this.f20675;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final C20960 m17546() {
        return this.f20680;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final InterfaceC1278 m17552() {
        InterfaceC3806 interfaceC3806;
        C20960 c20960;
        AbstractC22044 abstractC22044;
        EnumC12009 enumC12009 = EnumC12009.LOCAL_FILE;
        EnumC12009 enumC120010 = this.f20677;
        if (enumC120010 == enumC12009 && (abstractC22044 = this.f20675) != null) {
            return new C3060(abstractC22044);
        }
        if (enumC120010 == EnumC12009.NETWORK_CACHE && (c20960 = this.f20680) != null) {
            return c20960.m47917();
        }
        if (enumC120010 != EnumC12009.PAGED || (interfaceC3806 = this.f20679) == null) {
            return null;
        }
        return interfaceC3806.mo10127();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final String m17550() {
        C20960 c20960 = this.f20680;
        if (c20960 != null) {
            return c20960.m47916();
        }
        String str = this.f20678;
        if (str != null) {
            return "paged:".concat(str);
        }
        AbstractC22044 abstractC22044 = this.f20675;
        if (abstractC22044 != null) {
            return "local:" + abstractC22044.mo4294() + ":" + abstractC22044.mo4285();
        }
        return this.f20677.name();
    }
}
