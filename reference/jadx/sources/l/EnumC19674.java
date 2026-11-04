package l;

/* JADX INFO: renamed from: l.ᩴ۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes5.dex */
public enum EnumC19674 implements InterfaceC23425 {
    RETENTION_UNKNOWN(0),
    RETENTION_RUNTIME(1),
    RETENTION_SOURCE(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f63357 = 1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f63358 = 0;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f63359;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC19674[] f63361;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f63364 = 2;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f63366;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC19674.class.getName());
        f63359 = new C22658();
        f63361 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f63366;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC19674 m45344(int i) {
        return m45340(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19674 m45340(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m45342() {
        return f63359;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m45346() {
        return (C1357) m45343().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m45345() {
        return m45343();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m45343() {
        int i = C5504.f19140;
        return (C8069) C12543.f40258.m54743().get(2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC19674 m45341(C1357 c1357) {
        if (c1357.getType() != m45343()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f63361[c1357.m5001()];
    }

    EnumC19674(int i) {
        this.f63366 = i;
    }
}
