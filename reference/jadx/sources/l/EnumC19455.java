package l;

/* JADX INFO: renamed from: l.ᩴ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19455 implements InterfaceC23425 {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f62838 = 1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f62839 = 2;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f62840;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC19455[] f62842;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f62845 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f62847;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC19455.class.getName());
        f62840 = new C22439();
        f62842 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f62847;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC19455 m44966(int i) {
        return m44962(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19455 m44962(int i) {
        if (i == 0) {
            return JSON_FORMAT_UNKNOWN;
        }
        if (i == 1) {
            return ALLOW;
        }
        if (i != 2) {
            return null;
        }
        return LEGACY_BEST_EFFORT;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m44964() {
        return f62840;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m44968() {
        return (C1357) m44965().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m44967() {
        return m44965();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m44965() {
        int i = C16471.f53413;
        return (C8069) C12543.f40291.m54743().get(5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19455 m44963(C1357 c1357) {
        if (c1357.getType() != m44965()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f62842[c1357.m5001()];
    }

    EnumC19455(int i) {
        this.f62847 = i;
    }
}
