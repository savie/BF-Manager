package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۗ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ۗۤ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: L9QC */
/* JADX INFO: loaded from: classes2.dex */
public class EnumC3180 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3180[] f11947;

    /* JADX INFO: renamed from: ֨ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11948;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11949;

    /* JADX INFO: renamed from: ۖۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11950;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11951;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11952;

    /* JADX INFO: renamed from: ۚۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11953;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11954;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11955;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11956;

    /* JADX INFO: renamed from: ۨۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11957;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11958;

    /* JADX INFO: renamed from: ۬ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11959;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11960;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11961;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11962;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11963;

    /* JADX INFO: renamed from: ᩹ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11964;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC3180 f11965;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC4508 f11966;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final int f11967;

    /* JADX INFO: renamed from: ۚ */
    public boolean mo5811() {
        return true;
    }

    public /* synthetic */ EnumC3180(String str, int i, EnumC4508 enumC4508, int i2, C10943 c10943) {
        this(str, i, enumC4508, i2);
    }

    public static EnumC3180 valueOf(String str) {
        return (EnumC3180) Enum.valueOf(EnumC3180.class, str);
    }

    public static EnumC3180[] values() {
        return (EnumC3180[]) f11947.clone();
    }

    static {
        EnumC3180 enumC3180 = new EnumC3180("DOUBLE", 0, EnumC4508.DOUBLE, 1);
        f11963 = enumC3180;
        EnumC3180 enumC3181 = new EnumC3180("FLOAT", 1, EnumC4508.FLOAT, 5);
        f11961 = enumC3181;
        EnumC4508 enumC4508 = EnumC4508.LONG;
        final int i = 2;
        EnumC3180 enumC3182 = new EnumC3180("INT64", 2, enumC4508, 0);
        f11951 = enumC3182;
        final int i2 = 3;
        EnumC3180 enumC3183 = new EnumC3180("UINT64", 3, enumC4508, 0);
        f11959 = enumC3183;
        EnumC4508 enumC4509 = EnumC4508.INT;
        EnumC3180 enumC3184 = new EnumC3180("INT32", 4, enumC4509, 0);
        f11955 = enumC3184;
        EnumC3180 enumC3185 = new EnumC3180("FIXED64", 5, enumC4508, 1);
        f11965 = enumC3185;
        EnumC3180 enumC3186 = new EnumC3180("FIXED32", 6, enumC4509, 5);
        f11956 = enumC3186;
        EnumC3180 enumC3187 = new EnumC3180("BOOL", 7, EnumC4508.BOOLEAN, 0);
        f11962 = enumC3187;
        final EnumC4508 enumC45010 = EnumC4508.STRING;
        final String str = "STRING";
        final int i3 = 8;
        EnumC3180 enumC3188 = new EnumC3180(str, i3, enumC45010, i) { // from class: l.᩻ۤ᩸
            @Override // l.EnumC3180
            /* JADX INFO: renamed from: ۚ */
            public boolean mo5811() {
                return false;
            }

            {
                C10943 c10943 = null;
            }
        };
        f11964 = enumC3188;
        final EnumC4508 enumC45011 = EnumC4508.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        EnumC3180 enumC3189 = new EnumC3180(str2, i4, enumC45011, i2) { // from class: l.ܳۤ᩸
            @Override // l.EnumC3180
            /* JADX INFO: renamed from: ۚ */
            public boolean mo5811() {
                return false;
            }

            {
                C10943 c10943 = null;
            }
        };
        f11949 = enumC3189;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final int i6 = 2;
        EnumC3180 enumC31810 = new EnumC3180(str3, i5, enumC45011, i6) { // from class: l.֫ۤ᩸
            @Override // l.EnumC3180
            /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
            public boolean mo5811() {
                return false;
            }

            {
                C10943 c10943 = null;
            }
        };
        f11952 = enumC31810;
        final EnumC4508 enumC45012 = EnumC4508.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        EnumC3180 enumC31811 = new EnumC3180(str4, i7, enumC45012, i6) { // from class: l.ۢۤ᩸
            @Override // l.EnumC3180
            /* JADX INFO: renamed from: ۚ */
            public boolean mo5811() {
                return false;
            }

            {
                C10943 c10943 = null;
            }
        };
        f11958 = enumC31811;
        EnumC3180 enumC31812 = new EnumC3180("UINT32", 12, enumC4509, 0);
        f11948 = enumC31812;
        EnumC3180 enumC31813 = new EnumC3180("ENUM", 13, EnumC4508.ENUM, 0);
        f11954 = enumC31813;
        EnumC3180 enumC31814 = new EnumC3180("SFIXED32", 14, enumC4509, 5);
        f11960 = enumC31814;
        EnumC3180 enumC31815 = new EnumC3180("SFIXED64", 15, enumC4508, 1);
        f11957 = enumC31815;
        EnumC3180 enumC31816 = new EnumC3180("SINT32", 16, enumC4509, 0);
        f11950 = enumC31816;
        EnumC3180 enumC31817 = new EnumC3180("SINT64", 17, enumC4508, 0);
        f11953 = enumC31817;
        f11947 = new EnumC3180[]{enumC3180, enumC3181, enumC3182, enumC3183, enumC3184, enumC3185, enumC3186, enumC3187, enumC3188, enumC3189, enumC31810, enumC31811, enumC31812, enumC31813, enumC31814, enumC31815, enumC31816, enumC31817};
    }

    public EnumC3180(String str, int i, EnumC4508 enumC4508, int i2) {
        super(str, i);
        this.f11966 = enumC4508;
        this.f11967 = i2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC4508 m9597() {
        return this.f11966;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int m9598() {
        return this.f11967;
    }
}
