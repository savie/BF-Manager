package l;

/* JADX INFO: renamed from: l.᩶᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC20488 implements InterfaceC9800 {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f66440 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f66442;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f66443 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f66444 = 2;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC20488[] f66446;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f66447;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC20488.class.getName());
        f66442 = new C16255();
        f66446 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f66447;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC20488 m46292(int i) {
        return m46289(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20488 m46289(int i) {
        if (i == 0) {
            return RETENTION_UNKNOWN;
        }
        if (i == 1) {
            return RETENTION_RUNTIME;
        }
        if (i != 2) {
            return null;
        }
        return RETENTION_SOURCE;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m46288() {
        return f66442;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m46294() {
        return (C21857) m46291().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m46293() {
        return m46291();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m46291() {
        int i = C12727.f42445;
        return (C7040) C14097.f46276.m8532().get(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC20488 m46290(C21857 c21857) {
        if (c21857.getType() != m46291()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f66446[c21857.m48639()];
    }

    EnumC20488(int i) {
        this.f66447 = i;
    }
}
