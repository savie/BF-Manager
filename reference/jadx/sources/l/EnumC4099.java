package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܿ' uses external variables
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
/* JADX INFO: renamed from: l.ۘۤܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC4099 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC4099 f13961;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC4099[] f13962 = m13190();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC4099 f13963;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC4099 f13964;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract InterfaceC10064 mo13191(C3353 c3353, InterfaceC2213 interfaceC2213, Object obj, int i);

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public abstract AbstractC12874 mo13192();

    public EnumC4099(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC4099(String str, int i, C24566 c24566) {
        this(str, i);
    }

    public static EnumC4099 valueOf(String str) {
        return (EnumC4099) Enum.valueOf(EnumC4099.class, str);
    }

    public static EnumC4099[] values() {
        return (EnumC4099[]) f13962.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC4099[] m13190() {
        return new EnumC4099[]{f13963, f13964, f13961};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        f13963 = new EnumC4099(str, i) { // from class: l.ۨۤܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC10064 mo13191(C3353 c3353, InterfaceC2213 interfaceC2213, Object obj, int i2) {
                if (i2 == 1) {
                    return new C0370(obj);
                }
                return new C22350(i2, obj);
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public AbstractC12874 mo13192() {
                return AbstractC12874.m31905();
            }
        };
        final String str2 = "SOFT";
        final int i2 = 1;
        f13964 = new EnumC4099(str2, i2) { // from class: l.ۛۤܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC10064 mo13191(C3353 c3353, InterfaceC2213 interfaceC2213, Object obj, int i3) {
                if (i3 == 1) {
                    return new C20507(c3353.f10949, obj, interfaceC2213);
                }
                return new C5196(i3, interfaceC2213, obj, c3353.f10949);
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public AbstractC12874 mo13192() {
                return AbstractC12874.m31906();
            }
        };
        final String str3 = "WEAK";
        final int i3 = 2;
        f13961 = new EnumC4099(str3, i3) { // from class: l.᩺ۤܽ
            {
                C24566 c24566 = null;
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC10064 mo13191(C3353 c3353, InterfaceC2213 interfaceC2213, Object obj, int i4) {
                if (i4 == 1) {
                    return new C7082(c3353.f10949, obj, interfaceC2213);
                }
                return new C11161(i4, interfaceC2213, obj, c3353.f10949);
            }

            @Override // l.EnumC4099
            /* JADX INFO: renamed from: ۙ */
            public AbstractC12874 mo13192() {
                return AbstractC12874.m31906();
            }
        };
    }
}
