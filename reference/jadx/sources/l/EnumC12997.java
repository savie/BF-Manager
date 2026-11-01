package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ܳ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: l.۬۠᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: B9OU */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC12997 {

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43335;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43336;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43337;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43338;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43339;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43340;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43341;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43342;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC12997[] f43343;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43344;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC12997 f43345;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final Class f43346;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final Class f43347;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final Object f43348;

    public static EnumC12997 valueOf(String str) {
        return (EnumC12997) Enum.valueOf(EnumC12997.class, str);
    }

    public static EnumC12997[] values() {
        return (EnumC12997[]) f43343.clone();
    }

    static {
        EnumC12997 enumC12997 = new EnumC12997("VOID", 0, Void.class, Void.class, null);
        f43337 = enumC12997;
        Class cls = Integer.TYPE;
        EnumC12997 enumC12998 = new EnumC12997("INT", 1, cls, Integer.class, 0);
        f43342 = enumC12998;
        EnumC12997 enumC12999 = new EnumC12997("LONG", 2, Long.TYPE, Long.class, 0L);
        f43335 = enumC12999;
        EnumC12997 enumC129910 = new EnumC12997("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f43345 = enumC129910;
        EnumC12997 enumC129911 = new EnumC12997("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f43338 = enumC129911;
        EnumC12997 enumC129912 = new EnumC12997("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f43341 = enumC129912;
        EnumC12997 enumC129913 = new EnumC12997("STRING", 6, String.class, String.class, "");
        f43336 = enumC129913;
        EnumC12997 enumC129914 = new EnumC12997("BYTE_STRING", 7, AbstractC23725.class, AbstractC23725.class, AbstractC23725.f76778);
        f43344 = enumC129914;
        EnumC12997 enumC129915 = new EnumC12997("ENUM", 8, cls, Integer.class, null);
        f43340 = enumC129915;
        EnumC12997 enumC129916 = new EnumC12997("MESSAGE", 9, Object.class, Object.class, null);
        f43339 = enumC129916;
        f43343 = new EnumC12997[]{enumC12997, enumC12998, enumC12999, enumC129910, enumC129911, enumC129912, enumC129913, enumC129914, enumC129915, enumC129916};
    }

    public EnumC12997(String str, int i, Class cls, Class cls2, Object obj) {
        super(str, i);
        this.f43346 = cls;
        this.f43347 = cls2;
        this.f43348 = obj;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public Object m32140() {
        return this.f43348;
    }

    public Class getType() {
        return this.f43346;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Class m32138() {
        return this.f43347;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m32139(Class cls) {
        return this.f43346.isAssignableFrom(cls);
    }
}
