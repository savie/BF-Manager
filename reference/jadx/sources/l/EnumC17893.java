package l;

/* JADX INFO: renamed from: l.ᩳۜ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC17893 implements InterfaceC9800 {
    DECLARATION(0),
    UNVERIFIED(1);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC17893[] f56664;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f56665;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f56667 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f56668 = 1;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f56670;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC17893.class.getName());
        f56665 = new C21421();
        f56664 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f56670;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC17893 m41524(int i) {
        return m41521(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC17893 m41521(int i) {
        if (i == 0) {
            return DECLARATION;
        }
        if (i != 1) {
            return null;
        }
        return UNVERIFIED;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m41520() {
        return f56665;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m41526() {
        return (C21857) m41523().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m41525() {
        return m41523();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m41523() {
        int i = C18599.f59166;
        return (C7040) C14097.f46318.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC17893 m41522(C21857 c21857) {
        if (c21857.getType() != m41523()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f56664[c21857.m48639()];
    }

    EnumC17893(int i) {
        this.f56670 = i;
    }
}
