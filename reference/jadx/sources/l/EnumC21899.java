package l;

/* JADX INFO: renamed from: l.᩸᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21899 implements InterfaceC9800 {
    STRING(0),
    CORD(1),
    STRING_PIECE(2);


    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final int f71030 = 2;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f71031 = 0;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f71033;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f71034 = 1;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC21899[] f71037;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f71038;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC21899.class.getName());
        f71033 = new C15550();
        f71037 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f71038;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC21899 m48694(int i) {
        return m48691(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21899 m48691(int i) {
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

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m48690() {
        return f71033;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m48696() {
        return (C21857) m48693().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m48695() {
        return m48693();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m48693() {
        int i = C12727.f42445;
        return (C7040) C14097.f46276.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21899 m48692(C21857 c21857) {
        if (c21857.getType() != m48693()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f71037[c21857.m48639()];
    }

    EnumC21899(int i) {
        this.f71038 = i;
    }
}
