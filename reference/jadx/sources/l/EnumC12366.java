package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.۫ۧۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: 6428 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC12366 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC12366 f41347 = new C20127();

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC12366 f41344 = new C0370();

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC12366 f41346 = new C16599();

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC12366[] f41345 = m30775();

    public /* synthetic */ EnumC12366(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract EnumC12366 mo2098(EnumC12366 enumC12366);

    /* JADX INFO: renamed from: ܰ */
    public abstract EnumC12366 mo2099(EnumC12366 enumC12366);

    public EnumC12366(String str, int i) {
        super(str, i);
    }

    public static EnumC12366 valueOf(String str) {
        return (EnumC12366) Enum.valueOf(EnumC12366.class, str);
    }

    public static EnumC12366[] values() {
        return (EnumC12366[]) f41345.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC12366[] m30775() {
        return new EnumC12366[]{f41347, f41344, f41346};
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public EnumC12366 m30778(boolean z) {
        return mo2099(m30776(z));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public EnumC12366 m30777(boolean z) {
        return mo2098(m30776(z));
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static EnumC12366 m30776(boolean z) {
        return z ? f41347 : f41344;
    }
}
