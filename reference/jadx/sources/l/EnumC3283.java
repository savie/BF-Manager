package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۗܰ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3283 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f12174;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3283 f12172 = new C11046();

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC3283 f12169 = new C23746();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC3283 f12171 = new C14574();

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC3283 f12170 = new C1872();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC3283 f12168 = new C9635();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3283[] f12173 = m9775();

    public /* synthetic */ EnumC3283(String str, int i, int i2, boolean z) {
        this(str, i, z);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC3283 mo6069(EnumC6106 enumC6106);

    public static EnumC3283 valueOf(String str) {
        return (EnumC3283) Enum.valueOf(EnumC3283.class, str);
    }

    public static EnumC3283[] values() {
        return (EnumC3283[]) f12173.clone();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3283[] m9775() {
        return new EnumC3283[]{f12172, f12169, f12171, f12170, f12168};
    }

    public EnumC3283(String str, int i, boolean z) {
        super(str, i);
        this.f12174 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m9776() {
        return this.f12174;
    }
}
