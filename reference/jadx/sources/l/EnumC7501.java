package l;

/* JADX INFO: renamed from: l.۟ܰۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: 3AYO */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC7501 {
    V1_V2_V3("V1 + V2 + V3", true, true, true),
    V1_V2("V1 + V2", true, true, false),
    V1_V3("V1 + V3", true, false, true),
    V1("V1", true, false, false),
    V2_V3("V2 + V3 (Android 7.0+)", false, true, true),
    V2("V2 (Android 7.0+)", false, true, false),
    V3("V3 (Android 9.0+)", false, false, true);


    /* JADX INFO: renamed from: ֡, reason: not valid java name and contains not printable characters */
    public final boolean f24975;

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final boolean f24976;

    /* JADX INFO: renamed from: ܽ, reason: not valid java name and contains not printable characters */
    public final String f24977;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final boolean f24978;

    EnumC7501(String str, boolean z, boolean z2, boolean z3) {
        this.f24977 = str;
        this.f24976 = z;
        this.f24978 = z2;
        this.f24975 = z3;
    }
}
