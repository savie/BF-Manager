package l;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: l.ܰܳۤ, reason: contains not printable characters */
/* JADX INFO: compiled from: M43N */
/* JADX INFO: loaded from: classes3.dex */
public abstract class EnumC13880 {

    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45734;

    /* JADX INFO: renamed from: ۛ, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45735;

    /* JADX INFO: renamed from: ۧ, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45736;

    /* JADX INFO: renamed from: ܿ, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45739;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public static final /* synthetic */ EnumC13880[] f45740;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final EnumC8112 f45741;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45738 = new C6388(EnumC8112.f28428);

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public static final EnumC13880 f45737 = new C11328(EnumC8112.f28425);

    public /* synthetic */ EnumC13880(String str, int i, EnumC8112 enumC8112, int i2) {
        this(str, i, enumC8112);
    }

    /* JADX INFO: renamed from: ۨ */
    public abstract AbstractC16579 mo6718(C10229 c10229, C19524 c19524);

    public static EnumC13880 valueOf(String str) {
        return (EnumC13880) Enum.valueOf(EnumC13880.class, str);
    }

    public static EnumC13880[] values() {
        return (EnumC13880[]) f45740.clone();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ EnumC13880[] m33720() {
        return new EnumC13880[]{f45738, f45737, f45739, f45735, f45736, f45734};
    }

    static {
        EnumC8112 enumC8112 = EnumC8112.f28427;
        f45739 = new C2154(enumC8112);
        f45735 = new C9917(enumC8112);
        f45736 = new C3565(enumC8112);
        f45734 = new C4706(enumC8112);
        f45740 = m33720();
    }

    public EnumC13880(String str, int i, EnumC8112 enumC8112) {
        super(str, i);
        this.f45741 = enumC8112;
    }

    /* JADX INFO: renamed from: ۙ */
    public boolean mo6717(C10229 c10229, C19524 c19524) {
        return m33721(c10229, c19524).m48595() && !c10229.m26018();
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public C21825 m33721(C10229 c10229, C19524 c19524) {
        return AbstractC16579.m38995(c10229.m26012(this.f45741), new C2860(c19524));
    }
}
