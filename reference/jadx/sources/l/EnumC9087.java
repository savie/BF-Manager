package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֫' uses external variables
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
/* JADX INFO: renamed from: l.ۡ᩵ۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 643O */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC9087 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC9087[] f30963;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30964;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30965;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final int f30966;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30967;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30968;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30969;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30970;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30971;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC9087 f30972;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final int f30973;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC18651 f30974;

    public static EnumC9087 valueOf(String str) {
        return (EnumC9087) Enum.valueOf(EnumC9087.class, str);
    }

    public static EnumC9087[] values() {
        return (EnumC9087[]) f30963.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC9087[] m23428() {
        return new EnumC9087[]{f30964, f30968, f30970, f30969, f30972, f30967, f30965, f30971};
    }

    static {
        EnumC18651 enumC18651 = EnumC18651.f60545;
        f30964 = new EnumC9087("UNKNOWN", 0, -1, enumC18651);
        f30968 = new EnumC9087("DEREF", 1, 0, enumC18651);
        f30970 = new EnumC9087("ASSIGN", 2, 2, EnumC18651.f60510);
        f30969 = new EnumC9087("PREINC", 3, 4, EnumC18651.f60542);
        f30972 = new EnumC9087("PREDEC", 4, 6, EnumC18651.f60519);
        f30967 = new EnumC9087("POSTINC", 5, 8, EnumC18651.f60538);
        f30965 = new EnumC9087("POSTDEC", 6, 10, EnumC18651.f60467);
        EnumC9087 enumC9087 = new EnumC9087("FIRSTASGOP", 7, 12, enumC18651);
        f30971 = enumC9087;
        f30963 = m23428();
        f30966 = enumC9087.f30973 + 86;
    }

    public EnumC9087(String str, int i, int i2, EnumC18651 enumC18651) {
        super(str, i);
        this.f30973 = i2;
        this.f30974 = enumC18651;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC9087 m23427(int i) {
        for (EnumC9087 enumC9087 : values()) {
            if (enumC9087.f30973 == i) {
                return enumC9087;
            }
        }
        return f30964;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m23426(EnumC18651 enumC18651, int i) {
        int i2;
        int i3;
        int i4 = C2735.f10511[enumC18651.ordinal()];
        if (i4 == 1) {
            return f30969.f30973;
        }
        if (i4 == 2) {
            return f30972.f30973;
        }
        if (i4 == 3) {
            return f30967.f30973;
        }
        if (i4 == 4) {
            return f30965.f30973;
        }
        if (96 <= i && i <= 131) {
            i2 = (i - 96) * 2;
            i3 = f30971.f30973;
        } else {
            if (i == 256) {
                return f30971.f30973 + 72;
            }
            if (270 > i || i > 275) {
                return -1;
            }
            i2 = (i - 233) * 2;
            i3 = f30971.f30973;
        }
        return i2 + i3;
    }
}
