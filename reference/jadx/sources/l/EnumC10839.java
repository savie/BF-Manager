package l;

/* JADX INFO: renamed from: l.ۧۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC10839 implements InterfaceC9800 {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC10839[] f36885;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f36888;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f36889 = 3;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f36890 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f36892 = 2;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f36893;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC10839.class.getName());
        f36888 = new C5899();
        f36885 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f36893;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC10839 m27166(int i) {
        return m27163(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10839 m27163(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 2) {
            return VERIFY;
        }
        if (i != 3) {
            return null;
        }
        return NONE;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m27162() {
        return f36888;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m27168() {
        return (C21857) m27165().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m27167() {
        return m27165();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m27165() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10839 m27164(C21857 c21857) {
        if (c21857.getType() != m27165()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f36885[c21857.m48639()];
    }

    EnumC10839(int i) {
        this.f36893 = i;
    }
}
