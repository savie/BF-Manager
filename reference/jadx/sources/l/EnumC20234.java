package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.᩵֫ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: A451 */
/* JADX INFO: loaded from: classes5.dex */
public class EnumC20234 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f64936;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f64937;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC20234 f64932 = new EnumC20234("BASIC", 0, false, false);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC20234 f64933 = new EnumC20234("BOX", 1, true, false);

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC20234 f64935 = new C3080();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC20234[] f64934 = m46505();

    public /* synthetic */ EnumC20234(String str, int i, boolean z, boolean z2, int i2) {
        this(str, i, z, z2);
    }

    /* JADX INFO: renamed from: ۙ */
    public AbstractC11781 mo10049(AbstractC11781 abstractC11781, AbstractC11781 abstractC11782) {
        return abstractC11782;
    }

    public static EnumC20234 valueOf(String str) {
        return (EnumC20234) Enum.valueOf(EnumC20234.class, str);
    }

    public static EnumC20234[] values() {
        return (EnumC20234[]) f64934.clone();
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC20234[] m46505() {
        return new EnumC20234[]{f64932, f64933, f64935};
    }

    public EnumC20234(String str, int i, boolean z, boolean z2) {
        super(str, i);
        this.f64936 = z;
        this.f64937 = z2;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m46506() {
        return this.f64936;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean m46507() {
        return this.f64937;
    }
}
