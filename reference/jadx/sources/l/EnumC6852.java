package l;

/* JADX INFO: renamed from: l.ۜܶ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC6852 implements InterfaceC9800 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f23052 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f23054;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f23055 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f23056 = 2;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC6852[] f23058;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f23059;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC6852.class.getName());
        f23054 = new C4029();
        f23058 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f23059;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC6852 m18471(int i) {
        return m18468(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6852 m18468(int i) {
        if (i == 0) {
            return IDEMPOTENCY_UNKNOWN;
        }
        if (i == 1) {
            return NO_SIDE_EFFECTS;
        }
        if (i != 2) {
            return null;
        }
        return IDEMPOTENT;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m18467() {
        return f23054;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m18473() {
        return (C21857) m18470().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m18472() {
        return m18470();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m18470() {
        int i = C23081.f74983;
        return (C7040) C14097.f46325.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC6852 m18469(C21857 c21857) {
        if (c21857.getType() != m18470()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f23058[c21857.m48639()];
    }

    EnumC6852(int i) {
        this.f23059 = i;
    }
}
