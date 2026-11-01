package l;

/* JADX INFO: renamed from: l.ۢ᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9905 implements InterfaceC9800 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f33840 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f33842;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f33843 = 2;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f33844 = 3;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC9905[] f33846;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f33847;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC9905.class.getName());
        f33842 = new C2142();
        f33846 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f33847;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC9905 m25093(int i) {
        return m25090(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9905 m25090(int i) {
        if (i == 1) {
            return SPEED;
        }
        if (i == 2) {
            return CODE_SIZE;
        }
        if (i != 3) {
            return null;
        }
        return LITE_RUNTIME;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m25089() {
        return f33842;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m25095() {
        return (C21857) m25092().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m25094() {
        return m25092();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m25092() {
        int i = C3553.f13069;
        return (C7040) C14097.f46278.m8532().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9905 m25091(C21857 c21857) {
        if (c21857.getType() != m25092()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f33846[c21857.m48639()];
    }

    EnumC9905(int i) {
        this.f33847 = i;
    }
}
