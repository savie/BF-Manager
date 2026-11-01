package l;

/* JADX INFO: renamed from: l.ۤۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC10133 implements InterfaceC9800 {
    ENUM_TYPE_UNKNOWN(0),
    OPEN(1),
    CLOSED(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f34620 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f34622;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f34623 = 2;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f34624 = 0;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC10133[] f34626;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f34627;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC10133.class.getName());
        f34622 = new C8722();
        f34626 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f34627;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC10133 m25759(int i) {
        return m25756(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10133 m25756(int i) {
        if (i == 0) {
            return ENUM_TYPE_UNKNOWN;
        }
        if (i == 1) {
            return OPEN;
        }
        if (i != 2) {
            return null;
        }
        return CLOSED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m25755() {
        return f34622;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m25761() {
        return (C21857) m25758().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m25760() {
        return m25758();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m25758() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC10133 m25757(C21857 c21857) {
        if (c21857.getType() != m25758()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f34626[c21857.m48639()];
    }

    EnumC10133(int i) {
        this.f34627 = i;
    }
}
