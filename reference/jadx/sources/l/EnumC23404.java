package l;

/* JADX INFO: renamed from: l.᩹۟ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes.dex */
public enum EnumC23404 implements InterfaceC23425 {
    SPEED(1),
    CODE_SIZE(2),
    LITE_RUNTIME(3);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f75756 = 2;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f75757 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f75758;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC23404[] f75760;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f75763 = 3;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f75765;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC23404.class.getName());
        f75758 = new C15944();
        f75760 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f75765;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC23404 m52592(int i) {
        return m52588(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23404 m52588(int i) {
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

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m52590() {
        return f75758;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m52594() {
        return (C1357) m52591().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m52593() {
        return m52591();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m52591() {
        int i = C3266.f10613;
        return (C8069) C12543.f40294.m54743().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC23404 m52589(C1357 c1357) {
        if (c1357.getType() != m52591()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f75760[c1357.m5001()];
    }

    EnumC23404(int i) {
        this.f75765 = i;
    }
}
