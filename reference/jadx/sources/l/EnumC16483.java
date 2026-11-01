package l;

/* JADX INFO: renamed from: l.ܽۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC16483 implements InterfaceC9800 {
    MESSAGE_ENCODING_UNKNOWN(0),
    LENGTH_PREFIXED(1),
    DELIMITED(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f52958 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f52960;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f52961 = 2;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f52962 = 1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC16483[] f52964;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f52965;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC16483.class.getName());
        f52960 = new C0254();
        f52964 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f52965;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC16483 m38748(int i) {
        return m38745(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16483 m38745(int i) {
        if (i == 0) {
            return MESSAGE_ENCODING_UNKNOWN;
        }
        if (i == 1) {
            return LENGTH_PREFIXED;
        }
        if (i != 2) {
            return null;
        }
        return DELIMITED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m38744() {
        return f52960;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m38750() {
        return (C21857) m38747().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m38749() {
        return m38747();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m38747() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(4);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC16483 m38746(C21857 c21857) {
        if (c21857.getType() != m38747()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f52964[c21857.m48639()];
    }

    EnumC16483(int i) {
        this.f52965 = i;
    }
}
