package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۨۨ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes3.dex */
public class EnumC11678 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f39284;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f39285;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC11678 f39282 = new EnumC11678("BASIC", 0, false, false);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC11678 f39281 = new EnumC11678("BOX", 1, true, false);

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC11678 f39283 = new C13795();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC11678[] f39280 = m29176();

    public /* synthetic */ EnumC11678(String str, int i, boolean z, boolean z2, int i2) {
        this(str, i, z, z2);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public AbstractC23903 mo29177(AbstractC23903 abstractC23903, AbstractC23903 abstractC23904) {
        return abstractC23904;
    }

    public static EnumC11678 valueOf(String str) {
        return (EnumC11678) Enum.valueOf(EnumC11678.class, str);
    }

    public static EnumC11678[] values() {
        return (EnumC11678[]) f39280.clone();
    }

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC11678[] m29176() {
        return new EnumC11678[]{f39282, f39281, f39283};
    }

    public EnumC11678(String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.f39284 = z;
        this.f39285 = z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m29178() {
        return this.f39284;
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public boolean m29179() {
        return this.f39285;
    }
}
