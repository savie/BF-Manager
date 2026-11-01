package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܽ' uses external variables
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
/* JADX INFO: renamed from: l.ۧ᩻ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC11332 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC11332 f38234;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC11332[] f38235 = m28394();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC11332 f38236;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC11332 f38237;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo17539(int i);

    public EnumC11332(String str, int i) {
        super(str, i);
    }

    public static EnumC11332 valueOf(String str) {
        return (EnumC11332) Enum.valueOf(EnumC11332.class, str);
    }

    public static EnumC11332[] values() {
        return (EnumC11332[]) f38235.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC11332[] m28394() {
        return new EnumC11332[]{f38236, f38234, f38237};
    }

    static {
        final String str = "NEXT_LOWER";
        final int i = 0;
        f38236 = new EnumC11332(str, i) { // from class: l.۫᩻ܶ
            @Override // l.EnumC11332
            /* JADX INFO: renamed from: ۙ */
            public int mo17539(int i2) {
                return i2 - 1;
            }
        };
        final String str2 = "NEXT_HIGHER";
        final int i2 = 1;
        f38234 = new EnumC11332(str2, i2) { // from class: l.ܿ᩻ܶ
            @Override // l.EnumC11332
            /* JADX INFO: renamed from: ۙ */
            public int mo17539(int i3) {
                return i3;
            }
        };
        final String str3 = "INVERTED_INSERTION_INDEX";
        final int i3 = 2;
        f38237 = new EnumC11332(str3, i3) { // from class: l.ۛ᩻ܶ
            @Override // l.EnumC11332
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public int mo17539(int i4) {
                return ~i4;
            }
        };
    }
}
