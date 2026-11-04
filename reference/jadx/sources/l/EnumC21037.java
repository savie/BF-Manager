package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field '۬' uses external variables
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
/* JADX INFO: renamed from: l.᩶ۗ᩵, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VJ */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC21037 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67232;

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67233;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67234;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67235;

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67236;

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67237;

    /* JADX INFO: renamed from: ۠, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67238;

    /* JADX INFO: renamed from: ۡ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67239;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67240;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67241;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC21037[] f67242;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67243;

    /* JADX INFO: renamed from: ᩷ۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC21037 f67244;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f67245;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC14323 f67246;

    public static EnumC21037 valueOf(String str) {
        return (EnumC21037) Enum.valueOf(EnumC21037.class, str);
    }

    public static EnumC21037[] values() {
        return (EnumC21037[]) f67242.clone();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC21037[] m48081() {
        return new EnumC21037[]{f67241, f67235, f67244, f67237, f67243, f67232, f67233, f67239, f67234, f67240, f67236, f67238};
    }

    static {
        EnumC14323 enumC14323 = EnumC14323.probing;
        f67241 = new EnumC21037("PROBING_1", 0, "probing 1", enumC14323);
        f67235 = new EnumC21037("PROBING_2", 1, "probing 2", enumC14323);
        f67244 = new EnumC21037("PROBING_3", 2, "probing 3", enumC14323);
        EnumC14323 enumC14324 = EnumC14323.announcing;
        f67237 = new EnumC21037("ANNOUNCING_1", 3, "announcing 1", enumC14324);
        f67243 = new EnumC21037("ANNOUNCING_2", 4, "announcing 2", enumC14324);
        f67232 = new EnumC21037("ANNOUNCED", 5, "announced", EnumC14323.announced);
        EnumC14323 enumC14325 = EnumC14323.canceling;
        f67233 = new EnumC21037("CANCELING_1", 6, "canceling 1", enumC14325);
        f67239 = new EnumC21037("CANCELING_2", 7, "canceling 2", enumC14325);
        f67234 = new EnumC21037("CANCELING_3", 8, "canceling 3", enumC14325);
        f67240 = new EnumC21037("CANCELED", 9, "canceled", EnumC14323.canceled);
        f67236 = new EnumC21037("CLOSING", 10, "closing", EnumC14323.closing);
        f67238 = new EnumC21037("CLOSED", 11, "closed", EnumC14323.closed);
        f67242 = m48081();
    }

    public EnumC21037(String str, int i, String str2, EnumC14323 enumC14323) {
        super(str, i);
        this.f67245 = str2;
        this.f67246 = enumC14323;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f67245;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC21037 m48083() {
        switch (ordinal()) {
            case 0:
                return f67235;
            case 1:
                return f67244;
            case 2:
                return f67237;
            case 3:
                return f67243;
            case 4:
                return f67232;
            case 5:
                return f67232;
            case 6:
                return f67239;
            case 7:
                return f67234;
            case 8:
                return f67240;
            case 9:
                return f67240;
            case 10:
                return f67238;
            case 11:
                return f67238;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public final EnumC21037 m48089() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return f67241;
            case 6:
            case 7:
            case 8:
                return f67233;
            case 9:
                return f67240;
            case 10:
                return f67236;
            case 11:
                return f67238;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean m48086() {
        return this.f67246 == EnumC14323.probing;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final boolean m48087() {
        return this.f67246 == EnumC14323.announcing;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final boolean m48088() {
        return this.f67246 == EnumC14323.announced;
    }

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final boolean m48082() {
        return this.f67246 == EnumC14323.canceling;
    }

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final boolean m48085() {
        return this.f67246 == EnumC14323.canceled;
    }

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public final boolean m48090() {
        return this.f67246 == EnumC14323.closing;
    }

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public final boolean m48084() {
        return this.f67246 == EnumC14323.closed;
    }
}
