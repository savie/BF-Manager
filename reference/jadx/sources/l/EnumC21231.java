package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩸֡ܶ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y3M1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC21231 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC21231 f69152;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC21231 f69153;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC21231 f69156;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC21231 f69157;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC21231 f69155 = new C12765("EXPLICIT", 0);

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC21231[] f69154 = m47704();

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo10670();

    public static EnumC21231 valueOf(String str) {
        return (EnumC21231) Enum.valueOf(EnumC21231.class, str);
    }

    public static EnumC21231[] values() {
        return (EnumC21231[]) f69154.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC21231[] m47704() {
        return new EnumC21231[]{f69155, f69153, f69157, f69152, f69156};
    }

    public EnumC21231(String str, int i) {
        super(str, i);
    }

    public /* synthetic */ EnumC21231(String str, int i, C12765 c12765) {
        this(str, i);
    }

    static {
        final String str = "REPLACED";
        final int i = 1;
        f69153 = new EnumC21231(str, i) { // from class: l.ۘ֡ܶ
            @Override // l.EnumC21231
            /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
            public boolean mo10670() {
                return false;
            }

            {
                C12765 c12765 = null;
            }
        };
        final String str2 = "COLLECTED";
        final int i2 = 2;
        f69157 = new EnumC21231(str2, i2) { // from class: l.ۜ֡ܶ
            @Override // l.EnumC21231
            /* JADX INFO: renamed from: ۙ */
            public boolean mo10670() {
                return true;
            }

            {
                C12765 c12765 = null;
            }
        };
        final String str3 = "EXPIRED";
        final int i3 = 3;
        f69152 = new EnumC21231(str3, i3) { // from class: l.᩺֡ܶ
            @Override // l.EnumC21231
            /* JADX INFO: renamed from: ۙ */
            public boolean mo10670() {
                return true;
            }

            {
                C12765 c12765 = null;
            }
        };
        final String str4 = "SIZE";
        final int i4 = 4;
        f69156 = new EnumC21231(str4, i4) { // from class: l.ܶ֡ܶ
            @Override // l.EnumC21231
            /* JADX INFO: renamed from: ۙ */
            public boolean mo10670() {
                return true;
            }

            {
                C12765 c12765 = null;
            }
        };
    }
}
