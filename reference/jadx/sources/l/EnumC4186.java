package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܿ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۘ۬ܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4186 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC4186 f15309;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4186[] f15310;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4186 f15311;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC4186 f15312;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract Object mo13369(AbstractC3660 abstractC3660);

    public EnumC4186(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC4186(String str, int i, C25070 c25070) {
        this(str, i);
    }

    public static EnumC4186 valueOf(String str) {
        return (EnumC4186) Enum.valueOf(EnumC4186.class, str);
    }

    public static EnumC4186[] values() {
        return (EnumC4186[]) f15310.clone();
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        EnumC4186 enumC4186 = new EnumC4186(str, i) { // from class: l.ۨ۬ܽ
            {
                C25070 c25070 = null;
            }

            @Override // l.EnumC4186
            /* JADX INFO: renamed from: ۙ */
            public Object mo13369(AbstractC3660 abstractC3660) {
                return abstractC3660.mo11883();
            }
        };
        f15311 = enumC4186;
        final String str2 = "STRICT";
        final int i2 = 1;
        EnumC4186 enumC4187 = new EnumC4186(str2, i2) { // from class: l.ۛ۬ܽ
            {
                C25070 c25070 = null;
            }

            @Override // l.EnumC4186
            /* JADX INFO: renamed from: ۙ */
            public Object mo13369(AbstractC3660 abstractC3660) {
                return abstractC3660.mo11902();
            }
        };
        f15309 = enumC4187;
        final String str3 = "LAZY";
        final int i3 = 2;
        EnumC4186 enumC4188 = new EnumC4186(str3, i3) { // from class: l.᩺۬ܽ
            {
                C25070 c25070 = null;
            }

            @Override // l.EnumC4186
            /* JADX INFO: renamed from: ۙ */
            public Object mo13369(AbstractC3660 abstractC3660) {
                return abstractC3660.mo11890();
            }
        };
        f15312 = enumC4188;
        f15310 = new EnumC4186[]{enumC4186, enumC4187, enumC4188};
    }
}
