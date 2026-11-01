package l;

/* JADX INFO: renamed from: l.ܿۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC17188 implements InterfaceC9800 {
    REPEATED_FIELD_ENCODING_UNKNOWN(0),
    PACKED(1),
    EXPANDED(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f54797 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f54799;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f54800 = 2;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f54801 = 1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC17188[] f54803;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f54804;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC17188.class.getName());
        f54799 = new C12250();
        f54803 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f54804;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC17188 m40109(int i) {
        return m40106(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC17188 m40106(int i) {
        if (i == 0) {
            return REPEATED_FIELD_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return PACKED;
        }
        if (i != 2) {
            return null;
        }
        return EXPANDED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m40105() {
        return f54799;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m40111() {
        return (C21857) m40108().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m40110() {
        return m40108();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m40108() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC17188 m40107(C21857 c21857) {
        if (c21857.getType() != m40108()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f54803[c21857.m48639()];
    }

    EnumC17188(int i) {
        this.f54804 = i;
    }
}
