package l;

/* JADX INFO: renamed from: l.᩷᩺᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC21193 implements InterfaceC9800 {
    JS_NORMAL(0),
    JS_STRING(1),
    JS_NUMBER(2);


    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f68978 = 1;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f68980;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f68981 = 0;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f68982 = 2;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC21193[] f68984;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f68985;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC21193.class.getName());
        f68980 = new C7788();
        f68984 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f68985;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC21193 m47649(int i) {
        return m47646(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21193 m47646(int i) {
        if (i == 0) {
            return JS_NORMAL;
        }
        if (i == 1) {
            return JS_STRING;
        }
        if (i != 2) {
            return null;
        }
        return JS_NUMBER;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m47645() {
        return f68980;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m47651() {
        return (C21857) m47648().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m47650() {
        return m47648();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m47648() {
        int i = C12727.f42445;
        return (C7040) C14097.f46276.m8532().get(1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC21193 m47647(C21857 c21857) {
        if (c21857.getType() != m47648()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f68984[c21857.m48639()];
    }

    EnumC21193(int i) {
        this.f68985 = i;
    }
}
