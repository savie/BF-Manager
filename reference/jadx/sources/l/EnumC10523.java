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
/* JADX INFO: renamed from: l.ۤ᩶ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: E3QI */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC10523 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC10523 f36019;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC10523[] f36020 = m26662();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC10523 f36021;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC10523 f36022;

    /* JADX INFO: renamed from: ۙ */
    public abstract InterfaceC12639 mo22038(C18283 c18283, InterfaceC0769 interfaceC0769, Object obj, int i);

    /* JADX INFO: renamed from: ۙ */
    public abstract AbstractC14072 mo22039();

    public EnumC10523(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC10523(String str, int i, C8987 c8987) {
        this(str, i);
    }

    public static EnumC10523 valueOf(String str) {
        return (EnumC10523) Enum.valueOf(EnumC10523.class, str);
    }

    public static EnumC10523[] values() {
        return (EnumC10523[]) f36020.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC10523[] m26662() {
        return new EnumC10523[]{f36019, f36022, f36021};
    }

    static {
        final String str = "STRONG";
        final int i = 0;
        f36019 = new EnumC10523(str, i) { // from class: l.۠᩶ܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public InterfaceC12639 mo22038(C18283 c18283, InterfaceC0769 interfaceC0769, Object obj, int i2) {
                if (i2 == 1) {
                    return new C20400(obj);
                }
                return new C3465(i2, obj);
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public AbstractC14072 mo22039() {
                return AbstractC14072.m34032();
            }
        };
        final String str2 = "SOFT";
        final int i2 = 1;
        f36022 = new EnumC10523(str2, i2) { // from class: l.᩵᩶ܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC12639 mo22038(C18283 c18283, InterfaceC0769 interfaceC0769, Object obj, int i3) {
                if (i3 == 1) {
                    return new C18989(c18283.f58335, obj, interfaceC0769);
                }
                return new C9817(i3, interfaceC0769, obj, c18283.f58335);
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ */
            public AbstractC14072 mo22039() {
                return AbstractC14072.m34033();
            }
        };
        final String str3 = "WEAK";
        final int i3 = 2;
        f36021 = new EnumC10523(str3, i3) { // from class: l.ۡ᩶ܶ
            {
                C8987 c8987 = null;
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ */
            public InterfaceC12639 mo22038(C18283 c18283, InterfaceC0769 interfaceC0769, Object obj, int i4) {
                if (i4 == 1) {
                    return new C14756(c18283.f58335, obj, interfaceC0769);
                }
                return new C4297(i4, interfaceC0769, obj, c18283.f58335);
            }

            @Override // l.EnumC10523
            /* JADX INFO: renamed from: ۙ */
            public AbstractC14072 mo22039() {
                return AbstractC14072.m34033();
            }
        };
    }
}
