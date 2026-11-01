package l;

/* JADX INFO: renamed from: l.᩹᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC22605 implements InterfaceC9800 {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f73664 = 2;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f73666;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f73667 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f73668 = 3;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC22605[] f73670;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f73671;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC22605.class.getName());
        f73666 = new C5671();
        f73670 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f73671;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC22605 m50109(int i) {
        return m50106(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22605 m50106(int i) {
        if (i == 1) {
            return LABEL_OPTIONAL;
        }
        if (i == 2) {
            return LABEL_REQUIRED;
        }
        if (i != 3) {
            return null;
        }
        return LABEL_REPEATED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m50105() {
        return f73666;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m50111() {
        return (C21857) m50108().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m50110() {
        return m50108();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m50108() {
        int i = C4259.f15372;
        return (C7040) C14097.f46292.m8532().get(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC22605 m50107(C21857 c21857) {
        if (c21857.getType() != m50108()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f73670[c21857.m48639()];
    }

    EnumC22605(int i) {
        this.f73671 = i;
    }
}
