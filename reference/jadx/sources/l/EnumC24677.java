package l;

/* JADX INFO: renamed from: l.᩻֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC24677 implements InterfaceC23425 {
    UTF8_VALIDATION_UNKNOWN(0),
    VERIFY(2),
    NONE(3);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f79849 = 3;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f79851;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f79853 = 2;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC24677[] f79854;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f79856 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f79858;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC24677.class.getName());
        f79851 = new C11250();
        f79854 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f79858;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC24677 m55023(int i) {
        return m55019(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24677 m55019(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m55021() {
        return f79851;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m55025() {
        return (C1357) m55022().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m55024() {
        return m55022();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m55022() {
        int i = C16471.f53413;
        return (C8069) C12543.f40291.m54743().get(3);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC24677 m55020(C1357 c1357) {
        if (c1357.getType() != m55022()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f79854[c1357.m5001()];
    }

    EnumC24677(int i) {
        this.f79858 = i;
    }
}
