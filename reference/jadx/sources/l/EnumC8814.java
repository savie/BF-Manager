package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۜ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۠ᩳܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 99PI */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC8814 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28791;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28792;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28793;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28794;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814[] f28795;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28796;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28797;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28798;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28799;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28800;

    /* JADX INFO: renamed from: ۤۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28801;

    /* JADX INFO: renamed from: ۫ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28802;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28803;

    /* JADX INFO: renamed from: ܳۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28804;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28805;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28806;

    /* JADX INFO: renamed from: ᩴۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28807;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC8814[] f28808;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28809;

    /* JADX INFO: renamed from: ᩸ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC8814 f28810;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC2848 f28811;

    public static EnumC8814 valueOf(String str) {
        return (EnumC8814) Enum.valueOf(EnumC8814.class, str);
    }

    public static EnumC8814[] values() {
        return (EnumC8814[]) f28808.clone();
    }

    static {
        EnumC8814 enumC8814 = new EnumC8814("DOUBLE", 0, EnumC2848.DOUBLE);
        f28797 = enumC8814;
        EnumC8814 enumC8815 = new EnumC8814("FLOAT", 1, EnumC2848.FLOAT);
        f28799 = enumC8815;
        EnumC2848 enumC2848 = EnumC2848.LONG;
        EnumC8814 enumC8816 = new EnumC8814("INT64", 2, enumC2848);
        f28796 = enumC8816;
        EnumC8814 enumC8817 = new EnumC8814("UINT64", 3, enumC2848);
        f28802 = enumC8817;
        EnumC2848 enumC2849 = EnumC2848.INT;
        EnumC8814 enumC8818 = new EnumC8814("INT32", 4, enumC2849);
        f28798 = enumC8818;
        EnumC8814 enumC8819 = new EnumC8814("FIXED64", 5, enumC2848);
        f28792 = enumC8819;
        EnumC8814 enumC88110 = new EnumC8814("FIXED32", 6, enumC2849);
        f28800 = enumC88110;
        EnumC8814 enumC88111 = new EnumC8814("BOOL", 7, EnumC2848.BOOLEAN);
        f28805 = enumC88111;
        EnumC8814 enumC88112 = new EnumC8814("STRING", 8, EnumC2848.STRING);
        f28807 = enumC88112;
        EnumC2848 enumC28410 = EnumC2848.MESSAGE;
        EnumC8814 enumC88113 = new EnumC8814("GROUP", 9, enumC28410);
        f28793 = enumC88113;
        EnumC8814 enumC88114 = new EnumC8814("MESSAGE", 10, enumC28410);
        f28803 = enumC88114;
        EnumC8814 enumC88115 = new EnumC8814("BYTES", 11, EnumC2848.BYTE_STRING);
        f28791 = enumC88115;
        EnumC8814 enumC88116 = new EnumC8814("UINT32", 12, enumC2849);
        f28804 = enumC88116;
        EnumC8814 enumC88117 = new EnumC8814("ENUM", 13, EnumC2848.ENUM);
        f28806 = enumC88117;
        EnumC8814 enumC88118 = new EnumC8814("SFIXED32", 14, enumC2849);
        f28794 = enumC88118;
        EnumC8814 enumC88119 = new EnumC8814("SFIXED64", 15, enumC2848);
        f28809 = enumC88119;
        EnumC8814 enumC88120 = new EnumC8814("SINT32", 16, enumC2849);
        f28801 = enumC88120;
        EnumC8814 enumC88121 = new EnumC8814("SINT64", 17, enumC2848);
        f28810 = enumC88121;
        f28808 = new EnumC8814[]{enumC8814, enumC8815, enumC8816, enumC8817, enumC8818, enumC8819, enumC88110, enumC88111, enumC88112, enumC88113, enumC88114, enumC88115, enumC88116, enumC88117, enumC88118, enumC88119, enumC88120, enumC88121};
        f28795 = values();
    }

    public EnumC8814(String str, int i, EnumC2848 enumC2848) {
        super(str, i);
        this.f28811 = enumC2848;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public EnumC17963 m23656() {
        return EnumC17963.m41916(ordinal() + 1);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC2848 m23655() {
        return this.f28811;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static EnumC8814 m23653(EnumC17963 enumC17963) {
        return f28795[enumC17963.getNumber() - 1];
    }
}
