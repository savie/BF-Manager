package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۠' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۠᩶᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8886 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29019;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29020;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29021;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final int f29022;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29023;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29024;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29025;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29026;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC8886[] f29027;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC8886 f29028;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final int f29029;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC21461 f29030;

    public static EnumC8886 valueOf(String str) {
        return (EnumC8886) Enum.valueOf(EnumC8886.class, str);
    }

    public static EnumC8886[] values() {
        return (EnumC8886[]) f29027.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC8886[] m23765() {
        return new EnumC8886[]{f29024, f29023, f29019, f29021, f29025, f29020, f29026, f29028};
    }

    static {
        EnumC21461 enumC21461 = EnumC21461.f68515;
        f29024 = new EnumC8886("UNKNOWN", 0, -1, enumC21461);
        f29023 = new EnumC8886("DEREF", 1, 0, enumC21461);
        f29019 = new EnumC8886("ASSIGN", 2, 2, EnumC21461.f68452);
        f29021 = new EnumC8886("PREINC", 3, 4, EnumC21461.f68529);
        f29025 = new EnumC8886("PREDEC", 4, 6, EnumC21461.f68482);
        f29020 = new EnumC8886("POSTINC", 5, 8, EnumC21461.f68451);
        f29026 = new EnumC8886("POSTDEC", 6, 10, EnumC21461.f68525);
        EnumC8886 enumC8886 = new EnumC8886("FIRSTASGOP", 7, 12, enumC21461);
        f29028 = enumC8886;
        f29027 = m23765();
        f29022 = enumC8886.f29029 + 86;
    }

    public EnumC8886(String str, int i, int i2, EnumC21461 enumC21461) {
        super(str, i);
        this.f29029 = i2;
        this.f29030 = enumC21461;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC8886 m23764(int i) {
        for (EnumC8886 enumC8886 : values()) {
            if (enumC8886.f29029 == i) {
                return enumC8886;
            }
        }
        return f29024;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23763(EnumC21461 enumC21461, int i) {
        int i2;
        int i3;
        int i4 = C12615.f40476[enumC21461.ordinal()];
        if (i4 == 1) {
            return f29021.f29029;
        }
        if (i4 == 2) {
            return f29025.f29029;
        }
        if (i4 == 3) {
            return f29020.f29029;
        }
        if (i4 == 4) {
            return f29026.f29029;
        }
        if (96 <= i && i <= 131) {
            i2 = (i - 96) * 2;
            i3 = f29028.f29029;
        } else {
            if (i == 256) {
                return f29028.f29029 + 72;
            }
            if (270 > i || i > 275) {
                return -1;
            }
            i2 = (i - 233) * 2;
            i3 = f29028.f29029;
        }
        return i2 + i3;
    }
}
