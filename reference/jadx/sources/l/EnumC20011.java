package l;

/* JADX INFO: renamed from: l.᩶ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20011 implements InterfaceC9800 {
    JSON_FORMAT_UNKNOWN(0),
    ALLOW(1),
    LEGACY_BEST_EFFORT(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f64059 = 2;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f64061;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f64062 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f64063 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC20011[] f64065;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f64066;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC20011.class.getName());
        f64061 = new C15778();
        f64065 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f64066;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC20011 m45312(int i) {
        return m45309(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20011 m45309(int i) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m45308() {
        return f64061;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m45314() {
        return (C21857) m45311().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m45313() {
        return m45311();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m45311() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(5);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20011 m45310(C21857 c21857) {
        if (c21857.getType() != m45311()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f64065[c21857.m48639()];
    }

    EnumC20011(int i) {
        this.f64066 = i;
    }
}
