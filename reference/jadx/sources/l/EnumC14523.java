package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܰۢ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: X43L */
/* JADX INFO: loaded from: classes4.dex */
public abstract class EnumC14523 {

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final EnumC14523 f45681 = new C24221();

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC14523 f45680 = new C4083();

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC14523[] f45679 = m35038();

    public /* synthetic */ EnumC14523(String str, int i, int i2) {
        this(str, i);
    }

    /* JADX INFO: renamed from: ۙ */
    public abstract boolean mo13161(AbstractC22664 abstractC22664, AbstractC22664 abstractC22665, C24705 c24705);

    public EnumC14523(String str, int i) {
        super(str, i);
    }

    public static EnumC14523 valueOf(String str) {
        return (EnumC14523) Enum.valueOf(EnumC14523.class, str);
    }

    public static EnumC14523[] values() {
        return (EnumC14523[]) f45679.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC14523[] m35038() {
        return new EnumC14523[]{f45681, f45680};
    }
}
