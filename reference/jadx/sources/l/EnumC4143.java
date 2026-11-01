package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۧ' uses external variables
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
/* JADX INFO: renamed from: l.ۘ᩵۟, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC4143 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4143[] f15151;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15152;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15153;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15154;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15155;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15156;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15157;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC4143 f15158;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC13901 f15159;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f15160;

    public static EnumC4143 valueOf(String str) {
        return (EnumC4143) Enum.valueOf(EnumC4143.class, str);
    }

    public static EnumC4143[] values() {
        return (EnumC4143[]) f15151.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4143[] m11776() {
        return new EnumC4143[]{f15153, f15155, f15152, f15154, f15157, f15158, f15156};
    }

    static {
        EnumC13901 enumC13901 = EnumC13901.INVOKE;
        f15153 = new EnumC4143("SUPER", 0, enumC13901, false);
        f15155 = new EnumC4143("UNBOUND", 1, enumC13901, true);
        f15152 = new EnumC4143("STATIC", 2, enumC13901, false);
        f15154 = new EnumC4143("BOUND", 3, enumC13901, false);
        EnumC13901 enumC13902 = EnumC13901.NEW;
        f15157 = new EnumC4143("IMPLICIT_INNER", 4, enumC13902, false);
        f15158 = new EnumC4143("TOPLEVEL", 5, enumC13902, false);
        f15156 = new EnumC4143("ARRAY_CTOR", 6, enumC13902, false);
        f15151 = m11776();
    }

    public EnumC4143(String str, int i, EnumC13901 enumC13901, boolean z) {
        super(str, i);
        this.f15159 = enumC13901;
        this.f15160 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m11777() {
        return this.f15160;
    }
}
