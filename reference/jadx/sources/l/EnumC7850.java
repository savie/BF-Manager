package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֡' uses external variables
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
/* JADX INFO: renamed from: l.۟ۧܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 15PL */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC7850 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC7850 f26143;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC7850[] f26144 = m21373();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC7850 f26145;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC7850 f26146;

    /* JADX INFO: renamed from: ۙ */
    public abstract int mo2201(int i);

    public EnumC7850(String str, int i) {
        super(str, i);
    }

    public static EnumC7850 valueOf(String str) {
        return (EnumC7850) Enum.valueOf(EnumC7850.class, str);
    }

    public static EnumC7850[] values() {
        return (EnumC7850[]) f26144.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC7850[] m21373() {
        return new EnumC7850[]{f26143, f26145, f26146};
    }

    static {
        final String str = "NEXT_LOWER";
        final int i = 0;
        f26143 = new EnumC7850(str, i) { // from class: l.᩶ۧܽ
            @Override // l.EnumC7850
            /* JADX INFO: renamed from: ۙ */
            public int mo2201(int i2) {
                return i2 - 1;
            }
        };
        final String str2 = "NEXT_HIGHER";
        final int i2 = 1;
        f26145 = new EnumC7850(str2, i2) { // from class: l.ܿۧܽ
            @Override // l.EnumC7850
            /* JADX INFO: renamed from: ۙ */
            public int mo2201(int i3) {
                return i3;
            }
        };
        final String str3 = "INVERTED_INSERTION_INDEX";
        final int i3 = 2;
        f26146 = new EnumC7850(str3, i3) { // from class: l.֡ۧܽ
            @Override // l.EnumC7850
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public int mo2201(int i4) {
                return ~i4;
            }
        };
    }
}
