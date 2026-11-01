package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '֡' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۚ۟᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC5214 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC5214 f18060;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC5214[] f18061;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC5214 f18062;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC5214 f18063;

    /* JADX INFO: renamed from: ۙ */
    public abstract Object mo7264(AbstractC3262 abstractC3262);

    public EnumC5214(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC5214(String str, int i, C10943 c10943) {
        this(str, i);
    }

    public static EnumC5214 valueOf(String str) {
        return (EnumC5214) Enum.valueOf(EnumC5214.class, str);
    }

    public static EnumC5214[] values() {
        return (EnumC5214[]) f18061.clone();
    }

    static {
        final String str = "LOOSE";
        final int i = 0;
        EnumC5214 enumC5214 = new EnumC5214(str, i) { // from class: l.ܰ۟᩸
            {
                C10943 c10943 = null;
            }

            @Override // l.EnumC5214
            /* JADX INFO: renamed from: ۙ */
            public Object mo7264(AbstractC3262 abstractC3262) {
                return abstractC3262.mo6033();
            }
        };
        f18060 = enumC5214;
        final String str2 = "STRICT";
        final int i2 = 1;
        EnumC5214 enumC5215 = new EnumC5214(str2, i2) { // from class: l.ۨ۟᩸
            {
                C10943 c10943 = null;
            }

            @Override // l.EnumC5214
            /* JADX INFO: renamed from: ۙ */
            public Object mo7264(AbstractC3262 abstractC3262) {
                return abstractC3262.mo6030();
            }
        };
        f18062 = enumC5215;
        final String str3 = "LAZY";
        final int i3 = 2;
        EnumC5214 enumC5216 = new EnumC5214(str3, i3) { // from class: l.ۖ۟᩸
            {
                C10943 c10943 = null;
            }

            @Override // l.EnumC5214
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public Object mo7264(AbstractC3262 abstractC3262) {
                return abstractC3262.mo6050();
            }
        };
        f18063 = enumC5216;
        f18061 = new EnumC5214[]{enumC5214, enumC5215, enumC5216};
    }
}
