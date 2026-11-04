package l;

/* JADX INFO: renamed from: l.ۘۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: U940 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4055 implements InterfaceC23425 {
    UTF8_VALIDATION_UNKNOWN(0),
    DEFAULT(1),
    VERIFY(2);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f13811 = 1;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f13813;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final int f13815 = 2;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC4055[] f13816;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f13818 = 0;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f13820;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC4055.class.getName());
        f13813 = new C24193();
        f13816 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f13820;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC4055 m13052(int i) {
        return m13048(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4055 m13048(int i) {
        if (i == 0) {
            return UTF8_VALIDATION_UNKNOWN;
        }
        if (i == 1) {
            return DEFAULT;
        }
        if (i != 2) {
            return null;
        }
        return VERIFY;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m13050() {
        return f13813;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m13054() {
        return (C1357) m13051().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m13053() {
        return m13051();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m13051() {
        int i = C14495.f45608;
        return (C8069) C21209.f67696.m54743().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC4055 m13049(C1357 c1357) {
        if (c1357.getType() != m13051()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f13816[c1357.m5001()];
    }

    EnumC4055(int i) {
        this.f13820 = i;
    }
}
