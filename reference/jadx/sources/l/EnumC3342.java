package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ۗۤۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC3342 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10914;

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10916;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10917;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10918;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC3342[] f10919;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final EnumC0816 f10920;

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10913 = new C5580(EnumC0816.f3094);

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC3342 f10915 = new C1851(EnumC0816.f3093);

    public /* synthetic */ EnumC3342(String str, int i, EnumC0816 enumC0816, int i2) {
        this(str, i, enumC0816);
    }

    /* JADX INFO: renamed from: ۤ */
    public abstract AbstractC22664 mo6372(C8274 c8274, C2596 c2596);

    public static EnumC3342 valueOf(String str) {
        return (EnumC3342) Enum.valueOf(EnumC3342.class, str);
    }

    public static EnumC3342[] values() {
        return (EnumC3342[]) f10919.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC3342[] m10993() {
        return new EnumC3342[]{f10913, f10915, f10918, f10916, f10914, f10917};
    }

    static {
        EnumC0816 enumC0816 = EnumC0816.f3091;
        f10918 = new C16766(enumC0816);
        f10916 = new C17512(enumC0816);
        f10914 = new C16020(enumC0816);
        f10917 = new C23480(enumC0816);
        f10919 = m10993();
    }

    public EnumC3342(String str, int i, EnumC0816 enumC0816) {
        super(str, i);
        this.f10920 = enumC0816;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean mo10994(C8274 c8274, C2596 c2596) {
        return m10995(c8274, c2596).m35550() && !c8274.m22330();
    }

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public C14769 m10995(C8274 c8274, C2596 c2596) {
        return AbstractC22664.m51059(c8274.m22332(this.f10920), new C12620(c2596));
    }
}
