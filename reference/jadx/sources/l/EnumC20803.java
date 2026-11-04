package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֨' uses external variables
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
/* JADX INFO: renamed from: l.᩵᩶ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: H44W */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC20803 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66611;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66612;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66613;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66614;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66615;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66616;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC20803[] f66617;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC20803 f66618;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC16081 f66619;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f66620;

    public static EnumC20803 valueOf(String str) {
        return (EnumC20803) Enum.valueOf(EnumC20803.class, str);
    }

    public static EnumC20803[] values() {
        return (EnumC20803[]) f66617.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC20803[] m47583() {
        return new EnumC20803[]{f66612, f66613, f66616, f66614, f66618, f66615, f66611};
    }

    static {
        EnumC16081 enumC16081 = EnumC16081.INVOKE;
        f66612 = new EnumC20803("SUPER", 0, enumC16081, false);
        f66613 = new EnumC20803("UNBOUND", 1, enumC16081, true);
        f66616 = new EnumC20803("STATIC", 2, enumC16081, false);
        f66614 = new EnumC20803("BOUND", 3, enumC16081, false);
        EnumC16081 enumC16082 = EnumC16081.NEW;
        f66618 = new EnumC20803("IMPLICIT_INNER", 4, enumC16082, false);
        f66615 = new EnumC20803("TOPLEVEL", 5, enumC16082, false);
        f66611 = new EnumC20803("ARRAY_CTOR", 6, enumC16082, false);
        f66617 = m47583();
    }

    public EnumC20803(String str, int i, EnumC16081 enumC16081, boolean z) {
        super(str, i);
        this.f66619 = enumC16081;
        this.f66620 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m47584() {
        return this.f66620;
    }
}
