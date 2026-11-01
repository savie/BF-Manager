package l;

/* JADX INFO: renamed from: l.ۚ۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5235 implements InterfaceC9800 {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC5235[] f18149;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f18152;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f18153 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f18154 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final int f18156 = 2;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f18157;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC5235.class.getName());
        f18152 = new C2412();
        f18149 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f18157;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC5235 m14432(int i) {
        return m14429(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5235 m14429(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return VERIFY;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m14428() {
        return f18152;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m14434() {
        return (C21857) m14431().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m14433() {
        return m14431();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m14431() {
        int i = C22169.f72516;
        return (C7040) C1001.f4675.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5235 m14430(C21857 c21857) {
        if (c21857.getType() != m14431()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f18149[c21857.m48639()];
    }

    EnumC5235(int i) {
        this.f18157 = i;
    }
}
