package l;

/* JADX INFO: renamed from: l.۟۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7741 implements InterfaceC23425 {
    IDEMPOTENCY_UNKNOWN(0),
    NO_SIDE_EFFECTS(1),
    IDEMPOTENT(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f25490 = 0;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f25491 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f25492;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC7741[] f25494;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f25497 = 2;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f25499;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC7741.class.getName());
        f25492 = new C0283();
        f25494 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f25499;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC7741 m21073(int i) {
        return m21069(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7741 m21069(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m21071() {
        return f25492;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m21075() {
        return (C1357) m21072().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m21074() {
        return m21072();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m21072() {
        int i = C18928.f61400;
        return (C8069) C12543.f40308.m54743().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC7741 m21070(C1357 c1357) {
        if (c1357.getType() != m21072()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f25494[c1357.m5001()];
    }

    EnumC7741(int i) {
        this.f25499 = i;
    }
}
