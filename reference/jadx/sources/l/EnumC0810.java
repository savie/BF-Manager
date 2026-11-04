package l;

/* JADX INFO: renamed from: l.֨֡ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0810 implements InterfaceC23425 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f3076 = 1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f3077 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f3078;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC0810[] f3080;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f3081 = 2;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f3085;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC0810.class.getName());
        f3078 = new C9758();
        f3080 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f3085;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC0810 m3264(int i) {
        return m3260(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0810 m3260(int i) {
        if (i == 0) {
            return STRING;
        }
        if (i == 1) {
            return CORD;
        }
        if (i != 2) {
            return null;
        }
        return STRING_PIECE;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m3262() {
        return f3078;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m3266() {
        return (C1357) m3263().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m3265() {
        return m3263();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m3263() {
        int i = C5504.f19140;
        return (C8069) C12543.f40258.m54743().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC0810 m3261(C1357 c1357) {
        if (c1357.getType() != m3263()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f3080[c1357.m5001()];
    }

    EnumC0810(int i) {
        this.f3085 = i;
    }
}
