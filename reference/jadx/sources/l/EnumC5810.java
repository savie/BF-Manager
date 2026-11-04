package l;

/* JADX INFO: renamed from: l.ۚܿܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC5810 implements InterfaceC23425 {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(f19974),
    EDITION_PROTO2(f19955),
    EDITION_PROTO3(f19979),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(f19959),
    EDITION_99998_TEST_ONLY(f19957),
    EDITION_99999_TEST_ONLY(f19964),
    EDITION_MAX(Integer.MAX_VALUE);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final int f19953 = 1;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final int f19954 = 1001;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final int f19955 = 998;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final int f19956 = 2;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f19957 = 99998;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f19959 = 99997;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final int f19964 = 99999;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final int f19966 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ܶۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC5810[] f19969;

    /* JADX INFO: renamed from: ܽۙ, reason: not valid java name and contains not printable characters */
    public static final int f19971 = 0;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final int f19973 = 1000;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final int f19974 = 900;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC1818 f19978;

    /* JADX INFO: renamed from: ᩻ۙ, reason: not valid java name and contains not printable characters */
    public static final int f19979 = 999;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f19980;

    static {
        C0304.m1888(EnumC18203.PUBLIC, EnumC5810.class.getName());
        f19978 = new C13267();
        f19969 = values();
    }

    @Override // l.InterfaceC5547
    public final int getNumber() {
        return this.f19980;
    }

    @Deprecated
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public static EnumC5810 m16940(int i) {
        return m16936(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5810 m16936(int i) {
        if (i == 0) {
            return EDITION_UNKNOWN;
        }
        if (i == 1) {
            return EDITION_1_TEST_ONLY;
        }
        if (i == 2) {
            return EDITION_2_TEST_ONLY;
        }
        if (i == 900) {
            return EDITION_LEGACY;
        }
        if (i != Integer.MAX_VALUE) {
            switch (i) {
                case f19955:
                    return EDITION_PROTO2;
                case f19979:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (i) {
                        case f19959:
                            return EDITION_99997_TEST_ONLY;
                        case f19957:
                            return EDITION_99998_TEST_ONLY;
                        case f19964:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }
        return EDITION_MAX;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static InterfaceC1818 m16938() {
        return f19978;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final C1357 m16942() {
        return (C1357) m16939().m21965().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C8069 m16941() {
        return m16939();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static final C8069 m16939() {
        return (C8069) C12543.m31199().m34196().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC5810 m16937(C1357 c1357) {
        if (c1357.getType() != m16939()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f19969[c1357.m5001()];
    }

    EnumC5810(int i) {
        this.f19980 = i;
    }
}
