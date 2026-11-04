package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۖ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.ܿۡܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: B9OU */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC18225 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC18225[] f59491;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59492;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59493;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59494;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59495;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59496;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59497;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59498;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59499;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59500;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC18225 f59501;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Class f59502;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public final Class f59503;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f59504;

    public static EnumC18225 valueOf(String str) {
        return (EnumC18225) Enum.valueOf(EnumC18225.class, str);
    }

    public static EnumC18225[] values() {
        return (EnumC18225[]) f59491.clone();
    }

    static {
        EnumC18225 enumC18225 = new EnumC18225("VOID", 0, Void.class, Void.class, null);
        f59494 = enumC18225;
        Class cls = Integer.TYPE;
        EnumC18225 enumC18226 = new EnumC18225("INT", 1, cls, Integer.class, 0);
        f59493 = enumC18226;
        EnumC18225 enumC18227 = new EnumC18225("LONG", 2, Long.TYPE, Long.class, 0L);
        f59497 = enumC18227;
        EnumC18225 enumC18228 = new EnumC18225("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f59498 = enumC18228;
        EnumC18225 enumC18229 = new EnumC18225("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f59499 = enumC18229;
        EnumC18225 enumC182210 = new EnumC18225("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f59496 = enumC182210;
        EnumC18225 enumC182211 = new EnumC18225("STRING", 6, String.class, String.class, "");
        f59500 = enumC182211;
        EnumC18225 enumC182212 = new EnumC18225("BYTE_STRING", 7, AbstractC17084.class, AbstractC17084.class, AbstractC17084.f55772);
        f59501 = enumC182212;
        EnumC18225 enumC182213 = new EnumC18225("ENUM", 8, cls, Integer.class, null);
        f59492 = enumC182213;
        EnumC18225 enumC182214 = new EnumC18225("MESSAGE", 9, Object.class, Object.class, null);
        f59495 = enumC182214;
        f59491 = new EnumC18225[]{enumC18225, enumC18226, enumC18227, enumC18228, enumC18229, enumC182210, enumC182211, enumC182212, enumC182213, enumC182214};
    }

    public EnumC18225(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f59503 = cls;
        this.f59502 = cls2;
        this.f59504 = obj;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public Object m42392() {
        return this.f59504;
    }

    public Class getType() {
        return this.f59503;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Class m42390() {
        return this.f59502;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m42391(Class cls) {
        return this.f59503.isAssignableFrom(cls);
    }
}
