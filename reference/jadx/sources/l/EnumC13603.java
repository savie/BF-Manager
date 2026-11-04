package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۤۙ' uses external variables
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
/* JADX INFO: renamed from: l.۬ۘ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: O416 */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC13603 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43201;

    /* JADX INFO: renamed from: ֫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43202;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43203;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43204;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43205;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43206;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC13603[] f43207;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43208;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43209;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43210;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43211;

    /* JADX INFO: renamed from: ۧۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43212;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43213;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43214;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43215;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43216;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43217;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43218;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC13603 f43219;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final C22114 f43220;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC4960 f43221;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final EnumC4960 f43222;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC6892 f43223;

    public static EnumC13603 valueOf(String str) {
        return (EnumC13603) Enum.valueOf(EnumC13603.class, str);
    }

    public static EnumC13603[] values() {
        return (EnumC13603[]) f43207.clone();
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC13603[] m33345() {
        return new EnumC13603[]{f43211, f43219, f43213, f43205, f43218, f43217, f43214, f43208, f43209, f43206, f43215, f43204, f43203, f43201, f43212, f43202, f43216, f43210};
    }

    static {
        EnumC6892 enumC6892 = EnumC6892.BASIC;
        f43211 = new EnumC13603("NIL", 0, enumC6892, C22114.f71274);
        f43219 = new EnumC13603("PCK", 1, enumC6892, EnumC4960.PACKAGE, C22114.f71273);
        EnumC4960 enumC4960 = EnumC4960.CLASS;
        f43213 = new EnumC13603("TYP", 2, enumC6892, enumC4960, C22114.f71269);
        EnumC4960 enumC4961 = EnumC4960.VAR;
        f43205 = new EnumC13603("VAR", 3, enumC6892, enumC4961, C22114.f71275);
        EnumC4960 enumC4962 = EnumC4960.METHOD;
        f43218 = new EnumC13603("MTH", 4, enumC6892, enumC4962, C22114.f71278);
        f43217 = new EnumC13603("POLY", 5, enumC6892, C22114.f71270);
        f43214 = new EnumC13603("MDL", 6, enumC6892, C22114.f71280);
        f43208 = new EnumC13603("ERR", 7, EnumC6892.ERROR, C22114.f71271);
        EnumC6892 enumC6893 = EnumC6892.RESOLUTION_TARGET;
        f43209 = new EnumC13603("AMBIGUOUS", 8, enumC6893);
        f43206 = new EnumC13603("HIDDEN", 9, enumC6893);
        f43215 = new EnumC13603("STATICERR", 10, enumC6893);
        EnumC6892 enumC6894 = EnumC6892.RESOLUTION;
        f43204 = new EnumC13603("MISSING_ENCL", 11, enumC6894);
        f43203 = new EnumC13603("BAD_RESTRICTED_TYPE", 12, enumC6894);
        f43201 = new EnumC13603("ABSENT_VAR", 13, enumC6893, enumC4961);
        f43212 = new EnumC13603("WRONG_MTHS", 14, enumC6893, enumC4962);
        f43202 = new EnumC13603("WRONG_MTH", 15, enumC6893, enumC4962);
        f43216 = new EnumC13603("ABSENT_MTH", 16, enumC6893, enumC4962);
        f43210 = new EnumC13603("ABSENT_TYP", 17, enumC6893, enumC4960);
        f43207 = m33345();
    }

    public EnumC13603(String str, int i, EnumC6892 enumC6892) {
        this(str, i, enumC6892, null, null, null);
    }

    public EnumC13603(String str, int i, EnumC6892 enumC6892, C22114 c22114) {
        this(str, i, enumC6892, null, null, c22114);
    }

    public EnumC13603(String str, int i, EnumC6892 enumC6892, EnumC4960 enumC4960) {
        this(str, i, enumC6892, null, enumC4960, null);
    }

    public EnumC13603(String str, int i, EnumC6892 enumC6892, EnumC4960 enumC4960, C22114 c22114) {
        this(str, i, enumC6892, enumC4960, null, c22114);
    }

    public EnumC13603(String str, int i, EnumC6892 enumC6892, EnumC4960 enumC4960, EnumC4960 enumC4961, C22114 c22114) {
        super(str, i);
        this.f43223 = enumC6892;
        this.f43222 = enumC4960;
        this.f43221 = enumC4961;
        this.f43220 = c22114;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public C22114 m33350() {
        return this.f43220;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33349(C22114 c22114) {
        return this.f43220.m50069(c22114);
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m33353() {
        EnumC6892 enumC6892 = this.f43223;
        return enumC6892 == EnumC6892.RESOLUTION || enumC6892 == EnumC6892.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public boolean m33352() {
        return this.f43223 == EnumC6892.RESOLUTION_TARGET;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public boolean m33351() {
        return this.f43223 == EnumC6892.BASIC;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m33348(EnumC13603 enumC13603) {
        return ordinal() < enumC13603.ordinal();
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public EnumC4960 m33346() {
        EnumC4960 enumC4960 = this.f43222;
        if (enumC4960 != null) {
            return enumC4960;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC4960 m33347() {
        EnumC4960 enumC4960 = this.f43221;
        if (enumC4960 != null) {
            return enumC4960;
        }
        throw new AssertionError("Unexpected kind: " + this);
    }
}
