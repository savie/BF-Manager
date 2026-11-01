package l;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'ۗ' uses external variables
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
/* JADX INFO: renamed from: l.ۗۜ۠, reason: contains not printable characters */
/* JADX INFO: compiled from: M9VJ */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC3066 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3066[] f11543;

    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11544;

    /* JADX INFO: renamed from: ۗ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11545;

    /* JADX INFO: renamed from: ۙۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11546;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11547;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11548;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11549;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11550;

    /* JADX INFO: renamed from: ܰۙ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11551;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11552;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11553;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11554;

    /* JADX INFO: renamed from: ᩻, reason: not valid java name and contains not printable characters */
    public static final EnumC3066 f11555;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final String f11556;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final EnumC9418 f11557;

    public static EnumC3066 valueOf(String str) {
        return (EnumC3066) Enum.valueOf(EnumC3066.class, str);
    }

    public static EnumC3066[] values() {
        return (EnumC3066[]) f11543.clone();
    }

    /* JADX INFO: renamed from: ᩵, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3066[] m9196() {
        return new EnumC3066[]{f11545, f11546, f11551, f11550, f11554, f11553, f11549, f11555, f11552, f11547, f11548, f11544};
    }

    static {
        EnumC9418 enumC9418 = EnumC9418.probing;
        f11545 = new EnumC3066("PROBING_1", 0, "probing 1", enumC9418);
        f11546 = new EnumC3066("PROBING_2", 1, "probing 2", enumC9418);
        f11551 = new EnumC3066("PROBING_3", 2, "probing 3", enumC9418);
        EnumC9418 enumC9419 = EnumC9418.announcing;
        f11550 = new EnumC3066("ANNOUNCING_1", 3, "announcing 1", enumC9419);
        f11554 = new EnumC3066("ANNOUNCING_2", 4, "announcing 2", enumC9419);
        f11553 = new EnumC3066("ANNOUNCED", 5, "announced", EnumC9418.announced);
        EnumC9418 enumC94110 = EnumC9418.canceling;
        f11549 = new EnumC3066("CANCELING_1", 6, "canceling 1", enumC94110);
        f11555 = new EnumC3066("CANCELING_2", 7, "canceling 2", enumC94110);
        f11552 = new EnumC3066("CANCELING_3", 8, "canceling 3", enumC94110);
        f11547 = new EnumC3066("CANCELED", 9, "canceled", EnumC9418.canceled);
        f11548 = new EnumC3066("CLOSING", 10, "closing", EnumC9418.closing);
        f11544 = new EnumC3066("CLOSED", 11, "closed", EnumC9418.closed);
        f11543 = m9196();
    }

    public EnumC3066(String str, int i, String str2, EnumC9418 enumC9418) {
        super(str, i);
        this.f11556 = str2;
        this.f11557 = enumC9418;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f11556;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC3066 m9199() {
        switch (ordinal()) {
            case 0:
                return f11546;
            case 1:
                return f11551;
            case 2:
                return f11550;
            case 3:
                return f11554;
            case 4:
                return f11553;
            case 5:
                return f11553;
            case 6:
                return f11555;
            case 7:
                return f11552;
            case 8:
                return f11547;
            case 9:
                return f11547;
            case 10:
                return f11544;
            case 11:
                return f11544;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final EnumC3066 m9204() {
        switch (ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return f11545;
            case 6:
            case 7:
            case 8:
                return f11549;
            case 9:
                return f11547;
            case 10:
                return f11548;
            case 11:
                return f11544;
            default:
                return this;
        }
    }

    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final boolean m9203() {
        return this.f11557 == EnumC9418.probing;
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final boolean m9200() {
        return this.f11557 == EnumC9418.announcing;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean m9202() {
        return this.f11557 == EnumC9418.announced;
    }

    /* JADX INFO: renamed from: ۘ, reason: not valid java name and contains not printable characters */
    public final boolean m9198() {
        return this.f11557 == EnumC9418.canceling;
    }

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final boolean m9197() {
        return this.f11557 == EnumC9418.canceled;
    }

    /* JADX INFO: renamed from: ᩺, reason: not valid java name and contains not printable characters */
    public final boolean m9205() {
        return this.f11557 == EnumC9418.closing;
    }

    /* JADX INFO: renamed from: ۜ, reason: not valid java name and contains not printable characters */
    public final boolean m9201() {
        return this.f11557 == EnumC9418.closed;
    }
}
