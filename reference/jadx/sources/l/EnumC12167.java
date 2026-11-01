package l;

/* JADX INFO: renamed from: l.۫ۘ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: T9Q9 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC12167 implements InterfaceC9800 {
    EDITION_UNKNOWN(0),
    EDITION_LEGACY(f40710),
    EDITION_PROTO2(f40708),
    EDITION_PROTO3(f40728),
    EDITION_2023(1000),
    EDITION_2024(1001),
    EDITION_1_TEST_ONLY(1),
    EDITION_2_TEST_ONLY(2),
    EDITION_99997_TEST_ONLY(f40713),
    EDITION_99998_TEST_ONLY(f40709),
    EDITION_99999_TEST_ONLY(f40715),
    EDITION_MAX(Integer.MAX_VALUE);


    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final int f40704 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: ۘۙ, reason: not valid java name and contains not printable characters */
    public static final int f40708 = 998;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final int f40709 = 99998;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final int f40710 = 900;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f40713 = 99997;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final int f40714 = 1001;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final int f40715 = 99999;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final int f40719 = 2;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final int f40721 = 1;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final int f40722 = 1000;

    /* JADX INFO: renamed from: ᩳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC12167[] f40723;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final InterfaceC17539 f40724;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final int f40726 = 0;

    /* JADX INFO: renamed from: ᩺ۙ, reason: not valid java name and contains not printable characters */
    public static final int f40728 = 999;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f40730;

    static {
        C3844.m11171(EnumC13018.PUBLIC, EnumC12167.class.getName());
        f40724 = new C16400();
        f40723 = values();
    }

    @Override // l.InterfaceC12601
    public final int getNumber() {
        return this.f40730;
    }

    @Deprecated
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static EnumC12167 m30255(int i) {
        return m30252(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12167 m30252(int i) {
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
                case f40708:
                    return EDITION_PROTO2;
                case f40728:
                    return EDITION_PROTO3;
                case 1000:
                    return EDITION_2023;
                case 1001:
                    return EDITION_2024;
                default:
                    switch (i) {
                        case f40713:
                            return EDITION_99997_TEST_ONLY;
                        case f40709:
                            return EDITION_99998_TEST_ONLY;
                        case f40715:
                            return EDITION_99999_TEST_ONLY;
                        default:
                            return null;
                    }
            }
        }
        return EDITION_MAX;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static InterfaceC17539 m30251() {
        return f40724;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final C21857 m30257() {
        return (C21857) m30254().m18886().get(ordinal());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C7040 m30256() {
        return m30254();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static final C7040 m30254() {
        return (C7040) C14097.m34121().m23488().get(0);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC12167 m30253(C21857 c21857) {
        if (c21857.getType() != m30254()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        return f40723[c21857.m48639()];
    }

    EnumC12167(int i) {
        this.f40730 = i;
    }
}
