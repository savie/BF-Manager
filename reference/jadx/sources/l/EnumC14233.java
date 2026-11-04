package l;

/* JADX INFO: renamed from: l.ܰ֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC14233 implements InterfaceC23425 {
    LABEL_OPTIONAL(1),
    LABEL_REPEATED(3),
    LABEL_REQUIRED(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f44964 = 1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f44965 = 2;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f44966;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC14233[] f44968;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f44971 = 3;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f44973;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC14233.class.getName());
        f44966 = new C3793();
        f44968 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f44973;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC14233 m34554(int i) {
        return m34550(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14233 m34550(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m34552() {
        return f44966;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m34556() {
        return (C1357) m34553().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m34555() {
        return m34553();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m34553() {
        int i = C0064.f948;
        return (C8069) C12543.f40249.m54743().get(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC14233 m34551(C1357 c1357) {
        if (c1357.getType() != m34553()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f44968[c1357.m5001()];
    }

    EnumC14233(int i) {
        this.f44973 = i;
    }
}
