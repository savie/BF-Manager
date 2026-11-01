package l;

/* JADX INFO: renamed from: l.᩷ۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20716 implements InterfaceC9800 {
    FIELD_PRESENCE_UNKNOWN(0),
    EXPLICIT(1),
    IMPLICIT(2),
    LEGACY_REQUIRED(3);


    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC20716[] f67352;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f67354;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f67355 = 2;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f67357 = 3;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f67358 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f67359 = 0;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f67362;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC20716.class.getName());
        f67354 = new C7310();
        f67352 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f67362;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC20716 m46569(int i) {
        return m46566(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20716 m46566(int i) {
        if (i == 0) {
            return FIELD_PRESENCE_UNKNOWN;
        }
        if (i == 1) {
            return EXPLICIT;
        }
        if (i == 2) {
            return IMPLICIT;
        }
        if (i != 3) {
            return null;
        }
        return LEGACY_REQUIRED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m46565() {
        return f67354;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m46571() {
        return (C21857) m46568().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m46570() {
        return m46568();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m46568() {
        int i = C23539.f76221;
        return (C7040) C14097.f46308.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20716 m46567(C21857 c21857) {
        if (c21857.getType() != m46568()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f67352[c21857.m48639()];
    }

    EnumC20716(int i) {
        this.f67362 = i;
    }
}
