package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.֨ۗܽ, reason: contains not printable characters */
/* JADX INFO: compiled from: 17QY */
/* JADX INFO: loaded from: classes2.dex */
public abstract class EnumC0898 {

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final boolean f3336;

    /* JADX INFO: renamed from: ᩳ, reason: not valid java name and contains not printable characters */
    public static final EnumC0898 f3334 = new C18051();

    /* JADX INFO: renamed from: ۢ, reason: not valid java name and contains not printable characters */
    public static final EnumC0898 f3332 = new C0152();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC0898 f3330 = new C7610();

    /* JADX INFO: renamed from: ۟, reason: not valid java name and contains not printable characters */
    public static final EnumC0898 f3331 = new C18797();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC0898 f3333 = new C9846();

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC0898[] f3335 = m3634();

    public /* synthetic */ EnumC0898(String str, int i, int i2, boolean z) {
        this(str, i, z);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC0898 mo1347(EnumC21035 enumC21035);

    public static EnumC0898 valueOf(String str) {
        return (EnumC0898) Enum.valueOf(EnumC0898.class, str);
    }

    public static EnumC0898[] values() {
        return (EnumC0898[]) f3335.clone();
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC0898[] m3634() {
        return new EnumC0898[]{f3334, f3332, f3330, f3331, f3333};
    }

    public EnumC0898(String str, int i, boolean z) {
        super(str, i);
        this.f3336 = z;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public boolean m3635() {
        return this.f3336;
    }
}
